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

public class HelpSteps {
	public WebDriver driver;
	@When("user is on Help page")
	public void user_is_on_help_page() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/help");
		System.out.println("Successfully open Help page");
		Thread.sleep(1000); 
	    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\mindsdet158\\eclipse-workspace\\CucumberUrbanLadder\\Screenshots\\Screen.png"));
		System.out.println("Screenshot captured successfully");
	    
	}

}
