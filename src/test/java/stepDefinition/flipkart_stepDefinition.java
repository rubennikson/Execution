package stepDefinition; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flipkart_stepDefinition{


@Given("Navigate to flipkart app")
public void navigate_to_flipkart_app() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
    
    System.setProperty("webdriver.chrome.driver","driver/chromedrivers.exe");
   	WebDriver driver=new ChromeDriver();
   	driver.navigate().to("https://flipkart.com");
}
@When("Search for product")
public void search_for_product() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
}
@Then("Close the browsers")
public void close_the_browsers() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
}






}
