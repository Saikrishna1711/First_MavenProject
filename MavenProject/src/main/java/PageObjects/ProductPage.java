package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	public WebDriver driver;
	
	By size= By.cssSelector("[data-product-attribute='1']");
	By WhiteColor =By.cssSelector(".product-variants .input-container:nth-of-type(1) [type]");
	By blackColor= By.cssSelector(".product-variants .input-container:nth-of-type(2) [type]");
	By decreaseQuantity =By.cssSelector(".touchspin-down");
	By increaseQuantity =By.cssSelector(".touchspin-up");
	By AddtoCart = By.cssSelector("[data-button-action]");
	By HomePage=By.xpath("//span[.='Home']");
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getSize() {
		return driver.findElement(size);
	}
	public WebElement getWhiteColor() {
		return driver.findElement(WhiteColor);
	}
	public WebElement getBlackColor() {
		return driver.findElement(blackColor);
	}
	public WebElement getdecreaseQuantity() {
		return driver.findElement(decreaseQuantity);
	}
	public WebElement getIncreaseQuantity() {
		return driver.findElement(increaseQuantity);
	}
	public WebElement getAddtoCard() {
		return driver.findElement(AddtoCart);
	}
	public WebElement getHome() {
		return driver.findElement(HomePage);
	}
	
	

}
