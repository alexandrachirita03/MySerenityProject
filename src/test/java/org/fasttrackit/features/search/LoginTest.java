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
}
