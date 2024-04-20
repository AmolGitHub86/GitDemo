package Practice_at_pune;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage_1 extends BaseTest {

	WebDriver driver;

	public LandingPage_1(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickoncomputer() {
		driver.findElement(By.cssSelector(".hm-icon-label")).click();
	}
	
	
}

