package com_entrata_qa_testcases;

import com_entrata_qa_base.TestBase;
import com_entrata_qa_pages.SignUp;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest extends TestBase {

    SignUp signUp;

    public SignUpTest() {
        super();
    }

    //Before Test For Setup
    @BeforeMethod
    public void setUp() {
        initialization();
        signUp = new SignUp();
    }

    //Test for SignUp Functionality
    @Test
    public void signUpTest() throws InterruptedException {
        signUp.signUpPage();
        signUp.signUp(prop.getProperty("username"), prop.getProperty("password"));
        Thread.sleep(10000);
    }

    @AfterTest
    public void end() {
        driver.quit();
    }
}
