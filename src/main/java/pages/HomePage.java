package pages;

import com.beust.jcommander.IStringConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;


    //Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public ForgotPassword clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage clickHorizontalSliders(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public ContextMenu clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenu(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return  new DynamicLoadingPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

}
