package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WebDriverUtility;

public class DesktopsStepDef extends Base {
	page.objects.DesktopsPageObject desktopPage = new page.objects.DesktopsPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		desktopPage.clickonDesktopsTab();
		//WebDriverUtility.hardWait();
		logger.info("user clicked on Desktops tab");
		WebDriverUtility.takeScreenShot();
	}
	
	@And("User click on Show all desktops")
	public void userClickOnShowAllDesktops() {
		WebDriverUtility.hardWait();
		desktopPage.clickOnShowAllDesktops();
		logger.info("user clicked on Show all desktops");
	}
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktopPage.desktopsItems();
		for(WebElement element:desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title")+ " is present");
		}
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	   
	}
	
	
	
	@When("User click add to cart option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktopPage.clickOnHPLP3065Item();
		logger.info("user clicked Add to Cart Option");
	}
	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopPage.selectQuantity(string);
		logger.info("user selected quantity " +string);
	}
	@When("User click add to cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.clickOnAddToCartButton();
		logger.info("user clicked add to cart button");
	}
//	@Then("User should see a message {string}")
//	public void user_should_see_a_message(String expectedSuccessMessage) {
//		Assert.assertEquals(desktopPage.successMessage(),expectedSuccessMessage);
//		Assert.assertTrue(desktopPage.isSuccessMessagePresent());
//		logger.info(expectedSuccessMessage + " equals to "+desktopPage.successMessage() );
//		WebDriverUtility.takeScreenShot();
//		WebDriverUtility.hardWait();

//	}
	
		@When("User select color from dropdown Red")
		public void user_select_color_from_dropdown_red() {
		  
		   
		}
		
		

	
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.clickOnReviewLink();
	}
	@When("User fill the review information with below informatio")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	List<Map<String,String>> reviewInformation = dataTable.asMaps(String.class,String.class);
	desktopPage.enterYourName(reviewInformation.get(0).get("YourName"));
	desktopPage.enterYourReview(reviewInformation.get(0).get("YourReview"));
	desktopPage.selectRating(reviewInformation.get(0).get("Rating"));
	WebDriverUtility.hardWait();
	}
	@When("User click on ContinueButton")
	public void user_click_on_continue_button() {
		desktopPage.clickOnContinueButton();
	}
	@Then("User should see message {string}")
	public void user_should_see_message(String string){
	   System.out.println(desktopPage.reviewText() + "  from print");
	}
	

	
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		desktopPage.isSuccessMessagePresent();
		
	 
	}
	
	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	   desktopPage.clickOnCanonEOS5DCamera();
	}
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPage.clickOnHPLP3065Item();
	   
	}
	
	
	}
	
	  






	
	
	
	
	
	
	


