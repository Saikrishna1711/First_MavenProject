package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_PersonalInfo {
	public WebDriver driver;
	
	By titleMr=By.cssSelector("label:nth-of-type(1) > .custom-radio > input[name='id_gender']");
	By titleMrs= By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
	By FirstNameField = By.cssSelector("[name='firstname']");
	By LastNameFiled = By.cssSelector("[name='lastname']");
	By emailField= By.cssSelector(".tab-content [role='tabpanel']:nth-of-type(1) [name='email']");
	By passwordField =By.cssSelector(".tab-content [role='tabpanel']:nth-of-type(1) [name='password']");
	By BirthdateField = By.cssSelector("[name='birthday']");
	By TermsandConditionsCheckBox = By.cssSelector("[name='psgdpr']");
	By ContinueBtn= By.cssSelector(".tab-content [role='tabpanel']:nth-of-type(1) [name='continue']");
	
	public Order_PersonalInfo(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getTitleMr() {
		return driver.findElement(titleMr);
	}
	public WebElement getTitleMrs() {
		return driver.findElement(titleMrs);
	}
	public WebElement getFirstName() {
		return driver.findElement(FirstNameField);
	}
	public WebElement getLastName() {
		return driver.findElement(LastNameFiled);
	}
	public WebElement getEmail() {
		return driver.findElement(emailField);
	}
	public WebElement getPassword() {
		return driver.findElement(passwordField);
	}
	public WebElement getBirthdate() {
		return driver.findElement(BirthdateField);
	}
	public WebElement getTermsCheckBox() {
		return driver.findElement(TermsandConditionsCheckBox);
	}
	public WebElement getContinueBtn() {
		return driver.findElement(ContinueBtn);
	}
}
