package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajit\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	  	options.addArguments("--disable-notifications");  

	 WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		driver.get("https://remsdev4-dev-ed.my.salesforce.com/");
		//Add chrome switch to disable notification - "**--disable-notifications**"
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("lmsadmin@vamritech.com");
	        driver.findElement(By.id("password")).sendKeys("Password@123");
	        driver.findElement(By.id("Login")).click();
	        driver.manage().window().maximize();
	driver.manage().window().maximize();
	/**Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-r1']"))).click();
	Thread.sleep(6000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]"))).sendKeys("Leave Management");
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
	  Thread.sleep(5000);

	   WebElement csf1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='My Leaves']")));
	   csf1.click();
	   Thread.sleep(2000);
	   WebElement csf2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='My Leave Balance']")));
	   csf2.click();
	   Thread.sleep(6000);
	WebElement csf3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='Leave Requests']")));
	   csf3.click();
	   Thread.sleep(6000);
	   WebElement csf4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='Leave Summary']")));
	   csf4.click();
**/
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-r1']"))).click();
	Thread.sleep(6000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]"))).sendKeys("Leave Management");
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
	  Thread.sleep(5000);
	 
	 
	  WebElement csf3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='My Leaves']")));
	  csf3.click();
	 
	 
	  WebElement relatedTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='slds-button slds-button_icon slds-button_icon-border-filled']")));
	  relatedTab.click();
	  
	  
	  WebElement Co1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Leave Type']/following-sibling::*//button")));
	  Co1.click();
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Leave Type']/following-sibling::*//*[@class='slds-truncate' and text()='Casual leave']"))).click();
	  Thread.sleep(6000);
	 
	  WebElement Co2 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='remsdev4__Start_Date__c']")));
	  Co2.click();
	  Co2.sendKeys("Nov 15, 2023");
	  
	  WebElement Co3 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='remsdev4__End_Date__c']")));
	  Co3.click();
	  Co3.sendKeys("Nov 17, 2023");
	  Thread.sleep(3000);
	  WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
	  Save.click();
	  Thread.sleep(6000);
	  /**WebElement csf2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='My Leave Balance']")));
	   csf2.click();
	   Thread.sleep(6000);
	WebElement csf4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='Leave Requests']")));
	   csf4.click();
	   Thread.sleep(6000);
	   WebElement csf5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='Leave Summary']")));
	   csf5.click();**/
	   
}
}