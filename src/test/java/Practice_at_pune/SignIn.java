package Practice_at_pune;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn{
	WebDriver driver;
	String signintitle;
	String Titleinput="Amazon Sign-In";
	public LandingPage_1 landingpage_1;
	public SignIn(WebDriver driver)
	{
		this.driver= driver;
		//PageFactory.initElements(driver, this);
	}


	public void ClickOnSignIn()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("nav-link-accountList")).click();
		System.out.println(driver.getTitle());
		signintitle=driver.getTitle();
	}

	public void enterpassword() {
		signintitle.matches(Titleinput);
		driver.findElement(By.name("email")).sendKeys("8698991626");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Testing@1234");
		driver.findElement(By.id("signInSubmit")).click();
//		landingpage_1 = new LandingPage_1(driver);
//		return landingpage_1;
	}

	public LandingPage_1 landingpagereturn() {
		landingpage_1=new LandingPage_1(driver);
		return landingpage_1;
	}




}
