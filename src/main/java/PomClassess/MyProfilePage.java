package PomClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
public static WebDriver driver;
	
	public MyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='/my-profile/my-addresses']")
	private WebElement myAddressLink;
	
	public WebElement getmyAddressLink()
	{
		return myAddressLink;
	}
}
