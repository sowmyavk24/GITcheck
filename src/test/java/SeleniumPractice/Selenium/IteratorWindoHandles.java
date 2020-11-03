package SeleniumPractice.Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IteratorWindoHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Help")).click();
		System.out.println(driver.getTitle());
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwindows =driver.getWindowHandles();
		System.out.println(allwindows.size());
		for (String windows : allwindows)
		{
			if (!(windows.equals(parent))) 
			{ if(driver.switchTo().window(windows).getTitle().equalsIgnoreCase("Google Account Help"))
			{
				String txt =driver.findElement(By.xpath("/html/body/div[2]/header/div[5]/h1/div[2]")).getText();
				System.out.println(txt);
				driver.switchTo().defaultContent();
				}
				
			}
		}
		
		

	}

}
