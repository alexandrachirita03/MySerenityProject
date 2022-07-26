package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class ProductsSteps extends ScenarioSteps {

    private SearchResultsPage searchResultsPage;
    private ProductPage productPage;

    @Step

    public void selectProductFromList(String product){
        searchResultsPage.selectProductFromList(product);
    }

    @Step
    public void changeQuantity(String number){
       productPage.setQuantityField(number);
    }

    public void clickAddToCartButton(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void verifySuccessMessage(String text){
        Assert.assertEquals("VIEW CART", text);
    }
}
