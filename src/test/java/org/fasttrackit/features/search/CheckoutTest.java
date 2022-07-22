package org.fasttrackit.features.search;


import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public  void checkoutTestWithValidData(){
        checkoutSteps.navigateToHomePage();
        checkoutSteps.navigateToLogin();
        checkoutSteps.setCredentials("alexandra_rusitoru@yahoo.com", "Qwerty1$2$3$");
        checkoutSteps.clickLogin();
        checkoutSteps.doSearch("beanie");
        checkoutSteps.selectProductFromList("Beanie");
        checkoutSteps.clickAddToCart();
        checkoutSteps.navigateToCheckoutLink();
        checkoutSteps.setCredentials2("Chirita", "Alexandra");
        checkoutSteps.setAddress("Traian", "Brasov");
        checkoutSteps.setPostCode("505366");
        checkoutSteps.setContacts("0725698741","alexandra_rusitoru@yahoo.com");
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.verifySuccessMessage("Thank you. Your order has been received.");

    }
}
