package tests;

import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;

public class HomeTests extends AppManager {
    @Test
    public void firstTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickformsButton();
        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.clickOnPracticeFormButton();

    }

}
