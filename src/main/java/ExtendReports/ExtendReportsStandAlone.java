package ExtendReports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReportsStandAlone {
	
	WebDriver driver;
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web automation result");
		reporter.config().setDocumentTitle("Test Result");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Automation Tester", "Amol Ayarkar");
		
	}
	
	@Test
	public void initialDemo() {
		
		extent.createTest("test reports");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.close();
		extent.flush();
	}

}
