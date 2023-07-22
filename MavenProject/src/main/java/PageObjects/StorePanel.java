package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StorePanel {
	
	public WebDriver driver;
	
	By ContinueShop = By.xpath("//button[contains(text(),'Continue')]");
	By ProceedtoCheck = By.xpath("//a[contains(text(),'Proceed')]");
	
	public StorePanel(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getContinueShoppBtn() {
		return driver.findElement(ContinueShop);
	}
	public WebElement getproceedToCheck() {
		return driver.findElement(ProceedtoCheck);
	}

}
