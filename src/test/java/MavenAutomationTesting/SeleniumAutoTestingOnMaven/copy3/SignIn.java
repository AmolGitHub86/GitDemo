package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class SignIn {
	
	//SignIn signin;

WebDriver driver;
//	public SignIn(WebDriver driver) {
//		this.driver= driver;
//	}

	//@Test(dependsOnMethods={"chromelaunch"})
	@Test
	public void amzonSignIn() throws IOException, InterruptedException {
		//new SignIn();
		//this.driver= driver;	
		//PageFactory.initElements(driver, this);
		//chromelaunch();
		Thread.sleep(5000);
		//driver.getTitle();
		//String signtitlename=signtitle;
		//System.out.println("1 "+signtitlename);
		
		//if (signin.returnsigntitle().matches(signin.titleinput)){
		//*[@name='email']
		driver.findElement(By.name("email")).sendKeys("8698991626");
		//driver.findElement(By.id("ap_email")).sendKeys("8698991626");
		driver.findElement(By.id("continue")).click();
		//}	   
		//		else {System.out.println("Web Page Not Found");}

		//enter password for sign-in
		//		if (signin.signtitle.matches(signin.titleinput)) {
		//			signin.driver.findElement(By.id("ap_password")).sendKeys("Testing@1234");
		//			signin.driver.findElement(By.id("signInSubmit")).click();}	   
		//		else {System.out.println("Web Page Not Found");}
		//
		//		signin.driver.findElement(By.cssSelector(".hm-icon-label")).click();
	}

	//	@Test(dependsOnMethods={"amzonSignIn"})
	//	public void checkloginvalidation() {
	//		SignIn signin = new SignIn();
	//	WebElement loginuser=signin.driver.findElement(By.id("hmenu-customer-name"));
	//	System.out.println("get text from GetTxt"+loginuser.getText());
	//	//this alternative for text value if getText() is not work
	//	System.out.println(signin.driver.findElement(By.id("hmenu-customer-name")).getAttribute("innerText"));
	//	System.out.println(signin.driver.findElement(By.id("hmenu-customer-name")).getAttribute("textContent"));
	//
	//	String loginusercheck=signin.driver.findElement(By.id("hmenu-customer-name")).getAttribute("innerText");
	//	if (loginusercheck.equals("Hello, amol")) {System.out.println("Login user is valid");}
	//	else {System.out.println("Login user is invalid");}
	//
	//
//	String title= returnsigntitle();
	}


