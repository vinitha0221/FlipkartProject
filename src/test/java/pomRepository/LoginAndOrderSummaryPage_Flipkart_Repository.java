package pomRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.BaseClass;

public class LoginAndOrderSummaryPage_Flipkart_Repository extends BaseClass {

	public LoginAndOrderSummaryPage_Flipkart_Repository() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='IiD88i GtCYSF']/input[@type='text']")
	private WebElement txtUserName;

	@FindBy(xpath = "//span[text()='CONTINUE']")
	private WebElement btnContinue;

	@FindBy(xpath = "//div[@class='IiD88i GtCYSF']/input[@type='password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement btnLogin;

	@FindBy(xpath = "//input[@name='alternatePhone']")
	private WebElement txtAlternatePhone;

	@FindBy(xpath = "//input[@name='locationTypeTag']")
	private WebElement btnRadioHome;

	@FindBy(xpath = "//select[@name='state']")
	private WebElement dwnDropState;

	@FindBy(xpath = "//div[@class='l5QiYB _1hGj33']/button")
	private WebElement btnSaveAndDeliver;

	@FindBy(xpath = "//input[@name='landmark']")
	private WebElement txtLandMark;

	@FindBy(xpath = "//input[@name='city']")
	private WebElement txtCity;

	@FindBy(xpath = "//textarea[@name='addressLine1']")
	private WebElement txtAddress;

	@FindBy(xpath = "//input[@name='addressLine2']")
	private WebElement txtLocality;

	@FindBy(xpath = "//input[@name='pincode']")
	private WebElement txtPincode;

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement txtPhone;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement txtName;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement txtEmailBox;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement btnFinalContiune;

	@FindBy(xpath = "//span[text()='Need help? ']")
	private WebElement textPolicy;

	@FindBy(xpath = "//button[@class='_2KpZ6l _1uR9yB _3dESVI']")
	private WebElement accept;

	@FindBy(xpath = "(//button[@class='_32l7f0'])[position()=2]")
	private WebElement change;

	@FindBy(xpath = "//div[@class='_1P2-0f']")
	private WebElement add;

	public WebElement getAccept() {
		return accept;
	}

	public WebElement getChange() {
		return change;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getTextPolicy() {
		return textPolicy;
	}

	public WebElement getTxtEmailBox() {
		return txtEmailBox;
	}

	public WebElement getBtnFinalContiune() {
		return btnFinalContiune;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtAlternatePhone() {
		return txtAlternatePhone;
	}

	public WebElement getBtnRadioHome() {
		return btnRadioHome;
	}

	public WebElement getDwnDropState() {
		return dwnDropState;
	}

	public WebElement getBtnSaveAndDeliver() {
		return btnSaveAndDeliver;
	}

	public WebElement getTxtLandMark() {
		return txtLandMark;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtLocality() {
		return txtLocality;
	}

	public WebElement getTxtPincode() {
		return txtPincode;
	}

	public WebElement getTxtPhone() {
		return txtPhone;
	}

	public WebElement getTxtName() {
		return txtName;
	}

}
