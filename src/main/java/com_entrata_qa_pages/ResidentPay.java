package com_entrata_qa_pages;

import com_entrata_qa_base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResidentPay extends TestBase {


    //Page Factory
    @FindBy(xpath = "//input[contains(@id,'FirstName')]")
    WebElement firstName;

    @FindBy(xpath = "//input[contains(@id,'LastName')]")
    WebElement lastName;

    @FindBy(xpath = "//input[contains(@id,'Email')]")
    WebElement email;

    @FindBy(xpath = "//input[contains(@id,'Company')]")
    WebElement company;

    @FindBy(xpath = "//input[contains(@id,'Phone')]")
    WebElement phone;

    @FindBy(xpath = "//select[contains(@id,'Unit_Count__c')]")
    WebElement unit;

    @FindBy(xpath = "//input[contains(@id,'Title')]")
    WebElement jobTitle;

    @FindBy(xpath = "//div[contains(@class,'main-nav-link')]")
    WebElement menuBtn;

    @FindBy(xpath = "//a[contains(@class,'fat-nav-links')]")
    WebElement product;

    @FindBy(xpath = "//a[contains(@title,'ResidentPay Product Page – Product Banner – Button')]")
    WebElement demo;

    // Un-comment below code to schedule the demo
    //@FindBy(xpath = "//button[contains(@class,'mktoButton')]")
    //WebElement scheduleDemoBtn;

    //Initializing The Page Object
    public ResidentPay() {
        PageFactory.initElements(driver, this);
    }

    //Action To Perform
    public void menuButton()  {
        menuBtn.click();
        product.click();
        demo.click();
    }
    public void residentPayScheduleDemo(String fn, String ln, String em, String comp, String phn, String unt, String jt) {
        firstName.sendKeys(fn);
        lastName.sendKeys(ln);
        email.sendKeys(em);
        company.sendKeys(comp);
        phone.sendKeys(phn);
        unit.sendKeys(unt);
        jobTitle.sendKeys(jt);
        // Un-Comment below code to schedule the demo
        //scheduleDemoBtn.click();
    }

}