import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;


public class JU_Test {
  private WebDriver driver;
  //private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();
  private boolean acceptNextAlert = true;
  static String testHost;
  static String browser;
  
  
  @Before
  public void setUp() throws Exception {

//	  					testHost = "http://dev:hys!dev@dev.haveyouseen.com/"; // Dev
	  					testHost = "http://dev:hys!dev@stage.haveyouseen.com/"; // stage
//	  					testHost = "http://haveyouseen.com/"; // live
//	  					testHost = "http://dev:acldev99@ip.dev.broadlogic.co.uk"; // Dev
//	  					testHost = "http://dev:acldev99@ip.staging.broadlogic.co.uk"; // Test
					    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  					
//	  					browser = "firefox";
	  					
  }

//	 @Ignore
	  @Test
	  public void Login() throws Exception {
		  HysHomePage.Login(testHost);
		  HysHomePage.LogOut();
	 }
	  
//	@Ignore
	  @Test
	  public void SignIn() throws Exception {
		  HysHomePage.SignIn(testHost);
	  
   }
	  
	  //@Ignore
	  @Test
	  public void Activate() throws Exception {
		  HysHomePage.Activate(testHost);
	  
   }
	  //@Ignore
	  @Test
	  public void SignIn_FB() throws Exception {
		  HysHomePage.SignIn_FB(testHost);
	  
   }
	  
	  
	  //@Ignore
	  @Test
	  public void AddItem() throws Exception {
		  
		  String item_links = RandomItem.ParserAmazon("http://www.amazon.com/");
		  HysHomePage.Login(testHost);
		  HysHomePage.AddItem(item_links);
//		  HysHomePage.AddItem("http://www.amazon.com/gp/product/B009CF7F8Y/ref=s9_nwrsa_gw_g318_i2?pf_rd_m=ATVPDKIKX0DER&pf_rd_s=center-2&pf_rd_r=042JSJS27CYXSH55YREE&pf_rd_t=101&pf_rd_p=490157971&pf_rd_i=507846");
		  HysHomePage.LogOut();
	  
   }
	  
	  //@Ignore
	  @Test
	  public void WishList() throws Exception {
		  
		  HysHomePage.Login(testHost);
		  
		  HysHomePage.AddWishList(testHost);
		  HysHomePage.LogOut();
	  
   }
	  
	  
	  //@Ignore
	  @Test
	  public void AddToWishListMouseProductPage() throws Exception {
		  
		  HysHomePage.Login(testHost);
		  
		  HysHomePage.AddToWishListMouseProductPage(testHost);
		  HysHomePage.LogOut();
	  
   }
	  
	  //@Ignore
	  @Test
	  public void AddToCollectionMouseProductPage() throws Exception {
		  
		  HysHomePage.Login(testHost);
		  
		  HysHomePage.AddToCollectionMouseProductPage(testHost);
		  HysHomePage.LogOut();
	  
   }
	  
	
	  
	//@Ignore
	  @Test
	  public void AddCollectionHomePage() throws Exception {
		  
		  HysHomePage.Login(testHost);
		  
		  HysHomePage.AddCollectionHomePage(testHost);
		  HysHomePage.LogOut();
	  
   }
	  
	  
	//@Ignore
	  @Test
	  public void AddCollectionCollectionPage() throws Exception {
		  
		  HysHomePage.Login(testHost);
		  
		  HysHomePage.AddCollectionCollectionPage(testHost);
		  HysHomePage.LogOut();
	  
   }
	  
	  
	  
	  //@Ignore
	  @Test
	  public void ForTest() throws Exception {
		  
		 ForTest.test();
	  
   }
	  
	//@Ignore
	  @Test
	  public void AddCollectionWhenAddItem() throws Exception {
		  
		  String item_links = RandomItem.ParserAmazon("http://www.amazon.com/");
		  HysHomePage.Login(testHost);
		  HysHomePage.AddCollectionWhenAddItem(testHost,item_links);
		  HysHomePage.LogOut();
	  
   }

	//@Ignore
	  @Test
	  public void AddCollectionWhenAddToCollection() throws Exception {
		  
		  HysHomePage.Login(testHost);
		  HysHomePage.AddCollectionWhenAddToCollection(testHost);
		  HysHomePage.LogOut();
	  
   }
	  
	  
	  
	  
	//@Ignore
	  @Test
	  public void FollowRanCollection() throws Exception {
		  
		  HysHomePage.Login(testHost);
		  HysHomePage.FollowRanCollection(testHost);
		  HysHomePage.LogOut();
	  
   }
	
	  
		//@Ignore
	  @Test
	  public void ShareAllProducts() throws Exception {
		  
		  HysHomePage.Login(testHost);
		  HysHomePage.ShareAllProducts(testHost);
		  HysHomePage.LogOut();
	  
   }
	  
	  
	//@Ignore
	  @Test
	  public void ShareMyProducts() throws Exception {
		  
		  HysHomePage.Login(testHost);
		  HysHomePage.ShareMyProducts(testHost);
		  HysHomePage.LogOut();
	  
   }
	  
	//@Ignore
	  @Test
	  public void LoginCollectionShare() throws Exception {
		  
		  HysHomePage.LoginCollectionShare(testHost);
		  HysHomePage.LogOut();
	  
   }
	  
	//@Ignore
	  @Test
	  public void LoginUK_US() throws Exception {
		  
		  HysHomePage.LoginUK_US(testHost);
		  HysHomePage.LogOut();
	  
   }
	  
	  
	  
	  
  
  @After
  public void tearDown() throws Exception {
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