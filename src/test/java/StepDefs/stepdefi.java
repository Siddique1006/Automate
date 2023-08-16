package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import Actions.Act;

public class stepdefi {
	
	String productName;
	String productPrice;
	
	Act va = new Act(Hooks.driver);
	@Given("user launch the application")
	public void user_launch_the_application() {
		Hooks.driver.get("https://www.saucedemo.com/");

	}

	@When("user enter username and password as {string} and {string}")
	public void user_enter_username_and_password_as_and(String string1, String string2) {
		   va.enterUserName(string1);
		    va.enterUserPassword(string2);

	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		va.userClickonLoginBtn();

	}

	@Then("user get named and price of first availaible item")
	public void user_get_named_and_price_of_first_availaible_item() {
		   productName = va.getProductName();
			  productPrice=  va.getProductPrice();

	}

	@And("user click on add to cart btn")
	public void user_click_on_add_to_cart_btn() {
		va.clickAddToCart();

	}

	@And("user navigate to cart")
	public void user_navigate_to_cart() {
		va.openCart();

	}

	@And("user continue to checkout the item")
	public void user_continue_to_checkout_the_item() {

	}

	@And("user fill the details for delivery")
	public void user_fill_the_details_for_delivery() throws Exception {
		Thread.sleep(3000);
	    va.checkout();
	    Thread.sleep(3000);

	}


	@Then("user verfiy the confirmation message")
	public void user_verfiy_the_confirmation_message() {
		  Assert.assertEquals(productName, va.getActualProductName());
		  Assert.assertEquals(productPrice, va.getActualProductPrice());
		   Assert.assertEquals("Thank you for your order!",  va.verifyConfirmationMessage()); 
		}

	}


