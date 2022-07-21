package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;

public class LoginSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToLogin(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void setCredetials(String email, String pass){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyUsernameMessage(String userName){
        accountPage.verifyWelcomeMessage(userName);

    }

    @Step
    public void doLogin(String email, String password){
        navigateToHomePage();
        navigateToLogin();
        setCredetials(email, password);
        clickLogin();
    }
}