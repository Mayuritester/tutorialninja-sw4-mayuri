package com.tutorialninja.testsuite;

import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LoginPage;
import com.tutorialninja.pages.MyAccount;
import com.tutorialninja.pages.RegisterPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    MyAccount myAccount = new MyAccount();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
//1.1 Click on the My Account Link.
        homePage.clickOnMyAccountLink();
// 1.2 Call the method “selectMyAccountOptions()” method and pass the parameter “Register”
        homePage.selectMyAccountOptions("Register");
//  1.3 Verify the text “Register Account”.
        registerPage.verifyRegisterlink();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
//2.1 Click on the My Account Link.
        homePage.clickOnMyAccountLink();
// 2.2 Call the method “selectMyAccountOptions()” method and pass the parameter "Login"
        homePage.selectMyAccountOptions("Login");
//   2.3 Verify the text “Returning Customer”.
        String expectedText = "Returning Customer";
        String actualText = loginPage.verifyReturnCustomerText();
        Assert.assertEquals(actualText, expectedText, "Incorrect page displayed");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
//3.1 Click on the My Account Link.
        homePage.clickOnMyAccountLink();
//3.2 Call the method “selectMyAccountOptions()” method and pass the parameter “Register”
        homePage.selectMyAccountOptions("Register");

// 3.3 Enter the First Name
        registerPage.enterFirstName();
//3.4 Enter the Last Name
        registerPage.enterLastName();
//3.5 Enter the Email
        registerPage.enterEmail();
//3.6 Enter the Telephone
        registerPage.enterPhoneNumber();
//3.7 Enter the Password
        registerPage.entrerPassword();
//3.8 Enter the Password Confirm
        registerPage.enterConfirmPasssword();
//3.9 Select Subscribe Yes radio button
        registerPage.selectSubscribeYesRadio();
//3.10 Click on the Privacy Policy check box
        registerPage.clickPrivacyPolicyCheckBox();
//3.11 Click on the Continue button
        registerPage.ClickContinueButton();
//3.12 Verify the message “Your Account Has Been Created!”
        registerPage.clickPrivacyPolicyCheckBox();
// 3.13 Click on the Continue button
        registerPage.ClickContinueButton();
//3.14 Click on the My Account Link.
        homePage.clickOnMyAccountLink();
// 3.15 Call the method “selectMyAccountOptions()” method and pass the parameter “Logout”
        homePage.selectMyAccountOptions("Logout");
// 3.16 Verify the text “Account Logout”
        String actualText = "Account Logout";
        String expectedText = myAccount.verifyLogout();
        Assert.assertEquals(actualText, expectedText, "not logged out");
// 3.17 Click on the Continue button
       myAccount.clickLogout();

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
//4.1 Click on the My Account Link
        homePage.clickOnMyAccountLink();
//   4.2 Call the method “selectMyAccountOptions()” method and pass the parameter “Login”
        homePage.selectMyAccountOptions("Login");
//   4.3 Enter the Email address
        loginPage.enterEmail();

//4.5 Enter the Password
        loginPage.enterPassword();
//4.6 Click on the Login button
        loginPage.clickOnLoginButton();
//4.7 Verify text “My Account”
        String actualText = "My Account";
        String expectedText = (myAccount.getAccountText());
        System.out.println(expectedText);
        Assert.assertTrue(actualText.contains(expectedText), "Page not logged out");

//            4.8 Click on the My Account Link.
        myAccount.clickOnMyAccountLink();

//            4.9 Call the method “selectMyAccountOptions()” method and pass the parameter “Logout”
        homePage.selectMyAccountOptions("Logout");
//            4.10 Verify the text “Account Logout”
        String actualText1 = "Account Logout";
        String expectedText1 = myAccount.verifyLogout();
        Assert.assertEquals(actualText1, expectedText1, "not logged out");

//            4.11 Click on the Continue button
        homePage.clickOnContinue();
    }
}