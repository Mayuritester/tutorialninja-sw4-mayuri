package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccount extends Utility {
    By accountText = By.xpath("//h2[contains(text(),'My Account')]");
    By logoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
     public String getAccountText (){
     return getTextFromElement(accountText);
     }

    public void clickOnMyAccountLink (){
        clickOnElement(By.xpath("//span[contains(text(),'My Account')]"));
    }
    public String verifyLogout (){
        return getTextFromElement(logoutText);
    }

    public void clickLogout (){
         clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));
    }
}


