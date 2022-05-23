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

public class StudyRoomFurniture {
	public WebDriver driver;
	@When("user is on StudyRoomFurniture")
	public void is_on_study_room_furniture() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/products/search?utf8=%E2%9C%93&keywords=study+room+furniture");
		System.out.println("Successfully open StudyRoomFurniture page");
		Thread.sleep(1000); 
	    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\mindsdet158\\eclipse-workspace\\CucumberUrbanLadder\\Screenshots\\Screen.png"));
		System.out.println("Screenshot captured successfully");
	    
	    
	}

}
