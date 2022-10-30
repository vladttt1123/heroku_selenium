package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenu {
    private WebDriver driver;

    private By areaToBePresses = By.id("hot-spot");


    public ContextMenu(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickArea(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(areaToBePresses)).perform();
    }
    public String getResult(){
        return driver.switchTo().alert().getText();
    }

    public void clickOk(){
        driver.switchTo().alert().accept();
    }








}
