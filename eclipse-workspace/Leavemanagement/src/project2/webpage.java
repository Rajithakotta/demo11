package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webpage {

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


WebElement s1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='comm-navigation__top-level-item-link js-top-level-menu-item linkBtn' and text()='Seeds & Fertilizers']")));
s1.click();
Thread.sleep(6000);

WebElement s2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='comm-navigation__top-level-item-link js-top-level-menu-item linkBtn' and text()='Market Trends']")));
s2.click();
Thread.sleep(6000);


wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Select Language']/following-sibling::*//button"))).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Select Language']/following-sibling::*//*[@class='slds-truncate' and text()='Hindi']"))).click();
Thread.sleep(6000);
	}

}
