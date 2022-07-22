package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

    @FindBy(css  = " div.woocommerce-message")
    private WebElementFacade successMessage;
    @FindBy(css = ".wc-forward")
    private WebElementFacade viewCart;
    @FindBy(css = ".product-remove a")
    private WebElementFacade removeButton;
  //  @FindBy(css = ".woocommerce .woocommerce-message")
   // private WebElementFacade successMessage2;

    public void verifySuccessMessage(String productName){
        successMessage.shouldContainOnlyText( productName  +  "has been added to your cart.");
    }

    public void clickOnViewCart(){
        clickOn(viewCart);
    }


    public void removeProductFromCart(){
        clickOn(removeButton);
    }

   // public void verifySuccessMessage2(String productName){
    //    successMessage2.shouldContainOnlyText( productName  +  "removed. Undo?");
    //}

}
