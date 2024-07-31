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

public class Markettrends2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajit\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
		
		Thread.sleep(3000);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		driver.get("https://vamriinternaldev-dev-ed.develop.my.site.com/AgricultureEmpowerment/s");

		driver.manage().window().maximize();
		WebElement s2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='comm-navigation__top-level-item-link js-top-level-menu-item linkBtn' and text()='Market Trends']")));
        s2.click();
       Thread.sleep(6000);
      
        
          WebElement Co1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='City']/following-sibling::*//button")));
          JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
          jsExecutor1.executeScript("arguments[0].scrollIntoView(true);", Co1);
          Co1.click();
          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='City']/following-sibling::*//*[@class='slds-truncate' and text()='Bangalore']"))).click();
            Thread.sleep(6000);
 
	
            
            
            WebElement Co11 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Commodity']/following-sibling::*//button")));
            JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
            jsExecutor1.executeScript("arguments[0].scrollIntoView(true);", Co11);
            Co11.click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Commodity']/following-sibling::*//*[@class='slds-truncate' and text()='Beans']"))).click();
              Thread.sleep(6000);
    
            
              
 
              WebElement Co3 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Share your views...']")));
              Co3.click();
              Co3.sendKeys("Nice info");
              
              WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
              Save.click();
	}

}
