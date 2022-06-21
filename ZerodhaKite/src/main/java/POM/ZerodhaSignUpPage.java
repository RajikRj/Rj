package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {

	@FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement sign;// element on log in page
	@FindBy(xpath="(//a[text()='Signup'])[1]")private WebElement signUP;
	@FindBy(xpath="(//a[@href='https://zerodha.com/about/'])[1]")private WebElement about ;
	@FindBy(xpath="(//a[text()='Products'])[1]")private WebElement products;
	@FindBy(xpath="(//a[text()='Pricing'])[1]")private WebElement pricing;
	@FindBy(xpath="(//a[text()='Support'])[1]")private WebElement support;
	@FindBy(xpath="//input[@type='text']")private WebElement mobNUM;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	
	
	public ZerodhaSignUpPage(WebDriver obj) {
		PageFactory.initElements(obj, this);
	}
	public void clickonSign() {
		sign.click();}
	public void clickOnSignUp() {
		signUP.click();}
	public void clickOnAbout() {
	    about.click();}
	public void clickOnProducts() {
		products.click();}
	public void clickOnPricing() {
		pricing.click();}
	public void clickOnSupport() {
		support.click();}
	public void enterMobNUM(String MOBNUM) {
		mobNUM.sendKeys(MOBNUM);}
	public void clickOnSubmit() {
		submit.click();}
	
	
}
