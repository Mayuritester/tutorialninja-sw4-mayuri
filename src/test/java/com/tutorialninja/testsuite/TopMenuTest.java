package com.tutorialninja.testsuite;

import com.tutorialninja.pages.Components;
import com.tutorialninja.pages.Desktops;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LaptopsAndNotebooks;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
HomePage homepage = new HomePage();
Desktops desktops = new Desktops();
LaptopsAndNotebooks laptopsAndNotebooks = new LaptopsAndNotebooks();
Components components = new Components();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

//        1.1 Mouse hover on the “Desktops” Tab and click
          homepage.clickOnDesktopsLink();
//        1.2 call the selectMenu() method and pass the menu = “Show AllDesktops”
          homepage.selectMenu("Show AllDesktops");
//        1.3 Verify the text ‘Desktops’
          String expectedText = "Desktops";
          String actualText =  desktops.getDesktopText();
          Assert.assertEquals(actualText,expectedText,"Desktop page not displayed");

    }

        @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){

//            2.1 Mouse hover on the “Laptops & Notebooks” Tab and click
              homepage.clickOnLaptopAndNoteBooksLink();

//            2.2 call selectMenu() method and pass the menu = “Show AllLaptops & Notebooks”
              homepage.selectMenu("Show AllLaptops & Notebooks");

//            2.3 Verify the text ‘Laptops & Notebooks’
            String expectedText = "Laptops & Notebooks";
            String actualText =  laptopsAndNotebooks.getLaptopAndNotebookText();
            Assert.assertEquals(actualText,expectedText,"Laptop page not displayed");

        }

        @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
//            3.1 Mouse hover on the “Components” Tab and click
              homepage.clickOnComponentLink();
//            3.2 call the selectMenu() method and pass the menu = “Show AllComponents”
              homepage.selectMenu("Show AllComponents");
//            3.3 Verify the text ‘Components’
               String actualText = "Components";
               String expectedText = components.getComponentsText();
               Assert.assertEquals(actualText,expectedText, "compnents page not displayed");

        }

}


