package Testcases;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class AddToCart2Test extends BaseClass {
	@Test
	public void TC_add_001()
	{
		System.out.println("New test Case");
		String Name=System.getProperty("name");
		System.out.println(Name);
	}

}
