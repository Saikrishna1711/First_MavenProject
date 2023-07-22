package org.Maven_Project.First_project_Maven;

import java.io.IOException;



import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Basepage;
import PageObjects.HomePage;
import PageObjects.Order_Address;
import PageObjects.Order_Payment;
import PageObjects.Order_PersonalInfo;
import PageObjects.Order_ShipMethod;
import PageObjects.ProductCart;
import PageObjects.ProductPage;
import PageObjects.StorePanel;
import PageObjects.TestStore;
@Listeners(resources.Listeners.class) 
public class OrderTest extends Basepage {

	public OrderTest() throws IOException {
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
	public void End2EndTest() throws InterruptedException, IOException {
		
		HomePage home = new HomePage(driver);
		home.getCookieClose().click();
		Thread.sleep(1000);
		home.getToggle().click();
		Thread.sleep(1000);
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
		panel.getproceedToCheck().click();

		
		ProductCart cart = new ProductCart(driver);
		cart.getHavePromo().click();
		cart.getPromoTextBox().sendKeys("20OFF");
		cart.getPromoAddBtn().click();
		Thread.sleep(2000);
		cart.getProceedToCheckOutBtn().click();
		
		Order_PersonalInfo info = new Order_PersonalInfo(driver);
		info.getFirstName().sendKeys("test");
		info.getLastName().sendKeys("Maven");
		info.getEmail().sendKeys("testmaven@gmail.com");
		info.getTermsCheckBox().click();
		Thread.sleep(2000);
		info.getContinueBtn().click();
		
		Order_Address address= new Order_Address(driver);
		address.getAddress().sendKeys("123 street");
		address.getCity().sendKeys("Test City");
		Select state = new Select(address.getState());
		state.selectByVisibleText("Alaska");
		address.getPostalCode().sendKeys("78901");
		Thread.sleep(2000);
		address.getContinueBtn().click();

		Order_ShipMethod shipmethod = new Order_ShipMethod(driver);
		shipmethod.getMessage().sendKeys("Im not at home please put order in my porch");
		Thread.sleep(2000);
		shipmethod.getContinueBtn().click();
		
		Order_Payment payment = new Order_Payment(driver);
		payment.getPayByCheck().click();
		payment.getTermsCheckBox().click();
		Thread.sleep(2000);
		payment.getOrderBtn().click();
		
		
		
		
		
		
	}
	
	
	
	
	

}
