package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	By CookieClose = By.className("close-cookie-warning");
	By toggle= By.linkText("Toggle");
	By Homepage= By.linkText("HOMEPAGE");
	By Accordian= By.linkText("ACCORDION");
	By Actions= By.linkText("ACTIONS");
	By BrowserTabs= By.linkText("BROWSER TABS");
	By Buttons= By.linkText("BUTTONS");
	By calculator= By.linkText("CALCULATOR (JS)");
	By ContactUs= By.linkText("CONTACT US FORM TEST");
	By dropdown= By.linkText("DROPDOWN CHECKBOX RADIO");
	By FileUpload= By.linkText("FILE UPLOAD");
	By Teststore= By.linkText("TEST STORE");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getCookieClose() {
		return driver.findElement(CookieClose);
	}
	public WebElement getToggle() {
		return driver.findElement(toggle);
	}
	public WebElement getHomepage() {
		return driver.findElement(Homepage);
	}
	public WebElement getAccordian() {
		return driver.findElement(Accordian);
	}
	public WebElement getActions() {
		return driver.findElement(Actions);
	}
	public WebElement getBrowsertabs() {
		return driver.findElement(BrowserTabs);
	}
	public WebElement getButtons() {
		return driver.findElement(Buttons);
	}
	public WebElement getCalculator() {
		return driver.findElement(calculator);
	}
	public WebElement getContactus() {
		return driver.findElement(ContactUs);
	}
	public WebElement getDropDown() {
		return driver.findElement(dropdown);
	}
	public WebElement getFileupload() {
		return driver.findElement(FileUpload);
	}
	public WebElement getTestStore() {
		return driver.findElement(Teststore);
	}
	

}
