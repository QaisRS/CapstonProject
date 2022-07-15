package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath= "(//span[@class='hidden-xs hidden-sm hidden-md'])[1]")
	private WebElement currencyButton;
	
	public void clickOnCurrencyButton() {
		currencyButton.click();
	}
	
	
	@FindBy(xpath="//button[@name='EUR']")
	private WebElement currencyEUR;
	
	public void clickonEURCurrency() {
		currencyEUR.click();
	}
	
	
	
	//-------------
	
	
	@FindBy(xpath ="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement shoppingCartButton;
	
	public void clickOnShoppingCartButton() {
		shoppingCartButton.click();
	}
	
	@FindBy(xpath="//p[@class='text-center']")
	private WebElement messageShouldDisplayed;
	
	public boolean yourShoppingCartIsEmptyMessage() {
		if(messageShouldDisplayed.isDisplayed())
			return true;
		else 
			return false;
		
		
		
		
	}
}


