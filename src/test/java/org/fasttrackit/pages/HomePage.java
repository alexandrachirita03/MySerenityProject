package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy( css = "#menu-item-64")
    private WebElementFacade accountLink;
    @FindBy( css = ".col-1")
    private WebElementFacade loginLink;
    @FindBy(css = ".search-box>.icon-search")
    private WebElementFacade searchIcon1;
    @FindBy(css = "input[type='text']")
    private WebElementFacade searchField;
    @FindBy(css = "button[type='submit'] ")
    private WebElementFacade searchIcon;

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


}
