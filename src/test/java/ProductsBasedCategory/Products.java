package ProductsBasedCategory;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import BasicDetails.Basic;
import PageObjects.Elements;

public class Products extends Basic {

	Elements allelements;
	@Test
	public void categoryNamesChecking() throws InterruptedException, EncryptedDocumentException, IOException {

		FileInputStream filein = new FileInputStream("D:\\javanew\\Shopfy.Styletribute\\target\\Styletribute.xlsx");
		Workbook book = WorkbookFactory.create(filein);
		
		allelements=new Elements(driver);
		allelements.loginicon.click();
		allelements.Emailfield.sendKeys("nandeeshsk1007@gmail.com");
		allelements.Passwordfield.sendKeys("Hari@12345");
		allelements.Loginbutton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/account/logout']")));
		allelements.LogoButton.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[.='CATEGORY']")));
		allelements.cat_newcollection.click();
		List<WebElement> all = driver.findElements(By.xpath("//a[contains(@id, 'HeaderMenu-new-arrivals')]"));
		int count_newarrivals = all.size();
		//System.out.println("Size of sub-categories of new arrivals are "+count_newarrivals);
		
		
		ArrayList<String> all_app = new ArrayList<String>();
		for(int j=0; j<count_newarrivals; j++) {
			all_app.add(all.get(j).getText());
		}
		
		int excel_size=0;
		ArrayList<String> excel_ar = new ArrayList<String>();
		int column1=1;
		while(column1>=1) {
			Cell categories = book.getSheet("Sheet1").getRow(0).getCell(column1);
			if (categories != null && categories.getCellType() == CellType.STRING) {
				String cat_data1 = categories.getStringCellValue();
				if(!cat_data1.isEmpty()) {
					excel_ar.add(cat_data1);
					column1++;
					excel_size++;
				}
				
				//		ar.add("WOMEN");
				//		ar.add("MEN");
			}
			else {
				column1=0;
			}
		}
		for(int i=0; i<excel_size; i++) {
			Assert.assertTrue(all_app.contains(excel_ar.get(i)), "The following sub-category is not matching - "+excel_ar.get(i)+".");
			}
	}
}