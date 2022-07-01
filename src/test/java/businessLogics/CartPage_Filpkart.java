package businessLogics;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomRepository.HomePage_Filpkart_Repositroy;
import pomRepository.LoginAndOrderSummaryPage_Flipkart_Repository;
import pomRepository.MyCart_Flipkart_Repository;
import pomRepository.Product_Flipkart_Repository;
import pomRepository.SearchPage_Flipkart_Repository;

public class CartPage_Filpkart extends HomePage_Filpkart_Repositroy {

	@Given("User Launches the browser and navigate to Flipkart website")
	public void user_launches_the_browser_and_navigate_to_flipkart_website() {
		doLaunchBrowser("Chrome", "https://www.flipkart.com/");
		doMaximizeBrowser();
		doWaitImplicitly();
		doFreeze();
	}

	@When("User made search for product")
	public void user_made_search_for_i_phone() {
		HomePage_Filpkart_Repositroy h = new HomePage_Filpkart_Repositroy();
		doClick(h.getBtnClosePopUP());
		doSendKeys(h.getTxtSearchBox(), "laptop");
		doFreeze();
		doClick(h.getBtnSearchButton());
	}

	@When("User select the required product from result page")
	public void user_select_the_required_phone_from_result_page() {
		SearchPage_Flipkart_Repository s = new SearchPage_Flipkart_Repository();
		doFreeze();
		doCaptureScreenShot("SearchResult");
		doClick(s.getLinkMobile());
		doFreezeExecution(3000);
	}

	@When("User entered the required specification and added the product to cart")
	public void user_entered_the_required_specification_and_added_the_product_to_cart() {
		Product_Flipkart_Repository p = new Product_Flipkart_Repository();
		doSwitchWindow(1);
		doFreeze();
		doCaptureScreenShot("ProductResult");
		doClick(p.getBtnAddToCart());
	}

	@When("User verify the product from card and placed the order")
	public void user_verify_the_product_from_card_and_placed_the_order() {
		MyCart_Flipkart_Repository m = new MyCart_Flipkart_Repository();
		doCaptureScreenShot("AddToCartResult");
		doFreeze();
		doClick(m.getBtnPlaceOrder());
	}

	@When("User enter the creditials and address fields")
	public void user_enter_the_creditials_and_address_fields() throws AWTException {
		LoginAndOrderSummaryPage_Flipkart_Repository l = new LoginAndOrderSummaryPage_Flipkart_Repository();
		doSendKeys(l.getTxtUserName(), "8925843340");
		doClick(l.getBtnContinue());
		doSendKeys(l.getTxtPassword(), "Jagan@123");
		doClick(l.getBtnLogin());
		doClick(l.getAdd());
		doSendKeys(l.getTxtName(), "Jagan");
		doSendKeys(l.getTxtPhone(), "8925843340");
		doSendKeys(l.getTxtPincode(), "600001");
		doSendKeys(l.getTxtLocality(), "Chennai");
		doSendKeys(l.getTxtAddress(), "Address to Delivery");
		doClearTheTextBox(l.getTxtCity());
		doSendKeys(l.getTxtCity(), "chennai");
		doSelectDownDropViaText(l.getDwnDropState(), "Tamil Nadu");
		doSendKeys(l.getTxtLandMark(), "LandMark");
		doSendKeys(l.getTxtAlternatePhone(), "9876543212");
		doClickWithJavaScriptExecutor(l.getBtnRadioHome());
		doCaptureScreenShot("AddressConfirmationResult");
		doFreeze();
		doClick(l.getBtnSaveAndDeliver());
		doFreezeExecution(3000);
		doScrollWindowViaJavaScriptExecutor(l.getTextPolicy());
		doSendKeysViaJavaScriptExecutor(l.getTxtEmailBox(), "vinithalaxmi15@gmail.com");
		doFreeze();
		doCaptureScreenShot("ProceedToPaymentConfirmation");
		doClick(l.getBtnFinalContiune());
		doFreeze();
		doClick(l.getAccept());
		doFreeze();
	}

	@When("User removed the product from cart")
	public void user_removed_the_product_from_cart() {
		MyCart_Flipkart_Repository m = new MyCart_Flipkart_Repository();
		doCameBack();
		doScrollWindowViaJavaScriptExecutor(m.getBtnPlaceOrder());
		doFreeze();
		doClick(m.getBtnRemove());
		doFreeze();
		doClick(m.getBtnRemoveConfirmation());
		doCaptureScreenShot("EmptyCartResult");
		doClickWithJavaScriptExecutor(m.getBtnDownDropOptions());
		doFreeze();
		doClick(m.getBtnLogOut());
	}

	@Then("User verify the outcome and closed the browser")
	public void user_verify_the_outcome_and_closed_the_browser() {
		doFreeze();
		doCaptureScreenShot("LogedOutResult");
		doQuitTheBrowser();
	}

}
