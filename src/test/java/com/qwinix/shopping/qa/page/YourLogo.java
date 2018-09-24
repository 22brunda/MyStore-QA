package com.qwinix.shopping.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.shopping.qa.BaseDriver;

public class YourLogo {
	public YourLogo() 
	{
		PageFactory.initElements(BaseDriver.driver, this);
	}
	
	@FindBy(xpath="(//a[contains(.,'Women')])[1]")
	public WebElement womenHover;
	
	@FindBy(xpath="(//a[contains(.,'T-shirts')])[1]")
	public WebElement womenTshirts;
	
	@FindBy(xpath="//a[contains(.,'Faded Short Sleeve T-shirts')]")
	public WebElement itemHover;
	
	@FindBy(xpath="//span[contains(.,'Add to cart')]")
	public WebElement addToCart;
	
	@FindBy(xpath="//h2[contains(.,'Product successfully added to your shopping cart')]")
	public WebElement addedToCart;
	
	@FindBy(xpath="//span[contains(.,'Proceed to checkout')]")
	public WebElement proceedToCheckout1;
	
	@FindBy(xpath="//a[@class='button-exclusive btn btn-default']")
	public WebElement continueShopping;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	public WebElement proceedToCheckout2;
	
	@FindBy(xpath="//h3[@class='page-subheading']")
	public WebElement createAnAccount;
	
	@FindBy(name="email_create")
	public WebElement email;
	
	@FindBy(name="SubmitCreate")
	public WebElement createAccount;
	
	@FindBy(id="id_gender1")
	public WebElement male;
	
	@FindBy(id="id_gender2")
	public WebElement female;
	
	@FindBy(id="customer_firstname")
	public WebElement firstName;
	
	@FindBy(id="customer_lastname")
	public WebElement lastName;
	
	@FindBy(id="email")
	public WebElement cus_email;
	
	@FindBy(id="passwd")
	public WebElement cus_passwd;
	
	@FindBy(id="days")
	public WebElement day;
	
	@FindBy(id="months")
	public WebElement month;
	
	@FindBy(id="years")
	public WebElement year;
	
	@FindBy(xpath="//h3[text()='Your address']")
	public WebElement yourAddress;
	
	@FindBy(id="firstname")
	public WebElement fName;
	
	@FindBy(id="lastname")
	public WebElement lName;
	
	@FindBy(id="company")
	public WebElement company;
	
	@FindBy(id="address1")
	public WebElement address1;
	
	@FindBy(id="address2")
	public WebElement address2;
	
	@FindBy(id="city")
	public WebElement city;
	
	@FindBy(id="id_state")
	public WebElement state;
	
	@FindBy(id="postcode")
	public WebElement zipCode;
	
	@FindBy(id="id_country")
	public WebElement country;
	
	@FindBy(id="other")
	public WebElement add_info;
	
	@FindBy(id="phone")
	public WebElement phoneNumber;
	
	@FindBy(id="phone_mobile")
	public WebElement mobileNum;
	
	@FindBy(id="alias")
	public WebElement refAddress;
	
	@FindBy(id="submitAccount")
	public WebElement register;
	
	@FindBy(xpath="//h4[text()='Follow us']")
	public WebElement followUs;
	
	@FindBy(xpath="//button[@name='processAddress']")
	public WebElement processAddress;
	
	@FindBy(xpath="//h1[contains(.,'Shipping')]")
	public WebElement shipping;
	
	@FindBy(name="cgv")
	public WebElement agreeCondition;
	
	@FindBy(name="processCarrier")
	public WebElement processCarrier;
	
	@FindBy(xpath="//h4[text()='Newsletter']")
	public WebElement newsLetter;
	
	@FindBy(xpath="//a[@class='bankwire']")
	public WebElement payBankwire;
	
	@FindBy(xpath="//a[@class='cheque']")
	public WebElement payBycheque;
	
	@FindBy(xpath=".//*[@id='cart_navigation']/a")
	public WebElement otherPayment;
	
	@FindBy(xpath=".//*[@id='cart_navigation']/button")
	public WebElement confirmOrder;
	
	@FindBy(xpath="//h1[text()='Order confirmation']")
	public WebElement orderConfirmation;
}
