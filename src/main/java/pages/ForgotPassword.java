package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private WebDriver driver;
    public ForgotPassword(WebDriver driver){
        this.driver = driver;
    }

    private By emailInputField = By.id("email");
    private By retrievePassword = By.xpath("//*[@id=\"form_submit\"]/i");


    public void setEmail(String email){
        driver.findElement(emailInputField).sendKeys(email);
    }
    public RetrievePassword clickRetrievePassword(){
        driver.findElement(retrievePassword).click();
        return new RetrievePassword(driver);
    }



}
