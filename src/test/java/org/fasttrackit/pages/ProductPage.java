package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductPage extends PageObject {

    @FindBy(css= ".single_add_to_cart_button")
    private WebElementFacade addToCartButton;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
}
