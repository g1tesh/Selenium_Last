package TestNG_Important;

import org.testng.annotations.*;

public class DataProvider {
	
	
	@Test(dataProvider = "DP", priority = 1)
	public void testdata(String str, String str1)
	{
		System.out.println(str+" "+str1);
		
	}
	
	
	@org.testng.annotations.DataProvider(name = "DP")
	public String[][] data()
	{
		String [][]data1 = {{"hello@gmail.com","hello"},
					{"world@gmail.com","123"}};
		
		return data1;
	}
	@Parameters({"text"})
	@Test(timeOut = 1,priority = 2)
	public void para(String text)
	{
		System.out.println(text);
	}

}
