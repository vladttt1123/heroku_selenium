package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

/**
 * This package and class were created because
 * we need to separate our tests based on the functionality
 * so this class with include assertions for login functioanlity
 *
 */
public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage =  homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlert().contains("You logged into a secure area!"),
                "Alert text is incorrect");

//        assertTrue(secureAreaPage.getAlert(), "You logged into a secure area! x",
//                "Alert text is incorrect");


    }
}
