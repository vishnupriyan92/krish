import org.testng.annotations.Test;

public class Execution {
    @Test
	public void closeBrowser() {
		System.out.println("Smoke");
	}
    
    @Test
    public void enterUrl() {
    System.out.println("sanity");
    }
    
    @Test
    public void launchBrowser() {
    	System.out.println("reg");
    }
   
}
