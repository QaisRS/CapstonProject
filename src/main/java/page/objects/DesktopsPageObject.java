package page.objects;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopsPageObject extends Base {
	public DesktopsPageObject() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(tagName ="img")
	private List <WebElement> items; // driver.FindElements
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement quantityInput;
	
	@FindBy(id ="button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement HPLPsuccessmessage;
	
	@FindBy(xpath ="//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;
	
	@FindBy(xpath ="//a[text()='Write a review']")
	private WebElement writeReviewLink;
	
	@FindBy(id ="input-name")
	private WebElement yourNameField;
	
	@FindBy(id="input-review")
	private WebElement yourReviewField;
	
	@FindBy(xpath ="//input[@type='radio']")
	private List <WebElement> rating;
	
	@FindBy(id ="button-review")
	private WebElement ReviewContinueButton;
	
	@FindBy(xpath ="//*[@id=\"form-review\"]/div[2]/text()")
	private String reviewSubmissionMessage;
	
	
	
	public void clickonDesktopsTab() {
		WebDriverUtility.moveToElement(desktops);
	}
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public List<WebElement> desktopsItems(){
		List<WebElement> itemsDesk = items;
		return itemsDesk;
	}
	
	public void clickOnHPLP3065Item() {
		hpLP3065.click();
	}
	
	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
	}

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	
	public String successMessage() {
		String actualResult = "Success: You have added "+HPLPsuccessmessage.getText()+" to your shopping cart!";
		return actualResult;
	}
	
	public boolean isSuccessMessagePresent() {
		if(HPLPsuccessmessage.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickOnCanonEOS5DCamera() {
		canonEOS5DCamera.click();
	}
	
	public void clickOnReviewLink() {
		writeReviewLink.click();
	}
	
	public void selectRating(String ratingValue) {
		List<WebElement> ratingElements = rating;
		for(WebElement element:ratingElements) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
		}
	}
	
	public void clickOnContinueButton() {
		ReviewContinueButton.click();
	}
	
	public void enterYourName(String nameValue) {
		yourNameField.sendKeys(nameValue);
	}
	
	public void enterYourReview(String reviewValue) {
		yourReviewField.sendKeys(reviewValue);
	}
	
	public String reviewText() {
		return reviewSubmissionMessage;
	}


}