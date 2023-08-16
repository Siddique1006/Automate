package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Objects {
	
	@FindBy(id = "user-name")
	public WebElement userName;
	
	@FindBy(id = "password")
	public WebElement UserPassword;
	
	@FindBy(id = "login-button")
	public WebElement loginBtn;

	
	@FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
	public WebElement productName;
	
	@FindBy(xpath = "(//div[@class='inventory_item_price'])[1]")
	public WebElement productPrice;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	public WebElement addToCartBtn;
	
	@FindBy(id = "shopping_cart_container")
	public WebElement cartBtn;
	
	@FindBy(id = "checkout")
	public WebElement checkout;
	
	@FindBy(id = "first-name")
	public WebElement firstName;
	
	@FindBy(id = "last-name")
	public WebElement lastName;
	
	@FindBy(id = "postal-code")
	public WebElement postalCode;
	
	@FindBy(id = "continue")
	public WebElement continueBtn;
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	public WebElement actualProductName;
	
	@FindBy(xpath = "//div[@class='inventory_item_price']")
	public WebElement actualProductPrice;
	
	@FindBy(id = "finish")
	public WebElement finishBtn;
	
	@FindBy(xpath = "//h2[@class='complete-header']")
	public WebElement confirmationMsg;
	
	
}
