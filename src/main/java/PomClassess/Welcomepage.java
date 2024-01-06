package PomClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;

public class Welcomepage {
	
	public static WebDriver driver;
	
	public Welcomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
		@FindBy(xpath="//button[text()='Login']") 
	
		
	private WebElement MainLoginBtn;
	
	public WebElement getMainLoginBtn()
	{
		return MainLoginBtn;
	}
}
	

