package stepdefinitions;

import io.cucumber.java.en.*;
import pageobjects.*;
import utils.DriverManager;
import org.junit.Assert;

public class FlipkartSteps {

    LoginPage loginPage;
    HomePage homePage;
    ProductPage productPage;

    @Given("user launches the Flipkart app")
    public void launchApp() throws Exception {
        DriverManager.initializeDriver();
        loginPage = new LoginPage(DriverManager.getDriver());
    }

    @When("user logs in with phone number and OTP")
    public void loginToFlipkart() {
        loginPage.skipLogin(); // Optional: Flipkart allows skip login
        // loginPage.enterPhoneNumber("9876543210");
        // loginPage.enterOtp("123456"); // Or auto-read
    }

    @When("user searches for {string}")
    public void searchProduct(String product) {
        homePage = new HomePage(DriverManager.getDriver());
        homePage.searchForProduct(product);
    }

    @When("user adds first product to cart")
    public void addToCart() {
        productPage = new ProductPage(DriverManager.getDriver());
        productPage.selectFirstProduct();
        productPage.addToCart();
    }

    @Then("product should be added to cart successfully")
    public void verifyCart() {
        Assert.assertTrue(productPage.verifyCartUpdate());
        DriverManager.quitDriver();
    }
}
