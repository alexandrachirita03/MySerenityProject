package org.fasttrackit.features.search;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;



public class RegisterTests extends BaseTest {


    @Test
    public void registerWithValidCredentialsTest(){
       registerSteps.navigateToHomePage();
       registerSteps.navigateToRegister();
       registerSteps.setCredentials(" alexandra_rusitoru " + RandomStringUtils.randomAlphanumeric(1) + " @yahoo.com ","Qwerty1$2$3$" );
       registerSteps.clickRegister();

    }

    @Test
    public void registerWithEmptyRequiredFieldsTest(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegister();
        registerSteps.setCredentials("","" );
        registerSteps.clickRegister();
        registerSteps.verifyErrorMessage("Error: Please provide a valid email address.");

    }

    @Test
    public void registerWithEmptyPasswordFieldTest(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegister();
        registerSteps.setCredentials("alexandra.rusitoru@gmail.com","" );
        registerSteps.clickRegister();
        registerSteps.verifyErrorMessage("Error: Please enter an account password.");

    }

    @Test
    public void registerWithAnEmailAlreadyRegisteredTest(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegister();
        registerSteps.setCredentials("alexandra_rusitoru@yahoo.com","Qwerty1$2$3$" );
        registerSteps.clickRegister();
        registerSteps.verifyErrorMessage("Error: An account is already registered with your email address. Please log in.");

    }



}
