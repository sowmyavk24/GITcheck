package SeleniumPractice.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement e2 = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		e2.click();
		if (e2.isSelected()) {
			System.out.println("Radiobutton selected");
		}

		Thread.sleep(2000);

		WebElement e5 = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		e5.click();
		WebElement e7 = driver.findElement(By.xpath("//a[@text='Ajmer (KQH)']"));
		e7.click();

		Thread.sleep(2000);

		WebElement e3 = driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"));
		e3.click();

		WebElement e4 = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		e4.click();
		e4.sendKeys("25-09-2020");
		e4.click();

		if (e4.isEnabled()) {
			System.out.println("from calendar is displayed");
		}

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{
			WebElement e14 = driver.findElement(By.id("ctl00_mainContent_view_date1"));
			e14.click();
			e14.sendKeys("26-09-2020");
			e14.click();

			System.out.println("its enabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}
		
		//driver.findElement(arg0)

	}

}
