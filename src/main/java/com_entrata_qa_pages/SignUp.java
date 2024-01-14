package com_entrata_qa_pages;

import com_entrata_qa_base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class SignUp extends TestBase {

    //Page Factory
    @FindBy(xpath = "//input[contains(@id,'entrata-username')]")
    WebElement username;

    @FindBy(xpath = "//input[contains(@id,'entrata-password')]")
    WebElement password;

    @FindBy(xpath = "//a[contains(@class,'button-default outline-dark-button')]")
    WebElement signUp;

    @FindBy(xpath = "//a[contains(@class,'button-default solid-dark-button')]")
    WebElement propertyManagerLogin;

    //@FindBy(xpath = "//button[contains(@type,'submit')]")
    WebElement signupBtn;

    //Initializing The Page Object
    public SignUp() {
        PageFactory.initElements(driver, this);
    }

    //Action To Perform

    public void signUpPage() throws InterruptedException {
        signUp.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'button-default solid-dark-button')]")));
        propertyManagerLogin.click();
    }
    public void signUp(String un, String pwd) {
        username.sendKeys(un);
        password.sendKeys(pwd);
        //signupBtn.click();
    }
}
