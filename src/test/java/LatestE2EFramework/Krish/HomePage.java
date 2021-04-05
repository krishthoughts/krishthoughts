package LatestE2EFramework.Krish;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import pageObjects.soupUILoginPage;

import resources.base;

//Extends is the keyword which we can access all the methods of the base class in to home page class
public class HomePage extends base {
	public WebDriver driver;
	private static Logger log= LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initilize() throws IOException {
		// old -here we are calling the intializedriver as it is having all the driver info, it is declared globally
		/*Latest- multiple Testcses are calling the same driver from the base, it is overriding the execution
		 * so we declaring driver local to avoid that overriding
		 */
		driver = initializeDriver();

	}

	@Test(dataProvider = "getdata")

	public void basepagenavigation(String Username, String Password) throws IOException {

		driver.get(prop.getProperty("url"));
		log.info("Succesfully URL opened");
		
		/* If we declare this url in above aftertest method, 
		there is no scope of executing multiple data. Thats why we declare here*/
		landingPage lp = new landingPage(driver); /*
													 * if we dont define driver here this landing page doesnt have life
													 * to click login, that why we created constructor in homepage
													 */
		lp.getLogin().click();
		log.info("Succesfully opend login page");

		// Invoking the SoapUILOginPage

		soupUILoginPage lp1 = new soupUILoginPage(driver);
		lp1.getemailid().sendKeys(Username);
		lp1.getpassword().sendKeys(Password);

		lp1.loginbutton().click();

	}

	@AfterTest

	public void windowclose() {
		driver.close();
	}

	@DataProvider
	private Object[][] getdata() {
		// Row Stands for how many different data types, Test should run
		// Coloumn Stands for how many values per each test
// If an array set to [2] it means
		// 0,1
		Object[][] data = new Object[2][2];
		// 0th row or index
		data[0][0] = "stusername";
		data[0][1] = "145";

		// 1st row or Index

		data[1][0] = "ndusername";
		data[1][1] = "8547";
		return data;
		// Earlier we have given void but our return type should be Array so we are
		// giving "data" here
	}
}
