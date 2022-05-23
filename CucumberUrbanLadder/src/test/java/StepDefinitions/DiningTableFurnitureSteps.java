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

public class DiningTableFurnitureSteps {
	public WebDriver driver;
	
	@When("user is on DiningTableFurniture")
	public void is_on_dining_table_furniture() throws IOException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/products/search?utf8=%E2%9C%93&keywords=dining+table+6+seater+with+chair");
		System.out.println("Successfully open DiningTableFurniture page");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\mindsdet158\\eclipse-workspace\\CucumberUrbanLadder\\Screenshots\\Screen.png"));
		System.out.println("Screenshot captured successfully");
	}

}
