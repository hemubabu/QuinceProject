package com.google;

import java.io.File;
import java.util.LinkedList;
import java.util.*;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception   {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		driver.findElement(By.name("q")).sendKeys("redmi",Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> L = driver.findElements(By.xpath("(//div[contains(text(),'REDMI ')])[1]"));  
		for(int i=0;i<L.size();i++) {
			WebElement ele = L.get(2);
			ele.click();
		}
//		driver.findElement(By.xpath("(//div[contains(text(),'REDMI ')])[2]")).click();
//		driver.findElement(By.xpath("(//div[contains(text(),'REDMI ')])[3]")).click();
//		String Parent = driver.getWindowHandle();
//		System.out.println(Parent);
//		Set<String> child = driver.getWindowHandles();
//		List<String> childs = new LinkedList<String>();
//		childs.addAll(child);
//		Thread.sleep(3000);
//		for(int i=0;i<childs.size();i++) {
//			if(!Parent.equals(childs)) {
//				driver.switchTo().window(childs.get(1));
//			}
//		}
//	
//		WebElement SingleDropdown = driver.findElement(By.xpath("//select[@id='first']"));
//		Select S = new Select(SingleDropdown);
//		S.selectByVisibleText("Iphone");
//		boolean multiple = S.isMultiple();
//		System.out.println(multiple);
//		List<WebElement> option = S.getOptions();
//		for(int i=0;i<option.size();i++) {
//			WebElement element = option.get(i);
//			String text = element.getText();
//			System.out.println(text);
//		}
		
		
		
		
		
//		WebElement input = driver.findElement(By.name("q"));
//		input.sendKeys("cognizant news");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='lJ9FBc']/center/input[@class='gNO89b']")).click();
//		Thread.sleep(3000);
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File("C:\\Users\\HEMU\\eclipse-workspace2\\Project\\target\\CTS.png");
//		FileUtils.copyFile(source, target);
//		driver.quit();
	}

}
