package pomRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.BaseClass;

public class Product_Flipkart_Repository extends BaseClass {

	public Product_Flipkart_Repository() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement btnAddToCart;

	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}
	
	

}
