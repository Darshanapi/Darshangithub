package com.actitimej.generic;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is the generic class for data driven testing
 * Author Darshan
 */
public class FileLib {
	/**
	 * This is generic method for reading the data from property file
	 * @throws IOException 
	 * 
	 */
       public String getPropertyData(String key) throws IOException {
    	   FileInputStream fis=new FileInputStream("C:\\Users\\AMIN\\eclipse-workspace\\project\\Actitimej\\src\\test\\resources\\Data\\commondata.properties");
    	   Properties p=new Properties();
    	   p.load(fis);
    	   String data = p.getProperty(key);
    	   return data;
	}
       public String getExcelData(String Sheetname,int row,int cell) throws IOException {
    	   FileInputStream fis=new FileInputStream("C:\\Users\\AMIN\\eclipse-workspace\\project\\Actitimej\\src\\test\\resources\\Data\\Excel1.xlsx");
    	   Workbook wb=WorkbookFactory.create(fis);
    	   String data=wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
    	   return data;
    	   
       }
       public void setExcelData(String Sheetname,int row,int cell,String value) throws IOException {
    	   FileInputStream fis=new FileInputStream("C:\\Users\\AMIN\\eclipse-workspace\\project\\Actitimej\\src\\test\\resources\\Data\\Excel1.xlsx");
    	   Workbook wb=WorkbookFactory.create(fis);
    	   wb.getSheet(Sheetname).getRow(row).getCell(cell).setCellValue(value);
    	   FileOutputStream fos=new FileOutputStream("./Data/Excel.xlsx");
    	   wb.write(fos);
    	   wb.close();
       
}}
