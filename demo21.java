package com.selenium.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.google.common.collect.Table.Cell;
//import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class demo21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String excelFilePath = "D:\\data.xlsx";

	        try {
	            FileInputStream inputStream = new FileInputStream(excelFilePath);
	            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
	            XSSFSheet sheet = workbook.getSheetAt(0); // Assuming you want to work with the first sheet

	            // Read data from Excel
	            readData(sheet);
	            // Write data to Excel
	            writeData(sheet);

	            // Save the changes to Excel file
	            FileOutputStream outputStream = new FileOutputStream(excelFilePath);
	            workbook.write(outputStream);
	            workbook.close();
	            outputStream.close();

	            System.out.println("In console the data retrieved and Data written Successfully in excel!!");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    private static void readData(XSSFSheet sheet) 
	    {
	        for (Row row : sheet) {
	            for (org.apache.poi.ss.usermodel.Cell cell : row) {
	                CellType cellType = cell.getCellType();
	                if (cellType == CellType.STRING) {
	                    System.out.print(cell.getStringCellValue() + "\t");
	                } else if (cellType == CellType.NUMERIC) {
	                    System.out.print(cell.getNumericCellValue() + "\t");
	                }
	            }
	            System.out.println();
	        }
	    }

		private static void writeData(XSSFSheet sheet)
		{
	    	// Create a new row at the end of the excel and entrying the data.
	    	Row newRow = sheet.createRow(sheet.getLastRowNum() + 1); 
	    	// first create cell,then set cell value
	    	Cell firstdata = newRow.createCell(0);
	        firstdata.setCellValue("First Data Written");
	        Cell seconddata = newRow.createCell(1);
	        seconddata.setCellValue(10);
		}

	}


