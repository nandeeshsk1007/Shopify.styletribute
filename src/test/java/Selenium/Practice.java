package Selenium;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		for(int i=250; i<500; ) {
			org.openqa.selenium.Dimension dim = new org.openqa.selenium.Dimension(250, i);
			driver.manage().window().setSize(dim);
			System.out.println(i);
			i+=5;
		}
		
		org.openqa.selenium.Point point = new org.openqa.selenium.Point(250, 250);
		driver.manage().window().setPosition(point);
		
		driver.manage().window().maximize();
	}
}
