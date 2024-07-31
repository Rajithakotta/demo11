package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seasonacalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajit\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	  	//Add chrome switch to disable notification - "**--disable-notifications**"
	  	options.addArguments("--disable-notifications");
	     
	      WebDriver driver = new ChromeDriver(options);
		
WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		driver.get("https://vamriinternaldev-dev-ed.develop.lightning.force.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("rajitha.kotta@vamritech.com.dev");
        driver.findElement(By.id("password")).sendKeys("Rajitha@1993");
        driver.findElement(By.id("Login")).click();
        
		driver.manage().window().maximize();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-r1']"))).click();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]"))).sendKeys("Seasonal Calendars");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
		  
		WebElement New = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='New']")));
		New.click();
		 
		 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Name']"))).sendKeys("calendar");
		 
		WebElement Sd =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='End_Date__c']")));
		Sd.click();
		Sd.sendKeys("Feb 25, 2023");
		 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-textarea']"))).sendKeys("calendar");
		 
		 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search Seeds...')]"))).sendKeys("Apple");
		Thread.sleep(3000);
		 
		WebElement appleOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Apple']")));
		appleOption.click();
		 
		 
		WebElement Ed =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Start_Date__c']")));
		Ed.click();
		Ed.sendKeys("Feb 27, 2023");
		 
		 
		WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		Save.click();
	}

}
