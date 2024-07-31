package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Feedback {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajit\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	       options.addArguments("--disable-notifications");
	       WebDriver driver = new ChromeDriver(options);
	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
	       driver.get("https://vamriinternaldev-dev-ed.develop.lightning.force.com/");
	       wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("rajitha.kotta@vamritech.com.dev");
	       driver.findElement(By.id("password")).sendKeys("Rajitha@1993");
	       driver.findElement(By.id("Login")).click();
	       driver.manage().window().maximize();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-r1']"))).click();
	Thread.sleep(6000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]"))).sendKeys("Feedbacks");
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
	WebElement New = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='New']")));
	New.click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-textarea']"))).sendKeys("Scheme");
	WebElement dt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Submission_Date__c']")));
	dt.click();
	dt.sendKeys("Feb 25, 2023");
	WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
	Save.click();
	}

}
