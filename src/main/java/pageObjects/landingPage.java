package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {

	// First we need to define the Locators or objects

	// Locators of Login button

	public WebDriver driver;

	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By Navigation = By.cssSelector("ul[class*='navbar-right']");
	// Here we are defining the constructor to give the life to the driver

	public landingPage(WebDriver driver) {
		this.driver = driver; // this is the keyword we use in constructor

	}

//we have to define the method for the signin
	public WebElement getLogin() {
		return driver.findElement(signin);
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNav() {
		return driver.findElement(Navigation);
	}

}
