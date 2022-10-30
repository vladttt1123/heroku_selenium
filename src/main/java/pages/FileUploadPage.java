package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inoutField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");


    public FileUploadPage (WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**Provides path of the file to the form then clicks
     * Uploa
     *
     **/
    public void uploadFile(String absolutePathOfTheFile){
        driver.findElement(inoutField).sendKeys(absolutePathOfTheFile);
        clickUploadButton();
    }
    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }
}
