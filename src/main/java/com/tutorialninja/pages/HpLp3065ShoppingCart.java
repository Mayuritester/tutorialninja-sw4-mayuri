package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class HpLp3065ShoppingCart extends Utility {
     By shoppingCartText = By.xpath("//div[@id='content']//h1");
     By HPLP3065Text = By.xpath("(//a[contains(text(),'HP LP3065')])[2]");
    By deliveryDateText = By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) td.text-left:nth-child(2) > small:nth-child(3)");
    By modelText = By.xpath("//td[contains(text(),'Product 21')]");
    By totalText = By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");
    public String verifyShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }

  public void verifyProductNameHPLP3065 (){
   getTextFromElement(HPLP3065Text);
  }
    public String deliveryDateText (){
        return getTextFromElement(deliveryDateText);
    }
    public String modeltext (){
        return getTextFromElement(modelText);
    }
    public String totalText (){
        return getTextFromElement(totalText);
    }

}
