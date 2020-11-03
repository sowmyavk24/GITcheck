package SeleniumPractice.Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import objectrepository.Rediffobjects;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\driver\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		@SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver(capabilities);

		capabilities.setCapability("marionette", true);
		FirefoxOptions options = new FirefoxOptions();
		options.setLegacy(true);
		driver.get("http://www.qaclickacademy.com/");
		System.out.println(driver.getCurrentUrl());
		Rediffobjects rediffobj = new Rediffobjects(driver);
		
		//rediffobj.emaild().sendKeys("abc");
		//rediffobj.password().sendKeys("sder");
		//rediffobj.submit().click();
		driver.close();

	}

}
