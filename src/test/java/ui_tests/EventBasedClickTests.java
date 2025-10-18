package ui_tests;

import manager.AppManager;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ClickPage;
import pages.HomePage;
import utils.HomePageMenuItem;

public class EventBasedClickTests extends AppManager {

    @Test
    public void clickTest(){
        new HomePage(getDriver());
        ClickPage clickPage = BasePage.clickButtonsHomePageMenuItem(HomePageMenuItem.CLICK);
        clickPage.clickBtn();

    }
}
