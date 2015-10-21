//import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

//import ReadAndWrite.StringReadWrite;


public class JU_HYS {
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
  
  @Before
  public void setUp() throws Exception {
	  
		server = "dev";
//		server = "stage";
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
  
  
//	 @Ignore
	  @Test
	  public void Login()  {
		 
		  Setup.init();
		  Setup.selectHost(local, server);
		  Run.LogIn(userName, password);
		  
		  Page_Home.LogOut();
		  Setup.close();
	 }
  
  
  
  
  
  

//	 @Ignore
	  @Test
	  public void Sign()  {
		 
		 Setup.init(); 
		 Setup.selectHost(local, server);

		 Run.Registr();
		 
		 Page_Home.LogOut();
		 Setup.close();
		  
	 }
	  
	  	  
		  
  
//  //	 @Ignore
//	  @Test
//	  public void Activate_Login_UK()
//	  {
////		  Setup.Activate(testHostUK);
//		  String email = StringReadWrite.readFileString("log.txt");
//		  
//		  Setup.init();
//		  Page.MainPage(testHostUK);
//		  Login.LoginPage();
//		  Login.setUser(email);
//		  Login.setPassword(email);
//		  Login.pushLoginButton();
//		  Login.VerLogin();
//		  HomePage.LogOut();
//		  Setup.close();
//	  }
		 
	  
	  
//		 @Ignore
		  @Test
		  public void Sign_Activate_Login()  {
			 
			  Setup.init(); 
			  Setup.selectHost(local, server);

			  Run.Registr();
			  
			  Page_Home.LogOut();
			  Setup.close();
			  
			  
			  Setup.Activate(server);
			  
			  Page_Home.LogOut();
			  Setup.close();
			  

			
		 }	
	  
	  
////			 @Ignore
//			  @Test
//			  public void SignUpUK_US()  {
//				 
//				  Setup.init();
//				  Page.MainPage(testHostUK);
//				  SignUp.SignUpPage();
//				  SignUp.setUser();
//				  
//				  String email = Setup.generateEmail();
//				  System.out.println("email = "+email);
//				  
//				  SignUp.setEmail(email);
//				  SignUp.setPassword(email);
//				  SignUp.pushSignUpButton();
//				  Login.VerLogin();
//				  
//				  String token = HomePage.getAuthLink("US");
//				  
//				  HomePage.switchFlag(testHostUK, token, "US");
//				  Login.VerLogin();
//				  
//				  String token1 = HomePage.getAuthLink("UK");
//				  
//				  HomePage.switchFlag(testHostUK, token1, "UK");
//				  Login.VerLogin();
//				  
//				  HomePage.LogOut();
//				  Setup.close();
//	 		 }
//			  
//			  
//		  
////				 @Ignore
//				  @Test
//				  public void SignUpUS_UK()  {
//					 
//					  Setup.init();
//					  Page.MainPage(testHostUS);
//					  SignUp.SignUpPage();
//					  SignUp.setUser();
//					  
//					  String email = Setup.generateEmail();
//					  System.out.println("email = "+email);
//					  
//					  SignUp.setEmail(email);
//					  SignUp.setPassword(email);
//					  SignUp.pushSignUpButton();
//					  Login.VerLogin();
//					  
//					  String token = HomePage.getAuthLink("UK");
//					  
//					  HomePage.switchFlag(testHostUK, token, "UK");
//					  Login.VerLogin();
//					  
//					  String token1 = HomePage.getAuthLink("US");
//					  
//					  HomePage.switchFlag(testHostUK, token1, "US");
//					  Login.VerLogin();
//					  
//					  HomePage.LogOut();
//					  Setup.close();
//		 		 }
		  

////		 @Ignore
//		  @Test
//		  public void LoginUK_US()  {
//			 
//			  Setup.init();
//			  Page.MainPage(testHostUK);
//			  Login.LoginPage();
//			  Login.setUser(userName);
//			  Login.setPassword(password);
//			  Login.pushLoginButton();
//			  Login.VerLogin();
//			  
//			  String token = HomePage.getAuthLink("US");
//			  
//			  HomePage.switchFlag(testHostUK, token, "US");
//			  Login.VerLogin();
//			  
//			  String token1 = HomePage.getAuthLink("UK");
//			  
//			  HomePage.switchFlag(testHostUK, token1, "UK");
//			  Login.VerLogin();
//			  
//			  HomePage.LogOut();
//			  Setup.close();
// 		 }
//	  
//		  
////			 @Ignore
//			  @Test
//			  public void LoginUS_UK()  {
//				 
//				  Setup.init();
//				  Page.MainPage(testHostUK);
//				  Login.LoginPage();
//				  Login.setUser(userName);
//				  Login.setPassword(password);
//				  Login.pushLoginButton();
//				  Login.VerLogin();
//				  
//				  String token = HomePage.getAuthLink("UK");
//				  
//				  HomePage.switchFlag(testHostUK, token, "UK");
//				  Login.VerLogin();
//				  
//				  String token1 = HomePage.getAuthLink("US");
//				  
//				  HomePage.switchFlag(testHostUK, token1, "US");
//				  Login.VerLogin();
//				  
//				  HomePage.LogOut();
//				  Setup.close();
//	 		 }
//			  
//			  
////				 @Ignore
//			  @Test
//			  public void EditProfile_UK()  {
//				 
//				  // Login
//				  Setup.init();
//				  Page.MainPage(testHostUK);
//				  Login.LoginPage();
//				  Login.setUser(userName);
//				  Login.setPassword(password);
//				  Login.pushLoginButton();
//				  Login.VerLogin();
//				  
//				  //Edit Profile
////				  Settings.SettingsPage();
////				  Settings.setName(StringReadWrite.readRandomString("Name.txt")+""+StringReadWrite.readRandomString("LastName.txt"));
////				  Settings.setDisplayName(displayName);
////				  Settings.setEmail(email);
////				  Settings.setLocationCity(city);
////				  Settings.setLocationCountry(country);
////				  Settings.setAge();
//				  
//				  
//				  
//				  
//				  
//				  
//				  HomePage.LogOut();
//				  Setup.close();
//			 }

	  
	  
			//@Ignore
			  @Test
			  public void AddItem() throws FileNotFoundException, IOException  { //throws Exception
				  
//				  for (int i = 1; i <= 10; i++) {
				  
				  if (local == "US") 
					{
					  item_links = RandomItem.ParserEbooks();
					}
				  
				  if (local == "UK") 
					{
					  item_links = RandomItem.ParserAmazonUK();
					}
//				  String item_links = RandomItem.ParserAmazonUK();
//				  String item_links = RandomItem.ParserAmazonUS();
//				  String item_links = RandomItem.ParserKobobooks();
//				  String item_links = RandomItem.ParserEbooks();
				  
				  Setup.init();
				  Setup.selectHost(local, server);
				  Run.LogIn(userName, password);
//				  item_links
				  //Add Item
				  

				  String addItemLink = Run.AddItem(item_links);
				  String shortLink = Page_MyProducts.getShortLink(addItemLink);
				  

System.out.println("addItemLink = "+addItemLink);
System.out.println("shortLink = "+shortLink);


//Setup.close();
//					}
				  
				  
				  
				//Edit Item
//				!!!!!  Run.EditItem(shortLink);
				  
				  
				  
				  
//				  String addItemLink = Run.AddItem("http://www.amazon.com/gp/product/B009CF7F8Y/ref=s9_nwrsa_gw_g318_i2?pf_rd_m=ATVPDKIKX0DER&pf_rd_s=center-2&pf_rd_r=042JSJS27CYXSH55YREE&pf_rd_t=101&pf_rd_p=490157971&pf_rd_i=507846");
				  
//				  HysHomePage.Login(testHost);
//				  HysHomePage.AddItem(item_links);
////				  HysHomePage.AddItem("http://www.amazon.com/gp/product/B009CF7F8Y/ref=s9_nwrsa_gw_g318_i2?pf_rd_m=ATVPDKIKX0DER&pf_rd_s=center-2&pf_rd_r=042JSJS27CYXSH55YREE&pf_rd_t=101&pf_rd_p=490157971&pf_rd_i=507846");
//				  HysHomePage.LogOut();
			  
		   }
			  
			  
			  
			  
			//@Ignore
			  @Test
			  public void AddItemToExistCollectionFromProductPage() throws FileNotFoundException, IOException  { //throws Exception
				  
				  Setup.init();
				  Setup.selectHost(local, server);
				  Run.LogIn(userName, password);
				  
				  Page_Home.toMyProductsPage();
				  Page_Home.toAllProductsPage();

				  WebElement ranProduct = Page_AllProducts.SelectRanProductNotInCol_Wish("+ Collection");
				  
				  String ranProductUrl = Page_AllProducts.getURlRanProduct(ranProduct);
				  String ranProductTitle = Page_AllProducts.getTitleRanProduct(ranProduct);
				  String ranProductDealWishLIst = Page_AllProducts.getProductDealWishLIst(ranProductUrl);
				  
				  System.out.println("ranProductUrl = "+ranProductUrl);
				  System.out.println("ranProductTitle = "+ranProductTitle);
				  System.out.println("ranProductDealWishLIst = "+ranProductDealWishLIst);
				  
				  Page_AllProducts.toAddToCollection(ranProductUrl);
				
				  Page_AddToCollection.selectExistCollection("Test collection");
				  Page_AddToCollection.pushAdd();
				  
				// check in several ways !!!!!
				  
				  Page_Home.toAccountCollection();
				  Page_AccountCollection.selectCollection("Test collection");
				  Page_Collection.checkAddItemToCollection(ranProductDealWishLIst);
				  Page_Collection.delItemFromCollection(ranProductDealWishLIst);
				  
//				  Page_MyCollection.checkAddItemToCollection(ranProductUrl); // add !!!!!
				  
				  
				  
			  }
			  
			  
			//@Ignore
			  @Test
			  public void AddItemToWishlistFromProductPage() //throws FileNotFoundException, IOException  { //throws Exception
			  {
				  Setup.init();
				  Setup.selectHost(local, server);
				  Run.LogIn(userName, password);
				  
				  Page_Home.toMyProductsPage();
				  Page_Home.toAllProductsPage();

				  WebElement ranProduct = Page_AllProducts.SelectRanProductNotInCol_Wish("+ Wishlist");
				  
				  String ranProductUrl = Page_AllProducts.getURlRanProduct(ranProduct);
				  String ranProductTitle = Page_AllProducts.getTitleRanProduct(ranProduct);
				  String ranProductDealWishLIst = Page_AllProducts.getProductDealWishLIst(ranProductUrl);
				  
				  System.out.println("ranProductUrl = "+ranProductUrl);
				  System.out.println("ranProductTitle = "+ranProductTitle);
				  System.out.println("ranProductDealWishLIst = "+ranProductDealWishLIst);
//				  
				   
			  }
			  
			  
			//@Ignore
			  @Test
			  public void For_Test() throws FileNotFoundException, IOException  { //throws Exception
				  
//				  StringReadWrite.StoreProp("test", "key", "value");
//				  System.out.println(StringReadWrite.LoadProp("test", "key"));
//			
				  
				  // change !!!! may be move to another class !!!!
				  
				  String fileName = "editField";
				  
				  String newTitle = "Edit Item Title"; // change to random ???
				  String newDescription = "Edit Item Description"; // change to random ???
				  String newPrice = "100"; // change to random ???
				  String newCategory = "Books & Media"; // // may be random read from file ???
				  String newSubCategory = "Books"; // // may be random read from file ???
				  String newTags = "Edit Item Tags"; // change to random ???
				  
				  
//				  String newTitle = "Edit Item Title wdbdsfb"; // change to random ???
//				  String newDescription = "Edit Item Description sagsagadsg"; // change to random ???
//				  String newPrice = "100 asgsadgasd"; // change to random ???
//				  String newCategory = "Books & Media aEGFSADFSAD"; // // may be random read from file ???
//				  String newSubCategory = "Books ASEGASGAS"; // // may be random read from file ???
//				  String newTags = "Edit Item Tags sdgsdagsdg"; // change to random ???
				  
				  
				    File newFile = new File(fileName);
				  
				  	    if (newFile.exists())
						{
				  	    	newFile.delete();
						} 
				  
				  StringReadWrite.setProp(fileName, "newTitle", newTitle);
				  StringReadWrite.setProp(fileName, "newDescription", newDescription);
				  StringReadWrite.setProp(fileName, "newPrice", newPrice);
				  StringReadWrite.setProp(fileName, "newCategory", newCategory);
				  StringReadWrite.setProp(fileName, "newSubCategory", newSubCategory);
				  StringReadWrite.setProp(fileName, "newTags", newTags);
				  
				  System.out.println(StringReadWrite.getProp(fileName, "newTitle"));
				  System.out.println(StringReadWrite.getProp(fileName, "newDescription"));
				  System.out.println(StringReadWrite.getProp(fileName, "newPrice"));
				  System.out.println(StringReadWrite.getProp(fileName, "newCategory"));
				  System.out.println(StringReadWrite.getProp(fileName, "newSubCategory"));
				  System.out.println(StringReadWrite.getProp(fileName, "newTags"));
			  
		   }
			  
			  
			  
			  
			//@Ignore
			  @Test
			  public void For_Test1() throws FileNotFoundException, IOException  { //throws Exception
				  
				  
				  Setup.init();
				  Setup.selectHost(local, server);
				  Run.LogIn(userName, password);
				  
				  Page_Home.toAccountEarnings();
				  
				  String estimated = Page_AccountEarnings.getSummaryEstimated();
				  double estimatedValueCash = Setup.getValueCashNumeric(estimated);
				  
				  String confirmed = Page_AccountEarnings.getSummaryConfirmed();
				  double confirmedValueCash = Setup.getValueCashNumeric(confirmed);
				  
				  String payable = Page_AccountEarnings.getSummaryPayable();
				  double payableValueCash = Setup.getValueCashNumeric(payable);
				  
				  String paid = Page_AccountEarnings.getSummaryPaid();
				  double paidValueCash = Setup.getValueCashNumeric(paid);
				  
				  
				  System.out.println("estimated = "+estimatedValueCash);
				  System.out.println("confirmed = "+confirmedValueCash);
				  System.out.println("payable = "+payableValueCash);
				  System.out.println("paid = "+paidValueCash);
				  System.out.println("****************************************");
				 
				  
//				  Available, Rejected, Confirmed, Estimated
				  double sumCashEstimated = Page_AccountEarnings.getStatusSum("Estimated");
				  System.out.println("");
				  System.out.println("sumCashEstimated = "+sumCashEstimated);
				  System.out.println("****************************************");
				  				  
				  double sumCashAvailable = Page_AccountEarnings.getStatusSum("Available");
				  System.out.println("");
				  System.out.println("sumCashAvailable = "+sumCashAvailable);
				  System.out.println("****************************************");
				  
				  double sumCashConfirmed = Page_AccountEarnings.getStatusSum("Confirmed");
				  System.out.println("");
				  System.out.println("sumCashConfirmed = "+sumCashConfirmed);
				  System.out.println("****************************************");
				  
				  double sumCashRejected = Page_AccountEarnings.getStatusSum("Rejected");
				  System.out.println("");
				  System.out.println("sumCashRejected = "+sumCashRejected);
				  System.out.println("****************************************");
				  
				  System.out.println("estimated="+estimatedValueCash+"   =>   sumCashEstimated="+sumCashEstimated);
				  System.out.println("payable="+payableValueCash+"+paid = "+paidValueCash+"   =>   sumCashAvailable="+sumCashAvailable);
				  System.out.println("confirmed="+confirmedValueCash+"   =>   sumCashAvailable="+sumCashAvailable);
				 
			  
		   }
			  
			
			//@Ignore
			  @Test
			  public void AddItemBookmarks() 
			  {
//				  RandomItem.ParserEbooks();
				  String item_links = RandomItem.ParserEbooks();
				  
				  Setup.init();
				  Setup.driver.get(item_links);
				  String local = "usa:exclusive@www.us.haveyouseen.com";
				  ((JavascriptExecutor) driver).executeScript("if(top['bookmarklet-url@http://"+local+"']){top['bookmarklet-url@http://"+local+"'];}else{var e=document.createElement('script');e.setAttribute('type','text/javascript');e.setAttribute('charset','UTF-8');e.setAttribute('src','http://"+local+"/js/shareit-button.js?r='+Math.random()*99999999);document.body.appendChild(e);void(0);}");
				  
				  Page_Login.setUser(userName);
				  Page_Login.setPassword(password);
				  Bookmarks.pushLoginButton();
				  
				  String title = Page_AddItem.getProdictTitle();
System.out.println("title = "+title);
				  String price = Page_AddItem.getCurrentPrice();
System.out.println("price = "+price);

				  Page_AddItem.setCategory();
				  Page_AddItem.setTags("ebooks");
				  Page_AddItem.pushCorrect();
				  
				  
				  String addItemLink = Run.AddItem(item_links);
				  String shortLink = Page_MyProducts.getShortLink(addItemLink);
				  

System.out.println("addItemLink = "+addItemLink);
System.out.println("shortLink = "+shortLink);
				  
				  
//				  Bookmarks.AddItem("www.us.haveyouseen.com");
				  
			  }
	  
  
  @After
  
  
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