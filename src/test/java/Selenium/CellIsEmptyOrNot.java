package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter.Black;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellIsEmptyOrNot {
	private static Cell cell;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream filein = new FileInputStream("D:\\javanew\\Shopfy.Styletribute\\Files\\New Microsoft Office Excel Worksheet (2).xlsx");
		Workbook book = WorkbookFactory.create(filein);
		for(int i=0; i<10; i++) {
			try {
				cell = book.getSheet("Sheet1").getRow(i).getCell(0);
				System.out.println("4");
				if(cell==null && cell.getCellType() == CellType.STRING) {

					System.out.println("Empty");
				}
				else {
					String value1 = cell.getStringCellValue();
					System.out.println("Non empty");
					System.out.println("value is "+value1);
				}
			} catch (Exception e) {
				System.out.println("Index "+i+" is empty");
				e.printStackTrace();
				System.out.println(e.toString());
				System.out.println(e.getMessage());
			}
		}
	}
}
