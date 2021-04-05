package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
public Properties prop;
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {

		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\saine\\eclipse-workspace\\Krish\\src\\main\\java\\resources\\data.properties");

//below is to load the data from the file
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		// in below snippet we are extracting the property value so we should  use equals instead of  “”==”” 
		if (browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium software\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium software\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName == "IE") {
// no path so far I will give later
		}

		// Timeouts

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}



}
