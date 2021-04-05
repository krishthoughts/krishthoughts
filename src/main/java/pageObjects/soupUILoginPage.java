package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class soupUILoginPage {

	public WebDriver driver;

	// Locating the objects for sopaUILoginPage

	By email = By.id("user_email");
	By password = By.id("user_password");
	By login = By.cssSelector("input[type='submit']");

//Creating the methods for the locators

	public soupUILoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	
	}

	public WebElement getemailid() {
		return driver.findElement(email);
	}

	public WebElement getpassword() {
		return driver.findElement(password);

	}

	public WebElement loginbutton() {
		return driver.findElement(login);

	}
}