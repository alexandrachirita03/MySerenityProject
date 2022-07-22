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


}
