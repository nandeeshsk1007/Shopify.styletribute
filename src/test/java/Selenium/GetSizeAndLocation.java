package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSizeAndLocation {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		Dimension size = email.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("height: "+height);
		System.out.println("Width: "+width);
		
		Point location = email.getLocation();
		System.out.println(location.getX()+", "+location.getY());
	}
}
