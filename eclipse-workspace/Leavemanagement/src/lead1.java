import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class lead1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajit\\Downloads\\chromedriver-win32 (6)\\chromedriver-win32\\chromedriver.exe");
		
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        org.openqa.selenium.WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofMinutes(2));
        // Navigate to Salesforce login page
        driver.get("https://login.salesforce.com/");
        
      
 
        // Log in to Salesforce
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("rajikotta95@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Rajitha@1993");
        driver.findElement(By.id("Login")).click();
        driver.manage().window().maximize();
	     
	  // Navigate to Leads
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-aura-rendered-by=\"439:83;a\"]"))).click();
	     Thread.sleep(3000);
	     WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
	     searchInput.sendKeys("Leads");
	     Thread.sleep(3000);
	     WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'Leads')]//*[@class='slds-truncate']")));
	     searchResult.click();
	     Thread.sleep(3000);
	     
 
       	         
WebElement searchResult1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"New\"]")));
searchResult1.click();
         
        // name="Phone"
        		 WebElement mobile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"MobilePhone\"]")));
         mobile.click();
         mobile.sendKeys("7680991122");
         
	     Thread.sleep(3000);
 
 
       WebElement fn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"firstName\"]")));
       fn.click();
       fn.sendKeys("Pn");
       
       
	     Thread.sleep(3000);
 
       WebElement ln = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"lastName\"]")));
       JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
       jsExecutor.executeScript("arguments[0].scrollIntoView(true);", ln);
       ln.click();
       ln.sendKeys("Raji");
         
	     Thread.sleep(3000);
 
       
       WebElement company = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Company\"]")));
       company.click();
       company.sendKeys("crop");
       
       
	     Thread.sleep(3000);
 
       
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Lead Status']/following-sibling::*//button"))).click();
 
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Lead Status']/following-sibling::*//*[@data-value='Working - Contacted']"))).click();
 
       
	     Thread.sleep(3000);
 
       
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Industry']/following-sibling::*//button"))).click();
 
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Industry']/following-sibling::*//*[@data-value='Communications']"))).click();
 
	     Thread.sleep(3000);
 
       
       WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
       
       Save.click();
       
       
       WebElement Stage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title slds-path__title' and text()='Converted']")));
       
       // Use Actions to move to the element and click
       Actions actions = new Actions(driver);
       actions.moveToElement(Stage).click().perform();
 
	     Thread.sleep(3000);
 
       
       
       WebElement Converted = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='slds-button slds-button--brand slds-path__mark-complete stepAction active uiButton' and //span[text()='Select Converted Status']]")));
       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Converted);
 
	     Thread.sleep(3000);
 
       WebElement Convert = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Convert']")));
       Convert.click();
	}

}

	
