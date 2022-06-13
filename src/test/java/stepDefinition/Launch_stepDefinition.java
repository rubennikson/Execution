package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Launch_stepDefinition{


	
@Given("Navigate to app")
public void navigate_to_app() {
    // Write code here that turns the phrase above into concrete actions

    
    System.setProperty("webdriver.chrome.driver","driver/chromedrivers.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://amazon.in");
 
}



@When("Search for a product")
public void search_for_a_product() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("second");
}
@Then("Close the browser")
public void close_the_browser() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("third");
}
}