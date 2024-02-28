package Concatenate;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Concat {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream filein = new FileInputStream("D:\\javanew\\Styletribute\\src\\test\\java\\Ayatana\\boook.xlsx");
				Workbook book = WorkbookFactory.create(filein);
	
				for(int i=0; i<500; i++) {
				Cell dename = book.getSheet("Sheet11").getRow(i).getCell(6);
				String style = dename.getStringCellValue();
				System.out.print(style+" OR ");
				}
}
}
