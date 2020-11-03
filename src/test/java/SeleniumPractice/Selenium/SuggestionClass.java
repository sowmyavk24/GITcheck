package SeleniumPractice.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuggestionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		WebDriverWait w =new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='inputs.ui-autocomplete-input']")));
		List<WebElement> options =driver.findElements(By.xpath("//*[@class='inputs.ui-autocomplete-input']"));
		for (WebElement a :options) {
			if(a.getText().equalsIgnoreCase("india"))
			{
				a.click();
			}
		}

	}

}
