package utils;

import org.openqa.selenium.WebDriver;

import java.net.URL;


public class WindowsManager {
    private WebDriver driver;
//    private WebDriver.Navigation navigate;

    public WindowsManager(WebDriver driver){
        this.driver = driver;
//        navigate = driver.navigate();
    }

    /**
     * The methods below are util methods
     * because they return void and do not
     * return the object of a page
     */
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void refreshPage(){
        driver.navigate().refresh();
    }
    public void goTo(String url){
        driver.navigate().to(url);
    }
    public void switchToTab(String tabTitle){
//        /**
//         * The getWindowHandles returns
//         * handles to all open windows/tabs
//         */
//        var windows = driver.getWindowHandles();
//        System.out.println("Number of tabs: " + windows.size());
//        System.out.println("Window handles:");
//        windows.forEach(System.out::println);

    }
}
