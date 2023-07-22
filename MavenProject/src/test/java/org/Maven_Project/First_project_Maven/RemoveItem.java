package org.Maven_Project.First_project_Maven;


import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import Base.Basepage;
import PageObjects.HomePage;
import PageObjects.ProductCart;
import PageObjects.ProductPage;
import PageObjects.StorePanel;
import PageObjects.TestStore;

@Listeners(resources.Listeners.class)
public class RemoveItem extends Basepage {

	public RemoveItem() throws IOException {
		super();
		
	}
	@BeforeTest
	public void setup() throws IOException {
		driver= getDriver();
		driver.get(getUrl());	
	}
	
	
	@AfterTest
	public void tearDown() throws InterruptedException{
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test 
	public void RemoveItemTest() throws InterruptedException, IOException {
		
		HomePage home = new HomePage(driver);
		home.getCookieClose().click();
		Thread.sleep(2000);
		home.getToggle().click();
		Thread.sleep(2000);
		home.getTestStore().click();
		
		TestStore store = new TestStore(driver);
		Thread.sleep(2000);
		store.getProduct1().click();
		
		ProductPage products= new ProductPage(driver);
		Select size = new Select(products.getSize());
		size.selectByVisibleText("M");
		products.getIncreaseQuantity().click();
		products.getAddtoCard().click();
		
		StorePanel panel=new StorePanel(driver);
		Thread.sleep(2000);
		panel.getContinueShoppBtn().click();
		products.getHome().click();
		store.getProduct6().click();
		products.getAddtoCard().click();
		Thread.sleep(2000);
		panel.getproceedToCheck().click();
		
		ProductCart cart = new ProductCart(driver);
		cart.getRemoveBtn().click();
		
		WebDriverWait wait= new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.invisibilityOf(cart.getRemoveBtn()));
		
		String price= cart.getCartvalue().getText();
		System.out.println(price);
		Assert.assertEquals(price, "$45.24");
		
		
	}
}


	

