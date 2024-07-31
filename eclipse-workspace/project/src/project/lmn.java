package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class lmn {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajit\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	  	//Add chrome switch to disable notification - "**--disable-notifications**"
	  	options.addArguments("--disable-notifications");
	     
	      WebDriver driver = new ChromeDriver(options);
		
WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
driver.get("https://remsdev4-dev-ed.my.salesforce.com/");
WebElement username = driver.findElement(By.name("username"));
username.sendKeys("rajitha.kotta@vamritech.com.remsdev4");
driver.findElement(By.name("pw")).sendKeys("Shyam@1234");
driver.findElement(By.name("Login")).click();
driver.manage().window().maximize();
		
	Thread.sleep(3000);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-r1']"))).click();
        Thread.sleep(6000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]"))).sendKeys("Leave Management");
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
          Thread.sleep(5000);
         
          WebElement c1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-target-selection-name='sfdc:TabDefinition.remsdev4__Leave_Request__c']")));
          c1.click();
          Thread.sleep(3000);
        WebElement New = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='New']")));
          New.click();
          Thread.sleep(6000);
 
       

	}

}
