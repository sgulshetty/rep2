package org.cucu.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginApp {
	public static WebDriver driver = null;

	
	@Given("^User is on the Application login page$")
	public void user_is_on_the_Application_login_page(){	
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.store.demoqa.com");
	}
	
	@When("^user enters valid user name$")
	public void user_enters_valid_user_name(){
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.id("log")).sendKeys("sgulshetty");
		
	}
	
	@When("^user enters valid password$")
	public void user_enters_valid_password() {
		driver.findElement(By.id("pwd")).sendKeys("India123@");
	}
	
	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button(){
		driver.findElement(By.id("login")).click();
	}
	
	
	@Then("^user is on the Application home page$")
	public void user_is_on_the_Application_home_page(){
		System.out.println("Login Successfully");
		
	}
	
	@When("^user logs out of the Application$")
	public void user_logs_out_of_the_Application(){
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}
	
	@Then("^Message is displayed$")
	public void message_is_displayed(){
		System.out.println("LogOut Successfully");
		driver.quit();
	}
					
}

