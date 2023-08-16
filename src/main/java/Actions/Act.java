package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Objects.Objects;

public class Act {
	
	Objects Obj;
	Actions acts;
	
	public Act(WebDriver driver) {
		Obj = PageFactory.initElements(driver, Objects.class);
		acts = new Actions(driver);
	}
	
	public void enterUserName(String s) {
		Obj.userName.sendKeys(s);
	}
	
	public void enterUserPassword(String s1) {
		Obj.UserPassword.sendKeys(s1);
	}
	
	public void userClickonLoginBtn() {
		Obj.loginBtn.click();
	}
	
	public String getProductName() {
		return Obj.productName.getText();
	}
	
	public String getProductPrice() {
		return Obj.productPrice.getText();
	}
	
	public void clickAddToCart() {
		Obj.addToCartBtn.click();
	}
	
	public void openCart() {
		Obj.cartBtn.click();
	}
	
	public void checkout() {
		Obj.checkout.click();
		Obj.firstName.sendKeys("Mohamed Abubakker");
		Obj.lastName.sendKeys("Siddique");
		Obj.postalCode.sendKeys("6200001");
		Obj.continueBtn.click();
	}
	
	public String getActualProductName() {
		return Obj.actualProductName.getText();
	}
	
	public String getActualProductPrice() {
		return Obj.actualProductPrice.getText();
	}
	
	public String verifyConfirmationMessage() {
		Obj.finishBtn.click();
	return	Obj.confirmationMsg.getText();
	}

}
