package com.tutorialninja.testsuite;

import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LaptopsAndNotebooks;
import com.tutorialninja.pages.MacBookCartPage;
import com.tutorialninja.pages.Macbook;
import com.tutorialninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksTest extends BaseTest {
    HomePage homepage = new HomePage();
    LaptopsAndNotebooks laptopsAndNotebooks = new LaptopsAndNotebooks();
    Macbook macbook = new Macbook();
    MacBookCartPage macBookCartPage = new MacBookCartPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {

//1.1 Mouse hover on the Laptops & Notebooks Tab. and click
        homepage.clickOnLaptopAndNoteBooksLink();

//1.2 Click on “Show AllLaptops & Notebooks”
        homepage.selectMenu("Show AllLaptops & Notebooks");
        List<WebElement> products = getListOfElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);

// 1.3 Select the Sort By "Price (High > Low)"
        laptopsAndNotebooks.selectSortByPostionHighToLow();

// 1.4 Verify the Product price will be arranged in High to Low orders.
        products = getListOfElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);

        Assert.assertEquals(afterSortByPrice, originalProductsPrice, "Not sorted High too low");
    }

    @Test

    public void verifyThatUserPlaceOrderSuccessfully() {
//2.1 Mouse hover on the Laptops & Notebooks Tab and click
        homepage.clickOnLaptopAndNoteBooksLink();
//2.2 Click on the “Show AllLaptops & Notebooks”
        homepage.selectMenu("Show AllLaptops & Notebooks");
//        2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooks.selectSortByPostionHighToLow();
//        2.4 Select Product “MacBook”
        laptopsAndNotebooks.selectMacbook();
//        2.5 Verify the text “MacBook”
        macbook.verifyMacbook();
//        2.6 Click on the ‘Add To Cart’ button
        macbook.clickAddToCart();
//2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        macbook.verifyMessageSuccess();
//       2.8 Click on the link “shopping cart” display into the success message
        macbook.clickONShoppingCart();
// 2.9 Verify the text "Shopping Cart"
        macBookCartPage.verifyShoppingCartText();
//        2.10 Verify the Product name "MacBook"
        String actualText = "MacBook";
        String expectedText = macBookCartPage.verfyMacbookText();
        Assert.assertEquals(actualText, expectedText, "incorrect item");
//        2.11 Change the Quantity "2"
        macBookCartPage.changeQTY();
//        2.12 Click on the “Update” Tab
        macBookCartPage.clickOnUpdate();
//2.13 Verify the message “Success: You have modified your shopping cart!”
        String actualText1 = "Success: You have modified your shopping cart!";
        String expectedText1 = macBookCartPage.verifySuccessYouhavemodifiedyourshoppingcart();
        Assert.assertEquals(actualText1, expectedText1, "item not added");

//        2.14 Verify the Total £737.45
        macBookCartPage.verifyTotalText();

//        2.15 Click on the “Checkout” button
        macBookCartPage.clickonCheckout();


    }
}