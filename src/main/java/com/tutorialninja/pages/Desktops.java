package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Desktops extends Utility {

    By desktopText = By.xpath("//h2[normalize-space()='Desktops']");
    By dropdownText = By.xpath("//option[contains(text(),'Name (Z - A)')]");
    By dropdownTextAtoZ = By.xpath("//option[contains(text(),'Name (A - Z)')]");
    By HPLP3065Text = By.xpath("//a[contains(text(),'HP LP3065')]");


    public String getDesktopText () { return getTextFromElement(desktopText);}
    public String dropdownText () { return getTextFromElement(dropdownText);}
    public String dropdownTextAtoZ () { return getTextFromElement(dropdownTextAtoZ);}
    public String HPLP3065Text (){ return getTextFromElement(HPLP3065Text);}



    public void selectSortByPostion(){
        clickOnElement(By.id("input-sort"));
        WebElement ztoa = driver.findElement(By.xpath("//select[@id='input-sort']"));
        Select position2 = new Select(ztoa);
        position2.selectByVisibleText("Name (A - Z)");
    }

    public void selectHPLP3065 (){
        clickOnElement(HPLP3065Text);
    }





}
