package step.definition;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.WebDriverUtility;

public class RetailStepDefinition extends Base {
	RetailPageObject retail = new RetailPageObject();
	
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(retail.isLogoPresent());	
		Assert.assertEquals("TEK SCHOOL", retail.getTitle());
		logger.info("User is on Retail website");
		WebDriverUtility.takeScreenShot();
		
		
	}
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retail.clickOnMyAccount();
		logger.info("user click on my Account");
		WebDriverUtility.takeScreenShot();
	}
	@When("User click on Login")
	public void user_click_on_login() {
		retail.clickLoginOption();
		logger.info("user click on Login Option");
		WebDriverUtility.takeScreenShot();
	
	}
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
	   // i need help in this part.
		retail.enterUserName();
		retail.enterPassword();
		logger.info("User enter username {string} and password {string}");
		WebDriverUtility.takeScreenShot();
		
	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
		
		retail.loginButto();
		logger.info("User click on Login button");
		WebDriverUtility.takeScreenShot();
	   
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		// i need help for this part of code?
		Assert.assertTrue(retail.isLogoPresent());
		logger.info("User should be logged in to MyAccount dashboard");
		WebDriverUtility.takeScreenShot();
	}	
//	    ------------------
	
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
	retail.ClickUserForAffiliate();
	   logger.info("User click on Register for an Affiliate Account link");
	   
	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
	    
		 List<Map<String,String>> info = dataTable.asMaps(String.class, String.class);
	        retail.companyNameField(info.get(0).get("company"));
	        retail.websiteInputField(info.get(0).get("website"));
	        retail.taxInputField(info.get(0).get("taxID"));
	        retail.paymentMethodRadioButton(info.get(0).get("Payment Method"));
	        retail.inputChequeField(info.get(0).get("payee Name"));
	        logger.info("User entered bank account information");
	        WebDriverUtility.takeScreenShot();
	
	}
		

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	    retail.continueButton();
	    logger.info("User click on Continue button");
	    
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message(){
	   Assert.assertTrue(retail.isSuccssMessageDisplayed());
	   WebDriverUtility.takeScreenShot();
	   logger.info("User should see a success message");
	}
	
	
	
//--------Scenario Edit your affiliate information
	
     @When("User click on Edit your affiliate informationlink")
     public void User_click_on_edit_your_affiliate_information() {
	    retail.ClickUserForAffiliate();
	    logger.info("User click on Edit your affiliate informationlink");
}
	@And("User click on Bank tranfer radio button")
	public void User_click_on_Bank_Transfer_radio_Button() {
		
		
	}
	
}
	
//	@And("User click on continue button")
//	public void User_click_on_continue_button() {
//		
//	}
	
//	@Then("User should see a success message")
//	public void User_should_see_a_success_message() {
//			
//	}
//}
	
//
//	//--------------------Scenario Edit your account information.
//
////
////    @When("User click on 'Edit your account information' link")
////    public void User_click_on_Edit_your_account_information_link() {
////    	
////    }
//    
//    @And("User modify below information")
//    public void User_modify_below_information() {
//    	
//    }	
////    @And("User click on continue button")
////     public void User_click_on_continue_buton() {
////    	
////    }
//    
//	@Then("User should see a message 'Success: Your account has been successfully updated'")
//	public void User_should_see_a_message() {
//		
//	}
//}
	
	
	

