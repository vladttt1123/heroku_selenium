package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By linkExample1 = By.linkText("Example 1: Element on page that is hidden");


    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(linkExample1).click();
        return new DynamicLoadingExample1Page(driver);
    }
}
