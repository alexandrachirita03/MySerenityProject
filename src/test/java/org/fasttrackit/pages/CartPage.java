package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends PageObject {

    @FindBy(css  = "  .woocommerce-message .button")
    private WebElementFacade successMessage;
    @FindBy(css = ".wc-forward")
    private WebElementFacade viewCart;
    @FindBy(css = ".product-remove a")
    private WebElementFacade removeButton;
    @FindBy(css = ".entry-content .woocommerce-message ")
    private WebElementFacade successMessage2;
    @FindBy(css = ".qty")
    private WebElementFacade quantityField;

    @FindBy(css = "#quantity_62dda2d9e2987")
    private WebElementFacade quantityInputField;


    @FindBy( css = "#post-118 > div > div > form > table > tbody > tr:nth-child(2) > td > button")
    private WebElementFacade updateCart;



    public void clickOnViewCart(){
        clickOn(viewCart);
    }


    public void removeProductFromCart(){
        clickOn(removeButton);
    }

    public void verifySuccessMessage2(String productName){
        successMessage2.getText().equals ("�" + productName + "� removed. Undo?");
    }

    public void setQuantityField(String number){
        typeInto(quantityField,number);
    }

    public void clickOnUpdateCart(){
        clickOn(updateCart);
    }



}
