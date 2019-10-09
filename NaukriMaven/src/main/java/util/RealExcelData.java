package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RealExcelData {
	

	public ArrayList<String> getData(String testcase) throws IOException {
		
		ArrayList<String> al=new ArrayList<String>();
	FileInputStream fs=new FileInputStream("C:\\Users\\Administrator\\Documents\\Selenium Project\\Udemy\\Login.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fs);
	int sheetCount=wb.getNumberOfSheets();
	
	for(int i=0;i<sheetCount;i++) {
		if(wb.getSheetName(i).equalsIgnoreCase("testData")) {
			XSSFSheet credSheet=wb.getSheetAt(i);
			Iterator<Row> allrow=credSheet.rowIterator();
		
				Row row1=allrow.next();
				Iterator<Cell> allcells=row1.cellIterator();
				int k=0;
				int column=0;
				while(allcells.hasNext()){
					Cell tc=allcells.next();
					if(tc.getStringCellValue().equalsIgnoreCase("TestCases")) {
						System.out.println(tc.getStringCellValue());
						 column=k;
						
					}
					k++;
				
				}
				System.out.println("The column is :"+column);
				while(allrow.hasNext()) {	
					Row rows=allrow.next();
			          
					if(rows.getCell(column).getStringCellValue().equalsIgnoreCase(testcase)) {
											
					Iterator<Cell> validcell=rows.cellIterator();
					while(validcell.hasNext()) {
						Cell c= validcell.next();
						if(c.getCellTypeEnum().equals(CellType.STRING)) {
							al.add(c.getStringCellValue());
					}
						
						else {
							al.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						}
				
					}
				
				

				
			}
			
			
			
			
		}
		
		
		
		}}
	return al;}}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


