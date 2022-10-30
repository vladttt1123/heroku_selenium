package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This class represents an additional window that
 * opened in the browser after user clicked on the libk
 * Need to Interact with WindowsManager class further
 */
public class MultipleWindowsPage {
    private WebDriver driver;
    private By clickHereLink = By.linkText("Click here");


    public MultipleWindowsPage(WebDriver driver){
        this.driver =driver;
    }
    public void clickHere(){
        driver.findElement(clickHereLink).click();
    }
}
