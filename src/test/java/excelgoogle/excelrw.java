package excelgoogle;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class excelrw{

public static void readexcel(String filename,String sheetname) throws IOException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://triotend.com/tts/site/login");
	
     File f= new File(".//src//main//java/excel//Book1.xlsx");
     FileInputStream f1=new FileInputStream(f);
     Workbook readw=null;
     String f2=filename.substring(filename.indexOf("."));
     if(f2.equals(".xlsx"))
     {
    	 readw=new XSSFWorkbook(f1);
     }
     else if(f2.equals(".xls"))
     {
    	 readw=new HSSFWorkbook(f1);
     }
	Sheet s=readw.getSheet("excel1");
	int rowcount=s.getLastRowNum()-s.getFirstRowNum();
	for(int i=2;i<rowcount+1;i++)
	{
		Cell c1=null;
		Cell c2=null;
	Row r=s.getRow(i);
	for(int j=0;j<r.getLastCellNum();j++)
	{
		c1=s.getRow(i).getCell(j);
		c2=s.getRow(i).getCell(j+1);
	}
	driver.findElement(By.name("username")).sendKeys(c1.getStringCellValue());
	driver.findElement(By.name("password")).sendKeys(c1.getStringCellValue());
	}
	System.out.println();
	}
	
	
	

public static void main(String args[]) throws IOException
{
	excelrw erw=new excelrw();
	erw.readexcel( "ExportExcel.xlsx","exceldemo");
	
}
}
