package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowsManager;

import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    /**Step 1 is to create WevDriver Object
     *
     */
    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void  setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        goHome();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
//        WebElement shiftContent = driver.findElement(By.linkText("Shifting Content"));
//        shiftContent.click();
//        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
//        example1.click();
//        List<WebElement> links = driver.findElements(By.tagName("li"));
       // driver.manage().window().setSize(new Dimension(375, 812));
        // the command above specifies the screen resolution
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void recordFailure(ITestResult result) throws IOException {
        if(ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            Files.move(screenshot, new File("resources/screenshots/test.png"));
        }

    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    /**
     * the method below was added in addition to navigation
     * NavigationTest class to enable it
     * @return
     */
    public WindowsManager getWindowManager(){
        return new WindowsManager(driver);
    }




}
