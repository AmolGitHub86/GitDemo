package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class OpenMonitorScreen extends SignIn{
	
	public OpenMonitorScreen() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(dependsOnMethods={"checkloginvalidation"})
	public void OpenComputer() {
	System.out.println(driver.findElement(By.tagName("div")).getText().contains("Computers"));
	boolean computer= driver.findElement(By.tagName("div")).getText().contains("Computers");
	driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(8) > a > div")).click();
	}
	
	@Test(dependsOnMethods={"OpenComputer"})
	public void ClickOnMonitor() {
	String monitor=driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(9) > a")).getAttribute("href");
	System.out.println(monitor);
	driver.get(monitor);}
	
	

}
