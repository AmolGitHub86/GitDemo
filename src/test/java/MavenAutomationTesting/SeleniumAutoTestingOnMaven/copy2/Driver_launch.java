package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_launch extends BaseTest {
  
	String signtitle;
	String  titleinput = "Amazon Sign-In";
	public Driver_launch driver_launch;
	

	@Test
	public void chromelaunch() throws IOException  {
		driver_launch= new Driver_launch();
		driver_launch.InitializerDriver();  //method of baseTest class
		driver_launch.launchapplication();   //method of baseTest class
		driver_launch.clickonsignin();
		driver_launch.returnsigntitle();
	}


	public void clickonsignin() throws IOException {
		System.out.println("clcking on sign-in");
		driver.findElement(By.id("nav-link-accountList")).click();
		System.out.println("clicked on sign-in");
	}

	public String returnsigntitle() throws IOException {
		this.signtitle=signtitle;
		signtitle= driver.getTitle();
		System.out.println(signtitle);
		System.out.println("check");
		return signtitle;
	}
}






