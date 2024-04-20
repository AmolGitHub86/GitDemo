package practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonSignin  {

		WebDriver driver;
		public FindMonitor findmonitor;
		
				
		public AmazonSignin(WebDriver driver) {
			this.driver= driver;
		}

	public void clickOnSign() {
		driver.findElement(By.id("nav-link-accountList")).click();
		System.out.println(driver.getTitle());
	}
	
	
	public void verifyusername(String username,String password) {
		if (driver.getTitle().matches("Amazon Sign-In")) {
			//driver.findElement(By.id("ap_email")).sendKeys("8698991626");
			driver.findElement(By.id("ap_email")).sendKeys(username);
			driver.findElement(By.id("continue")).click();}	   
		else {System.out.println("Web Page Not Found");}
	}
	
	
	public void verifypassword(String username,String password){
		if (driver.getTitle().matches("Amazon Sign-In")) {
			//driver.findElement(By.id("ap_password")).sendKeys("Testing@1234");
			driver.findElement(By.id("ap_password")).sendKeys(password);
			driver.findElement(By.id("signInSubmit")).click();}	   
		else {System.out.println("Web Page Not Found");}
	}
	
	public FindMonitor returntomonitor() {
		findmonitor=new FindMonitor(driver);
			return findmonitor;
		}
	
	
	
	
	
	
}
