package SeleniumPractice.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownandCheckbox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		Select s =new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue("option2");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if(s.getFirstSelectedOption().isEnabled())
		{
			System.out.println("selected");
		}
		
		driver.findElement(By.id("checkBoxOption2")).click();
		if(driver.findElement(By.id("checkBoxOption2")).isSelected())
		{
			System.out.println("checkbox is checked");
		}

	}
}
