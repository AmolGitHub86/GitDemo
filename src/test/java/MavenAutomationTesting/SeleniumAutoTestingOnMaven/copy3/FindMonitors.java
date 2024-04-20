package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindMonitors extends OpenMonitorScreen {
	
	public FindMonitors() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(dependsOnMethods={"ClickOnMonitor"})
	public void monitors(){		
		if (driver.findElements(By.xpath("//*[@id=\"brandsRefinements\"]")).size()!=0) {
			String brandname=driver.findElement(By.id("brandsRefinements")).getText();
			System.out.println(brandname);

			String SearchBrand="LG";
			for (int i=1;i<8;i++) {
				String brandname1=driver.findElement(By.cssSelector("#brandsRefinements > ul > span > span:nth-child("+i+")")).getText();
				System.out.println("Name of "+i+"brand :- "+ brandname1);
				if (brandname1.equals(SearchBrand)) {
					driver.findElement(By.cssSelector("#brandsRefinements > ul > span > span:nth-child("+i+")" +"> li > span > a > div > label > i")).click();
				System.out.println("iternation is:- "+i);
				}

			}

			for (int i=6;i<15;i++)
			{String resultofmonitor=driver.findElement(By.cssSelector(".s-result-list > div:nth-child("+i+")")).getText();
			System.out.println(i+") result of selected monitor :- ");
			System.out.println(resultofmonitor);
			System.out.println("===========================");
			}
			}
			else {driver.quit();}
		
	}

}
