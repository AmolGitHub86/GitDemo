package ExtendReports;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExetndReportsTestNG {
	
	static ExtentReports extent;
	
	@BeforeTest
	public static ExtentReports getReportobject() {
		
		String path=System.getProperty("user.dir")+"\\reports_1\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web automation result");
		reporter.config().setDocumentTitle("Test Result");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Automation Tester", "Amol Ayarkar");
		return extent;
		
	}
	


}
