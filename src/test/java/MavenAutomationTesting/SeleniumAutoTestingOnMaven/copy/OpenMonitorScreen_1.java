package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class OpenMonitorScreen_1 extends SignIn_1{
	
	@Test(dependsOnMethods={"amzonSignIn_1"})
	public void OpenComputer() {
	System.out.println(driver1.findElement(By.tagName("div")).getText().contains("Computers"));
	boolean computer= driver1.findElement(By.tagName("div")).getText().contains("Computers");
	driver1.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(8) > a > div")).click();
	}
	
	@Test(dependsOnMethods={"OpenComputer"})
	public void ClickOnMonitor() {
	String monitor=driver1.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(9) > a")).getAttribute("href");
	System.out.println(monitor);
	driver1.get(monitor);}
	
	

}
