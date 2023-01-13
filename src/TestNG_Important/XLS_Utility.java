package TestNG_Important;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLS_Utility {
	
	XSSFWorkbook book;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	FileInputStream FI;
	
	public int getRowCount() throws IOException
	{
		FI = new FileInputStream(".\\TestData\\Login_Data.xls");
		book = new XSSFWorkbook(FI);
		sheet = book.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		book.close();
		FI.close();
		return rowcount;
	}
	
	public int getColCount() throws IOException
	{
		FI = new FileInputStream(".\\TestData\\Login_Data.xls");
		book = new XSSFWorkbook(FI);
		sheet = book.getSheet("Sheet1");	
		int colcount = sheet.getRow(1).getLastCellNum();
		book.close();
		FI.close();
		return colcount;
		
	}
	
	public String getData(int rows, int cols) throws IOException
	{
		FI = new FileInputStream(".\\TEstData\\Login_Data.xls");
		book = new XSSFWorkbook(FI);
		sheet = book.getSheet("Sheet1");
		row = sheet.getRow(rows);
		cell = row.getCell(cols);
		
		DataFormatter format = new DataFormatter();
		String data;
		try {
			data = format.formatCellValue(cell);
			
		}
		catch(Exception e)
		{
			data = "";
			System.out.println("Exception caught");
		}
		
		book.close();
		FI.close();
		
		return data;
		
	}

}
