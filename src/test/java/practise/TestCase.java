package practise;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase extends Initialization{

	
//	@Test(dataProvider="getdata")
//	public void signin(String username,String password ) throws IOException, InterruptedException {
//		amazonsignin.clickOnSign();
//		amazonsignin.verifyusername(username, password);
//		amazonsignin.verifypassword(username, password);
//		FindMonitor findmonitor=amazonsignin.returntomonitor();
//		findmonitor.opencomputer();
//		findmonitor.ClickOnMonitor();
//		findmonitor.openmonitorbrand();
//	}
//	
	
	
//	@DataProvider
//	public Object getdata() {		
//		return new Object[][] {{"8698991626","Testing@1234"},{"ayarkaramol@gmail.com","Testing@1234"}};
//	}
//	
	
	@Test(dataProvider="getdata",retryAnalyzer=retry.class)
	public void signin(HashMap<String, String> input ) throws IOException, InterruptedException {
		amazonsignin.clickOnSign();
		amazonsignin.verifyusername(input.get("username"),input.get("password"));
		amazonsignin.verifypassword(input.get("username"),input.get("password"));
		FindMonitor findmonitor=amazonsignin.returntomonitor();
		findmonitor.opencomputer();
		findmonitor.ClickOnMonitor();
		findmonitor.openmonitorbrand();
	}
	
	@DataProvider
	public Object[][] getdata() throws IOException {
	
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("username", "8698991626");
//		map.put("password", "Testing@1234");
//		
//		HashMap<String, String> map1 = new HashMap<String, String>();
//		map1.put("username", "ayarkaramol@gmail.com");
//		map1.put("password", "Testing@1234");
//		return new Object[][] {{map},{map1}};
		
		List<HashMap<String,String>> data=jsondataTohashmapdata("C:\\Users\\Montran\\Desktop\\Workspace\\SeleniumAutoTestingOnMaven\\src\\test\\java\\Dataprovider\\practisejasondata.json");
		return new Object[][] {{data.get(0)},{data.get(1)}};
	}
	
	
	
	
	
}
