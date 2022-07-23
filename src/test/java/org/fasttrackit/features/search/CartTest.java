package org.fasttrackit.features.search;

import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addProductToCart(){
        loginSteps.doLogin("alexandra_rusitoru@yahoo.com", "Qwerty1$2$3$");
        searchSteps.doSearch("beanie");
        productsSteps.selectProductFromList("Beanie");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessMessage("VIEW CART");
    }

    @Test
    public void removeProductFromCart() {
        loginSteps.doLogin("alexandra_rusitoru@yahoo.com", "Qwerty1$2$3$");
        searchSteps.doSearch("beanie");
        productsSteps.selectProductFromList("Beanie");
        cartSteps.clickAddToCart();
        cartSteps.clickOnViewCart();
        cartSteps.clickRemoveButton();
        cartSteps.verifySuccessMessage2("Beanie" );
    }

    @Test
    public void changeQuantityOfProductFromCart(){
        loginSteps.doLogin("alexandra_rusitoru@yahoo.com", "Qwerty1$2$3$");
        searchSteps.doSearch("beanie");
        productsSteps.selectProductFromList("Beanie");
        cartSteps.clickAddToCart();
        cartSteps.clickOnViewCart();
        //cartSteps.navigateToHomePage();
       // cartSteps.clickOnShoppingCartIcon();
        cartSteps.changeQuantity("5");
        cartSteps.clickOnUpdateCart();
    }


}
