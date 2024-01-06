package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	private static final String ExpectedConditions = null;

	/**Author:kavya
	 * When we get ElementClickInterceptedException(When Element is hidden by other element)
	 * then we will use javascript Click
	 * @param driver
	 * @param ele
	 */

	public void JavascriptClick(WebDriver driver,WebElement ele)
	{
	 JavascriptExecutor jse=(JavascriptExecutor)driver;	
	 jse.executeScript("arguments[0].click();",ele);
	 }
	
	/**Author:Kavya
	 * To avoid ElementClickInterceptedException
	 * @param driver
	 * @param ele
	 * @param data
	 */
	
	public void JavascriptSend(WebDriver driver,WebElement ele,String data)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;	
		 jse.executeScript("arguments[0].value=arguments[1];",ele,data);
	}
	/**Author:Kavya
	 * this method is used to scroll the webpage till the given webelement
	 * @param driver
	 * @param ele
	 */
	
	public void JavaScriptScrollTillwebelement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;	
		 jse.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	/**Author:Kavya
	 * this method is used scroll the WebPage with given coordinate
	 * @param driver
	 * @param xco
	 * @param yco
	 */
	public void JavaScriptByCoordinates(WebDriver driver,int xco,int yco)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;	
		 jse.executeScript("scrollBy("+xco+","+yco+");");
	}
	/**author:kavya
	 * Highlightening webelement border
	 * @param driver
	 * @param ele
	 */
	
	public void JavaScriptHighLightWebElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].style.border='2px soild blue';",ele);
	}
}
	
////select.class.methods
//	public void selectDropDownByText(WebElement selectTag,String TextValue)
//	{
//		Select select=new Select(selectTag);
//		select.selectByVisibleText((TextValue);
//	}
//	public void selectDropDownByValueofValueAttribute(WebElement selectTag,String valueAttributevalue)
//	{
//		Select select=new Select(selectTag);
//		select.selectByVisibleText((valueAttributevalue);
//	}
//	public void deselectDropDownByText(WebElement selectTag,String TextValue)
//	{
//		Select select=new Select(selectTag);
//		select.selectByVisibleText((TextValue);
//		
//	}
//	public void deselectDropDownByValueofValueAttribute(WebElement selectTag,String  valueAttributevalue)
//	{
//		Select select=new Select(selectTag);
//		select.deselectByValue( valueAttributevalue);
//		
//	}
//	
//	//Action Class method
//	
//	public void moveToElement(WebDriver driver,WebElement ele)
//	{
//		Actions action=new Actions(driver);
//	    action.moveToElement(ele).perform();
//	}
//	public void doubleClick(WebDriver.driver,WebElement ele)
//	{
//		Actions.action=new Actions(driver);
//		action.doubleClick(ele).perform();
//		
//	}
//	public void ClickAndHold(Webdriver.driver,WebElement ele)
//	{
//		Actions.action=new Actions(driver);
//		action.clickAndHold(ele).perform();
//	}
//	
//		
//	public void DragAndDrop(WebDriver driver,WebElement ele)
//	{
//		Actions.action=new Actions(driver);
//		action.dragAnddrop(ele).perform();
//	}
//	public void RightClick(WebDriver driver,WebElement ele)
//	{
//		Actions.action=new Actions(driver);
//		action.contextClick(ele).perform();
////	}
//	
//	Explicitly Wait
//public void explicitlywaitForElementClickable(By locator,WebDriver driver,int timeInSeconds)
//{
//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
//wait.until(ExpectedConditions.elementToBeClickable(locator));
//}
//
//public void explicitlywaitForalertTobepresent(WebDriver driver,int timeInSeconds)
//{
//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
//wait.until(ExpectedConditions.alertIsPresent());
//}
//
//public void explicitlywaitForUrlToBePresent(WebDriver driver,int timeInSeconds,String CompleteUrl)
//{
//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
//wait.until(ExpectedConditions.urlToBe(CompleteUrl));
//}
//
//public void explicitlywaitForTitleToBePresent(By locator,WebDriver driver,int timeInSeconds,String CompleteTitle)
//{
//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
//wait.until(ExpectedConditions.titleIs(CompleteTitle));
//}
//
//
//public void explicitlywaitForVisibilityOfElement(WebDriver driver,int timeInSeconds,WebElement ele)
//{
//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
//wait.until(ExpectedConditions.visibilityOf(ele));
//}
//}

	

 





