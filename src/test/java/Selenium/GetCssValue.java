package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCssValue {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		System.out.println(email.getCssValue("font-size"));
		System.out.println(email.getCssValue("font-family"));
		System.out.println(email.getCssValue("color"));
		System.out.println(email.getCssValue("font-weight"));
		System.out.println(email.getCssValue("background"));
	}
}
