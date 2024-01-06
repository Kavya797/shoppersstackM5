package PomClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TShirtPage {
public static WebDriver driver;
	
	public TShirtPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='men tshirt']")
	private WebElement tshirtTopLink;
	
	public WebElement gettshirtTopLink()
	{
		return tshirtTopLink;
	}
	
	@FindBy(xpath="//span[text()='Levis Mens Regular Fit Tee']/../..//button")
	private WebElement levisMensRegularFitProduct_AddToCartButton;
	
	public WebElement getlevisMensRegularFitProduct_AddToCartButton()
	{
		return levisMensRegularFitProduct_AddToCartButton;
	}
}
