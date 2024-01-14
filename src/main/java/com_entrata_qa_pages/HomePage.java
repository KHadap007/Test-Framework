package com_entrata_qa_pages;

import com_entrata_qa_base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    //Page Factory
    @FindBy(xpath = "//a[contains(@class,'main-header-logo')]")
    WebElement logo;

    @FindBy(xpath = "//div[contains(@class,'footer-text footer-social-text')]")
    WebElement salesNo;

    //Initializing The Page Object
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    //Action To Perform
    public String validateHomePageTitle() {
        return driver.getTitle();
    }
    public String validateHomePageUrl(){
        return driver.getCurrentUrl();

    }
    public boolean validateLogo(){
        return logo.isDisplayed();
    }
    public String validateHomePageSaleNo(){
        return salesNo.getText();
    }
}
