package TestNG11;

import org.testng.Assert;
import org.testng.annotations.Test;



public class FirstTestNG
{
	
	@Test(priority=1, description= "This Test case will verify login Succesfully")
	public void loginApplication()
	{
		
		System.out.println("Login into My Application");
		//Assert.assertEquals(12, 13);
		
	}
	
	@Test(priority=2, description="This Test Case will Add Certain Items in Basket")
	public void selectItems()
	{
		
		System.out.println("Items Are Selected");
		
	}

	@Test(priority=3, description="This Test Case will pperform Checkout Operation")
	public void Checkout()
	{
		
		System.out.println("Checkout Completed");
		
	}

	
}
