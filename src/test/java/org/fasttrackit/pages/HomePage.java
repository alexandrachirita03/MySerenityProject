package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy( css = "#menu-item-122")
    private WebElementFacade accountLink;
    @FindBy( css = ".col-1")
    private WebElementFacade loginLink;
    @FindBy(css = ".header-search")
    private WebElementFacade searchIcon1;
    @FindBy(css = ".woocommerce-product-search .search-field")
    private WebElementFacade searchField;
    @FindBy(css = "[type='submit']")
    private WebElementFacade searchIcon;
    @FindBy(css = ".col-2")
    private WebElementFacade registerLink;
    @FindBy(css = "#menu-item-125")
    private WebElementFacade checkoutLink;


    public void clickAccountLink(){
        clickOn(accountLink);
    }

    public void clickLoginLink(){
        clickOn(loginLink);
    }

    public void clickSearchIcon1(){
        clickOn(searchIcon1);
    }

    public void setSearchField(String keyword){
        typeInto(searchField, keyword);
    }

    public void clickSearchIcon(){
        clickOn(searchIcon);
    }

    public void clickRegisterLink(){
        clickOn(registerLink);
    }
    public void clickCheckoutLink(){
        clickOn(checkoutLink);
    }




}
