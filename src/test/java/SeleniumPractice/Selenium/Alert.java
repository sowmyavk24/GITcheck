package SeleniumPractice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("name")).sendKeys("sowmya");
		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		String text =driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		//Assert.assertTrue(text.contains("Hello , share this practice page and share your knowledge"));
		driver.close();
		
		

	}

}
