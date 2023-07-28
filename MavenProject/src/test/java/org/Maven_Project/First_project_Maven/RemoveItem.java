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
import Base.ExtentManager;
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
		
		ExtentManager.log("RemoveItem_From_Cart_Test");
		
		HomePage home = new HomePage(driver);
		ExtentManager.pass("Reached Home page");
		home.getCookieClose().click();
		Thread.sleep(2000);
		home.getToggle().click();
		Thread.sleep(2000);
		home.getTestStore().click();
		ExtentManager.pass("Reached Store page");
		
		TestStore store = new TestStore(driver);
		ExtentManager.pass("Reached Product page");
		Thread.sleep(2000);
		store.getProduct1().click();
		
		ProductPage products= new ProductPage(driver);
		Select size = new Select(products.getSize());
		size.selectByVisibleText("M");
		ExtentManager.pass("Successfully increased Size");
		products.getIncreaseQuantity().click();
		ExtentManager.pass("Successfully Increased Quantity");
		products.getAddtoCard().click();
		ExtentManager.pass("Successfully added to cart");
		
		StorePanel panel=new StorePanel(driver);
		Thread.sleep(2000);
		panel.getContinueShoppBtn().click();
		products.getHome().click();
		ExtentManager.pass("again Reached Home page successfully");
		store.getProduct6().click();
		products.getAddtoCard().click();
		ExtentManager.pass(" Succeessfully Added another prouct to cart");
		Thread.sleep(2000);
		panel.getproceedToCheck().click();
		
		ProductCart cart = new ProductCart(driver);

		cart.getRemoveBtn().click();
		ExtentManager.pass(" Succeessfully Removed item from cart");
		
		WebDriverWait wait= new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.invisibilityOf(cart.getRemoveBtn()));
	
		try {
			Assert.assertEquals(cart.getCartvalue().getText(), "$45.23");
			ExtentManager.pass("The Total amount matches the expected amount");
			
		}
		catch(AssertionError e){
			Assert.fail("cart amount did not match expected amount , it found "+cart.getCartvalue().getText()+ "expected $45.24");
			ExtentManager.fail("The amont did not match");
		}
		
		
		
	}
}


	

