package SeleniumPractice.Selenium;


import java.io.File;
import java.io.File.*;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTable {

	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			System.out.println(driver.getCurrentUrl());
			driver.manage().window().maximize();
			//List<WebElement> iframe =driver.findElements(By.tagName("iframe"));
			//System.out.println(iframe.size());
			//driver.switchTo().frame("courses-iframe");
			
			WebElement table =driver.findElement(By.xpath("//*[@id='product']"));
			table.click();
			//table.sendKeys(Keys.CONTROL,"t");//opens in the new tab
			List<WebElement> rowsList = table.findElements(By.tagName("tr"));
			System.out.println(rowsList.size());
			for (WebElement rows :rowsList)
			{
				List<WebElement> list =rows.findElements(By.tagName("td"));
				for (WebElement column : list)
				{
					if(column.getText().equalsIgnoreCase("Learn SQL in Practical + Database Testing from Scratch"))
					{
						System.out.println("found");
					}
					
				}
			}
			
			File sc =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sc,new File("D:\\Selenium\\snapshot.png"));

	}

}
