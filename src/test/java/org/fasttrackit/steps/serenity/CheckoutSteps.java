package org.fasttrackit.steps.serenity;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;
import org.junit.Assert;


public class CheckoutSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private SearchResultsPage searchResultsPage;
    private ProductPage productPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private AccountPage accountPage;


    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToLogin(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void setCredentials(String email, String pass){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();
    }

    @Step
    public void doSearch(String keyword){
        homePage.clickSearchIcon1();
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }

    @Step

    public void selectProductFromList(String product){
        searchResultsPage.selectProductFromList(product);
    }


    @Step
    public void clickAddToCart(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void navigateToCheckoutLink(){
        homePage.clickCheckoutLink();
    }

    @Step
    public void setCredentials2(String name1, String name2){
        checkoutPage.setFirstName(name1);
        checkoutPage.setLastName(name2);
    }

    @Step
    public void setAddress(String street, String town){
        checkoutPage.setStreetAddress(street);
        checkoutPage.setTownCity(town);
    }

    @Step
    public void setPostCode(String code){
        checkoutPage.setPostCode(code);
    }

    @Step
    public void setContacts(String phone, String email){
        checkoutPage.setPhone(phone);
        checkoutPage.setEmailAddress(email);
    }

    @Step
    public void clickPlaceOrder(){
        checkoutPage.clickPlaceOrderButton();
    }

    @Step
    public void verifySuccessMessage(String text){
        Assert.assertEquals("Thank you. Your order has been received.", text);
    }


}
