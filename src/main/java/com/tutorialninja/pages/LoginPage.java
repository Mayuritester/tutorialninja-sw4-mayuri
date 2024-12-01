package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By returnCustomerText = By.xpath("//h2[normalize-space()='Returning Customer']");

    public String verifyReturnCustomerText() {
        return getTextFromElement(returnCustomerText);
    }

    public void enterEmail() {
        sendTextToElement(By.id("input-email"), "computer.tester009@gmail.com");
    }//

public void enterPassword (){
sendTextToElement(By.id("input-password"), "Tester123");}

public void clickOnLoginButton () {
clickOnElement(By.xpath("//form[contains(@action,'login')]//input[@type='submit']"));}

}

