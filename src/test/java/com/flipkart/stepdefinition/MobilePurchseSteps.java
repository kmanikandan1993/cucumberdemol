package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class MobilePurchseSteps {
	static WebDriver driver;
    static String mobileName;
    static String wait;
@Given("user launches flipkart application")
public void user_launches_flipkart_application() {
	System.out.println("launch");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver,30);
}
@Given("user login by entering crendentials")
public void user_login_by_entering_crendentials() throws InterruptedException {
	  try {
			
			WebElement a = driver.findElement(By.xpath("//button[text()='✕']"));
			a.isDisplayed();
			a.click();
		} catch (Exception e) {
			System.out.println("Login popup is closed");
		}
}
@When("user search mobile")
public void user_search_mobile() {
	
	
	mobileName =" realme";
	
	WebElement bar = driver.findElement(By.name("q"));
	bar.sendKeys("realme",Keys.ENTER);
}



@When("user click on the mobile name")
public void user_click_on_the_mobile_name() throws InterruptedException {
    Thread.sleep(5000);
	WebElement mobilef = driver.findElement(By.xpath("(//div[contains(text(),'"+mobileName+"')])[5]"));
	
	mobilef.click();
	
}

@Then("user click on add to cart")
public void user_click_on_add_to_cart() throws Exception {
	String parenturl = driver.getWindowHandle();
	Set<String> childwindow = driver.getWindowHandles();
	for(String child :childwindow) {
		if (!parenturl.equals(child)) {
			driver.switchTo().window(child);
		}
	}
	
	
	Thread.sleep(500);
	
  WebElement add = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
  
  JavascriptExecutor js =( JavascriptExecutor)driver;
  
  js.executeScript("arguments[0].scrollIntoView(true)",add);
  
  add.click();
 
}


@When("user search mobile by one dim list")
public void user_search_mobile_by_one_dim_list(DataTable dataTable) {
	
   List<String> asList = dataTable.asList(String.class);
   WebElement mapp = driver.findElement(By.name("q"));
	mapp.sendKeys(asList.get(0),Keys.ENTER);
	mobileName=asList.get(0);
	
}
@When("user search mobile by one dim map")
public void user_search_mobile_by_one_dim_map(DataTable dataTable) {
	
 Map<String,String > asMap = dataTable.asMap(String.class,String.class);   

WebElement search = driver.findElement(By.name("q"));
search.sendKeys(asMap.get("3"),Keys.ENTER);

mobileName=asMap.get("3");


}
@When("user search mobile{string}")
public void user_search_mobile(String mobiles) {
 
	
	 WebElement search = driver.findElement(By.name("q"));
	 search.sendKeys(mobiles,Keys.ENTER);

	 mobileName=mobiles;

driver.quit();
	
	
	
}

}
