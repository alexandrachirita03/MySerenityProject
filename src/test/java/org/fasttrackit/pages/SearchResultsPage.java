package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".type-product")
    private List<WebElementFacade> productsList;

    public boolean checkListForProduct(String productName) {

        for (WebElementFacade element : productsList) {
            if (element.findElement(By.cssSelector(".entry-title a[href*='v-neck-t-shirt']")).getText().equalsIgnoreCase(productName)) {
                return true;

            }
        }
        return false;
    }
}

