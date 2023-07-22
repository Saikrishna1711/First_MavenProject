package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_Payment {
	public WebDriver driver;
	
	By payByCheck = By.cssSelector("[data-module-name='ps_checkpayment']");
	By payBybankWire = By.cssSelector("div:nth-of-type(4) > .payment-option > span > span");
	By TermsCheckBox = By.cssSelector("#checkout-payment-step [method] .ps-shown-by-js");
	By OrderBtn = By.cssSelector(".btn-primary.center-block");
	
	public Order_Payment(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getPayByCheck() {
		return driver.findElement(payByCheck);
	}
	public WebElement getPayBybankWire() {
		return driver.findElement(payBybankWire);
	}
	public WebElement getTermsCheckBox() {
		return driver.findElement(TermsCheckBox);
	}
	public WebElement getOrderBtn() {
		return driver.findElement(OrderBtn);
	}
	

}
