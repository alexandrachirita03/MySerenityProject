package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class RegisterPage extends PageObject {

    @FindBy(css = "#reg_email")
    private WebElementFacade emailField;
    @FindBy(css = "#reg_password")
    private WebElementFacade passwordField;
    @FindBy(css = "button[name='register']")
    private WebElementFacade registerButton;

    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }
}
