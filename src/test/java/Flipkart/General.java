package Flipkart;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class General {
	private WebDriverWait wait;
	public static ChromeDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void gen() throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		General run = new General();
		run.step();

	}
	public void step() throws InterruptedException {
		for(int k=1; k<=2; k++) {

			WebElement next_page = driver.findElement(By.xpath("//a[@class='_1LKTO3']"));
			List<WebElement> no_of_products = driver.findElements(By.xpath("//a[@class='_2UzuFa']"));
			int sizee = no_of_products.size();
			//System.out.println(sizee+"d");

			for(int j=0; j<sizee; j++) {
				no_of_products.get(j).click();
				Set<String> path = driver.getWindowHandles();
				LinkedList<String> array = new LinkedList<String>();
				for(String each:path) {
					//System.out.println(each);
					array.add(each);
				}
				String main_page = array.getFirst();
				String sub_page = array.getLast();
				driver.switchTo().window(sub_page);
				//			FileInputStream filein = new FileInputStream("D:\\javanew\\Shopfy.Styletribute\\src\\test\\java\\Flipkart\\Flip.xlsx");
				//			Workbook book = WorkbookFactory.create(filein);
				//
				//			FileOutputStream fileout = new FileOutputStream("D:\\javanew\\Shopfy.Styletribute\\src\\test\\java\\Flipkart\\Flip.xlsx");
				//
				//			int row=1;
				//			int cell=1;

				try {
					WebElement product_name = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
					wait = new WebDriverWait(driver, Duration.ofSeconds(50));
					wait.until(ExpectedConditions.visibilityOf(product_name));
					String name = product_name.getText();
					System.out.print(name);
				} catch (Exception e) {
					// Refresh the page
					driver.navigate().refresh();

					// Try to locate the element again
					WebElement product_name = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
					wait.until(ExpectedConditions.visibilityOf(product_name));
					wait.until(ExpectedConditions.visibilityOf(product_name));
					String name = product_name.getText();
					System.out.print(name);
				}

				try {
					WebElement product_brand = driver.findElement(By.xpath("//span[@class='G6XhRU']"));
					wait.until(ExpectedConditions.visibilityOf(product_brand));
					String brand = product_brand.getText();
					System.out.print(" brand-"+brand);
				} catch (StaleElementReferenceException e) {
					// Refresh the page
					driver.navigate().refresh();

					// Try to locate the element again
					WebElement product_brand = driver.findElement(By.xpath("//span[@class='G6XhRU']"));
					wait.until(ExpectedConditions.visibilityOf(product_brand));
					String brand = product_brand.getText();
					System.out.print(" brand-"+brand);
				}

				try {
					WebElement product_price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
					wait.until(ExpectedConditions.visibilityOf(product_price));
					String price = product_price.getText();
					System.out.print(" price-"+price+" ");
				} catch (StaleElementReferenceException e) {
					// Refresh the page
					driver.navigate().refresh();

					// Try to locate the element again
					WebElement product_price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
					wait.until(ExpectedConditions.visibilityOf(product_price));
					String price = product_price.getText();
					System.out.print(" price-"+price+" ");
				}


				List<WebElement> product_images = driver.findElements(By.xpath("//img[@class='q6DClP']"));
				wait.until(ExpectedConditions.visibilityOfAllElements(product_images));

				//			Cell name = book.getSheet("Sheet1").createRow(row).createCell(cell);
				//			name.setCellValue(product_name);
				//			Cell brand = book.getSheet("Sheet1").createRow(row).createCell(cell+1);
				//			brand.setCellValue(product_brand);
				//			Cell price = book.getSheet("Sheet1").createRow(row).createCell(cell+2);
				//			price.setCellValue(product_price);
				//book.write(fileout);

				//System.out.print(name+" "+product_brand.getText()+" "+product_price.getText());
				int no_of_images = product_images.size();
				for(int i=0; i<no_of_images; i++) {
					System.out.print("image"+i+"-"+product_images.get(i).getAttribute("src")+" ");
				}
				System.out.println();
				//System.out.println(driver.getCurrentUrl());
				driver.close();
				driver.switchTo().window(main_page);
				//System.out.println(driver.getCurrentUrl());
			}
			try {
				wait.until(ExpectedConditions.elementToBeClickable(next_page));
//				JavascriptExecutor jse = (JavascriptExecutor) driver;
//				Point loc = next_page.getLocation();
//				jse.executeScript("window.scrollBy("+loc.getX()+","+loc.getX()+")");
				next_page.click();
			} catch (StaleElementReferenceException e) {
				// Refresh the page
				driver.navigate().refresh();

				// Try to locate the element again
				wait.until(ExpectedConditions.elementToBeClickable(next_page));
//				JavascriptExecutor jse = (JavascriptExecutor) driver;
//				Point loc = next_page.getLocation();
//				jse.executeScript("window.scrollBy("+loc.getX()+","+loc.getY()+")");
				next_page.click();
			}

		}

	}
}
