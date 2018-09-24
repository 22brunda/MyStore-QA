package com.qwinix.shopping.qa.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qwinix.shopping.qa.BaseDriver;
import com.qwinix.shopping.qa.page.YourLogo;

public class OrderMaterial {
	public WebDriver driver = BaseDriver.driver;
	public static CommonUtil objCOM = new CommonUtil();
	YourLogo objYL = new YourLogo();

	public void purchaseMaterial() throws InterruptedException {
		objCOM.waitForPageLoaded();
		//Hover to Women and click T-shirts
		Actions hoverWomen = new Actions(driver);
		hoverWomen.moveToElement(objYL.womenHover).perform();
		Thread.sleep(5000);
		WebElement tShirt= driver.findElement(By.xpath("(//a[contains(.,'T-shirts')])[1]"));
		Thread.sleep(5000);
		hoverWomen.moveToElement(tShirt).click().perform();
		Thread.sleep(5000);
		
		//Scroll till Add to cart
		WebElement scrollforItem = driver.findElement(By.xpath("//a[contains(.,'Faded Short Sleeve T-shirts')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollforItem);
		Thread.sleep(5000); 
		
		//Hover to Women and click T-shirts
		Actions hoverMat = new Actions(driver);
		hoverMat.moveToElement(objYL.itemHover).perform();
		Thread.sleep(1000);
		WebElement addToCart= driver.findElement(By.xpath("//span[contains(.,'Add to cart')]"));
		Thread.sleep(5000);
		hoverMat.moveToElement(addToCart).click().perform();
		Thread.sleep(5000);
		
		
		//Verify for product add to cart successfully and Proceed to checkout
		String productAdded = driver.findElement(By.xpath("//h2[contains(.,'Product successfully added to your shopping cart')]")).getText();
		Thread.sleep(1000);
		Assert.assertEquals("Product successfully added to your shopping cart", productAdded);
		System.out.println("actualvalue is = "+productAdded);
		objYL.proceedToCheckout1.click();
		Thread.sleep(1000);
		
		//Summary
		//Scroll and Verify for Continue Shopping and Proceed to checkout
		String continueShopping = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']")).getText();
		Thread.sleep(1000);
		System.out.println("actualvalue is = "+ continueShopping);
		Thread.sleep(1000);
		Assert.assertEquals("Continue shopping", continueShopping);
		objYL.proceedToCheckout2.click();
		Thread.sleep(1000);
		
		//SignIn
		//Scroll till Email TextBox
		WebElement scrollforEmail = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollforEmail);
		Thread.sleep(5000); 
		objYL.email.sendKeys("Nikitha11@gmail.com"); 
		objYL.createAccount.click();
		objYL.female.click();
		objYL.firstName.sendKeys("Nikitha");
		objYL.lastName.sendKeys("S");
		objYL.cus_passwd.sendKeys("Nikitha@22");
		
		//Scroll till Your address
		WebElement scrollAddress = driver.findElement(By.xpath("//h3[text()='Your address']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollAddress);
		Thread.sleep(5000); 
		objYL.company.sendKeys("Qwinix");
		objYL.address1.sendKeys("2nd Street, Hebbal Industrial Area");
		objYL.address2.sendKeys("3rd cross");	
		objYL.city.sendKeys("Mysore");
		
		///Select Dropdown for State
		Select state = new Select(objYL.state);
		state.selectByVisibleText("Indiana");
		objYL.zipCode.sendKeys("46001");
		Select country = new Select(objYL.country);
		country.selectByVisibleText("United States");
		objYL.add_info.sendKeys("Automation testing");
		objYL.phoneNumber.sendKeys("9874569098");
		objYL.mobileNum.sendKeys("9945787234");
		objYL.refAddress.clear();
		objYL.refAddress.sendKeys("Hebbal, Mysore");
		objYL.register.click();
		Thread.sleep(1000);
		
		//Address
		//Scroll till FollowUS
		objCOM.waitForPageLoaded();
		WebElement scrollForFollowUs = driver.findElement(By.xpath("//h4[text()='Follow us']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollForFollowUs);
		Thread.sleep(5000);
		objYL.processAddress.click();
		
		//Scroll till shipping and agree terms and conditions and proceed to checkout
		objCOM.waitForPageLoaded();
		WebElement scrollForShipping = driver.findElement(By.xpath("//h1[contains(.,'Shipping')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollForShipping);
		Thread.sleep(5000);
		
		//checkbox click 
		driver.findElement(By.name("cgv")).click();
		objYL.processCarrier.click();
		WebElement scrollFornewsLetter = driver.findElement(By.xpath("//h4[text()='Newsletter']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollFornewsLetter);
		Thread.sleep(5000);
		
		//payment
		objYL.payBankwire.click();
		objCOM.waitForPageLoaded();
		WebElement scrollForPayment = driver.findElement(By.xpath(".//*[@id='cart_navigation']/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollForPayment);
		Thread.sleep(5000);
		objYL.confirmOrder.click();
		
		//order confirmation
		objCOM.waitForPageLoaded();
		String orderConfirmation = driver.findElement(By.xpath("//h1[text()='Order confirmation']")).getText();
		Thread.sleep(1000);
		System.out.println("actualvalue is = "+ orderConfirmation);
		Thread.sleep(1000);
		Assert.assertEquals("ORDER CONFIRMATION", orderConfirmation);
	}
}
