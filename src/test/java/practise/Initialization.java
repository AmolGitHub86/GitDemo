	package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initialization {

	
	public WebDriver driver;
	public AmazonSignin amazonsignin;
		

	public WebDriver InitializerDriver() throws IOException {
		Properties prop= new Properties();
		FileInputStream files= new FileInputStream("C:\\Users\\Montran\\Desktop\\Workspace\\SeleniumAutoTestingOnMaven\\src\\main\\java\\MavenAutomationTesting\\SeleniumAutoTestingOnMaven\\Global.properties");
		prop.load(files);
		String browsername=System.getProperty("browser")!= null ? System.getProperty("browser"):prop.getProperty("browser"); //this use to drive testng using Maven cmd prompt data
		//String browsername=prop.getProperty("browser");

		if (browsername.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}	else if (browsername.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		return driver;
	}


	@BeforeMethod
	public  AmazonSignin launchapplication() throws IOException {
		InitializerDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		amazonsignin=new AmazonSignin(driver);
		return amazonsignin;
		
	}
	
	public List<HashMap<String, String>> jsondataTohashmapdata(String filepath) throws IOException {
		
		//read jason data into string
		String jsondata=FileUtils.readFileToString(new File (filepath));
		
	
		//convert String into hashmap (jackson databind dependency)
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data=mapper.readValue(jsondata, new TypeReference<List<HashMap<String, String>>>(){});
		return data;	
	} 
	
	public String takescreenshot(String testcasename, WebDriver driver) throws IOException {
		TakesScreenshot ts	=(TakesScreenshot)driver;
		System.out.println("ss-1");
		File source=ts.getScreenshotAs(OutputType.FILE);
		System.out.println("ss-2");
		
		File file=new File(System.getProperty("user.dir")+"//reports_1//"+testcasename+".png");
		System.out.println(System.getProperty("user.dir"));
		System.out.println("ss-3");
		//File file=new File("C://Users//Montran//Desktop//Workspace//SeleniumAutoTestingOnMaven//reports_1"+testcasename+".png");
		FileUtils.copyFile(source, file);
		System.out.println("ss-4");
		//return System.getProperty("user.dir")+"//reports_1"+testcasename+".png";		
		return System.getProperty("user.dir")+"//reports_1//"+testcasename+"//_1"+".png";
		}






}


