package PomClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
public static WebDriver driver;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//p[text()='Levis Mens Regular Fit Tee']")
	private WebElement levisProduct;
	
	public WebElement getlevisProduct()
	{
		return levisProduct;
	}
	@FindBy(id="buynow_f1")
	private WebElement buyNowButtonInAddToCartPage;
	
	public WebElement getbuyNowButtonInAddToCartPage()
	{
		return buyNowButtonInAddToCartPage;
		
	}
	
}

