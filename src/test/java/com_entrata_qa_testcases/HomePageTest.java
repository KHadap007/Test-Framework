package com_entrata_qa_testcases;

import com_entrata_qa_base.TestBase;
import com_entrata_qa_pages.HomePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homepage;

    public HomePageTest() {
        super();
    }

    //Before Test For Setup
    @BeforeMethod
    public void setUp() {
        initialization();
        homepage = new HomePage();
    }

    //Test for HomePage Functionality
    @Test(priority = 1)
    public void homePageTitleTest() {
        String title = homepage.validateHomePageTitle();
        Assert.assertEquals(title, "Property Management Software | Entrata");
    }

    @Test(priority = 3)
    public void validateLogoTest() {
        boolean flag = homepage.validateLogo();
        System.out.println(flag);
        Assert.assertTrue(flag);
    }

    @Test(priority = 4)
    public void homePageSaleNoTest() throws InterruptedException {
        Thread.sleep(10000);
        String salesNo = homepage.validateHomePageSaleNo();
        Thread.sleep(5000);
        Assert.assertEquals(salesNo, "Sales: 814.747.5807");
    }

    @Test(priority = 2)
    public void homePageUrlTest() {
        String url = homepage.validateHomePageUrl();
        Assert.assertEquals(url, "https://www.entrata.com/");
    }

    // After Test For Quit the Browser
    @AfterTest
    public void end() {
        driver.quit();
    }
}
