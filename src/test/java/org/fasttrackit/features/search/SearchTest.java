package org.fasttrackit.features.search;




import org.junit.Test;


public class SearchTest extends BaseTest{



    @Test
    public void searchProductTest(){
        loginSteps.doLogin("alexandra_rusitoru@yahoo.com", "Qwerty1$2$3$");
        searchSteps.doSearch("t-shirt");
        searchSteps.verifyProductInResults("V-NECK T-SHIRT");
    }

}
