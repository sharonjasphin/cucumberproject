package StepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	
	public WebDriver driver;
	
	@Given("User login")
	public void user_login() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver();
		driver.get("https://www.news18.com/");
	    System.out.println("Hi");
	}

	@And("User enters Username and Password")
	public void user_enters_username_and_password() {
		 System.out.println("Hello");
	}

	@When("Click Login")
	public void click_login() {
		System.out.println("How are you");
	}

	@Then("logout")
	public void logout() {
		System.out.println("Bye");
	} 
	@When("Click Login")
	public void click_login1() {
		System.out.println("How are you");
	}
}
