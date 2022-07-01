package pomRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.BaseClass;

public class SearchPage_Flipkart_Repository extends BaseClass {

	public SearchPage_Flipkart_Repository() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='_4rR01T'])[position()=1]")
	private WebElement linkMobile;

	public WebElement getLinkMobile() {
		return linkMobile;
	}
	
	
}
