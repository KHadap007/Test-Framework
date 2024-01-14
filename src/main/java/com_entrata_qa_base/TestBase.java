package com_entrata_qa_base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

   public static WebDriver driver;
   public static Properties prop;
   //Reading Properties file
   public TestBase() {
      try {
         prop = new Properties();
         FileInputStream ip = new FileInputStream("C:\\Users\\Sarang\\Documents\\Kasturi_Projects\\Test-Framework\\src\\main\\config.properties");
         prop.load(ip);
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }

   }
   //Browser initialization(change browserName in properties file according to browser usage)
   public static void initialization() {
      String browserName = prop.getProperty("browser");
      if (browserName.equals("Chrome")) {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarang\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver = new ChromeDriver();
      } else if (browserName.equals("Edge")) {
         System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
         driver = new ChromeDriver();
      }

      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get(prop.getProperty("url"));
      driver.findElement(By.xpath("//button[contains(@id,'rcc-confirm-button')]")).click();

   }
}
