package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_Address {
	
	public WebDriver driver;

	By FirstNameField= By.cssSelector(".form-fields [name='firstname']");
	By LastnameField = By.cssSelector(".form-fields [name='lastname']");
	By AddressFiled = By.cssSelector("[name='address1']");
	By CityField = By.cssSelector("[name='city']");
	By StateFiled = By.cssSelector("[name='id_state']");
	By PostalCodeField = By.cssSelector("[name='postcode']");
	By CountryFiled = By.cssSelector("[name='id_country']");
	By continueBtn= By.cssSelector("[name='confirm-addresses']");
	
	public Order_Address(WebDriver driver) {
		this.driver=driver;	
	}
	public WebElement getFirstName() {
		return driver.findElement(FirstNameField); 
	}
	public WebElement getLastName() {
		return driver.findElement(LastnameField); 
	}
	public WebElement getAddress() {
		return driver.findElement(AddressFiled); 
	}
	public WebElement getCity() {
		return driver.findElement(CityField); 
	}
	public WebElement getState() {
		return driver.findElement(StateFiled); 
	}
	public WebElement getPostalCode() {
		return driver.findElement(PostalCodeField); 
	}
	public WebElement getCountry() {
		return driver.findElement(CountryFiled); 
	}
	public WebElement getContinueBtn() {
		return driver.findElement(continueBtn); 
	}
	
	
	

}
