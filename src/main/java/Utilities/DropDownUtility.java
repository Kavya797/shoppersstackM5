package Utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility {
	public void selectDropDownByText(WebElement selectTag,String TextValue)
	{
		Select select=new Select(selectTag);
		select.selectByVisibleText((TextValue));
	}
	public void selectDropDownByValueofValueAttribute(WebElement selectTag,String valueAttributevalue)
	{
		Select select=new Select(selectTag);
		select.selectByVisibleText((valueAttributevalue));
	}
	public void selectDropDownByIndex(WebElement selectTag,int index)
	{
		Select select=new Select(selectTag);
		select.selectByIndex(index);
	}
	
	
	public void deselectDropDownByText(WebElement selectTag,String TextValue)
	{
		Select select=new Select(selectTag);
		select.selectByVisibleText((TextValue));
		
	}
	public void deselectDropDownByValueofValueAttribute(WebElement selectTag,String  valueAttributevalue)
	{
		Select select=new Select(selectTag);
		select.deselectByValue( valueAttributevalue);
		
	}
	
	public void deselectDropDownByIndex(WebElement selectTag,int index)
	{
		Select select=new Select(selectTag);
		select.deselectByIndex((index));
		
	}
	
	public ArrayList dropdown(WebElement selectTagofDropDown)
	{
		Select select=new Select(selectTagofDropDown);
		List<WebElement> alloptions=select.getOptions();
		
		ArrayList<String>allOptionsTexts=new ArrayList();
		for(WebElement ele:alloptions)
		{
			allOptionsTexts.add(ele.getText());
		}
		return allOptionsTexts;
	}
	
	public WebElement toGetParticularOptionsOnindex(WebElement selectTagOfDropDown,int indexofOption)
	{
		Select select=new Select(selectTagOfDropDown);
		List<WebElement> allOptions=select.getOptions();
		
		WebElement particularOptionsWebElement=allOptions.get(indexofOption);
		return particularOptionsWebElement;
	}
	
}			
			
		
		
	

