package PomClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {

public static WebDriver driver;
	
	public MyAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressButton;
	
	public WebElement getaddAddressButton()
	{
		return addAddressButton;
	}
}
