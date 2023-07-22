package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestStore {
	
	public WebDriver driver;

	By Product1= By.cssSelector("img[alt='Hummingbird printed t-shirt']");
	By Product2= By.linkText("Hummingbird Printed Sweater");
	By Product3= By.linkText("The Best Is Yet To Come'...");
	By Product4= By.linkText("The Adventure Begins Framed...");
	By Product5= By.linkText("Mug The Best Is Yet To Come");
	By Product6= By.linkText("Mug Today Is A Good Day");
	
	public TestStore(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getProduct1() {
		return driver.findElement(Product1);
	}
	public WebElement getProduct2() {
		return driver.findElement(Product2);
	}
	public WebElement getProduct3() {
		return driver.findElement(Product3);
	}
	public WebElement getProduct4() {
		return driver.findElement(Product4);
	}
	public WebElement getProduct5() {
		return driver.findElement(Product5);
	}
	public WebElement getProduct6() {
		return driver.findElement(Product6);
	}
	
		

	
	
}
