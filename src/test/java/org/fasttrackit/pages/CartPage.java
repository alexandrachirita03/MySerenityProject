package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

    @FindBy(css  = "#primary > div.woocommerce-message")
    private WebElementFacade successMessage;

    public void verifySuccessMessage(String productName){
        successMessage.shouldContainOnlyText( productName  +  "has been added to your cart.");
    }
}
