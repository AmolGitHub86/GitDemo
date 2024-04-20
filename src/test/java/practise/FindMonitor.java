package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindMonitor extends Initialization {

	WebDriver driver;

	public FindMonitor(WebDriver driver) {
		this.driver=driver;
	}


	public void opencomputer() throws InterruptedException {
		driver.findElement(By.cssSelector(".hm-icon-label")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("div")).getText().contains("Computers"));
		driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(8) > a > div")).click();
		System.out.println("click on computer");
	}

	public void ClickOnMonitor() throws InterruptedException {
		Thread.sleep(2000);
		String monitor=driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(9) > a")).getAttribute("href");
		System.out.println(monitor);
		driver.get(monitor);}

	public void openmonitorbrand() throws InterruptedException{		
		if (driver.findElements(By.xpath("//*[@id=\"brandsRefinements\"]")).size()!=0) {
			String brandname=driver.findElement(By.id("brandsRefinements")).getText();
			System.out.println(brandname);
			Thread.sleep(1000);
			String SearchBrand="LG";
			for (int i=1;i<8;i++) {
				String brandname1=driver.findElement(By.cssSelector("#brandsRefinements > div > div > ul >  span:nth-child("+i+")")).getText();
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
