package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.CommonFunctions;

public class PageObjectModel extends CommonFunctions {
	public PageObjectModel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement search;
	public WebElement getSearch() {
		return search;
		
	}

}
