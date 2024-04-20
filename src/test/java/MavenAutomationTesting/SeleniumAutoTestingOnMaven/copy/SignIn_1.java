package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignIn_1 extends Driver_launch_1 {	
	
	@Test
	public void amzonSignIn_1() {
		driver1.findElement(By.id("nav-link-accountList")).click();
		String signtitle= driver1.getTitle();
		System.out.println(signtitle);
		String titleinput="Amazon Sign-In";
		if (signtitle.matches(titleinput)) {
			driver1.findElement(By.id("ap_email")).sendKeys("8698991626");
			driver1.findElement(By.id("continue")).click();}	   
		else {System.out.println("Web Page Not Found");}

		//enter password for sign-in
		if (signtitle.matches(titleinput)) {
			driver1.findElement(By.id("ap_password")).sendKeys("Testing@1234");
			driver1.findElement(By.id("signInSubmit")).click();}	   
		else {System.out.println("Web Page Not Found");}

		driver1.findElement(By.cssSelector(".hm-icon-label")).click();

	}

}
