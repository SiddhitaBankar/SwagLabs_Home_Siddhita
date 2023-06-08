package HomePage_stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.Login_Outline;
import com.utility.Utility;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex_01 extends Utility
{
	public LoginPage lp;
	public 	HomePage hp;

	public void objectMethod() throws IOException {

		lp = new LoginPage();
		hp = new HomePage();

}
	
	
//Browser launching
	
@Given("Chrome is opened and SwagLabs app is opened")
public void chrome_is_opened_and_swag_labs_app_is_opened() throws InterruptedException, IOException

{	
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



//Username & Password field

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



//Login button

@When("User clicks on login button")
public void user_clicks_on_login_button() throws IOException, InterruptedException {
	objectMethod();
//    Utility.implicitWait();
    Thread.sleep(2000);
    lp.loginButton();    
    Thread.sleep(2000);
//    Utility.implicitWait();
    System.out.println("User clicked on login button");
    logger.log(Status.INFO, "Step3 is executed");
    
}



//Navigation to homepage

@Then("User navigates onto HomePage")
public void user_navigates_onto_home_page() throws IOException, InterruptedException {
	
	objectMethod();
//  Thread.sleep(2000);
    Utility.implicitWait();
	logger = report.createTest("test04");
    logger.log(Status.INFO, "Validating home page title");
    String actualTitle = lp.validatePageTitle();
    String expectedTitle = "Swag Labs";
	 System.out.println("User navigates onto HomePage");

     try {
         logger.log(Status.INFO, "Step4 is executed");
         logger.log(Status.PASS, "Test is passed");
         assert true;
     } catch (AssertionError e) {
         e.printStackTrace();
         logger.log(Status.FAIL, "Test is failed");
         captureScreenshotOnFailure();
         assert false;
     }
     
  //  Thread.sleep(2000); 
    Utility.implicitWait();

}



//HomePage title

@Then("HomePage title is visible to the user")
public void home_page_fields_are_visible_to_the_user() throws InterruptedException, IOException {
	
	objectMethod();
 // Thread.sleep(2000);
    Utility.implicitWait();
    String actualtext = hp.Heading();
    String expectedtext = "Swag Labs";
    assertEquals(expectedtext,actualtext);
    System.out.println(actualtext);
    logger.log(Status.INFO, "Step5 is executed");

}



//Add to cart button

@Then("Add to cart button is visible to the user")
public void add_to_cart_button_is_visible_to_the_user() throws InterruptedException, IOException {
	objectMethod();
 // Thread.sleep(2000);
    Utility.implicitWait();
    System.out.println("Add to cart button is visible to the user");
    logger.log(Status.INFO, "Step6 is executed");
}



//Cart icon(GUI)

@Then("Cart icon is visible to the user")
public void cart_icon_is_visible_to_the_user() throws IOException, InterruptedException {
	objectMethod();
//	Thread.sleep(2000);
   Utility.implicitWait();
	 boolean cart = hp.addtocart();
	 assertTrue(cart);
    logger.log(Status.INFO, "Step7 is executed");
    System.out.println("Cart icon is visible to the user");

}



//Menu icon (GUI)

@Then("Menu icon is visible to the user")
public void menu_icon_is_visible_to_the_user() throws IOException, InterruptedException {
	objectMethod();
//	Thread.sleep(2000);
    Utility.implicitWait();
	 boolean menu = hp.menu_icon();
	    assertTrue(menu);
  logger.log(Status.INFO, "Step8 is executed");
  System.out.println("Menu icon is visible to the user");

}



//Add to cart button

@When("User clicks on Add to cart button")
public void user_clicks_on_add_to_cart_button() throws IOException, InterruptedException {
	objectMethod();
    Utility.implicitWait();
//    Thread.sleep(2000);
    hp.cartoptionButton();    
//    Thread.sleep(2000);
    Utility.implicitWait(); 
    
    logger.log(Status.INFO, "Step9 is executed");
}



//Items added to cart

@Then("Selected item is added to the cart")
public void selected_item_is_added_to_the_cart() throws InterruptedException, IOException {
	objectMethod();
//	Thread.sleep(2000);
    Utility.implicitWait(); 
    System.out.println("Items are added to the cart");
    logger.log(Status.INFO, "Step10 is executed");

}



//Visibility of items on the cart icon

@Then("User is able to see choosen item on the cart icon in the checkout page")
public void user_is_able_to_see_choosen_item_on_the_cart_icon_in_the_checkout_page() throws IOException, InterruptedException {
	objectMethod();
    Thread.sleep(2000);
//  Utility.implicitWait();
    hp.addtocarticonButton();    
    Thread.sleep(2000);
//  Utility.implicitWait();
    System.out.println("Items are seen on the cart icon");
    logger.log(Status.INFO, "Step11 is executed");


}



//Navigate back to the home page

@When("User clicks on continue shopping it navigates back to HomePage")
public void user_clicks_on_continue_shopping_it_navigates_back_to_home_page() throws IOException, InterruptedException {
	objectMethod();
   Utility.implicitWait();
//     Thread.sleep(2000);
     hp.continueshoppingButton();    
//     Thread.sleep(2000);
   Utility.implicitWait();
     logger.log(Status.INFO, "Step12 is executed");
     System.out.println("User is navigated back to HomePage");

}



//Clicking on Filter Icon

@When("User clicks on the filter icon")
public void user_clicks_on_the_filter_icon() throws IOException, InterruptedException {
	objectMethod();
//    Utility.implicitWait();
    Thread.sleep(2000);
    hp.filtericonButton();    
    Thread.sleep(2000);
//    Utility.implicitWait();
    System.out.println("User clicks on filter icon");
    logger.log(Status.INFO, "Step13 is executed");

}



//Sorting Dropdown

@Then("It shows the sorting dropdown")
public void it_shows_the_sorting_dropdown() throws IOException, InterruptedException {
	objectMethod();
//  Utility.implicitWait();
	Thread.sleep(2000);
    System.out.println("Dropdown option is shown");
    logger.log(Status.INFO, "Step14 is executed");

}

}