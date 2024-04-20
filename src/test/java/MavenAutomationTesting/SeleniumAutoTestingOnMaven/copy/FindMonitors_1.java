package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindMonitors_1 extends OpenMonitorScreen_1 {
	
	@Test(dependsOnMethods={"ClickOnMonitor"})
	public void monitors_1(){		
		if (driver1.findElements(By.xpath("//*[@id=\"brandsRefinements\"]")).size()!=0) {
			String brandname=driver1.findElement(By.id("brandsRefinements")).getText();
			System.out.println(brandname);

			String SearchBrand="LG";
			for (int i=1;i<8;i++) {
				String brandname1=driver1.findElement(By.cssSelector("#brandsRefinements > ul > span > span:nth-child("+i+")")).getText();
				System.out.println("Name of "+i+"brand :- "+ brandname1);
				if (brandname1.equals(SearchBrand)) {
					driver1.findElement(By.cssSelector("#brandsRefinements > ul > span > span:nth-child("+i+")" +"> li > span > a > div > label > i")).click();
				System.out.println("iternation is:- "+i);
				}

			}

			for (int i=6;i<15;i++)
			{String resultofmonitor=driver1.findElement(By.cssSelector(".s-result-list > div:nth-child("+i+")")).getText();
			System.out.println(i+") result of selected monitor :- ");
			System.out.println(resultofmonitor);
			System.out.println("===========================");
			}
			}
			else {driver1.quit();}
		
	}

}
