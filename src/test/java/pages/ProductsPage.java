package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    @FindBy(id = "search_product")
    private WebElement searchProductBox;

    @FindBy(id = "submit_search")
    private WebElement searchButton;

    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    private WebElement allProductsTextWebElement;

    @FindBy(xpath = "//div[@class='features_items']")
    private WebElement allProductItemsWebElement;

    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    private WebElement firstViewProductButton;

    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    private WebElement searchedProductsMessageWebElement;

    @FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Men Tshirt')]")
    private WebElement searchedProductMenTshirt;

    @FindBy(xpath = "(//div)[40]")
    private WebElement hoverOverFirstItemWebElement;

    @FindBy(xpath = "(//div)[47]")
    private WebElement hoverOverSecondItemWebElement;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]")
    private WebElement addToCartButton;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[3]")
    private WebElement addToCartSecondButton;

    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    private WebElement viewCartButton;

    @FindBy(xpath = "//a[normalize-space()='Men']")
    private WebElement menCategoryButton;
    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    private WebElement tshirtCategoryButton;

    @FindBy(xpath = "(//a[contains(text(),'Dress')])[1]")
    private WebElement dressCategoryButton;

    @FindBy(css = ".title.text-center")
    private WebElement productsTitleText;
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    private WebElement categoryTextWebElement;

    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    private WebElement brandsText;

    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    private WebElement brandsNamePoloWebElement;


    public void searchProduct(String productName) {
        searchProductBox.sendKeys(productName);
    }

    public String getAllProductsText() {
        return allProductsTextWebElement.getText();
    }

    public WebElement getAllProductItemsWebElement() {
        return allProductItemsWebElement;
    }

    public WebElement getHoverOverFirstItemWebElement() {
        return hoverOverFirstItemWebElement;
    }

    public WebElement getHoverOverSecondItemWebElement() {
        return hoverOverSecondItemWebElement;
    }

    public void clickFirstViewProductButton() {
        firstViewProductButton.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickAddToCartSecondButton() {
        addToCartSecondButton.click();
    }

    public void clickViewCartButton() {
        viewCartButton.click();
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }

    public void clickMenCategoryButton() {
        menCategoryButton.click();
    }

    public void clickTshirtCategoryButton() {
        tshirtCategoryButton.click();
    }

    public void clickDressCategoryButton() {
        dressCategoryButton.click();
    }

    public void clickBrandsNamePolo() {
        brandsNamePoloWebElement.click();

    }

    public String getSearchedProductsMessage() {
        return searchedProductsMessageWebElement.getText();
    }

    public String getSearhedMenTshirt() {
        return searchedProductMenTshirt.getText();
    }

    public String getProductsTitleText() {
        return productsTitleText.getText();
    }



    public String getCategoryText() {
        return categoryTextWebElement.getText();
    }

    public String getBrandsText() {
        return brandsText.getText();
    }

}
