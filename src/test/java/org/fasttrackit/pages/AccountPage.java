package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AccountPage extends PageObject {

    @FindBy(css = "strong:nth-child(1)")
    private WebElementFacade welcomeText;

    public void verifyWelcomeMessage(String userName){
        welcomeText.shouldContainOnlyText(userName);
    }
}