package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;


public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        AlertsPage alertsPage =  homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Result is incorrect");
    }
    @Test
    public void testGetTextFromAlert(){
        AlertsPage alertsPage =  homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }
    @Test
    public void testSetInputInAlert(){
        AlertsPage alertsPage =  homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "TAU Rocks";
        alertsPage.alert_setInpunt(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: "+ text, "Result text incorrect");

    }
}
