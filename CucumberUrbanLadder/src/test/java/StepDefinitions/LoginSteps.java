package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	public WebDriver driver;
	
	@Given("opening browser")
	public void opening_browser() throws InterruptedException, IOException {
	    System.out.println("Hello Browser");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/signup");
	    Thread.sleep(1000); 
	    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\mindsdet158\\eclipse-workspace\\CucumberUrbanLadder\\Screenshots\\Screen.png"));
		System.out.println("Screenshot captured successfully");

	   
	}

	@When("user enter username")
	public void user_enter_username() {
    System.out.println("Enter user name");
    driver.findElement(By.xpath("//*[@id='spree_user_email']")).sendKeys("kavanaks199913@gmail.com");

	}
	@Then("click on searchbox")
	public void click_on_searchbox() throws IOException {
	    System.out.println("click searchbox");
	    driver.findElement(By.xpath("//*[@id='search']")).sendKeys("Living Room Furniture");
	    
	    
	}
	    
	}



