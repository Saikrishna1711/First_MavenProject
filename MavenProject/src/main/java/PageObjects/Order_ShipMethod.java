package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_ShipMethod {
	public WebDriver driver;
	
	By deliveryMessage= By.cssSelector("#delivery_message");
	By continueBtn= By.cssSelector("[name='confirmDeliveryOption']");
	
	public Order_ShipMethod(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getMessage() {
		return driver.findElement(deliveryMessage);
	}
	public WebElement getContinueBtn() {
		return driver.findElement(continueBtn);
	}
	
	

}
