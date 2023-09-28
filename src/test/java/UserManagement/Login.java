package UserManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasicDetails.Basic;
import PageObjects.Elements;

public class Login extends Basic {
	Elements allelements;
	@BeforeMethod
	public void loginClicking() {
		allelements = new Elements(driver);
		allelements.loginicon.click();
	}
	
	@Test(priority = 0)
	public void loginWithValidCredentials() {
		allelements.Emailfield.sendKeys("nandeeshsk1007@gmail.com");
		allelements.Passwordfield.sendKeys("Apps@123");
		allelements.Loginbutton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/account/logout']")));
		Assert.assertTrue(allelements.Logoutbutton.isDisplayed(), "Login failed");
		allelements.Logoutbutton.click();
	}
	@Test(priority = 1)
	public void loginWithInvalidEmail() {
		allelements.Emailfield.sendKeys("nandeeshsk10@gmail.com");
		allelements.Passwordfield.sendKeys("Apps@123");
		allelements.Loginbutton.click();
		Assert.assertEquals(driver.findElement(By.xpath("//span[.='User not found']")).getText(), "User not found", "It is not validating email id");
	}
	@Test(priority = 2)
	public void loginWithInvalidPassword() {
		allelements.Emailfield.sendKeys("nandeeshsk1007@gmail.com");
		allelements.Passwordfield.sendKeys("Apps@1234");
		allelements.Loginbutton.click();
		Assert.assertEquals(driver.findElement(By.xpath("//span[.='Invalid Username / Password']")).getText(), "Invalid Username / Password", "It is not validating password");
	}
	@Test(priority = 3)
	public void loginWithoutEmailID() {
		allelements.Loginbutton.click();
		System.out.println(allelements.Emailfield.getText());
		Assert.assertEquals(allelements.Emailfield.getAttribute("validationMessage"), "Please fill out this field.", "The app is not verifying whether the fields are empty");
	}
	@Test(priority = 4)
	public void loginWithoutPassword() {
		allelements.Emailfield.sendKeys("nandeeshsk1007@gmail.com");
		allelements.Loginbutton.click();
		System.out.println(allelements.Passwordfield.getText());
		Assert.assertEquals(allelements.Passwordfield.getAttribute("validationMessage"), "Please fill out this field.", "The app is not verifying whether the fields are empty");
	}
}