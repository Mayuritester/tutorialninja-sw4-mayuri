package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class Macbook extends Utility {
    By macbookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");

    public String verifyMacbook(){ return getTextFromElement (macbookText);}

public void clickAddToCart () {
    clickOnElement(By.xpath("//button[@id='button-cart']"));

}

    public String verifyMessageSuccess () {
        return getTextFromElement(successMessage);
    }
    public void clickONShoppingCart () {
        clickOnElement(By.cssSelector("div.container div.nav.pull-right ul.list-inline li:nth-child(4) a:nth-child(1) > span.hidden-xs.hidden-sm.hidden-md"));
    }


}




