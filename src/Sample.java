import org.testng.annotations.Test;

public class Sample {
	@Test
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}
	
	@Test
	public void closeBrowser() {
		System.out.println("CloseBrowser");
	}
	
	@Test(invocationCount=100)
	public void enterUrl() {
		System.out.println("enterUrl");
	}
}
