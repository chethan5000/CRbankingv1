package com.inetcrbank.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	public int getrowCount(String path, String sheetname) throws IOException 
	{
		FileInputStream FIS = new FileInputStream(path);
		XSSFWorkbook WB = new XSSFWorkbook(FIS);
		XSSFSheet sheet = WB.getSheet(sheetname);
		int rowcount= sheet.getLastRowNum();
		WB.close();
		FIS.close();
		return rowcount;
				
	}
	public int getcolCount(String path, String sheetname,int rownum) throws IOException 
	{
		FileInputStream FIS = new FileInputStream(path);
		XSSFWorkbook WB = new XSSFWorkbook(FIS);
		XSSFSheet sheet = WB.getSheet(sheetname);
		XSSFRow row = sheet.getRow(rownum);
		int colnum = row.getLastCellNum();
		WB.close();
		FIS.close();
		return colnum;
	}
	
	public String getCelldata(String path, String sheetname,int rownum,int colnum) throws IOException 
	{
		FileInputStream FIS = new FileInputStream(path);
		XSSFWorkbook WB = new XSSFWorkbook(FIS);
		XSSFSheet sheet = WB.getSheet(sheetname);
		XSSFRow row = sheet.getRow(rownum);
		XSSFCell cell = row.getCell(colnum);
		
		DataFormatter DF = new DataFormatter();
		String data;
		try 
		{
		 data = DF.formatCellValue(cell);
		}
		catch(Exception e) 
		{
			data="";
		}
		WB.close();
		FIS.close();
		return data;		
	}
	
	public void setcelldata(String path, String sheetname,int rownum,int colnum, String data) throws IOException 
	{
		FileInputStream FIS = new FileInputStream(path);
		XSSFWorkbook WB = new XSSFWorkbook(FIS);
		XSSFSheet sheet = WB.getSheet(sheetname);
		XSSFRow row = sheet.getRow(rownum);
		XSSFCell cell = row.createCell(colnum);
		cell.setCellValue(data);
		
		FileOutputStream FOS = new FileOutputStream(path);
		WB.write(FOS);
		WB.close();
		FIS.close();
				
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
