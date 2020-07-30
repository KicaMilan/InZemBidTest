package pages;

import org.openqa.selenium.WebElement;

public class BidPopUp extends BasePage {
	private String acceptConditionsCheckBox = "//input[@id='acceptConditions']";
	private String priceField = "//input[@id='Price']";
	private String dateOfDepositField = "//input[@id='DateOfDeposit']";
	private String depositAmountFields = "//input[@id='DepositAmount']";
	private String ocitanaLkCheckBox = "//label[contains(text(),'na karta')]";
	private String izvodRPGCheckBox = "//label[contains(text(),'Izvod iz RPG')]";
	private String minimumPolaHektaraCheckBox = "//label[contains(text(),'tvu najmanje 0.5 ha u KO')]";
	private String vlasnistvoSusednaKOCheckBox = "//label[contains(text(),'tvu koje grani')]";
	private String aktivanStatusCheckBox = "//label[contains(text(),'Dokaz o aktivnom statusu namanje 3 godine')]";
	private String prebivalisteCheckBox = "//label[contains(text(),'Dokaz o prebivali')]";
	private String saveButton = "//button[@class='btn btn-primary']";
	private String sendButton = "//button[contains(text(),'alji')]";
	private String closeButton = "//div[@class='modal-footer justify-content-between bg-light']//button[@class='btn btn-default'][contains(text(),'Zatvori')]";

	public WebElement getAcceptConditionsCheckBox() {
		return findElement(acceptConditionsCheckBox);
	}

	public WebElement getPriceField() {
		return findElement(priceField);
	}

	public WebElement getDateOfDepositField() {
		return findElement(dateOfDepositField);
	}

	public WebElement getDepositAmountFields() {
		return findElement(depositAmountFields);
	}

	public WebElement getOcitanaLkCheckBox() {
		return findElement(ocitanaLkCheckBox);
	}

	public WebElement getIzvodRPGCheckBox() {
		return findElement(izvodRPGCheckBox);
	}

	public WebElement getMinimumPolaHektaraCheckBox() {
		return findElement(minimumPolaHektaraCheckBox);
	}

	public WebElement getVlasnistvoSusednaKOCheckBox() {
		return findElement(vlasnistvoSusednaKOCheckBox);
	}

	public WebElement getAktivanStatusCheckBox() {
		return findElement(aktivanStatusCheckBox);
	}

	public WebElement getPrebivalisteCheckBox() {
		return findElement(prebivalisteCheckBox);
	}

	public WebElement getSaveButton() {
		return findElement(saveButton);
	}

	public WebElement getSendButton() {
		return findElement(sendButton);
	}

	public WebElement getCloseButton() {
		return findElement(closeButton);
	}

}
