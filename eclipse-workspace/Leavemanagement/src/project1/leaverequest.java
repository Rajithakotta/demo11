package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class leaverequest {

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
driver.manage().window().maximize();
Thread.sleep(3000);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-r1']"))).click();
Thread.sleep(6000);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]"))).sendKeys("Leave Management");
Thread.sleep(3000);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
Thread.sleep(5000);
// WebElement c1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Leave Allocations']")));
//c1.click();
//Thread.sleep(3000);
WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='slds-button slds-button_icon slds-button_icon-brand']")));
button.click();
WebElement Co1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Leave Type']/following-sibling::*//button")));
Co1.click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Leave Type']/following-sibling::*//*[@class='slds-truncate' and text()='Maternity leave']"))).click();
// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[class='slds-no-flex']/following-sibling::*//*[@class='slds-hide' and name='title']"))).click();
// Thread.sleep(6000);
WebElement Co2 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Start_Date__c']")));
Co2.click();
Thread.sleep(5000);
Co2.sendKeys("Jan 3, 2024");
Thread.sleep(5000);
WebElement Co3 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='End_Date__c']")));
Co3.click();
Co3.sendKeys("Jan 3, 2024");
WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
Save.click();
	}

}
