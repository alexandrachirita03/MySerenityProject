package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

    @FindBy(css  = "  .woocommerce-message .button")
    private WebElementFacade successMessage;
    @FindBy(css = ".wc-forward")
    private WebElementFacade viewCart;
    @FindBy(css = ".product-remove a")
    private WebElementFacade removeButton;
    @FindBy(css = ".entry-content .woocommerce-message ")
    private WebElementFacade successMessage2;
    @FindBy(css = "#quantity_62dc2df02fbe2")
    private WebElementFacade quantityField;
    @FindBy( css = "#post-118 > div > div > form > table > tbody > tr:nth-child(2) > td > button")
    private WebElementFacade updateCart;


   //public void verifySuccessMessage(String productName){
    //   successMessage.shouldContainOnlyText( productName  +  "has been added to your cart.");
   // }



    public void clickOnViewCart(){
        clickOn(viewCart);
    }


    public void removeProductFromCart(){
        clickOn(removeButton);
    }

    public void verifySuccessMessage2(String productName){
       successMessage2.shouldContainOnlyText( productName  +  " removed. Undo? ");
    }

    public void setQuantityField(String number){
        typeInto(quantityField, number);
    }

    public void clickOnUpdateCart(){
        clickOn(updateCart);
    }

}
