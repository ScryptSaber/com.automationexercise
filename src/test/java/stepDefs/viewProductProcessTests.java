package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class viewProductProcessTests extends BaseStep {
    SoftAssert softAssert = new SoftAssert();

    @When("^I click on 'Women' category$")
    public void i_click_on_women_category() {
        pages.getHomePage().clickWomenCategoryButton();
    }

    @When("^I click on any category link under 'Women' category, for example: Dress$")
    public void i_click_on_any_category_link_under_women_category_for_example_dress() {
        pages.getProductsPage().clickDressCategoryButton();
    }

    @When("^I click on any sub-category link of 'Men' category,  on left side bar$")
    public void i_click_on_any_subcategory_link_of_men_category_on_left_side_bar() {
        pages.getProductsPage().clickMenCategoryButton();
        pages.getProductsPage().clickTshirtCategoryButton();
    }

    @Then("^I should verify that categories are visible on left side bar$")
    public void i_should_verify_that_categories_are_visible_on_left_side_bar() {
        String actualCategoryText = pages.getProductsPage().getCategoryText();
        softAssert.assertEquals(actualCategoryText, "CATEGORY");
        softAssert.assertAll();
    }

    @Then("^I should verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'$")
    public void i_should_verify_that_category_page_is_displayed_and_confirm_text_women_dress_products() {
        softAssert.assertTrue(pages.getProductsPage().getProductsTitleText().contains("PRODUCTS"));
        softAssert.assertAll();
    }

    @Then("^I should verify that user is navigated to that category page$")
    public void i_should_verify_that_user_is_navigated_to_that_category_page() {
        softAssert.assertTrue(pages.getProductsPage().getProductsTitleText().contains("PRODUCTS"));
        softAssert.assertAll();

    }

    @When("^I click on 'Products' button$")
    public void i_click_on_products_button() {
        pages.getHomePage().clickProductsButton();
    }

    @When("^I click on any brand name$")
    public void i_click_on_any_brand_name() {
        pages.getProductsPage().clickBrandsNamePolo();
    }

    @When("^I click on any other brand link,on left side bar$")
    public void i_click_on_any_other_brand_linkon_left_side_bar() {
        pages.getProductsPage().clickBrandsNamePolo();
    }

    @Then("^I should verify that Brands are visible on left side bar$")
    public void i_should_verify_that_brands_are_visible_on_left_side_bar() {
        String actualBrandsText = pages.getProductsPage().getBrandsText();
        Assert.assertEquals(actualBrandsText, "BRANDS");
    }

    @Then("^I should verify that user is navigated to brand page and brand products are displayed$")
    public void i_should_verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
        String actualBrandPageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualBrandPageUrl, "https://automationexercise.com/brand_products/Polo");

        String actualBrandProducts;
        Assert.assertTrue(pages.getProductsPage().getProductsTitleText().contains("PRODUCTS"));
    }

    @Then("^I should verify that user is navigated to that brand page and can see products$")
    public void i_should_verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {
        String actualBrandPageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualBrandPageUrl, "https://automationexercise.com/brand_products/Polo");

        String actualBrandProducts;
        Assert.assertTrue(pages.getProductsPage().getProductsTitleText().contains("PRODUCTS"));
    }

}
