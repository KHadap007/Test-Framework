//package com_entrata_qa_testcases;
//
//import com_entrata_qa_base.TestBase;
//import com_entrata_qa_pages.ResidentPay;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class ResidentPayTest extends TestBase {
//
//    ResidentPay residentpay;
//
//    public ResidentPayTest() {
//        super();
//    }
//
//    //Before Test For Setup
//    @BeforeMethod
//    public void setUp() {
//        initialization();
//        residentpay = new ResidentPay();
//    }
//
//    //Test for ResidentPay Functionality
//
//    @Test
//    public void residentPayScheduleDemoTest() throws InterruptedException {
//        residentpay.menuButton();
//                residentpay.residentPayScheduleDemo(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"),
//                        prop.getProperty("company"), prop.getProperty("phone"), prop.getProperty("unit"), prop.getProperty("jobtitle"));
//    }
//
//    // After Test For Quit the Browser
//    @AfterTest
//    public void end() {
//        driver.quit();
//    }
//}
