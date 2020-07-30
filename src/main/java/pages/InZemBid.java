package pages;

public class InZemBid {

	private LogInPage logInPage;
	private HomePage homePage;
	private PublicBidNisPage publicBidNisPage;

	public LogInPage getLogInPage() {
		if (logInPage == null) {
			logInPage = new LogInPage();
		}
		return logInPage;
	}

	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage();
		}
		return homePage;
	}

	public PublicBidNisPage getPublicBidNisPage() {
		if (publicBidNisPage == null) {
			publicBidNisPage = new PublicBidNisPage();
		}
		return publicBidNisPage;
	}

}
