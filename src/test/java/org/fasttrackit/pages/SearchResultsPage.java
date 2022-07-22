package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".type-product h2")
    private List<WebElementFacade> productsList;


    public boolean checkListForProduct(String productName) {
        waitFor(productsList.get(0));

        for (WebElementFacade element : productsList) {
            if (element.getText().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public void selectProductFromList(String product) {

        for (WebElementFacade element : productsList) {
            if (element.getText().equalsIgnoreCase(product)) {
                clickOn(element);
                break;
            }
        }
    }



}


