package SeleniumPractice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		if (driver.findElement(By.xpath("//input[@value='radio2']")).isSelected())
		{
			System.out.println("Radiobutton is selected");
		}
		

	}

}
