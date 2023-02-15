package excelgoogle;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class excelwrite {
	public static void writeexcel(String Filename,String Sheetname,String[]datatowrite) throws IOException {
	
	File f=new File(".//src//main//java//excel//Book1.xlsx");
	FileInputStream f1=new FileInputStream(f);
	Workbook writex=null;
    String f2=Filename.substring(Filename.indexOf("."));
    if(f2.equals(".xlsx"))
    {
   	 writex=new XSSFWorkbook(f1);
    }
    else if(f2.equals(".xls"))
    {
   	 writex=new HSSFWorkbook(f1);
    }
	Sheet s=writex.getSheet("excel1");
	int rowcount=s.getLastRowNum()-s.getFirstRowNum();
	Row r=s.getRow(0);
	Row nr=s.createRow(rowcount+1);
	for(int j=0;j<r.getLastCellNum();j++)
	{
		Cell c=nr.createCell(j);
		c.setCellValue(datatowrite(j));
		
	}
	f1.close();
	FileOutputStream f3=new FileOutputStream(f);
	writex.write(f3);
	f3.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
