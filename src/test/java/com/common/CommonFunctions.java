package com.common;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {
	public static WebDriver driver;
	public void launchUrl(String url) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
		driver = new EdgeDriver(options);
		driver.get(url);	
		
		}
	public void waits(WebElement ele) {
		WebDriverWait W = new WebDriverWait(driver, Duration.ofSeconds(10));
		W.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public void screenshot(String name) throws IOException {
		 TakesScreenshot ts = (TakesScreenshot)driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    File target = new File("C:\\Users\\HEMU\\eclipse-workspace2\\Project\\target\\"+name+".png");
		    FileUtils.copyFile(source, target);
	}
}
