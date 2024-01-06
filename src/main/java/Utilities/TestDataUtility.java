package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestDataUtility {
	
	public String DataFromPropertyFile(String key)throws Throwable
	{
	 File file=new File("./src/main/resources/Credential.properties");
	  FileInputStream Fis=new FileInputStream(file);
	  Properties pr=new Properties();
	  pr.load(Fis);
	  String Value=pr.getProperty(key);
	  return Value ;
	}
	public String DataFromExcelFile(String SheetName,int rownum,int colnum)throws Throwable
	{
	 File file=new File("./src/main/resources/TestData001.xlsx");
	 FileInputStream Fis=new FileInputStream(file);
	 Workbook workbook=WorkbookFactory.create(Fis);
	 Sheet sheet=workbook.getSheet("Sheet1");
	 
	 Row row=sheet.getRow(rownum); 
	 DataFormatter formatter=new DataFormatter();
	 String value=formatter.formatCellValue(row.getCell( colnum));
	 return(value);
}
}
