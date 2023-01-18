package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;

public class RemoveProductProcessTests extends BaseStep {
    SoftAssert softAssert = new SoftAssert();

    @When("^I click 'X' button corresponding to particular product$")
    public void i_click_x_button_corresponding_to_particular_product() {
        pages.getCartPage().clickRemoveButtonX();
        BrowserUtils.wait(2);
    }


    @Then("^I should verify that product is removed from the cart$")
    public void i_should_verify_that_product_is_removed_from_the_cart() {
        String actualCartIsEmptyMessage = pages.getCartPage().getCartIsEmptyMessage();
        softAssert.assertEquals(actualCartIsEmptyMessage, "Cart is empty! Click here to buy products.",
                "TestCase 17 : Error! Verify that product is removed from the cart.\n\n");
        softAssert.assertAll();
    }
}
