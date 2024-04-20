package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAlone {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList")).click();
	   String signtitle= driver.getTitle();
	   System.out.println(signtitle);
	   String titleinput="Amazon Sign-In";
	   
	   //enter username for sign-in
	   if (signtitle.matches(titleinput)) {
		   driver.findElement(By.id("ap_email")).sendKeys("8698991626");
		   driver.findElement(By.id("continue")).click();}	   
	   else {System.out.println("Web Page Not Found");}
	   
	   //enter password for sign-in
	   if (signtitle.matches(titleinput)) {
		   driver.findElement(By.id("ap_password")).sendKeys("Testing@1234");
		   driver.findElement(By.id("signInSubmit")).click();}	   
	   else {System.out.println("Web Page Not Found");}
	   
	 driver.findElement(By.cssSelector(".hm-icon-label")).click();
	 
	 //verified login user by is valid by name
WebElement loginuser=driver.findElement(By.id("hmenu-customer-name"));
System.out.println("get text from GetTxt"+loginuser.getText());
//this alternative for text value if getText() is not work
System.out.println(driver.findElement(By.id("hmenu-customer-name")).getAttribute("innerText"));
System.out.println(driver.findElement(By.id("hmenu-customer-name")).getAttribute("textContent"));

String loginusercheck=driver.findElement(By.id("hmenu-customer-name")).getAttribute("innerText");
if (loginusercheck.equals("Hello, amol")) {System.out.println("Login user is valid");}
else {System.out.println("Login user is invalid");}

//click on computer
System.out.println(driver.findElement(By.tagName("div")).getText().contains("Computers"));
boolean computer= driver.findElement(By.tagName("div")).getText().contains("Computers");
driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(8) > a > div")).click();



Thread.sleep(10);

//click on monitor
String monitor=driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(9) > a")).getAttribute("href");
System.out.println(monitor);
driver.get(monitor);


// check for brand name 


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

//driver.quit();
   
	   }
}
		   
	


