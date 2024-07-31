package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fetilizers {

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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]"))).sendKeys("Fertilizers");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
		  
		WebElement New = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='New']")));
		New.click();
		 
		 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Name']"))).sendKeys("fertilizers");
		 
		 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Image_Url__c']"))).sendKeys("https://www.google.com/imgres?imgurl=https%3A%2F%2Fthumbs.dreamstime.com%2Fb%2Fagriculture-vegetable-field-landscape-view-freshly-growing-84090367.jpg&tbnid=sbGK4t9BbkCLUM&vet=12ahUKEwjv1rmS2OiDAxUSY2wGHUHMAGgQMygAegQIARBw..i&imgrefurl=https%3A%2F%2Fwww.dreamstime.com%2Fphotos-images%2Fagriculture.html&docid=XiP7FsDk_16bjM&w=800&h=534&q=agricultureimages&ved=2ahUKEwjv1rmS2OiDAxUSY2wGHUHMAGgQMygAegQIARBw");
		 
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-textarea']"))).sendKeys("fertilizers");
		 
		 
		 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Read_More__c']"))).sendKeys("given the details");
		 
		 
		 
		//Perform search in the lookup field
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search Seeds...')]"))).sendKeys("Apple");
		Thread.sleep(3000);
		 
		WebElement appleOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Apple']")));
		appleOption.click();
		WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		Save.click();
	}

}
