package LatestE2EFramework.Krish;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import pageObjects.soupUILoginPage;

import resources.base;

//Extends is the keyword which we can access all the methods of the base class in to home page class
public class AssertValidation extends base {
	// below is the code to intialize the log4j driver
	private static Logger log= LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initilize() throws IOException {
		
		// old -here we are calling the intializedriver as it is having all the driver info, it is declared globally
				/*Latest- multiple Testcses are calling the same driver from the base, it is overriding the execution
				 * so we declaring driver local to avoid that overriding
				 */
		driver = initializeDriver();
		
		
		log.info("driver is initalised");
		driver.get(prop.getProperty("url"));
		log.info("driver is navigated");

	}

	
	

	@Test()

	public void basepagenavigation() throws IOException {

		// here we are calling the intializedriver as it is having all the driver
		// objects

		// defining the object of the other class to invoke the method

		landingPage lp = new landingPage(driver); /*
													 * if we dont define driver here this landing page doesnt have life
													 * to click login, that why we created constructor in homepage
													 */

		// Getting the Text by using assertions

		// Assert.assertEquals(lp.getTitle().getText(),"Featured345");
		Assert.assertTrue(lp.getNav().isDisplayed());
		log.info("succesfully completed");
	}

	@AfterTest

	public void windowclose() {
		driver.close();
	}
}
