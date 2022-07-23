package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CheckoutPage extends PageObject {

    @FindBy(css ="#billing_first_name  ")
    private WebElementFacade firstName;
    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastName;
    @FindBy(css = "")
    private WebElementFacade country;
    @FindBy(css = "#billing_address_1")
    private WebElementFacade streetAddress;
    @FindBy(css = ".address-field #billing_city")
    private WebElementFacade townCity;
    @FindBy(css = ".address-field #billing_postcode")
    private WebElementFacade postCode;
    @FindBy(css =" #billing_phone")
    private WebElementFacade phone;
    @FindBy(css = "#billing_email")
    private WebElementFacade emailAddress;
    @FindBy(css = ".place-order .alt")
    private WebElementFacade placeOrderButton;
    @FindBy (css = ".woocommerce-error ")
    private WebElementFacade errorMessage;


    public void setFirstName(String name1){
        typeInto(firstName, name1);
    }
    public void setLastName(String name2){
        typeInto(lastName, name2);
    }

    public void setStreetAddress(String address ){
        typeInto(streetAddress, address);
    }

    public void setTownCity(String town){
        typeInto(townCity,town);
    }

    public void setPostCode(String code){
        typeInto(postCode, code);
    }

    public void setPhone(String phoneNumber){
        typeInto(phone, phoneNumber);
    }

    public void setEmailAddress(String email){
        typeInto(emailAddress, email);
    }

    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }




}
