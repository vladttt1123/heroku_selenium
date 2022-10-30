package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FIleUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        FileUploadPage uploadPage =  homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/vtolosiuk/IdeaProjects/testautomatioU/resources/chromedriver");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver", "Uploaded file is incorrect");

    }
}
