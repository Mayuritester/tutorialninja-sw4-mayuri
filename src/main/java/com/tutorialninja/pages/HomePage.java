package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By components = By.linkText("Components");
    By desktops = By.linkText("Desktops");
    By laptopAndNoteBooks = By.linkText("Laptops & Notebooks");
    By currancy = By.xpath("//span[contains(text(),'Currency')]");
    By poundCurrancy = By.xpath("//button[contains(text(),'£Pound Sterling')]");




    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    public void clickOnComponentLink() {
        clickOnElement(components);
    }

    public void clickOnDesktopsLink() {
        clickOnElement(desktops);
    }

    public void clickOnLaptopAndNoteBooksLink() {
        clickOnElement(laptopAndNoteBooks);
    }

 public void clickOnCurrancy (){
        clickOnElement(currancy);
 }

    public void clickOnPoundCurrancy (){
        clickOnElement(poundCurrancy);
    }

    public void selectMyAccountOptions (String option){
        List<WebElement> myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }
    public void clickOnMyAccountLink (){
        clickOnElement(By.xpath("//span[contains(text(),'My Account')]"));
    }

    public void clickOnContinue (){
        clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));
    }


    }








