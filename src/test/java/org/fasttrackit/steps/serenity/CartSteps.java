package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {

    private ProductPage productPage;
    private CartPage cartPage;


    @Step
    public void clickAddToCart(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void verifySuccessMessage(String text){
        Assert.assertEquals("VIEW CART", text);
    }

    //@Step
   // public void verifySuccessMessage(String productName){
    //    cartPage.verifySuccessMessage(productName);

   // }

    @Step
    public void clickOnViewCart(){
        cartPage.clickOnViewCart();
    }


    @Step
    public void clickRemoveButton(){
        cartPage.removeProductFromCart();
    }


    @Step
    public void verifySuccessMessage2(String productName){
      cartPage.verifySuccessMessage2(productName);
    }


    @Step
    public void changeQuantity(String number){
        cartPage.setQuantityField(number);
    }

    @Step
    public void clickOnUpdateCart(){
        cartPage.clickOnUpdateCart();
    }

}
