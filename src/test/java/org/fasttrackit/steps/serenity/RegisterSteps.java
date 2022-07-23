package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;

public class RegisterSteps extends ScenarioSteps {

    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;



    @Step
    public void navigateToHomePage(){
        homePage.open();

    }

    @Step
    public void navigateToRegister(){
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }

    @Step
    public void setCredentials(String email, String pass){
        registerPage.setEmailField(email);
        registerPage.setPasswordField(pass);
    }

    @Step
    public void clickRegister(){
        registerPage.clickRegisterButton();
    }

    @Step
    public void verifyErrorMessage(String text){
        accountPage.verifyErrorMessage(text);
    }


}
