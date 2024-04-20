package Practice_at_pune;

import org.testng.annotations.Test;

public class TestCase extends BaseTest{
	public LandingPage_1 landingpage;

	@Test
	public void getTitle() {
		signin.ClickOnSignIn();
		signin.enterpassword();
		//LandingPage_1 landingpage_1 = signin.enterpassword();
		//landingpage_1.clickoncomputer();
		//landingpage_1.clickoncomputer();
		LandingPage_1 landingpage_1=signin.landingpagereturn();
		landingpage_1.clickoncomputer();
	}
	
	
	

}