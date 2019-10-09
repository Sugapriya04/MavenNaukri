package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData2 {
	@Test
	public void getData() throws IOException {

	FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Documents\\Selenium Project\\Udemy\\Login.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	int count=wb.getNumberOfSheets();
 
	
	for(int i=0;i<count;i++)
	{
	if(wb.getSheetName(i).equalsIgnoreCase("test_Data")) {

			
			
			XSSFSheet sheet=wb.getSheetAt(i);
			
			//get all rows
			
			Iterator<Row> allrow=sheet.iterator();//sheet is collection of rows
			Row firstRow=allrow.next();				
			
			Iterator<Cell> ce=firstRow.cellIterator();//row is collection of cells
			int k=0;
			int column=0;
			
			while(ce.hasNext()) {					
			Cell value=ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCases")){
					column=k;
				}
				k++;}
			
			
			System.out.println("The column number is:"+column);
			
	
	
	while(allrow.hasNext()) {
		Row r=allrow.next();
	
		if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase")) {
			Iterator<Cell> cv=r.cellIterator();
		
			while(cv.hasNext()) {
			
				System.out.println("The number of data are " +cv.next().getStringCellValue());
			}
		}
		
	}			
	}		
	}

	
}}
