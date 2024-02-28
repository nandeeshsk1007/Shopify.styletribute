package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> email = driver.findElements(By.xpath("//a"));
		System.out.println(email.size());
		for( WebElement all:email) {
			System.out.println(all.getAttribute("href"));
		}
	}
}
