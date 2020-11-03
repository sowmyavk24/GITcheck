package SeleniumPractice.Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Help")).click();
		System.out.println(driver.getTitle());
		Set<String> id =driver.getWindowHandles();
		System.out.println(id.size());
		ArrayList<String> list =new ArrayList<String>();
		list.addAll(id);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		String txt =driver.findElement(By.xpath("/html/body/div[2]/header/div[5]/h1/div[2]")).getText();
		System.out.println(txt);
		driver.switchTo().defaultContent();
		
		 

	}

}
