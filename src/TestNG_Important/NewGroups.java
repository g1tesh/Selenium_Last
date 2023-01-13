package TestNG_Important;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewGroups {
	@Parameters({"num"})
	@Test(priority = 1, groups = {"Sanity","Regression"})
	public void group1(int num)
	{
		System.out.println(num);
		System.out.println("Group1");
	}
	@Test(priority = 2, groups = {"Sanity"})
	public void group2()
	{
		System.out.println("Group2");
	}
	@Test(priority = 3, groups = {"Regression"})
	public void group3()
	{
		System.out.println("Group3");
	}

}
