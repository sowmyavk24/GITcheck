package SeleniumPractice.Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList <String>a =new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\exceldata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheet = workbook.getNumberOfSheets();
		for (int i = 0; i <= sheet; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				XSSFSheet sheets = workbook.getSheetAt(i);
				System.out.println("sheet count"+ sheets);
				Iterator<Row> rows =sheets.iterator();
				Row firstrow =rows.next();
				System.out.println("fst" +firstrow);
				Iterator<Cell>cell =firstrow.iterator();
				int column=0;
				int k=0;
				while(cell.hasNext())
				{
					Cell value =cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("run"))
					
						column=k;
					
					k++;
				}
				System.out.println(column);
			
				while(rows.hasNext())
				{
					Row r =rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase("y"))
					{
						Iterator<Cell> cv =r.cellIterator();
						while(cv.hasNext()) {
							Cell c =cv.next();
							if (c.getCellTypeEnum() == CellType.STRING) 
								a.add(c.getStringCellValue());
							
							}
						}
					
					}
			}
		}
	}
}
	
				
				
		
	
	

			
			

		
		

	


