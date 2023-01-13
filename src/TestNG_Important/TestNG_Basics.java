package TestNG_Important;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("I am before suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am before Test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("I am before class");
	}
	
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("I am before method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("TEst1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("TEst2");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("I am after Method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("I am after class");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("I am after Test");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I am after suite");
	}
	
}