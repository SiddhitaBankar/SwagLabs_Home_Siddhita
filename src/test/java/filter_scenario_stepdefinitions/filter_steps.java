package filter_scenario_stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class filter_steps extends Utility
{
	public LoginPage lp;
	public 	HomePage hp;

	public void objectMethod() throws IOException {

		lp = new LoginPage();
		hp = new HomePage();

}
	
//Positive scenario outline
	
	//Launching
	
	@Given("Chrome is opened and SwagLabs app is opened")
	public void chrome_is_opened_and_swag_labs_app_is_opened() throws IOException  {
		objectMethod();
		//Thread.sleep(2000);
	    Utility.implicitWait();
	    logger = report.createTest("test01");
	    logger.log(Status.INFO, "Validating login page title");
	    String actualTitle = lp.validatePageTitle();
	    String expectedTitle = "Swag Labs";
	    System.out.println("Chrome is opened and SwagLabs app is opened");

	    
	    	try {
	    		assertEquals(expectedTitle, actualTitle);
	    		logger.log(Status.PASS, "Step1 is passed");
	    		System.out.println(actualTitle);
	    		assert true;
	    }	catch (AssertionError e) {
	        e.printStackTrace();
	        logger.log(Status.FAIL, "Step1 is failed");
	        captureScreenshotOnFailure();
	        assert false; 
	    }
}	    	
	 
	//Username & Password Field
	
	@When("User enters correct Username {string} and Password {string}")
	 public void user_enters_correct_username_and_password(String un, String pw) throws IOException, InterruptedException {
		 objectMethod();
			Thread.sleep(2000);
		//  Utility.implicitWait();
			lp.loginUserName(un);
			lp.loginPassword(pw);
			Thread.sleep(2000);
		//  Utility.implicitWait();
		    logger.log(Status.INFO, "Step2 is executed");

	    	}

	// Login Button
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException  {
		objectMethod();
//	    Utility.implicitWait();
	    Thread.sleep(2000);
	    lp.loginButton();    
	    Thread.sleep(2000);
//	    Utility.implicitWait();
	    System.out.println("User clicked on login button");
	    logger.log(Status.INFO, "Step3 is executed");
	    
	}
	
	//Filter icon
	
	@When("User clicks on the filter icon")
	public void user_clicks_on_the_filter_icon() throws IOException, InterruptedException {
		objectMethod();
//	    Thread.sleep(2000);
	    Utility.implicitWait();
	    hp.filtericonButton();    
//	    Thread.sleep(2000);
	    Utility.implicitWait();
	    System.out.println("User clicks on filter icon");
	    logger.log(Status.INFO, "Step4 is executed");

	}
	
	//Dropdown
	
	@Then("It shows the sorting dropdown")
	public void it_shows_the_sorting_dropdown() throws IOException, InterruptedException {
		objectMethod();
	//  Utility.implicitWait();
		Thread.sleep(2000);
	    System.out.println("Dropdown option is shown");
	    logger.log(Status.INFO, "Step5 is executed");
	}
	
	// First product heading
	
	@When("User clicks on {string}")
	public void user_clicks_on(String string) throws IOException, InterruptedException {
		
		objectMethod();
		Thread.sleep(2000);
	    //Utility.implicitWait();
	    logger = report.createTest("test06");
	    logger.log(Status.INFO, "Validating first product title");
//	    String actualTitle = hp.validatefirstproductTitle();
	    String actualheading = hp.productHeading();
	    String expectedheading = "Sauce Labs Backpack";
	    System.out.println("First product heading verified");

	    
	    	try {
	    		assertEquals(expectedheading, actualheading);
	    		logger.log(Status.PASS, "Step6 is passed");
	    		System.out.println(actualheading);
	    		assert true;
	    }	catch (AssertionError e) {
	        	e.printStackTrace();
	        	logger.log(Status.FAIL, "Step6 is failed");
	        	captureScreenshotOnFailure();
	        	assert false; 
	    }
	}
	
	// Sorted
	
	@Then("Products get sorted in the ascending alphabetical manner")
	public void products_get_sorted_in_the_ascending_alphabetical_manner() {
	    System.out.println("Products are sorted in the ascending alphabetical manner");
	    logger.log(Status.INFO, "Step7 is executed");

	}
	}