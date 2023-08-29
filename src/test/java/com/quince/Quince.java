package com.quince;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.common.CommonFunctions;
import com.pom.PageObjectModel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Quince extends CommonFunctions{
	CommonFunctions C = new CommonFunctions();
	PageObjectModel P = new PageObjectModel();
	@SuppressWarnings("deprecation")
	@Given("User launches the application {string}")
	public void user_launches_the_application(String url) throws Exception {
		System.out.println("Website Launched");
		
		
	}


	@When("User search the product")
	public void user_search_the_product() throws Exception{
		P.getSearch().click();
//		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
//		search.sendKeys("Mens",Keys.ENTER);
		C.waits(P.getSearch());
		
	    
	}

	@When("User search the particular product")
	public void user_search_the_particular_product() throws Exception {
		Thread.sleep(4000);
	    C.screenshot("MensDresses");
	}

	@Then("User validates the product description")
	public void user_validates_the_product_description() throws IOException, InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		  WebElement men = driver.findElement(By.xpath("(//a[contains(text(),'Mongolian ')])[1]"));
			
		JS.executeScript("arguments[0].scrollIntoView(true)", men);
		JS.executeScript("arguments[0].click()", men);
	}
	 

	@Then("User takes screenshot")
	public void user_takes_screenshot() throws IOException, InterruptedException {
		Thread.sleep(4000);
	   C.screenshot("Page");
	}

}
