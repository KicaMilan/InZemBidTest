package pages;

import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage  {
	
	private String emailKorisnika = "//input[@id='Email']";
	private String sifraKorisnika = "//input[@id='Password']";
	private String prijaviSeButton = "//button[@id='submit']";
	
	public WebElement getEmailKorisnika() {
		return findElement(emailKorisnika);
	}
	
	public WebElement getSifraKorisnika() {
		return findElement(sifraKorisnika);
	}
	
	public WebElement getPrijaviSeButton() {
		return findElement(prijaviSeButton);
	}

}
