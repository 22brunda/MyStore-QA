package com.qwinix.shopping.qa.steps;

import org.openqa.selenium.WebDriver;

import com.qwinix.shopping.qa.BaseDriver;

public class UserSteps {
	 
	public static WebDriver driver = BaseDriver.driver;
	ConfigReader config = new ConfigReader();
//	LoginPage objLP = new LoginPage();
	CommonUtil objCU = new  CommonUtil();

	public void openUrl() {
		driver.get(config.getUrl());
	    driver.manage().window().maximize();
	}
	
	public void Login() {	
//		objLP.username.sendKeys("Brunda");
//		objLP.phonenumber.sendKeys("9945801979");
//		objCU.waitForElement(objLP.logIn);
//		objLP.logIn.click();
	}
	
//	public void verifyLogin() throws InterruptedException {
//		Thread.sleep(10000);
//		String actual = driver.findElement(By.xpath("//a[@class='nav-link Ripple-parent active']")).getText();
//		Thread.sleep(10000);
//		System.out.println("actualvalue is = "+actual);
//		Thread.sleep(10000);
//		Assert.assertEquals("Pending Tickets", actual);
//	}		
}
