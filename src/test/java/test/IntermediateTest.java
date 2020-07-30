package test;

import org.junit.Before;

import browser.Browser;

public class IntermediateTest extends BaseTest {

	@Before
	public static void testSetUp() {
		Browser.getBrowser().get("http://52.174.89.178/InzemBid/");
		Browser.getBrowser().manage().window().maximize();
		inZemBid.getLogInPage().getEmailKorisnika().sendKeys("milan.zivanovic@minpolj.gov.rs");
		inZemBid.getLogInPage().getSifraKorisnika().sendKeys("Testapp1");
		inZemBid.getLogInPage().getPrijaviSeButton().click();

	}

}
