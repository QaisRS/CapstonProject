package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoptopNoteBooksPageObject extends Base{
	
	public LoptopNoteBooksPageObject() {
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
	private WebElement LopTopAndNoteBook;
	
    

    @FindBy(xpath="//a[contains(text(),'Show All Laptops & Notebooks')]")
    private WebElement  ShowAllLoptopAndNoteBook;
     
    
    @FindBy(xpath="(//img[@title='MacBook' ])[1]")
    private WebElement MacBook;
    
    
    @FindBy(xpath="//button[@id='button-cart']")
    private WebElement AddToCartButton;
    
    
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
    private WebElement SuccessMessage;
    
    
    @FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    private WebElement AddCartOption;
    
    
    @FindBy(xpath="//button[@title='Remove']")
    private WebElement RemoveItemOption;
    
    
    @FindBy(xpath="//span[@id='cart-total']")
    private WebElement ZeroItemsInCartOption;
    
    ///------Product Comparison
    
    }
    
    
    	
