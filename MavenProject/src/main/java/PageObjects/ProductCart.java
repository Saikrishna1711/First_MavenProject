package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class ProductCart {
	
	public WebDriver driver;
	
	By HavePromo =By.linkText("Have a promo code?");
	By PromoTextBox= By.cssSelector("input[name='discount_name']");
	By PromoAddBtn= By.cssSelector("[action='http\\:\\/\\/teststore\\.automationtesting\\.co\\.uk\\/cart'] .btn-primary");
	By CartValue = By.cssSelector(".cart-total .value");
	By remove= By.cssSelector("li:nth-of-type(2) > .product-line-grid > .col-md-5.col-xs-12.product-line-actions.product-line-grid-right > .row > .col-md-2.col-xs-2.text-xs-right > .cart-line-product-actions > .remove-from-cart > .float-xs-left.material-icons");
	By proceedtoCheckout = By.linkText("PROCEED TO CHECKOUT");
	
	public ProductCart(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getHavePromo() {
		return driver.findElement(HavePromo);
	}
	public WebElement getPromoTextBox() {
		return driver.findElement(PromoTextBox);
	}
	public WebElement getPromoAddBtn() {
		return driver.findElement(PromoAddBtn);
	}
	public WebElement getCartvalue() {
		return driver.findElement(CartValue);
	}
	public WebElement getRemoveBtn() {
		return driver.findElement(remove);
	}
	public WebElement getProceedToCheckOutBtn() {
		return driver.findElement(proceedtoCheckout);
	}

}
