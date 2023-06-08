package Excel_Stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.aventstack.extentreports.Status;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.Login_Outline;
import com.utility.Config;
import com.utility.ExcelReader;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Excel extends Utility
{

	
	public LoginPage lp;
	public 	HomePage hp;
	public ExcelReader reader;
	
	public void objectMethod() throws IOException {

		lp = new LoginPage();
		hp = new HomePage();
}
	
	
	
//Launching
	
	@Given("Chrome is opened and SwagLabs app is opened")
	public void chrome_is_opened_and_swag_labs_app_is_opened() throws InterruptedException, IOException 
	{
		objectMethod();
		Thread.sleep(2000);
//	    Utility.implicitWait();
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
	

	
//Username & Password field
	
	@When("user fills the data from given {string} and rowsheet {int} in username and password field")
	public void user_fills_the_data_from_given_and_rowsheet_in_username_and_password_field(String sheetName, Integer rowNumber) throws InterruptedException, IOException, InvalidFormatException 
	{
	    
		
		Thread.sleep(10000);
        objectMethod();
        reader = new ExcelReader();
        List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);

        String uname = testData.get(rowNumber).get("username");
        String pword = testData.get(rowNumber).get("password");
         
        lp.loginUserName(uname);
        lp.loginPassword(pword);
        Thread.sleep(5000);
	}
		

	
//Login
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException {
		objectMethod();
        lp = lp.loginButton();
        Thread.sleep(5000);
//	    Utility.implicitWait();
      logger.log(Status.INFO, "Step3 is executed");
 
}
	

	
//Result is displayed
	
	@Then("Relevant search result is displayed")
	public void relevant_search_result_is_displayed() throws IOException, InterruptedException 
	{
	   objectMethod();
	   Thread.sleep(2000);
//	    Utility.implicitWait();
	   System.out.println("Relevant search result is displayed");
	}

}
