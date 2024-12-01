package com.tutorialninja.testbase;

import com.tutorialninja.propertyreader.Propertyreader;
import com.tutorialninja.utilities.Utility;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = Propertyreader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setup (){
        selectBrowser(browser);
    }


//    @AfterMethod
//    public void tearDown (){
//        closeBrowser();
//
//    }

}
