package Search;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasicDetails.Basic;
import PageObjects.Elements;

public class SearchingForProducts extends Basic  {

	@Test
	public void basedOnProductName() {
		Elements eles = new Elements(driver);
		eles.searchicon.click();
		eles.entertextforsearching.sendKeys("Black Bao Bao Prism Tote Bag");
		eles.submitsearch.click();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(eles.productnameanddesigner.getText(), "ISSEY MIYAKE Black Bao Bao Prism Tote Bag", "Product name is not matching");
		softassert.assertAll();
	}
	
	@Test
	public void basedOnSKU() {
		Elements eles = new Elements(driver);
		eles.searchicon.click();
		eles.entertextforsearching.sendKeys("SVSGBG278585");
		eles.submitsearch.click();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(eles.productnameanddesigner.getText().contains("ISSEY MIYAKE Black Bao Bao Prism Tote Bag"), true, "Product name is not matching");
		softassert.assertAll();
	}
	
	@Test
	public void verify_Designer_SalePrice_And_RetailPrice() {
		Elements eles = new Elements(driver);
		eles.searchicon.click();
		eles.entertextforsearching.sendKeys("SVSGBG278585");
		eles.submitsearch.click();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(eles.productnameanddesigner.getText().contains("ISSEY MIYAKE"), true, "The designer name is not matching");
		softassert.assertEquals(eles.product_saleprice.getText().contains("Rs. 24,200.00"), true, "Sale price is not matching");
		softassert.assertEquals(eles.product_retailprice.getText().contains("Rs. 50,700.00"), true, "Retails price is not matching");
		softassert.assertAll();
	}

	@Test
	public void verifyWhetherSoldOutOrNot() {
		Elements eles = new Elements(driver);
		eles.searchicon.click();
		eles.entertextforsearching.sendKeys("SVSGBG278585");
		eles.submitsearch.click();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(eles.soldouttext.getText().contains("Sold out"), true, "The product is sold out but not showing as sold out");
		softassert.assertAll();
	}
	
	@Test
	public void verifyEMIIsAvailable() {
		Elements eles = new Elements(driver);
		eles.searchicon.click();
		eles.entertextforsearching.sendKeys("SVSGBG278585");
		eles.submitsearch.click();
		SoftAssert softassert = new SoftAssert();
		System.out.println(eles.atomeEMIfield.getText());
		softassert.assertEquals(eles.atomeEMIfield.getText().contains("3 payments"), true, "The EMI option is not enabled for the product SVSGBG278585");
		softassert.assertAll();
	}
}