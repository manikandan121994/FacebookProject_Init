package com.amazon.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\manis\\eclipse-workspace_Java_Project\\SampleProject\\Testr-data\\testDatafile.xlsx");
	FileInputStream Stream=new FileInputStream(f);
	XSSFWorkbook book=new XSSFWorkbook(Stream);
	XSSFSheet sheet = book.getSheet("testdata");
	List <String> res=new ArrayList<String>();
	for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 1; j < row.getPhysicalNumberOfCells(); j++) {
			XSSFCell cell = row.getCell(j);
			System.out.println(cell);
			
			
		}
		
		
	}
        
}
}
