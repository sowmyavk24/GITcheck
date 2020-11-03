package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediffobjects {
	WebDriver driver;

	public Rediffobjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	// By username =By.xpath("//input[@id='login1']");
	// By password =By.xpath("//input[@id='password']");
	// By go = By.xpath("//input[@name='proceed']");

	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='proceed']")
	WebElement go;

	public WebElement emaild() {
		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement submit() {
		return go;
	}

}
