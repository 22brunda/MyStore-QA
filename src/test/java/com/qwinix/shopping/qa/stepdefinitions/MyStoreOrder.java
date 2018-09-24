package com.qwinix.shopping.qa.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.qwinix.shopping.qa.BaseDriver;
import com.qwinix.shopping.qa.steps.CommonUtil;
import com.qwinix.shopping.qa.steps.OrderMaterial;
import com.qwinix.shopping.qa.steps.UserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStoreOrder {
	UserSteps objUS = new UserSteps();
	BaseDriver objBD = new BaseDriver();
	WebDriver driver = objBD.driver;
	CommonUtil objCU = new  CommonUtil();
	OrderMaterial objMAT = new OrderMaterial();
	
	@Given("^I am on YourLogo Home page$")
	public void i_am_on_YourLogo_Home_page() throws Throwable {
	    objUS.openUrl();
	}

	@When("^I click on Women Tab$")
	public void i_click_on_Women_Tab() throws Throwable {
	    objMAT.purchaseMaterial();
	}

	@Then("^I should be able to select T-shirt$")
	public void i_should_be_able_to_select_T_shirt() throws Throwable {
	    
	}

	@Then("^I shoud able to purchase the Material$")
	public void i_shoud_able_to_purchase_the_Material() throws Throwable {
	    
	}	
}
