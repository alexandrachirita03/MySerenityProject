package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductPage extends PageObject {

    @FindBy(css= ".single_add_to_cart_button")
    private WebElementFacade addToCartButton;
    @FindBy(css = ".qty")
    private WebElementFacade quantityField;
    @FindBy(css = " div.woocommerce-message ")
    private WebElementFacade successMessage;


    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void setQuantityField(String number){
        typeInto(quantityField,number);
    }




}
