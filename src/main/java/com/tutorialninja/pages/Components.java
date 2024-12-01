package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class Components extends Utility {

    By components = By.xpath("//h2[contains(text(),'Components')]");

    public String getComponentsText () {return getTextFromElement(components);}

}
