package com.tutorialninja.testsuite;

import com.tutorialninja.pages.Desktops;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.HpLp3065;
import com.tutorialninja.pages.HpLp3065ShoppingCart;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {
 HomePage homePage = new HomePage();
 Desktops desktops = new Desktops();
 HpLp3065 HpLp3065 = new HpLp3065();
 HpLp3065ShoppingCart HpLp3065ShoppingCart = new HpLp3065ShoppingCart();
    @Test

    public void verifyProductArrangeInAlphaBaticalOrder(){
//        1.1 Mouse hover on the Desktops Tab. and click
          homePage.clickOnDesktopsLink();
//        1.2 Click on “Show AllDesktops”
          homePage.selectMenu("Show AllDesktops");
//        1.3 Select Sort By position "Name: Z to A"
          desktops.selectSortByPostion();
//        1.4 Verify the Product will be arranged in Descending order.
          String actualText = "Name (Z - A)";
          String expectedText = desktops.dropdownText();
        Assert.assertEquals(actualText,expectedText,"Not displayed in correct page");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
//        2.1 Mouse hover on the Currency Dropdown and click
          homePage.clickOnCurrancy();
//        2.2 Mouse hover on the £Pound Sterling and click
          homePage.clickOnPoundCurrancy();
//        2.3 Mouse hover on the Desktops Tab.
        homePage.clickOnDesktopsLink();
//        2.4 Click on the “Show AllDesktops”
        homePage.selectMenu("Show AllDesktops");
//        2.5 Select the Sort By position "Name: A to Z"
          desktops.selectSortByPostion();
          desktops.dropdownTextAtoZ();
//        2.6 Select product “HP LP3065”
          desktops.selectHPLP3065();
//        2.7 Verify the Text "HP LP3065"
        String expectedText = "HP LP3065";
        String actualText = desktops.HPLP3065Text();
        Assert.assertEquals(actualText,expectedText,"Incorrect product");
//        2.8 Select Delivery Date "2024-11-27"
          HpLp3065.changeDeliveryDate();
//        2.9.Enter Qty "1” using Select class.
          HpLp3065.enterQty1();
//        2.10 Click on the “Add to Cart”button
          HpLp3065.clickAddToCart();
//        2.11 Verify the Message “Success:You have added HP LP3065 to your shopping cart !”
        HpLp3065.verifyMessageSuccess();
//        2.12 Click on the link “shopping cart”displayed in a success message
          HpLp3065.clickONShoppingCart();
//        2.13 Verify the text "Shopping Cart"
        HpLp3065ShoppingCart.verifyShoppingCartText();
//        2.14 Verify the Product name "HP LP3065"
          HpLp3065ShoppingCart.verifyProductNameHPLP3065();

//        2.15 Verify the Delivery Date "2024-11-27"
          // HpLp3065ShoppingCart.deliveryDateText();

//        2.16 Verify the Model "Product21"
          HpLp3065ShoppingCart.modeltext();
//        2.17 Verify the Total "£74.73"
        HpLp3065ShoppingCart.totalText();
    }







}
