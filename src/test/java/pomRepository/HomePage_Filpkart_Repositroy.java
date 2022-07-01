package pomRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.BaseClass;

public class HomePage_Filpkart_Repositroy extends BaseClass {

	public HomePage_Filpkart_Repositroy() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='q']")
	private WebElement txtSearchBox;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSearchButton;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement btnClosePopUP;

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getBtnSearchButton() {
		return btnSearchButton;
	}

	public WebElement getBtnClosePopUP() {
		return btnClosePopUP;
	}

}
