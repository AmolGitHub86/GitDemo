//package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy3;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.BeforeMethod;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class BaseTest {
//	
//	public WebDriver driver;
//	public SignIn signin;
//	
//	public WebDriver InitializerDriver() throws IOException {
//		Properties prop= new Properties();
//		FileInputStream files= new FileInputStream("C:\\Users\\Montran\\Desktop\\Workspace\\SeleniumAutoTestingOnMaven\\src\\main\\java\\MavenAutomationTesting\\SeleniumAutoTestingOnMaven\\Global.properties");
//		prop.load(files);
//		String browsername=prop.getProperty("browser");
//
//		if (browsername.contains("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			 driver= new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		}	else if (browsername.contains("edge")) {
//			WebDriverManager.edgedriver().setup();
//			 driver= new EdgeDriver();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		}
//		
//		return driver;
//	}
//	
//	@BeforeMethod
//	public SignIn launchapplication() throws IOException {
//		 InitializerDriver();
//		 driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
//		 new SignIn(driver);
//		return signin;
//	}
//}
