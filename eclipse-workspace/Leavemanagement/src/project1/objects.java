package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class objects {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajit\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	  	//Add chrome switch to disable notification - "**--disable-notifications**"
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


/**WebElement csf3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='Leave Requests']")));
csf3.click();
WebElement relatedTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-row-key-value='a0FDn000006kTAbMAM']")));
relatedTab.click();**/
Thread.sleep(6000);
WebElement csf2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='My Leave Balance']")));
csf2.click();
Thread.sleep(6000);
WebElement csf4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='Leave Requests']")));
csf4.click();
Thread.sleep(6000);
WebElement csf5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='Leave Summary']")));
csf5.click();
}
}
