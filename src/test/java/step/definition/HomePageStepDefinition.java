package step.definition;



import org.apache.logging.log4j.core.util.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.WebDriverUtility;

public class HomePageStepDefinition extends Base{
	
	HomePageObject homePage = new HomePageObject();
	
	
	
	@When("User click on currency")
	public void UserClickOnCurrency() {
		homePage.clickOnCurrencyButton();
		logger.info("User click on currency");
		WebDriverUtility.hardWait();
		
	}
	@And("User chose Euro from Dropdown")
	public void UserChoseEuroFromDropDown() {
		homePage.clickOnCurrencyButton();
		logger.info("User chose Euro from Dropdown");
		//WebDriverUtility.hardWait();
	}
	@Then("Currency value should change to Euro")
	public void CurrencyValueShouldChangeToEuro() {
		logger.info("Currency value should change to Euro");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	//--------- User Empty Shopping Cart
	

	@When("User click on shopping cart")
	public void UserClickOnShoppingCart() {
		homePage.clickOnShoppingCartButton();
		logger.info("User click on shopping cart");
		WebDriverUtility.hardWait();
	}
	@Then("{string} message should display")
	public void message_should_display(String string) {
		homePage.yourShoppingCartIsEmptyMessage();
		Assert.isEmpty(homePage.yourShoppingCartIsEmptyMessage());
		logger.info(" 'Your shopping cart is empty!' message should display");
		
	}
	
	 
	   
	
}
