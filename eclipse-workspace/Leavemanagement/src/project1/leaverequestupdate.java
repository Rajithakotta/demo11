package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class leaverequestupdate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajit\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	  	options.addArguments("--disable-notifications"); 

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
 
        driver.get("https://remsdev4-dev-ed.my.salesforce.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("lmsadmin@vamritech.com");
        driver.findElement(By.id("password")).sendKeys("Password@123");
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
  WebElement c1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-label='Leave Requests']")));
  c1.click();
	
 
  
  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-row-key-value='a0FDn000006kXgCMAU']//*[@data-position-id=\"lgcp-1000001\"]"))).click();
  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Status']/following-sibling::*//button"))).click();
  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Status']/following-sibling::*//*[@class='slds-truncate' and text()='Closed']"))).click();
  Thread.sleep(6000);
  //*[@data-row-key-value="a0FDn000006kXdHMAU"]
 // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-row-key-value=\"a0FDn000006kXgCMAU\"]/following-sibling::*//button[@data-value='Rejected']"))).click();
	}

}
