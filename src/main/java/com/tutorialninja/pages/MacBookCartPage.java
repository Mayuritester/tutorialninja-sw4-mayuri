package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class MacBookCartPage extends Utility {

    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    By MacBookText = By.xpath("//body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By successText = By.xpath("//body/div[@id='checkout-cart']/div[1]");
     By totalText = By.xpath("//body[1]/div[2]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");
    public String verifyShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }

    public String verfyMacbookText (){
        return getTextFromElement(MacBookText);
    }

    public void changeQTY (){
        driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]")).clear();
        driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]")).sendKeys("2");
    }
    public void clickOnUpdate (){
        clickOnElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]/i[1]"));

    }
    public String verifySuccessYouhavemodifiedyourshoppingcart (){
        return getTextFromElement(successText);
    }

    public String verifyTotalText (){
      return getTextFromElement(totalText);
    }

    public void clickonCheckout (){
        clickOnElement(By.xpath("//a[contains(text(),'Checkout')]"));
    }



}
