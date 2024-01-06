package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomClassess.AccountSettingPage;
import PomClassess.HomePage;
import PomClassess.LoginPage;
import PomClassess.Welcomepage;

public class BaseClass {
	public static WebDriver driver;
 public TestDataUtility Td=new TestDataUtility();//credentials
 public WebDriverUtility wdu=new WebDriverUtility();
 public DropDownUtility ddu=new DropDownUtility();
 
 @BeforeClass
 public void LaunchingBrowser() throws Throwable
 {
	System.out.println("----LaunchingBrowser----"); 
	String Browser=Td.DataFromPropertyFile("browser");
	
	if(Browser.equals("chrome"))
	{
		driver=new ChromeDriver();
		
	}
	else if(Browser.equals("FireFox"))
	{
		driver=new FirefoxDriver();
	}
	else if(Browser.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		driver=new ChromeDriver();
	}
		String Url=Td.DataFromPropertyFile("url");//fetching url
		driver.get(Url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 }
 @BeforeMethod
 public void LoginToApplication() throws Throwable
 {
	 System.out.println("----- LoginToApplication------");
	 Welcomepage Wp=new Welcomepage(driver);//opens welcome page
	 Wp.getMainLoginBtn().click();
	 Thread.sleep(2000l);
	 LoginPage Lp=new LoginPage(driver);
	 String Emailid1=Td.DataFromPropertyFile("Emailid");//to enter username
	 Lp.getEmailTextField().sendKeys(Emailid1);
	 Thread.sleep(2000l);
	 String Password=Td.DataFromPropertyFile("password");//to enter password
	 Lp.getPasswordTextField().sendKeys(Password);
	 Thread.sleep(2000l);
	 Lp.getLoginButton().click();//click on login btn
	 Thread.sleep(2000l);
	 
 }
 @AfterMethod
 public void LogoutFromApplication() throws Throwable
 {
	 System.out.println("------LogoutFromApplication----");
	 HomePage hp=new HomePage(driver);//opens home page click on accsettingicon
	 hp.getAccountSettingIcon().click();
	 Thread.sleep(2000l);
	 AccountSettingPage Logout=new AccountSettingPage(driver);
	 Logout.getLogoutButton().click();//click on logout
	 
	 
 }
 @AfterClass
 public void QuiteBrowser()
 {
	 System.out.println("----- QuiteBrowser----");
	 driver.quit();
 }
}
