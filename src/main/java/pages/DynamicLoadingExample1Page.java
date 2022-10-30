package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DynamicLoadingExample1Page {
    private WebDriver driver;

    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");


    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
        /** here we are going to use explicit wait
         * which means that system will wait
         * until the task is done. Selenium provides
         * the class "WebDriverWait"
         */

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf
                (driver.findElement(loadingIndicator)));



    }
    public String getLoadedText(){
        return  driver.findElement(loadedText).getText();
    }
}
