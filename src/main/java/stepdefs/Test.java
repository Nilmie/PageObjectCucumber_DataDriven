package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import ReadExcel.ExcelRead;
import PageObject.HomePage;
import PageObject.LoginJava;


public class Test {
	
	  WebDriver driver;

	  LoginJava objLogin;

	    HomePage objHomePage;
	
	    //ExtentReport extRpt = new ExtentReport();
	    ExcelRead excel = new ExcelRead();
	
	@Given("^I'm in the guru bank login page$")
	public void i_m_in_the_guru_bank_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
	    driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/V4/");
     

	 
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String username, String password) throws Throwable {
	 
	}

	@Then("^I should able to navigate to the home page$")
	public void i_should_able_to_navigate_to_the_home_page() throws Throwable {

	}

}
