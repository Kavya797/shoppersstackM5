package PomClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[name()='svg'and @data-testid='SettingsIcon']")
	private WebElement AccountSettingIcon;
	
	public WebElement getAccountSettingIcon()
	{
		return AccountSettingIcon;
	}
	
@FindBy(id="men")
private WebElement mensLink;

public WebElement getmensLink()
{
	return mensLink;
}
//@FindBy(xpath="//");
private WebElement AddToCartLink;
public WebElement getAddToCartLink() 
{
	// TODO Auto-generated method stub
	return AddToCartLink;
}
}
