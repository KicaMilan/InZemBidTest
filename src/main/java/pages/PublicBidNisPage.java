package pages;

import org.openqa.selenium.WebElement;

public class PublicBidNisPage extends BasePage {

	private String katastarskaOpstinaDropDown = "//div[@class='col-12']//select[@class='form-control']";
	private String publicBidDropDown = "//a[@id='publicAuctionMenu']";
	private String graphicPreviewButton = "//a[@class='btn btn-outline-primary']";
	private String prijaviSeNaNadmetanjeButton = "//div[@class='card-footer text-center d-none d-lg-table d-md-table']//button[@class='btn btn-success'][contains(text(),'Prijavi se na nadmetanje')]";

	public WebElement getKatastarskaOpstinaDropDown() {
		return findElement(katastarskaOpstinaDropDown);
	}

	public WebElement getPublicBidDropDown() {
		return findElement(publicBidDropDown);
	}

	public WebElement getGraphicPreviewButton() {
		return findElement(graphicPreviewButton);
	}

	public WebElement getPrijaviSeNaNadmetanjeButton() {
		return findElement(prijaviSeNaNadmetanjeButton);
	}

}
