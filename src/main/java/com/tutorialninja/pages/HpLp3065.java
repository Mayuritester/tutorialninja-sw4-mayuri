package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class HpLp3065 extends Utility {

    By deliveryDate = By.xpath("//input[@id='input-option225']");
    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");

    public void selectDeliveryDate (){
    clickOnElement(deliveryDate);

    }

    public void changeDeliveryDate (){

        driver.findElement(By.xpath("//input[@id='input-option225']")).clear();
        driver.findElement(By.xpath("//input[@id='input-option225']")).sendKeys("2024-11-27");

            }

            public void enterQty1 () {
                sendTextToElement(By.name("quantity"), "1");
            }

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
