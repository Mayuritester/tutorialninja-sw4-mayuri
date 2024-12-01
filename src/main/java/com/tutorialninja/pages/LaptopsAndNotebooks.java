package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LaptopsAndNotebooks extends Utility {

    By laptopAndNoteBooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");


    public String getLaptopAndNotebookText (){return getTextFromElement(laptopAndNoteBooks);}

    public void selectSortByPostionHighToLow () {
        WebElement highToLow = driver.findElement(By.xpath("//select[@id='input-sort']"));
        Select sort = new Select(highToLow);
        sort.selectByVisibleText("Price (High > Low)");

    }
   public void selectMacbook (){
     clickOnElement(By.xpath("//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[1]/h4[1]/a[1]"));
   }



    }







