package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

	@FindBy (xpath = "//a[@class='header__icon header__icon--account link focus-inset small-hide']")
	public WebElement loginicon;
	
	@FindBy (id = "email")
	public WebElement Emailfield;
	
	@FindBy (id = "password")
	public WebElement Passwordfield;
	
	@FindBy (id = "lr-raas-login-link")
	public WebElement Loginbutton;
	
	@FindBy (xpath = "//a[@href='/account/logout']")
	public WebElement Logoutbutton;
	
	@FindBy (xpath = "//a[@class='header__heading-link link link--text focus-inset']")
	public WebElement LogoButton;
	
	@FindBy (xpath = "//strong[.='CATEGORY']")
	public WebElement ShopbyCategorytext;
	
	@FindBy (xpath = "//span[.='NEW ARRIVALS']")
	public WebElement cat_newcollection;
	
	@FindBy (xpath = "//span[.='WOMEN']")
	public WebElement cat_women;
	
	@FindBy (xpath = "//span[.='MEN']")
	public WebElement cat_men;
	
	@FindBy (xpath = "//span[.='DESIGNERS']")
	public WebElement cat_designers;
	
	@FindBy (xpath = "//span[.='BAGS']")
	public WebElement cat_bags;
	
	//Search
	
	@FindBy (xpath = "//summary[@aria-label='Search']")
	public WebElement searchicon;
	
	@FindBy (xpath = "//input[@class='search__input field__input']")
	public WebElement entertextforsearching;
	
	@FindBy (xpath = "//button[@class='search__button field__button']")
	public WebElement submitsearch;
	
	@FindBy (xpath = "//h2[@class='card__heading h5']")
	public WebElement productnameanddesigner;
	
	@FindBy (xpath = "//span[@class='price-item price-item--sale price-item--last']")
	public WebElement product_saleprice;
	
	@FindBy (xpath = "//s[@class='price-item price-item--regular']")
	public WebElement product_retailprice;
	
	@FindBy (xpath = "//div[@class='card__inner color-background-2 gradient ratio']")
	public WebElement soldouttext;
	
	@FindBy (xpath = "//div[contains(@class,'atome-price-divider atome-widget')]")
	public WebElement atomeEMIfield;
	
	public Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
