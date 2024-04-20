package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;	
	
	
	public void InitializerDriver() throws IOException {
		Properties prop= new Properties();
		FileInputStream files= new FileInputStream("C:\\Users\\Montran\\Desktop\\Workspace\\SeleniumAutoTestingOnMaven\\src\\main\\java\\MavenAutomationTesting\\SeleniumAutoTestingOnMaven\\Global.properties");
		prop.load(files);
		String browsername=prop.getProperty("browser");

		if (browsername.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}	else if (browsername.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
	}
	
	public void launchapplication() throws IOException {
		 driver.get("https://www.amazon.com/");
		 System.out.println("url launch successfully");
		driver.manage().window().maximize();
	}
}
