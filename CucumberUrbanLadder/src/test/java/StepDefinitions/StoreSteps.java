package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StoreSteps {
	public WebDriver driver;
	@When("user is on Store Page")
	public void user_is_on_store_page() throws InterruptedException, IOException {
		
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.urbanladder.com/furniture-stores?src=header");
			System.out.println("Successfully open Store page");
			Thread.sleep(1000); 
		    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\mindsdet158\\eclipse-workspace\\CucumberUrbanLadder\\Screenshots\\Screen.png"));
			System.out.println("Screenshot captured successfully");
		    
	}

}
