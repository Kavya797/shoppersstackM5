package Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomClassess.AccountSettingPage;
import PomClassess.AddToCartPage;
import PomClassess.AddressPage;
import PomClassess.HomePage;
import PomClassess.MyProfilePage;
import PomClassess.TShirtPage;
import Utilities.BaseClass;
@Listeners(Utilities.ListenersUtility.class)
public class AddToCart_Test extends BaseClass{
@Test
public void Tc_AddToCart_001() throws Throwable
{
// String Url=Td.DataFromPropertyFile("url");
// System.out.println(Url);
// 
// String mobilenum=Td.DataFromExcelFile("Sheet1", 0, 1);
// System.out.println(mobilenum);
	System.out.println("1st test case");
	Thread.sleep(3000l);
	String titleHomePage=driver.getTitle();
	Assert.assertEquals(titleHomePage,"ShoppersStack | Home");
	
	
}
 @Test
 public void AddToCart_002() throws Throwable
 {
	 System.out.println("2nd test cases");
 }
 
 
@Test
public void Tc_AddAddress_001_Test()
{
	System.out.println("Add Address");
	HomePage hp=new HomePage(driver);
	hp.getAccountSettingIcon().click();
	
	AccountSettingPage as=new AccountSettingPage(driver);
	as.getmyProfileLink().click();
	
	Assert.assertEquals(driver.getCurrentUrl(),"httpps://www.shoppersstack.com/my-profile-info");
	System.out.println("my profile page is opened");
	
	MyProfilePage mp=new MyProfilePage(driver);
	mp.getmyAddressLink().click();
}

@Test(dependsOnMethods="Tc_AddAddress_001_Test")
public void Tc_AddToCart_002_Test() throws Throwable
{
	Thread.sleep(2000l);
	System.out.println("1st test case");
	Thread.sleep(3000l);
	String titleHomePage=driver.getTitle();
	Assert.assertEquals(titleHomePage,"ShoppersStack | Home");
	
	HomePage hp=new HomePage(driver);
	Thread.sleep(2000l);
	
	//WebElement mensLink=hp.getmensLink();
	//wu.mouseOverAction(driver,mensLink);
	//hp.getTShirtPopupLink().click();
	
	
	TShirtPage  tsp=new TShirtPage(driver);
	String currentUrl=driver.getCurrentUrl();
	
	Assert.assertEquals(currentUrl,"https://www.shoppersstack.com/sub-category/men-tshirt");
	//wdu.mouseOverAction(driver,tsp.gettshirtTopLink());
	
	tsp.getlevisMensRegularFitProduct_AddToCartButton().click();
	hp.getAddToCartLink().click();
	
	Assert.assertEquals(currentUrl,"https://www.shoppersstack.com/cart");
	System.out.println("the cart page has opened");
	
	AddToCartPage acp=new AddToCartPage(driver);
	String LevisProductTest=acp.getlevisProduct().getText();
	
	Assert.assertEquals(LevisProductTest,"Levis Mens Regular Fit Tee");
	System.out.println("the product is added to cart");
	
	acp.getbuyNowButtonInAddToCartPage().click();
	String addressPageurl=driver.getCurrentUrl();
	Assert.assertEquals(addressPageurl,"https://www.shopperstack.com/selectaddress");
	System.out.println("the address page is displayed");
	
	
	AddressPage ap=new AddressPage(driver);
	ap.getLoveBirdAddress().click();
	ap.getprocedButton().click();
}

@Test
public void Tc_AddTocart_003_Test() throws Throwable
{
	Thread.sleep(2000l);
	System.out.println("SecondTest case");
}
	
	
}

	


 
 
  


