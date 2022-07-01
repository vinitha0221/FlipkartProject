package pomRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.BaseClass;

public class MyCart_Flipkart_Repository extends BaseClass {

	public MyCart_Flipkart_Repository() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement btnPlaceOrder;

	@FindBy(xpath = "(//div[@class='_10vWcL td-FUv WDiNrH']//div[@class='_3dsJAO'])[position()=2]")
	private WebElement btnRemove;

	@FindBy(xpath = "//div[@class='td-FUv WDiNrH']//div[@class='_3dsJAO _24d-qY FhkMJZ']")
	private WebElement btnRemoveConfirmation;

	@FindBy(xpath = "//div[@class='exehdJ']")
	private WebElement btnDownDropOptions;

	@FindBy(xpath = "(//div[@class='_3vhnxf'])[position()=10]")
	private WebElement btnLogOut;

	public WebElement getBtnPlaceOrder() {
		return btnPlaceOrder;
	}

	public WebElement getBtnRemove() {
		return btnRemove;
	}

	public WebElement getBtnRemoveConfirmation() {
		return btnRemoveConfirmation;
	}

	public WebElement getBtnDownDropOptions() {
		return btnDownDropOptions;
	}

	public WebElement getBtnLogOut() {
		return btnLogOut;
	}

}