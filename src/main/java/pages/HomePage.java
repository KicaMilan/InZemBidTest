package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	private String userAccountPreview = "//a[@class='d-block']";
	private String skupiButton = "//i[@class='fas fa-bars']";
	private String userAccountDropDown = "//i[@class='fas fa-cogs']";
	private String myAccountButton = "//a[contains(text(),'Moj nalog')]";
	private String logOutButton = "//a[contains(text(),'Odjavi me')]";
	private String cirilicaButton = "//a[contains(text(),'irilica')]";
	private String aktuelniOglasiButton = "//p[contains(text(),'Aktuelni oglasi')]";
	private String mojePonudeBotton = "//p[contains(text(),'Moje ponude')]";
	private String rangListaButton = "//p[contains(text(),'Rang lista')]";
	private String helpButton = "//p[contains(text(),'Pomo')]";
	private String prijaviSeNisButton = "//tr[1]//td[9]//a[1]";
	private String prijaviSeKursumlijaButton = "//tr[2]//td[9]//a[1]";
	
	public WebElement getUserAccountPreview() {
		return findElement(userAccountPreview);
	}
	public WebElement getSkupiButton() {
		return findElement(skupiButton);
	}
	public WebElement getUserAccountDropDown() {
		return findElement(userAccountDropDown);
	}
	public WebElement getMyAccountButton() {
		return findElement(myAccountButton);
	}
	public WebElement getLogOutButton() {
		return findElement(logOutButton);
	}
	public WebElement getCirilicaButton() {
		return findElement(cirilicaButton);
	}
	public WebElement getAktuelniOglasiButton() {
		return findElement(aktuelniOglasiButton);
	}
	public WebElement getMojePonudeBotton() {
		return findElement(mojePonudeBotton);
	}
	public WebElement getRangListaButton() {
		return findElement(rangListaButton);
	}
	public WebElement getHelpButton() {
		return findElement(helpButton);
	}
	public WebElement getPrijaviSeNisButton() {
		return findElement(prijaviSeNisButton);
	}
	public WebElement getPrijaviSeKursumlijaButton() {
		return findElement(prijaviSeKursumlijaButton);
	}
	
	

}
