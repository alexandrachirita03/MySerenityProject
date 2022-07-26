package org.fasttrackit.features.search;

import org.junit.Test;

public class ProductTest extends BaseTest{

    @Test
    public void changeQuantityOfProductBeforeAddToCart() {
        cartSteps.navigateToHomePage();
        searchSteps.doSearch("beanie");
        productsSteps.selectProductFromList("Beanie");
        productsSteps.changeQuantity("5");
        productsSteps.clickAddToCartButton();
        productsSteps.verifySuccessMessage("VIEW CART");
    }
}
