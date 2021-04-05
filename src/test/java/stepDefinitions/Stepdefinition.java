package stepDefinitions;




import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.landingPage;
import pageObjects.soupUILoginPage;
import resources.base;

/*public class Stepdefinition extends base{

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver = initializeDriver();
	   
	}

	@Given("^Navigate to \"([^\"]*)\" website$")
	public void navigate_to_website(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^click on login link to land in to signin page$")
	public void click_on_login_link_to_land_in_to_signin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		landingPage lp = new landingPage(driver);
		lp.getLogin().click();
	   
	}

	
	@Then("^verify the user is sucessfully login$")
	public void verify_the_user_is_sucessfully_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("User enters the {string} and {string} and logs in")

	   public void user_enters_the_and_and_logs_in(String string, String string2) {

	   

	System.out.println("user entered username = "+string+ "and password =" + string2);
	       
		soupUILoginPage lp1 = new soupUILoginPage(driver);
		lp1.getemailid().sendKeys(string);
		lp1.getpassword().sendKeys(string2);

		lp1.loginbutton().click();
	   
	}

}*/
@RunWith(Cucumber.class)
public class Stepdefinition extends base{

    @Given("^Initialize the browser with chrome $")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	driver = initializeDriver();
    }
    @And("^ Navigate to \"([^\"]*)\" website$")
    public void navigate_to_something_website(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }
    @And("^click on login link to land in to signin page$")
    public void click_on_login_link_to_land_in_to_signin_page() throws Throwable {
    	landingPage lp = new landingPage(driver);
		lp.getLogin().click();
	   
    }
    @When("^the user enters the \"([^\"]*)\" and \"([^\"]*)\" and logs in $")
    public void the_user_enters_the_something_and_something_and_logs_in(String username, String password, String strArg1, String strArg2) throws Throwable {
    	soupUILoginPage lp1 = new soupUILoginPage(driver);
		lp1.getemailid().sendKeys(username);
		lp1.getpassword().sendKeys(password);

		lp1.loginbutton().click();
    }
    @Then("^verify the user is sucessfully login$")
    public void verify_the_user_is_sucessfully_login() throws Throwable {
    	
      
    }

   

   
   

}
