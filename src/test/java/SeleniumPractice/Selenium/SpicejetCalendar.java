package SeleniumPractice.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement e2 = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		e2.click();
		if (e2.isSelected()) {
			System.out.println("Radiobutton selected");
			
			WebElement e1 = driver.findElement(By.id("ctl00_mainContent_view_date1"));
			e1.click();
			WebElement e3=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/table/thead"));
			List<WebElement>columns=e3.findElements(By.tagName("td"));
			for (WebElement  cell: columns)
			{
				if (cell.getText().contains("27")) {
	                cell.click();
	                break;
	            }
				
				 try {
			            Thread.sleep(4000);
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
			}
			
			
			
		}

	}

}
