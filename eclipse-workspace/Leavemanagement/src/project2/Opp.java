package project2;


		// TODO Auto-generated method stub
		
		import java.time.Duration;
		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		public class Opp {
			public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajit\\Downloads\\chromedriver-win32 (6)\\chromedriver-win32\\chromedriver.exe");
		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("--disable-notifications");
		        WebDriver driver = new ChromeDriver(options);
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		        // Navigate to Salesforce login page
		        driver.get("https://login.salesforce.com/");
		        // Log in to Salesforce
		        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("rajikotta95@gmail.com");
		        driver.findElement(By.id("password")).sendKeys("Rajitha@1993");
		        driver.findElement(By.id("Login")).click();
		        driver.manage().window().maximize();
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-target-selection-name=\"181c7013df09423d8f755b49c067f6f3\"]"))).click();
		        Thread.sleep(3000);
		        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
		        searchInput.sendKeys("Opportunities");
		        Thread.sleep(3000);
		        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'Opportunities')]//*[@class='slds-truncate']")));
		        searchResult.click();
		        Thread.sleep(3000);
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-aura-class='forceActionLink' and @title='New']"))).click();
		        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"CloseDate\"]")));
		        date.click();
		        date.sendKeys("10/12/2024");
		        WebElement Name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Name\"]")));
		        Name.click();
		        Name.sendKeys("Automation");
		        WebElement Stage =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Stage']/following-sibling::*//button")));
		        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", Stage);
		        Stage.click();
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Stage']/following-sibling::*//*[@class='slds-truncate' and text()='Qualification']"))).click();
		        Thread.sleep(3000);
		        WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		        Save.click();
		        Thread.sleep(3000);
	}

}
