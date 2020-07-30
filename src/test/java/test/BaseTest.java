package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import browser.Browser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import pages.InZemBid;

public class BaseTest {
	
	protected static InZemBid inZemBid;
	
	@BeforeClass
	public static void setUp() {
		inZemBid = new InZemBid();
		ChromeDriverManager.chromedriver().setup();
	}
	
	@AfterClass
	public static void cleanUp() {
		Browser.getBrowser().quit();
	}

}
