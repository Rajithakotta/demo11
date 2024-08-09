package cucumberjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {

	WebDriver driver = null;
	@Given("browser is open")
public void browser_is_open() {
   
    driver=new ChromeDriver();
	
	
	
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
    

 }

@And("user is on login page")
public void user_is_on_login_page() throws InterruptedException {
  
	System.out.println("Inside Step - user is on login page  ");
//driver.navigate().to("https://vamriinternaldev-dev-ed.develop.my.salesforce.com");
	driver.get("https://vamriinternaldev-dev-ed.develop.my.salesforce.com/");
	 

    Thread.sleep(3000);
	
}

@When("user enters username and password")
public void user_enters_username_and_password() throws InterruptedException {
	System.out.println("Inside Step - user enters username and password   ");
    
	driver.findElement(By.id("username")).sendKeys("haritha.gajjala@vamriinternaldev.com");


	driver.findElement(By.id("password")).sendKeys("Haritha@444");
  Thread.sleep(3000);

   
}

@And("user clicks on login")
public void user_clicks_on_login() throws InterruptedException {
	System.out.println("Inside Step - user clicks on login  ");
   
    driver.findElement(By.id("Login")).click();
    Thread.sleep(5000);

}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	System.out.println("Inside Step - user is navigated to the home page  ");
   
	driver.getPageSource().contains("Setup");
	driver.findElement(By.xpath("//*[@data-target-selection-name=\"181c7013df09423d8f755b49c067f6f3\"]")).click();
	
	 driver.findElement(By.xpath("//input[contains(@placeholder,'Search apps and items')]")).sendKeys("LemmoRealEstate");
    

    //driver.findElement(By.xpath("//*[contains(@data-label,'LemmoRealEstate')]//*[@class='slds-truncate']")).click();
    //driver.findElement(By.xpath("//*[@data-target-selection-name=\"181c7013df09423d8f755b49c067f6f3\"]")).click();
	
	 //driver.findElement(By.xpath("//input[contains(@placeholder,'Search apps and items')]")).sendKeys("LemmoRealEstate");
    

    driver.findElement(By.xpath("//*[contains(@data-label,'LemmoRealEstate')]//*[@class='slds-truncate']")).click();   
}
}