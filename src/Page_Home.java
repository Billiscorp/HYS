//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByXPath;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
//import org.openqa.selenium.support.ui.Select;


public class Page_Home {
	
//	public static WebDriver driver;
//	public static Actions actions;
//	static String ranProductUrl;
//	static String ranProductTitle;
//	static String ranProductDealWishLIst;
//	static WebElement ranProduct;
//	static String CollectionName1;
//	static String CollectionTags1;
//	static String ranCollectionUrl;
//	static String ranCollectionTitle;
//	static String ranCollectionShortlink;
//	static String ranProductUrlShortlink;
	
//	static WebElement ProductMenu;
//	static WebElement AllProductLink;
	
	private static String accountMenu = "//li[@class='user-account hidden-xs dropdown']";
	private static String productMenu = "//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/items']";
	private static String collectionMenu = "";
	
	public static void switchFlag (String hostName, String token, String flag)  
	{
		  
		String flagLink = "";
		String flagUrl = "";
		
		if (flag == "US")
		{
			flagLink = "//a[@class='lang us']";
			flagUrl = "http://dev:hys!dev@stage-us.haveyouseen.com/auth/login?auth_token="+token;
		}
		
		if (flag == "UK")
		{
			flagLink = "//a[@class='lang au']";
			flagUrl = "http://dev:hys!dev@stage.haveyouseen.com/auth/login?auth_token="+token;
		}
		
		
		if (hostName.contains("stage"))
			{
			Setup.driver.get(flagUrl);
			}
			else {
				MoveAndClick.OneElement(flagLink);
				 }
		
	}	
	
	
	public static String getAuthLink (String flag)  
	{
		String flagLink = "";
		
		if (flag == "US")
		{
			flagLink = "//a[@class='lang us']";
		}
		
		if (flag == "UK")
		{
			flagLink = "//a[@class='lang au']";
		}
		
		
		String authLink = Setup.driver.findElement(By.xpath(flagLink)).getAttribute("href");
System.out.println("authLink"+"flag"+" = "+authLink);
		String authToken = Setup.getAuthToken(authLink,"auth_token");
System.out.println("authToken"+"flag"+" = "+authToken);

		if(authToken.equals("null"))
		{
			System.out.println("authToken not exist in "+flag+"flag");
		}
		return authToken;
		
}
	
	
	
	
	
	
	
	
	
	
	public static void toAddItemPage()  
	
	{
		MoveAndClick.OneElement("//a[@href='/addNewItem/index']");
	}
	
	
	
//	Product Menu
	
	public static void toAllProductsPage ()  
	{
		MoveAndClick.TwoElement(productMenu, "//a[contains(.,'All Products')]");
	}
	
	
	public static void toMyProductsPage ()  
	{
		MoveAndClick.TwoElement(productMenu, "//a[contains(.,'My Products')]");
	}

	
	
	
//	Collection Menu
	
	public static void toAllCollectionsPage ()  
	{
//		MoveAndClick.TwoElement(collectionMenu, "//a[contains(.,'My Products')]");
	}
	
	public static void toMyCollectionsPage ()  
	{
		MoveAndClick.TwoElement(collectionMenu, "//a[contains(.,'My Collections')]");
	}
	
	public static void toCollectionsIFlowPage ()  
	{
//		MoveAndClick.TwoElement(collectionMenu, "//a[contains(.,'My Products')]");
	}
	
	public static void toNewCollectionPage ()  
	{
//		MoveAndClick.TwoElement(collectionMenu, "//a[contains(.,'My Products')]");
	}
		
	
	

//  Account Menu
	
	public static void toAccountDashboard() 
	
	{
	MoveAndClick.TwoElement(accountMenu, "//a[@href='/account/index'][contains(.,'Dashboard')]");
	}
	
	public static void toAccountEarnings() 
		
		{
		MoveAndClick.TwoElement(accountMenu, "//a[@href='/account/earnings'][contains(.,'Earnings')]");
		}
	
	
	public static void toAccountPayments() 
	
	{
	MoveAndClick.TwoElement(accountMenu, "//a[@href='/account/payments'][contains(.,'Payments')]");
	}
	
	
	public static void toAccountProducts() 
		
		{
		MoveAndClick.TwoElement(accountMenu, "//a[@href='/account/items'][contains(.,'Products')]");
		}
	
	
	
	public static void toAccountCollection() 
		
		{
		MoveAndClick.TwoElement(accountMenu, "//a[@href='/account/collections'][contains(.,'Collections')]");
		}
	
	
	public static void toAccountWishlist() 
	
	{
	MoveAndClick.TwoElement(accountMenu, "//a[@href='/account/wishlist'][contains(.,'Wishlist')]");
	}
	
	
	public static void toAccountPoints() 
		
		{
		MoveAndClick.TwoElement(accountMenu, "//a[@href='/account/points'][contains(.,'Points')]");
		}
	
	
	public static void toAccountReviews() 
	
	{
	MoveAndClick.TwoElement(accountMenu, "//a[@href='/account/reviews'][contains(.,'Reviews')]");
	}
	
			
	public static void toSettings() 
		
		{
		MoveAndClick.TwoElement(accountMenu, "//ul[@class='dropdown-menu']/li/a[@href='/account/settings']");
		}

	
	public static void LogOut() 
		
		{
			MoveAndClick.TwoElement(accountMenu, "//ul[@class='dropdown-menu']/li/a[@href='/auth/logout']");
		}
	
	

		
		
	
		

		
		
	
		
		
		
		
		
		
}
