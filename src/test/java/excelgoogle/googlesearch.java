package excelgoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.cucumber.java.PendingException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googlesearch {
	
	WebDriver driver=null;
	
	@Given("^Go to google browser$")
	public void go_to_google_browser() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

	@Given("^open the new tab$")
	public void open_the_new_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User in browser");
	    driver.navigate().to("https://google.com");
	    
	}

	@When("^type in search bar$")
	public void type_in_search_bar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	
	}

	@Then("^hit enter it will navigate to next page$")
	public void hit_enter_it_will_navigate_to_next_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
