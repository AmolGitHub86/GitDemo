package MavenAutomationTesting.SeleniumAutoTestingOnMaven.copy3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class AmazonLoginTest {
    WebDriver driver;
 
    @BeforeClass
    public void setUp() {
    	WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
 
    @Test
    public void loginTest() {
        driver.get("https://www.amazon.com");
        WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
        signInLink.click();        
        WebElement emailInput = driver.findElement(By.id("ap_email"));
        emailInput.sendKeys("8698991626");        
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        WebElement passwordInput = driver.findElement(By.id("ap_password"));
        passwordInput.sendKeys("Test@1234");
        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();
 
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}