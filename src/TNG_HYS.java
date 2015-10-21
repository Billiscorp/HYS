//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.List;

//import org.junit.*;

//import static org.junit.Assert.*;

import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*; 

//import ReadAndWrite.StringReadWrite;


public class TNG_HYS {
  private WebDriver driver;
  //private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();
  private boolean acceptNextAlert = true;
//  static String testHostUS;
//  static String testHostUK;
//  static String browser;
  static String userName;
  static String password;
  static String server;
  static String local;
  static String item_links;
  
  @BeforeMethod
  public void setUp() throws Exception {
	  
//		server = "dev";
		server = "stage";
//		server = "pre-live";
//		server = "live";
	  
		local = "UK";
//		local = "US";
//		local = "";
		
//			browser = "firefox";
			
			userName = "billiscorp@gmail.com";
			password = "billiscorp@gmail.com";
			
//			userName = "roman.vyakhirev@gmail.com";
//			password = "hysletmein";
			 	  
  }
  

	  @Test
	  public void Sign()  {
		 
		 Setup.init(); 
		 Setup.selectHost(local, server);

		 Run.Registr();
		 
		 Page_Home.LogOut();
		  
	 }

  
  @AfterMethod
  
  
  public void tearDown() throws Exception {
	  Setup.close();
//  driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}