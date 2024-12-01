package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//a[contains(text(),'Register')]");


    public String verifyRegisterlink() {
        return getTextFromElement(registerText);
    }

    public void enterFirstName() {
        sendTextToElement(By.id("input-firstname"), "Sima");
    }

    public void enterLastName() {
        sendTextToElement(By.id("input-lastname"), "Patel");
    }

    public void enterEmail() {
        sendTextToElement(By.id("input-email"), "prime@gmail.com");
    }//

    public void enterPhoneNumber() {
        sendTextToElement(By.id("input-telephone"), "07988112233");
    }

    public void entrerPassword() {
        sendTextToElement(By.id("input-password"), "test123");
    }

    public void enterConfirmPasssword() {
        sendTextToElement(By.id("input-confirm"), "test123");
    }

    public void selectSubscribeYesRadio() {
        clickOnElement(By.xpath("//fieldset[3]//input"));
    }

    public void clickPrivacyPolicyCheckBox() {
        clickOnElement(By.xpath("//div[@class = 'buttons']//input[@name='agree']"));
    }

    public void ClickContinueButton() {
        clickOnElement(By.xpath("//div[@class = 'buttons']//input[@value='Continue']"));
    }




    }


