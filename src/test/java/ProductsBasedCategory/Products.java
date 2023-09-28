package ProductsBasedCategory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import BasicDetails.Basic;
import PageObjects.Elements;

public class Products extends Basic {

	Elements allelements;
	@Test
	public void categoryNamesChecking() {
		allelements=new Elements(driver);
		allelements.loginicon.click();
		allelements.Emailfield.sendKeys("nandeeshsk1007@gmail.com");
		allelements.Passwordfield.sendKeys("Apps@123");
		allelements.Loginbutton.click();
		allelements.cat_newcollection.click();
		List<WebElement> all = driver.findElements(By.xpath("//a[contains(@id, 'HeaderMenu-new-arrivals')]"));
		int count_newarrivals = all.size();
		System.out.println(count_newarrivals);
		int index=0;
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("WOMEN");
		ar.add("MEN");
		for(int i=count_newarrivals; i>0; i--) {
			System.out.println(all.get(index).getText());
			System.out.println(ar.contains(all.get(index).getText()));
			Assert.assertEquals(ar.get(index), all.get(index).getText(), "Sub-category name of New arrivals is not matching");
			index++;
		}
	}
}