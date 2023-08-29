package com.common;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonFunctions {
	CommonFunctions C = new CommonFunctions();
	static long StartTime;
	@Before
	public void beforeScenario() {
		System.out.println("Before Scenario");
		C.launchUrl("https://www.quince.com/");
		StartTime = System.currentTimeMillis();
		
	}
	@After
	public void afterScenario() {
		System.out.println("After Scenario");
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - StartTime);
	}
	


}
