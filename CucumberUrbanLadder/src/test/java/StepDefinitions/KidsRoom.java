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

public class KidsRoom {
	public WebDriver driver;
@When("user is on KidsRoom")
public void user_is_on_kids_room() throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.urbanladder.com/products/search?utf8=%E2%9C%93&keywords=kids+room");
	System.out.println("Successfully open KidsRoom page");
	Thread.sleep(1000); 
    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile, new File("C:\\Users\\mindsdet158\\eclipse-workspace\\CucumberUrbanLadder\\Screenshots\\Screen.png"));
	System.out.println("Screenshot captured successfully");
    
}


}
