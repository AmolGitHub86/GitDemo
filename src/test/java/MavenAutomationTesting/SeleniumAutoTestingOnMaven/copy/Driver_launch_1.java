package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_launch_1  {
	
	WebDriver driver1;
	public  Driver_launch_1() {
		WebDriverManager.chromedriver().setup();
		driver1= new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.get("https://www.amazon.com/");
		driver1.manage().window().maximize();
	}

}






