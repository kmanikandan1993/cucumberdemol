package com.flipkart.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public void beforeScenario() {
		
		System.out.println("before");

}
@After
public void afterScenario() {
	System.out.println("after");

}}