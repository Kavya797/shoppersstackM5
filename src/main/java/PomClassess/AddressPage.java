package PomClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
public static WebDriver driver;
	
	public AddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='/addressform']")
	private WebElement addressform;
	
	public WebElement getaddressform()
	{
		return addressform;
		}
	@FindBy(xpath="strong[text()='LoveBirds']/../../..//input")
	private WebElement LoveBirdAddress;
	
	@FindBy(xpath="//button[text()=Proceed']")
	private WebElement procedButton;
	
	public WebElement getLoveBirdAddress()
	{
		return LoveBirdAddress;
	}
	public WebElement getprocedButton()
	{
		return procedButton;
	}
	
	}


