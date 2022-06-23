package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import core.Base;

public class RetailPageObject extends Base{
	
	public RetailPageObject() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath ="//Span[text() = 'My Account']")
	private WebElement MyAccountOption;
	
	public void clickOnMyAccount() {
		MyAccountOption.click();
		
	}
	
	@FindBy(xpath= "(//a[text() ='Login'])[1]")
	private WebElement LoginOption;
	
	public void clickLoginOption() {
		LoginOption.click();
		
	}
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement UserNameOption;
	
	public void enterUserName() {
		UserNameOption.sendKeys("qrsaleh@gmail.com");
	}
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement PasswordOption;
	
	public void enterPassword() {
		PasswordOption.sendKeys("Siamjan12asad");
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement LoginButtonOption;
	
	public void loginButto() {
		LoginButtonOption.click();
	}
	
	@FindBy(xpath= "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement testEnvironmentLogo;
	
	public boolean isLogoPresent() {
		
		if (testEnvironmentLogo.isDisplayed())
			return true;
		else
			return false;
		
	}
	
	public String getTitle() {
		return driver.getTitle();
				
	}

	//------------
	
	@FindBy(xpath=" //a[contains(text(),'Register for an affiliate account')]")
	private WebElement RegisterForAffiliateAccountOption;
	
	public void ClickUserForAffiliate() {
		RegisterForAffiliateAccountOption.click();
	}

	@FindBy(xpath= "//input[@id='input-company']")
	private WebElement CopmanyNameOption;
	
	public void companyNameField(String companyName) {
		CopmanyNameOption.sendKeys(companyName);
	
	}

	
	@FindBy(id="input-website")
	private WebElement WebsiteOption;
	
	public void websiteInputField(String WebsiteName) {
		WebsiteOption.sendKeys(WebsiteName);
	}
	
	@FindBy(id="input-tax")
	private WebElement TaxIdOption;
	
	public void taxInputField(String Taxinput) {
		TaxIdOption.sendKeys(Taxinput);
	}
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement PaymentMethodChequeOption;
	
	@FindBy(xpath =" //body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[2]/label[1]/input[1]")
	private WebElement PayPalOption;
	
	@FindBy(xpath="//input[@value='bank']")
	private WebElement bankTranferoption;
	
	public void paymentMethodRadioButton(String paymentType) {
		if(paymentType.equals("Cheque")) {
		PaymentMethodChequeOption.click();
		}else if(paymentType.equals("PayPal")) {
			PayPalOption.click();
		}else 
			bankTranferoption.click();
			
	
	}
	
	@FindBy(id="input-cheque")
	private WebElement ChequeNamePayeeOption;
	public void inputChequeField(String InputCheque) {
		ChequeNamePayeeOption.sendKeys(InputCheque);
	}

	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement AgreementCheckboxOption;
	public void checkBoxAgreement() {
		AgreementCheckboxOption.click();
	}
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueButton;
	
	public void continueButton() {
		continueButton.click();
	}
	
	
	@FindBy(xpath ="//*[@id=\"account-account\"]/div[1]")
	private WebElement SuccessMessageOption;
	 
	public boolean isSuccssMessageDisplayed() {
	
		if(SuccessMessageOption.isDisplayed())
			return true;
		else
			return false;
	}
//
	}
//	//---------Edit your affiliate account
//	
//	@FindBy(xpath ="(//input[@ type='radio'])[1]")
//	private WebElement bankTransferRadioButton;
//	
//	@FindBy(xpath="//input[@placeholder='Bank Name']")
//	private WebElement enterbankName;
//	
//	@FindBy(xpath="//input[@placeholder='ABA/BSB number (Branch Number)']")
//	private WebElement enterabaNumber;
//	
//	@FindBy(xpath= "//input[@placeholder='SWIFT Code']")
//	private WebElement enterswiftCode;
//	
//	@FindBy(xpath= "//input[@placeholder='Account Name']")
//	private WebElement enteraccountName;
//	
//	@FindBy(xpath="//input[@placeholder='Account Number']")
//	private WebElement enteraccountNumber;
//	
//	@FindBy(xpath="//input[@value= 'Continue']")
//	private WebElement continuebutton;
//	
//	@FindBy(xpath="//div[text()=' Success: Your account has been successfully updated.']")
//	private WebElement successMessage;
//
//   
////-----------
//
//   @FindBy(xpath="//a[text()='Edit your account information']")
//   private WebElement editYourAccInfo;
//   
//   
//   @FindBy(id= "input-firstname")
//   private WebElement firstName;
//   
//   @FindBy(id="input-lastname")
//   private WebElement lastName;
//   
//   @FindBy(xpath ="//input[@id='input-email']")
//   private WebElement emailField;
//   
//   
//   @FindBy(xpath = "//input[@id='input-email']")
//   private WebElement telephoneField;
//   
//   @FindBy(xpath = "//input[@class='btn btn-primary']")
//   private WebElement continue_Button;
//   
//   @FindBy(xpath = "//body/div[@id='account-account']/div[1]")
//   private WebElement successMessageDisplay;
//
//public Object getSuccessMessage() {
//	// TODO Auto-generated method stub
//	return null;
//}
//   
//   }
//   
//
//
//


