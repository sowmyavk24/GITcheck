package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffobjectsPageObjectFactory {
	WebDriver driver;

	public RediffobjectsPageObjectFactory(WebDriver driver) {
		this.driver = driver;

	}
 By username =By.xpath("//input[@id='login1']");
 By password =By.xpath("//input[@id='password']");
 By go = By.xpath("//input[@name='proceed']");
 
public WebElement emaild() {
	return driver.findElement(username);
}

public WebElement password() {
	return driver.findElement(password);
}
public WebElement submit() {
	return driver.findElement(go);
}

}
