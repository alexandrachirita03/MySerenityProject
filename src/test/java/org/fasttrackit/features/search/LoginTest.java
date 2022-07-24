package org.fasttrackit.features.search;


import org.junit.Test;



public class LoginTest extends BaseTest {


    @Test
    public void loginWithValidCredentialsTest(){
       loginSteps.navigateToHomePage();
       loginSteps.navigateToLogin();
       loginSteps.setCredentials("alexandra_rusitoru@yahoo.com", "Qwerty1$2$3$");
       loginSteps.clickLogin();
       loginSteps.verifyUsernameMessage("alexandra_rusitoru");
    }

    @Test
    public void loginWithEmptyPasswordFieldTest(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("alexandra_rusitoru@yahoo.com", "");
        loginSteps.clickLogin();
        loginSteps.verifyErrorMessage("ERROR: The password field is empty.");

    }

    @Test
    public void loginWithEmptyUserNamedFieldTest(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("", "Qwerty1$2$3$");
        loginSteps.clickLogin();
        loginSteps.verifyErrorMessage("Error: Username is required.");

    }

    @Test
    public void loginWithInvalidCredentialsTest(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("alexandra.rusitoru95@gmail.com", "Qwerty1$2$3$");
        loginSteps.clickLogin();
        loginSteps.verifyErrorMessage("ERROR: Invalid email address. Lost your password?");
    }


}
