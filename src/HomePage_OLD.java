//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;


public class HomePage_OLD {
	
//	public static WebDriver driver;
//	public static Actions actions;
	static String ranProductUrl;
	static String ranProductTitle;
	static String ranProductDealWishLIst;
	static WebElement ranProduct;
	static String CollectionName1;
	static String CollectionTags1;
	static String ranCollectionUrl;
	static String ranCollectionTitle;
	static String ranCollectionShortlink;
	static String ranProductUrlShortlink;
	
//	static WebElement ProductMenu;
//	static WebElement AllProductLink;
	
	
//		public static String LogOut()  // Change http://dev:hys!dev@dev.haveyouseen.com/
//			
//			{
//				
//			actions = new Actions(driver);
//
//			WebElement AccountMenu = driver.findElement(By.xpath("//li[@class='user-account hidden-xs dropdown']"));
//			WebElement LogOut = driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a[@href='/auth/logout']"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", LogOut);
//			
//			actions.moveToElement(AccountMenu).build().perform();
//			LogOut.click();
//				
//				driver.quit();
//				
//				String finishTest = "Ok";
//				return finishTest ;
//				
//			}
//	
	
	 	
		
			
//		public static String Activate (String hostName)  // Header ? Button?
//		{
//			driver = new FirefoxDriver();
//			driver.get("https://mail.google.com/");
//			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("tpcdealer@gmail.com");
//			driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("welovetpc123");
//			driver.findElement(By.xpath("//input[@id='signIn']")).click();
//			
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			
//			driver.findElement(By.xpath("//span[@id]//b[contains(text(),'Please confirm your haveyouseen account')]")).click();
//			
////			String VerUrl = (driver.findElement(By.xpath("//a[contains(.,'Verify my account')]")).getAttribute("href")).replace("http://", "http://dev:hys!dev@");
//			String VerUrl = (driver.findElement(By.xpath("//a[contains(.,'Verify my account')]")).getAttribute("href")); // for Live
//			driver.get(VerUrl);
//			
//						
////			driver.findElement(By.xpath("//p[contains(.,'Thank you for confirming your email address. You will now be able to withdraw any earnings from the site.')]"));
//			 			
//			driver.quit();
//			String finishTest = "Ok";
//			return finishTest ;
//			
//			
//		}
		
		public static String SignIn_FB (String hostName)  // Header ? Button?
		{
			driver = new FirefoxDriver();
			driver.get(hostName);
			
			driver.findElement(By.xpath("//a[@href='/auth/register']")).click();
			driver.findElement(By.xpath("//button[@data-social='facebook']")).click();
//			String FB_Url = (driver.findElement(By.xpath("//button[@data-social='facebook']")).getAttribute("href")).replace("http://", "http://dev:hys!dev@");
			
			
			
			
			
			
			driver.quit();
			String finishTest = "Ok";
			return finishTest ;
		}
		
		
//		public static String AddItem (String item_url)  // Header ? Button?
//		{
////			Add Verification if item is in base
//			
//			
//			Actions actions = new Actions(driver);
//			WebElement AddMenu = driver.findElement(By.xpath("//a[@href='/addNewItem/index']"));
//			
//			actions.moveToElement(AddMenu).build().perform();
//			AddMenu.click();
//			
////			driver.findElement(By.xpath("//a[@href='/addNewItem/index']")).click();
//			driver.findElement(By.xpath("//input[@id='item-url']")).sendKeys(item_url);
//			driver.findElement(By.xpath("//input[@value='Add']")).click();
//			
////			driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
//			 
//			boolean for_while=true;
//			  
//		  		while (for_while) 
//		  		{
//
//		  			if	(!driver.findElements(By.xpath("//div[@class='panel-collapse collapse in']")).isEmpty());
//					{
//						for_while=false;
//					}
//		  		}
//		  		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		  		
////			add Verification
//			
//		  	String RanProductTitle = driver.findElement(By.xpath("//input[@id='title']")).getAttribute("value");	
//		  	driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Test Item Tags");
//			new Select(driver.findElement(By.xpath("//select[@id='topcatid']"))).selectByVisibleText("Other");
//			new Select(driver.findElement(By.xpath("//select[@id='category_id']"))).selectByVisibleText("Everything Else");
//			driver.findElement(By.xpath("//input[@value='Yes, all product details are correct']")).click();
//			
////			if ((!driver.findElements(By.xpath("//input[@class='form-control error']")).isEmpty()) || (!driver.findElements(By.xpath("//select[@aria-describedby='topcatid-error']")).isEmpty()) || (!driver.findElements(By.xpath("//select[@aria-describedby='category_id-error']")).isEmpty()))
////			{
////				System.out.println("Product details are not correct!!! Test stop !!! ");
////				driver.quit();
////			}
//			
//			boolean for_while1=true;
//			  
//	  		while (for_while1) 
//	  		{
//
//	  			if	(!driver.findElements(By.xpath("//div[@class='panel-collapse collapse in']")).isEmpty());
//				{
//					for_while1=false;
//				}
//	  		}
//	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			
//			driver.findElement(By.xpath("//input[@id='review-title']")).sendKeys("Test Review this product");
//			driver.findElement(By.xpath("//span[@data-value='4']"));
//			driver.findElement(By.xpath("//input[@value='Add my review']")).click();
//			
//			WebElement ProductMenu = driver.findElement(By.xpath("//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/items']"));
//			WebElement MyProductLink = driver.findElement(By.xpath("//a[contains(.,'My Products')]"));
//			
//			actions.moveToElement(ProductMenu).build().perform();
//			MyProductLink.click();
//			
//WebElement element = driver.findElement(By.xpath("//a[contains(.,'"+RanProductTitle+"')]"));
//((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", element);
//			
//			if (driver.findElements(By.xpath("//a[contains(.,'"+RanProductTitle+"')]")).isEmpty())
//			{
//				System.out.println("Item was not added !!!!");
//				
//				driver.quit();
//			
//	  		}
//
//			
//			
//			
//			
//			
//			
//			//		STOP !!!!!!!!!!!!!	
//			String add_item_link = driver.findElement(By.xpath("//a[contains(.,'"+RanProductTitle+"')]")).getAttribute("href");
//			
//			int stringLength = add_item_link.length();
//			String add_item_shortlink = add_item_link.substring(stringLength-5, stringLength);
//			
//WebElement element1 = driver.findElement(By.xpath("//table[@class='table hidden-xs hidden-sm']//a[@class='icon icon-view'][contains(@href,'"+add_item_shortlink+"')]"));
//((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", element1);			
//						
//			driver.findElement(By.xpath("//table[@class='table hidden-xs hidden-sm']//a[@class='icon icon-view'][contains(@href,'"+add_item_shortlink+"')]")).click();
//			driver.findElement(By.xpath("//a[@data-tip='Edit product details']")).click();
//			
//			//Edit Item
//			
//			String newTitle = "Edit Item Title";
//			String newDescription = "Edit Item Description";
//			String newPrice = "100";
//			String newCategory = "Books & Media";
//			String newSubCategory = "Books";
//			String newTags = "Edit Item Tags";
//			
//			driver.findElement(By.xpath("//input[@name='title_display']")).clear();
//			driver.findElement(By.xpath("//input[@name='title_display']")).sendKeys(newTitle);
//			driver.findElement(By.xpath("//textarea[@name='description']")).clear();
//			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(newDescription);
//			driver.findElement(By.xpath("//input[@name='price_now_value']")).clear();
//			driver.findElement(By.xpath("//input[@name='price_now_value']")).sendKeys(newPrice);
//			//Is this on promotion?
//			new Select(driver.findElement(By.xpath("//select[@id='topcatid']"))).selectByVisibleText(newCategory);
//			new Select(driver.findElement(By.xpath("//select[@id='category_id']"))).selectByVisibleText(newSubCategory);
//			driver.findElement(By.xpath("//input[@name='tags']")).clear();
//			driver.findElement(By.xpath("//input[@name='tags']")).sendKeys(newTags);
//			driver.findElement(By.xpath("//input[@value='Apply']")).click();
//			
//			
//			// Verify Edit
//			driver.findElement(By.xpath("//ul[@class='breadcrumbs']/li[2]/a")).equals(newCategory);
//			driver.findElement(By.xpath("//ul[@class='breadcrumbs']/li[2]/a")).equals(newSubCategory);
//			driver.findElement(By.xpath("//h1[contains(.,'"+newTitle+"')]"));
//			driver.findElement(By.xpath("//p[@id='product-descr']")).equals(newDescription);
//			driver.findElement(By.xpath("//span[contains(.,'now: £"+newPrice+"')]"));
//			
//			String finishTest = "Ok";
//			return finishTest ;
//		}
		
		public static String AddWishList (String hostName)  
		{
			
			String text="";
			
			driver.get(hostName+"search/items");
			
			driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			List<WebElement> item_links = driver.findElements(By.xpath("//div[@class='text-box']/h5/a"));
			List<String> item_urls = new ArrayList<String>();
			
			for(WebElement url: item_links){
				String test = url.getAttribute("href");
				text = url.getText();
		System.out.println("Brand link "+"'"+text+"'"+" = "+test);
				item_urls.add(test);
			}
			
			int size = item_urls.size();
			System.out.println("size = "+size);	
						int ran = (int)((Math.random()*size));
			System.out.println("ran = "+ran);
											String u = item_urls.get(ran);
			System.out.println("Random item urls = "+u);
			
			driver.get(u);
			
			String productTitle = driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-7 col-lg-9']/h1")).getText();
			
			System.out.println("productTitle = "+productTitle);
			
//			 String [] RanProduct = RandomItem.ParserHYS();
//			 String productUrl = RanProduct[0];
//			 String productTitle = RanProduct[1];
			
//			driver.get(productUrl);
			
			
			driver.findElement(By.xpath("//a[contains(.,'Add to wishlist')]")).click();
			
			driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
//			driver.findElement(By.xpath("//p[@class='hidden-xs'][contains(.,'was added to your wishlist!')]"));
			
			driver.get(hostName+"account/wishlist");
		
			
			if (driver.findElements(By.xpath("//a[contains(.,'"+productTitle+"')]")).isEmpty())
			{
				System.out.println("Product not found in Wishlist !!!!");
				
				driver.quit();
			}
			
			String finishTest = "Ok";
			return finishTest ;
			
		}
		
		
		
		
		
		
		
		public static String AddToWishListMouseProductPage (String hostName)  
		{
			
			Actions actions = new Actions(driver);
			
			WebElement ProductMenu = driver.findElement(By.xpath("//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/items']"));
			WebElement AllProductLink = driver.findElement(By.xpath("//a[contains(.,'All Products')]"));
			
			actions.moveToElement(ProductMenu).build().perform();
			AllProductLink.click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			List<WebElement> ProductBox = driver.findElements(By.xpath("//div[@class='product']/div[@class='text-box']/h5/a"));
		
//			List<WebElement> ProductBox = driver.findElements(By.xpath("//div[@class='product']"));
			
			
			
//			for (WebElement we: ProductBox)
//			{
//				System.out.println("getAttribute href = "+we.getAttribute("href"));
//				System.out.println("getText = "+we.getText());
//				System.out.println("**********************************************************");
//			}
			
			boolean for_while=true;
			  
	  		while (for_while) 
	  		{
						
			int count = ProductBox.size();
System.out.println("count = "+count);
			int ran = (int)((Math.random()*count));
System.out.println("ran = "+ran);

			WebElement ranProduct = ProductBox.get(ran);
			
			ranProductUrl = ranProduct.getAttribute("href");
			ranProductTitle = ranProduct.getText();
			//data-deal-to-wishlis
System.out.println("ranProductUrl = "+ranProductUrl);
System.out.println("ranProductTitle = "+ranProductTitle);
			
			actions.moveToElement(ranProduct).build().perform();
			
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			if (!driver.findElements(By.xpath("//a[contains(@href,'"+ranProductUrl+"')]/../div[@class='row bottom-links']/div/a[contains(.,'+ Wishlist')]")).isEmpty())
				
			{
				for_while=false;
			
			
			WebElement WishListLink = driver.findElement(By.xpath("//a[contains(@href,'"+ranProductUrl+"')]/../div[@class='row bottom-links']/div/a[contains(.,'+ Wishlist')]"));
			
			WishListLink.click();
			
			driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			
			
			
	  		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			}
			WebElement AccountMenu = driver.findElement(By.xpath("//li[@class='user-account hidden-xs dropdown']"));
			WebElement WishListPageLink = driver.findElement(By.xpath("//span[contains(.,'Wishlist')]"));
			
			actions.moveToElement(AccountMenu).build().perform();
			
			WishListPageLink.click();
		
			
			if (driver.findElements(By.xpath("//a[contains(.,'"+ranProductTitle+"')]")).isEmpty())
			{
				System.out.println("Product not found in Wishlist !!!!");
				
				driver.quit();
			
	  		}
			
	  		// Delete item wishlist
	  		
	  		WebElement ProductMenu_4Del = driver.findElement(By.xpath("//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/items']"));
	  		WebElement AllProductLink_4Del = driver.findElement(By.xpath("//a[contains(.,'All Products')]"));
	  		
	  		
	  		actions.moveToElement(ProductMenu_4Del).build().perform();
	  		AllProductLink_4Del.click();
	  	
	  		WebElement ranProduct_4Del = driver.findElement(By.xpath("//div[@class='product']/div[@class='text-box']/h5/a[contains(@href,'"+ranProductUrl+"')]"));
	  		
			actions.moveToElement(ranProduct_4Del).build().perform();
			
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  		
			WebElement WishListLink_4Del = driver.findElement(By.xpath("//a[contains(@href,'"+ranProductUrl+"')]/../div[@class='row bottom-links']/div/a[contains(.,'- Wishlist')]"));
			
			WishListLink_4Del.click();
			
			driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
	  		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			WebElement AccountMenu_4Del = driver.findElement(By.xpath("//li[@class='user-account hidden-xs dropdown']"));
			WebElement WishListPageLink_4Del = driver.findElement(By.xpath("//span[contains(.,'Wishlist')]"));
			
			actions.moveToElement(AccountMenu_4Del).build().perform();
			
			WishListPageLink_4Del.click();
		
			
			if (!driver.findElements(By.xpath("//a[contains(.,'"+ranProductTitle+"')]")).isEmpty())
			{
				System.out.println("Product was not removed from Wishlist !!!!");
				
				driver.quit();
			}
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		String finishTest = "Ok";
			return finishTest ;
			
		}
		
		
		
		public static String AddToCollectionMouseProductPage (String hostName)  
		{
			
			Actions actions = new Actions(driver);
			
			WebElement ProductMenu = driver.findElement(By.xpath("//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/items']"));
			WebElement AllProductLink = driver.findElement(By.xpath("//a[contains(.,'All Products')]"));
			
			actions.moveToElement(ProductMenu).build().perform();
			AllProductLink.click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			List<WebElement> ProductBox = driver.findElements(By.xpath("//div[@class='product']/div[@class='text-box']/h5/a"));

//			for (WebElement we: ProductBox)
//			{
//				System.out.println("getAttribute href = "+we.getAttribute("href"));
//				System.out.println("getText = "+we.getText());
//				System.out.println("**********************************************************");
//			}
			
			boolean for_while=true;
			  
	  		while (for_while) 
	  		{
						
			int count = ProductBox.size();
System.out.println("count = "+count);
			int ran = (int)((Math.random()*count));
System.out.println("ran = "+ran);

			WebElement ranProduct = ProductBox.get(ran);
			
			ranProductUrl = ranProduct.getAttribute("href");
			ranProductTitle = ranProduct.getText();
			ranProductDealWishLIst = driver.findElement(By.xpath("//a[@href='"+ranProductUrl+"']/../div/div/div/div/a[contains(.,'Wishlist')]")).getAttribute("data-wishlist-deal");
System.out.println("ranProductUrl = "+ranProductUrl);
System.out.println("ranProductTitle = "+ranProductTitle);
System.out.println("ranProductDealWishLIst = "+ranProductDealWishLIst);
			
			actions.moveToElement(ranProduct).build().perform();
			
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			if (!driver.findElements(By.xpath("//a[contains(@href,'"+ranProductUrl+"')]/../div[@class='row bottom-links']/div/a[contains(.,'+ Collection')]")).isEmpty())
				
			{
				for_while=false;
			
			
			WebElement CollectionLink = driver.findElement(By.xpath("//a[contains(@href,'"+ranProductUrl+"')]/../div[@class='row bottom-links']/div/a[contains(.,'+ Collection')]"));
			
			CollectionLink.click();
			
			driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// Choose a collection or Create???
			// Public or Private ????
			// Use existing collection for test !!!!! 
			
						driver.findElement(By.xpath("//span[contains(.,'Test collection')]")).click(); // Hard code
						driver.findElement(By.xpath("//a[contains(.,'Add it')]")).click();
						
				}
			}
	  		
	  		
	  		
	  		
	  		
//	  STOP !!!!		
	  		
			WebElement AccountMenu = driver.findElement(By.xpath("//li[@class='user-account hidden-xs dropdown']"));
			WebElement CollectionPageLink = driver.findElement(By.xpath("//a[@href='/account/collections'][contains(.,'Collections')]"));
			
			actions.moveToElement(AccountMenu).build().perform();
			
			CollectionPageLink.click();
		
			
			// check in several ways !!!!!
			
						WebElement productCollections = driver.findElement(By.xpath("//div[@class='product collections']"));
						WebElement productCollectionsLink = driver.findElement(By.xpath("//span[@class='img-link']"));
						actions.moveToElement(productCollections).build().perform();
						productCollectionsLink.click();
					
						
//						if (driver.findElements(By.xpath("//a[contains(.,'"+ranProductUrl+"')]")).isEmpty())
//						if (driver.findElements(By.xpath("//a[@href='"+ranProductUrl+"']/../../div[@class='product']")).isEmpty())
					
						
						WebElement element = driver.findElement(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']"));
						((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", element);
						
						
						if (driver.findElements(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']")).isEmpty())
							
						{
							System.out.println("Product not add to Collection and found in Collection !!!!");
							
							driver.quit();
						}
			
	  		// Delete item Collection
	  		
			WebElement productCollectionsLink_4Del = driver.findElement(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']"));
			
			
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", productCollectionsLink_4Del);
			
			actions.moveToElement(productCollectionsLink_4Del).build().perform();
			
			WebElement CollectionLink_4Del = driver.findElement(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../div[@class='col-xs-6']/a[contains(.,'- Collection')]"));
			
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", CollectionLink_4Del);
			
			CollectionLink_4Del.click();
			
			driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
	  		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.navigate().refresh();
			
			if (!driver.findElements(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']")).isEmpty())
			{
				System.out.println("Product was not removed from Collection !!!!");
				
				driver.quit();
			}
	  		
	  		
	  		String finishTest = "Ok";
			return finishTest ;
			
		}
			
		
		public static String AddCollectionHomePage (String hostName)  // create Verify Public, change to Private  
		{
		
			Actions actions = new Actions(driver);
			
			WebElement CollectionMenu = driver.findElement(By.xpath("//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/collections']"));
			WebElement NewCollectionLink = driver.findElement(By.xpath("//a[contains(.,'New Collection')]"));;
			
			actions.moveToElement(CollectionMenu).build().perform();
			NewCollectionLink.click();
			
			
			int ran = (int)((Math.random()*999));
			String CollectionName = "New Collection Name "+ran;
			String CollectionTags = "New Collection Tags "+ran;
			
			
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//input[contains(@placeholder,'name')]")).clear();
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//input[contains(@placeholder,'name')]")).sendKeys(CollectionName);
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//input[contains(@placeholder,'tags')]")).clear();
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//input[contains(@placeholder,'tags')]")).sendKeys(CollectionTags);
			
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//a[@class='active'][contains(@data-is-private,'0')]")); // Is Public ?
			
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//input[@value='Create']")).click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//div[@class='row my-items collections-items']/div//h4[contains(.,'"+CollectionName+"')]"));
	
			
			WebElement productCollections = driver.findElement(By.xpath("//h4[contains(.,'"+CollectionName+"')]/../../../..//div[@class='product collections']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", productCollections);
			WebElement productCollectionsLink = driver.findElement(By.xpath("//h4[contains(.,'"+CollectionName+"')]/../../../..//span[@class='img-link']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", productCollectionsLink);
			actions.moveToElement(productCollections).build().perform();
			productCollectionsLink.click();
			
			driver.findElement(By.xpath("//a[contains(.,'Edit collection')]")).click();
			
			
			int ranNew = (int)((Math.random()*999));
			String NewCollectionName = "New Collection Name "+ranNew;
			String NewCollectionTags = "New Collection Tags "+ranNew;
			
			
			driver.findElement(By.xpath("//div[@id='editCollectionModal']//input[@data-collection-name='']")).clear();
			driver.findElement(By.xpath("//div[@id='editCollectionModal']//input[@data-collection-name='']")).sendKeys(NewCollectionName);
			
			
			//Verify Old Tags
			driver.findElement(By.xpath("//a[@data-remove-tag='"+CollectionTags+"']"));
			
			driver.findElement(By.xpath("//div[@id='editCollectionModal']//input[@data-new-tag='']")).clear();
			driver.findElement(By.xpath("//div[@id='editCollectionModal']//input[@data-new-tag='']")).sendKeys(NewCollectionTags);
			driver.findElement(By.xpath("//input[@value='Add tag']")).click();
			
			// Verify New Tags
			driver.findElement(By.xpath("//a[@data-remove-tag='"+NewCollectionTags+"']"));
			//remove old tags
			
			WebElement OldCollectionTags = driver.findElement(By.xpath("//a[@data-remove-tag='"+CollectionTags+"']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", OldCollectionTags);
			actions.moveToElement(OldCollectionTags).build().perform();
			OldCollectionTags.click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (!driver.findElements(By.xpath("//a[@data-remove-tag='"+CollectionTags+"']")).isEmpty())
			{
System.out.println("Tags was not removed  !!!!");
				
				driver.quit();
			}
			
			//change to Private
			WebElement Private = driver.findElement(By.xpath("//div[@id='editCollectionModal']//a[@data-is-private='1']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", Private);
			actions.moveToElement(Private).build().perform();
			Private.click();
			
			
			driver.findElement(By.xpath("//a[contains(.,'Apply')]")).click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//h3[contains(.,'"+NewCollectionName+"')]"));
			driver.findElement(By.xpath("//a[contains(.,'"+NewCollectionTags+"')]"));
			
			
			String finishTest = "Ok";
			return finishTest ;
		
		}
		
		
		public static String AddCollectionCollectionPage (String hostName)  
		{
			Actions actions = new Actions(driver);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement AccountMenu = driver.findElement(By.xpath("//li[@class='user-account hidden-xs dropdown']"));
			WebElement CollectionPageLink = driver.findElement(By.xpath("//a[@href='/account/collections'][contains(.,'Collections')]"));
			
			actions.moveToElement(AccountMenu).build().perform();
			CollectionPageLink.click();
			
			driver.findElement(By.xpath("//a[contains(.,'Create a new collection')]")).click();
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			int ran = (int)((Math.random()*999));
			String CollectionName = "New Collection Name "+ran;
			String CollectionTags = "New Collection Tags "+ran;
			
			
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//input[contains(@placeholder,'name')]")).clear();
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//input[contains(@placeholder,'name')]")).sendKeys(CollectionName);
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//input[contains(@placeholder,'tags')]")).clear();
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//input[contains(@placeholder,'tags')]")).sendKeys(CollectionTags);
			
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//a[@class='active'][contains(@data-is-private,'0')]")); // Is Public ?
			
			driver.findElement(By.xpath("//div[@id='createCollectionModal']//input[@value='Create']")).click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//div[@class='row my-items collections-items']/div//h4[contains(.,'"+CollectionName+"')]"));
	
			
			WebElement productCollections = driver.findElement(By.xpath("//h4[contains(.,'"+CollectionName+"')]/../../../..//div[@class='product collections']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", productCollections);
			WebElement productCollectionsLink = driver.findElement(By.xpath("//h4[contains(.,'"+CollectionName+"')]/../../../..//span[@class='img-link']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", productCollectionsLink);
			actions.moveToElement(productCollections).build().perform();
			productCollectionsLink.click();
			
			driver.findElement(By.xpath("//a[contains(.,'Edit collection')]")).click();
			
			
			int ranNew = (int)((Math.random()*999));
			String NewCollectionName = "New Collection Name "+ranNew;
			String NewCollectionTags = "New Collection Tags "+ranNew;
			
			
			driver.findElement(By.xpath("//div[@id='editCollectionModal']//input[@data-collection-name='']")).clear();
			driver.findElement(By.xpath("//div[@id='editCollectionModal']//input[@data-collection-name='']")).sendKeys(NewCollectionName);
			
			
			//Verify Old Tags
			driver.findElement(By.xpath("//a[@data-remove-tag='"+CollectionTags+"']"));
			
			driver.findElement(By.xpath("//div[@id='editCollectionModal']//input[@data-new-tag='']")).clear();
			driver.findElement(By.xpath("//div[@id='editCollectionModal']//input[@data-new-tag='']")).sendKeys(NewCollectionTags);
			driver.findElement(By.xpath("//input[@value='Add tag']")).click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			// Verify New Tags
			driver.findElement(By.xpath("//a[@data-remove-tag='"+NewCollectionTags+"']"));
			
			//remove old tags
			
			WebElement OldCollectionTags = driver.findElement(By.xpath("//a[@data-remove-tag='"+CollectionTags+"']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", OldCollectionTags);
			actions.moveToElement(OldCollectionTags).build().perform();
			OldCollectionTags.click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if (!driver.findElements(By.xpath("//a[@data-remove-tag='"+CollectionTags+"']")).isEmpty())
			{
System.out.println("Tags was not removed  !!!!");
				
				driver.quit();
			}
			
			//change to Private
			WebElement Private = driver.findElement(By.xpath("//div[@id='editCollectionModal']//a[@data-is-private='1']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", Private);
			actions.moveToElement(Private).build().perform();
			Private.click();
			
			
			driver.findElement(By.xpath("//a[contains(.,'Apply')]")).click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//h3[contains(.,'"+NewCollectionName+"')]"));
			driver.findElement(By.xpath("//a[contains(.,'"+NewCollectionTags+"')]"));
			
			
			String finishTest = "Ok";
			return finishTest ;
		
		}
		
	
		public static String AddCollectionWhenAddItem (String hostName, String item_url)  
		{
//			Add Verification if item is in base
			
			
			Actions actions = new Actions(driver);
			WebElement AddMenu = driver.findElement(By.xpath("//a[@href='/addNewItem/index']"));
			
			actions.moveToElement(AddMenu).build().perform();
			AddMenu.click();
			
//			driver.findElement(By.xpath("//a[@href='/addNewItem/index']")).click();
			driver.findElement(By.xpath("//input[@id='item-url']")).sendKeys(item_url);
			driver.findElement(By.xpath("//input[@value='Add']")).click();
			
//			driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
			 
			boolean for_while=true;
			  
		  		while (for_while) 
		  		{

		  			if	(!driver.findElements(By.xpath("//div[@class='panel-collapse collapse in']")).isEmpty());
					{
						for_while=false;
					}
		  		}
		  		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  		
//			add Verification
			
		  	String RanProductTitle = driver.findElement(By.xpath("//input[@id='title']")).getAttribute("value");	
		  	driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Test Item Tags");
			new Select(driver.findElement(By.xpath("//select[@id='topcatid']"))).selectByVisibleText("Other");
			new Select(driver.findElement(By.xpath("//select[@id='category_id']"))).selectByVisibleText("Everything Else");
			driver.findElement(By.xpath("//input[@value='Yes, all product details are correct']")).click();
			
//			if ((!driver.findElements(By.xpath("//input[@class='form-control error']")).isEmpty()) || (!driver.findElements(By.xpath("//select[@aria-describedby='topcatid-error']")).isEmpty()) || (!driver.findElements(By.xpath("//select[@aria-describedby='category_id-error']")).isEmpty()))
//			{
//				System.out.println("Product details are not correct!!! Test stop !!! ");
//				driver.quit();
//			}
			
			boolean for_while1=true;
			  
	  		while (for_while1) 
	  		{

	  			if	(!driver.findElements(By.xpath("//div[@class='panel-collapse collapse in']")).isEmpty());
				{
					for_while1=false;
				}
	  		}
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@id='review-title']")).sendKeys("Test Review this product");
			driver.findElement(By.xpath("//span[@data-value='4']"));
			driver.findElement(By.xpath("//input[@value='Add my review']")).click();
			
			
			int ran = (int)((Math.random()*999));
			String CollectionName = "New Collection Name "+ran;
			String CollectionTags = "New Collection Tags "+ran;
			driver.findElement(By.xpath("//a[contains(.,'Add to collection')]")).click();
			driver.findElement(By.xpath("//input[@placeholder='name']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='name']")).sendKeys(CollectionName);
			driver.findElement(By.xpath("//input[@placeholder='tags']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='tags']")).sendKeys(CollectionTags);
			
			//change to Private
			WebElement Private = driver.findElement(By.xpath("//div[@id='addToCollectionModal']//a[@data-is-private='1']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", Private);
			actions.moveToElement(Private).build().perform();
			Private.click();
			
			driver.findElement(By.xpath("//input[@value='Create']")).click();
			driver.findElement(By.xpath("//span[contains(.,'"+CollectionName+"')]")).click(); // Hard code
			driver.findElement(By.xpath("//a[contains(.,'Add it')]")).click();
			
						
			WebElement ProductMenu = driver.findElement(By.xpath("//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/items']"));
			WebElement MyProductLink = driver.findElement(By.xpath("//a[contains(.,'My Products')]"));
			
			actions.moveToElement(ProductMenu).build().perform();
			MyProductLink.click();
			
WebElement element = driver.findElement(By.xpath("//a[contains(.,'"+RanProductTitle+"')]"));
((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", element);
			
			if (driver.findElements(By.xpath("//a[contains(.,'"+RanProductTitle+"')]")).isEmpty())
			{
				System.out.println("Item was not added !!!!");
				
				driver.quit();
			
	  		}
			
			String add_item_link = driver.findElement(By.xpath("//a[contains(.,'"+RanProductTitle+"')]")).getAttribute("href");
			
			int stringLength = add_item_link.length();
			String add_item_shortlink = add_item_link.substring(stringLength-5, stringLength);
			
WebElement element1 = driver.findElement(By.xpath("//table[@class='table hidden-xs hidden-sm']//a[@class='icon icon-view'][contains(@href,'"+add_item_shortlink+"')]"));
((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", element1);			
						
			driver.findElement(By.xpath("//table[@class='table hidden-xs hidden-sm']//a[@class='icon icon-view'][contains(@href,'"+add_item_shortlink+"')]")).click();
			driver.findElement(By.xpath("//a[@data-tip='Edit product details']")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Edit Item
			
			String newTitle = "Edit Item Title";
			String newDescription = "Edit Item Description";
			String newPrice = "100";
			String newCategory = "Books & Media";
			String newSubCategory = "Books";
			String newTags = "Edit Item Tags";
			
			driver.findElement(By.xpath("//input[@name='title_display']")).clear();
			driver.findElement(By.xpath("//input[@name='title_display']")).sendKeys(newTitle);
			driver.findElement(By.xpath("//textarea[@name='description']")).clear();
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(newDescription);
			driver.findElement(By.xpath("//input[@name='price_now_value']")).clear();
			driver.findElement(By.xpath("//input[@name='price_now_value']")).sendKeys(newPrice);
			//Is this on promotion?
			new Select(driver.findElement(By.xpath("//select[@id='topcatid']"))).selectByVisibleText(newCategory);
			new Select(driver.findElement(By.xpath("//select[@id='category_id']"))).selectByVisibleText(newSubCategory);
			driver.findElement(By.xpath("//input[@name='tags']")).clear();
			driver.findElement(By.xpath("//input[@name='tags']")).sendKeys(newTags);
			driver.findElement(By.xpath("//input[@value='Apply']")).click();
			
			
			// Verify Edit
			driver.findElement(By.xpath("//ul[@class='breadcrumbs']/li[2]/a")).equals(newCategory);
			driver.findElement(By.xpath("//ul[@class='breadcrumbs']/li[2]/a")).equals(newSubCategory);
			driver.findElement(By.xpath("//h1[contains(.,'"+newTitle+"')]"));
			driver.findElement(By.xpath("//p[@id='product-descr']")).equals(newDescription);
			driver.findElement(By.xpath("//span[contains(.,'now: £"+newPrice+"')]"));
			
			String finishTest = "Ok";
			return finishTest ;
		
		}
		
	
		
		public static String AddCollectionWhenAddToCollection (String hostName)  
		{
		
			
			
				Actions actions = new Actions(driver);
			
			WebElement ProductMenu = driver.findElement(By.xpath("//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/items']"));
			WebElement AllProductLink = driver.findElement(By.xpath("//a[contains(.,'All Products')]"));
			
			actions.moveToElement(ProductMenu).build().perform();
			AllProductLink.click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			List<WebElement> ProductBox = driver.findElements(By.xpath("//div[@class='product']/div[@class='text-box']/h5/a"));

//			for (WebElement we: ProductBox)
//			{
//				System.out.println("getAttribute href = "+we.getAttribute("href"));
//				System.out.println("getText = "+we.getText());
//				System.out.println("**********************************************************");
//			}
			
			boolean for_while=true;
			  
	  		while (for_while) 
	  		{
						
			int count = ProductBox.size();
System.out.println("count = "+count);
			int ran = (int)((Math.random()*count));
System.out.println("ran = "+ran);

			WebElement ranProduct = ProductBox.get(ran);
			
			ranProductUrl = ranProduct.getAttribute("href");
			ranProductTitle = ranProduct.getText();
			ranProductDealWishLIst = driver.findElement(By.xpath("//a[@href='"+ranProductUrl+"']/../div/div/div/div/a[contains(.,'Wishlist')]")).getAttribute("data-wishlist-deal");
System.out.println("ranProductUrl = "+ranProductUrl);
System.out.println("ranProductTitle = "+ranProductTitle);
System.out.println("ranProductDealWishLIst = "+ranProductDealWishLIst);
			
			actions.moveToElement(ranProduct).build().perform();
			
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			if (!driver.findElements(By.xpath("//a[contains(@href,'"+ranProductUrl+"')]/../div[@class='row bottom-links']/div/a[contains(.,'+ Collection')]")).isEmpty())
				
			{
				for_while=false;
			
			
			WebElement CollectionLink = driver.findElement(By.xpath("//a[contains(@href,'"+ranProductUrl+"')]/../div[@class='row bottom-links']/div/a[contains(.,'+ Collection')]"));
			
			CollectionLink.click();
			
			driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			int ran1 = (int)((Math.random()*999));
			CollectionName1 = "New Collection Name "+ran1;
			CollectionTags1 = "New Collection Tags "+ran1;
			driver.findElement(By.xpath("//input[@placeholder='name']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='name']")).sendKeys(CollectionName1);
			driver.findElement(By.xpath("//input[@placeholder='tags']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='tags']")).sendKeys(CollectionTags1);
			
			//change to Private
			WebElement Private = driver.findElement(By.xpath("//div[@id='addToCollectionModal']//a[@data-is-private='1']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", Private);
			actions.moveToElement(Private).build().perform();
			Private.click();
			
			driver.findElement(By.xpath("//input[@value='Create']")).click();
			driver.findElement(By.xpath("//span[contains(.,'"+CollectionName1+"')]")).click(); // Hard code
			driver.findElement(By.xpath("//a[contains(.,'Add it')]")).click();
						
				}
			}
	  		
			WebElement AccountMenu = driver.findElement(By.xpath("//li[@class='user-account hidden-xs dropdown']"));
			WebElement CollectionPageLink = driver.findElement(By.xpath("//a[@href='/account/collections'][contains(.,'Collections')]"));
			
			actions.moveToElement(AccountMenu).build().perform();
			
			CollectionPageLink.click();
		
			
			// check in several ways !!!!!
			
			WebElement productCollections = driver.findElement(By.xpath("//h4[contains(.,'"+CollectionName1+"')]/../../../..//div[@class='product collections']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", productCollections);
			WebElement productCollectionsLink = driver.findElement(By.xpath("//h4[contains(.,'"+CollectionName1+"')]/../../../..//span[@class='img-link']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", productCollectionsLink);
			actions.moveToElement(productCollections).build().perform();
			productCollectionsLink.click();
					
						
//						if (driver.findElements(By.xpath("//a[contains(.,'"+ranProductUrl+"')]")).isEmpty())
//						if (driver.findElements(By.xpath("//a[@href='"+ranProductUrl+"']/../../div[@class='product']")).isEmpty())
					
						
						WebElement element = driver.findElement(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']"));
						((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", element);
						
						
						if (driver.findElements(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']")).isEmpty())
							
						{
							System.out.println("Product not add to Collection and found in Collection !!!!");
							
							driver.quit();
						}
			
	  		// Delete item Collection
	  		
			WebElement productCollectionsLink_4Del = driver.findElement(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']"));
			
			
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", productCollectionsLink_4Del);
			
			actions.moveToElement(productCollectionsLink_4Del).build().perform();
			
			WebElement CollectionLink_4Del = driver.findElement(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../div[@class='col-xs-6']/a[contains(.,'- Collection')]"));
			
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", CollectionLink_4Del);
			
			CollectionLink_4Del.click();
			
			driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
	  		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.navigate().refresh();
			
			if (!driver.findElements(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']")).isEmpty())
			{
				System.out.println("Product was not removed from Collection !!!!");
				
				driver.quit();
			}
	  		
	  		
	  		String finishTest = "Ok";
			return finishTest ;
		
		}
		
		
		
		public static String FollowRanCollection (String hostName)  
		{
			
			Actions actions = new Actions(driver);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement CollectionMenu = driver.findElement(By.xpath("//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/collections']"));
			WebElement AllCollectionPageLink = driver.findElement(By.xpath("//a[@href='/search/collections'][contains(.,'All Collections')]"));
			
			actions.moveToElement(CollectionMenu).build().perform();
			AllCollectionPageLink.click();
			
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			List<WebElement> CollectionBox = driver.findElements(By.xpath("//div[@class='product collections']/div[@class='text-box']/h5/a"));
			
			
			boolean for_while=true;
			  
	  		while (for_while) 
	  		{
						
			int count = CollectionBox.size();
System.out.println("count = "+count);
			int ran = (int)((Math.random()*count));
System.out.println("ran = "+ran);

			WebElement ranCollection = CollectionBox.get(ran);
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", ranCollection);
			
			ranCollectionUrl = ranCollection.getAttribute("href");
System.out.println("ranCollectionUrl = "+ranCollectionUrl);
			ranCollectionTitle = ranCollection.getText();
System.out.println("ranCollectionTitle = "+ranCollectionTitle);

		int stringLength = ranCollectionUrl.length();
		ranCollectionShortlink = ranCollectionUrl.substring(stringLength-10, stringLength);


			actions.moveToElement(ranCollection).build().perform();
			
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			if (!driver.findElements(By.xpath("//a[contains(@href,'"+ranCollectionShortlink+"')]/../div[@class='row bottom-links']/a[contains(.,'Follow collection')]")).isEmpty())
			
			{
				for_while=false;
			
			
			WebElement CollectionLink = driver.findElement(By.xpath("//a[contains(@href,'"+ranCollectionShortlink+"')]/../div[@class='row bottom-links']/a[contains(.,'Follow collection')]"));
			
			CollectionLink.click();
			
			driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			
			
			
	  		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			}
			
	  		WebElement CollectionMenu1 = driver.findElement(By.xpath("//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/collections']"));
			WebElement Collections_I_FollowPageLink = driver.findElement(By.xpath("//a[contains(.,'Collections I Follow')]"));
			
			
			actions.moveToElement(CollectionMenu1).build().perform();
			Collections_I_FollowPageLink.click();
	  		
			
			if (driver.findElements(By.xpath("//a[contains(.,'"+ranCollectionTitle+"')]")).isEmpty())
			{
				System.out.println("Product not found in Follow !!!!");
				
				driver.quit();
			
	  		}
			
	  		// UnFollow
	  		
	  		WebElement ranCollection_4Del = driver.findElement(By.xpath("//div[@class='product collections']/div[@class='text-box']/h5/a[contains(@href,'"+ranCollectionShortlink+"')]"));
	  		
			actions.moveToElement(ranCollection_4Del).build().perform();
			
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  		
			WebElement CollectionLink_4Del = driver.findElement(By.xpath("//a[contains(@href,'"+ranCollectionShortlink+"')]/../div[@class='row bottom-links']/a[contains(.,'Unfollow collection')]"));
			
			CollectionLink_4Del.click();
			
			driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
	  		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			driver.navigate().refresh();
		
			
			if (driver.findElements(By.xpath("//a[contains(.,'"+ranCollectionTitle+"')]")).isEmpty())
			{
				System.out.println("Product was not removed from Follow !!!!");
				
				driver.quit();
			}
			
		
			String finishTest = "Ok";
			return finishTest ;
		
		}
		
		
		
		
		public static String ShareAllProducts (String hostName)  
		{
			
			Actions actions = new Actions(driver);
			
			WebElement ProductMenu = driver.findElement(By.xpath("//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/items']"));
			WebElement AllProductLink = driver.findElement(By.xpath("//a[contains(.,'All Products')]"));
			
			actions.moveToElement(ProductMenu).build().perform();
			AllProductLink.click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			List<WebElement> ProductBox = driver.findElements(By.xpath("//div[@class='product']/div[@class='text-box']/h5/a"));
			
	
			int count = ProductBox.size();
System.out.println("count = "+count);
			int ran = (int)((Math.random()*count));
System.out.println("ran = "+ran);

			WebElement ranProduct = ProductBox.get(ran);
			
			ranProductUrl = ranProduct.getAttribute("href");
			ranProductTitle = ranProduct.getText();
			//data-deal-to-wishlis
System.out.println("ranProductUrl = "+ranProductUrl);
System.out.println("ranProductTitle = "+ranProductTitle);
			
			actions.moveToElement(ranProduct).build().perform();
			
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			WebElement Share_Earn = driver.findElement(By.xpath("//a[contains(@href,'"+ranProductUrl+"')]/../div[@class='row']/div/a[contains(.,'Share & earn')]"));
		
			Share_Earn.click();
			
			driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

//			Check Popup for Share and button 			
			driver.findElement(By.xpath("//div[@id='shareModal']"));
			driver.findElement(By.xpath("//div[@id='shareModal']//a[@data-share='facebook']"));
			driver.findElement(By.xpath("//div[@id='shareModal']//a[@data-share='twitter']"));
			driver.findElement(By.xpath("//div[@id='shareModal']//a[@data-share='google']"));
			driver.findElement(By.xpath("//div[@id='shareModal']//a[@data-share='pinterest']"));
			
			driver.findElement(By.xpath("//div[@id='shareModal']//a[@class='close']")).click();
			
			String finishTest = "Ok";
			return finishTest ;
		
		}
		
		
		public static String ShareMyProducts (String hostName)  
		{
			
			Actions actions = new Actions(driver);
			
			WebElement ProductMenu = driver.findElement(By.xpath("//li[@class='link-nav collections-dropdown hidden-xs dropdown']/a[@href='/search/items']"));
			WebElement MyProductLink = driver.findElement(By.xpath("//a[contains(.,'My Products')]"));
			
			actions.moveToElement(ProductMenu).build().perform();
			MyProductLink.click();
			
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			List<WebElement> ProductBox = driver.findElements(By.xpath("//table[@class='table hidden-xs hidden-sm']/tbody/tr"));
			
	
			int count = ProductBox.size();
System.out.println("count = "+count);
			int ran = (int)((Math.random()*count));
System.out.println("ran = "+ran);

			WebElement ranProduct = ProductBox.get(ran);
			
((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", ranProduct);
			
			ranProductUrl = ranProduct.getAttribute("href");
			ranProductTitle = ranProduct.getText();
			//data-deal-to-wishlis
System.out.println("ranProductUrl = "+ranProductUrl);
System.out.println("ranProductTitle = "+ranProductTitle);
			
			actions.moveToElement(ranProduct).build().perform();
			
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			WebElement Share_Earn = driver.findElement(By.xpath("//a[contains(@href,'"+ranProductUrl+"')]/../div[@class='row']/div/a[contains(.,'Share & earn')]"));
		
			Share_Earn.click();
			
			driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

//			Check Popup for Share and button 			
			driver.findElement(By.xpath("//div[@id='shareModal']"));
			driver.findElement(By.xpath("//div[@id='shareModal']//a[@data-share='facebook']"));
			driver.findElement(By.xpath("//div[@id='shareModal']//a[@data-share='twitter']"));
			driver.findElement(By.xpath("//div[@id='shareModal']//a[@data-share='google']"));
			driver.findElement(By.xpath("//div[@id='shareModal']//a[@data-share='pinterest']"));
			
			driver.findElement(By.xpath("//div[@id='shareModal']//a[@class='close']")).click();
			
			String finishTest = "Ok";
			return finishTest ;
		
		}
		
		
		
		public static String LoginCollectionShare (String hostName)  
		{
			driver = new FirefoxDriver();
			Actions actions = new Actions(driver);
			
			driver.manage().window().maximize();
			driver.get(hostName);
			
			List<WebElement> CollectionBox = driver.findElements(By.xpath("//div[@class='text-box']/h5/a"));
			
			int count = CollectionBox.size();
			
System.out.println("count = "+count);
						int ran = (int)((Math.random()*count));
System.out.println("ran = "+ran);

						WebElement ranCollectionBox = CollectionBox.get(ran);
						((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'red'", ranCollectionBox);
						
						String ranCollectionUrl = ranCollectionBox.getAttribute("href");
						String ranCollectionTitle = ranCollectionBox.getText();
						int stringLength = ranCollectionUrl.length();
						String ranCollShortlink = ranCollectionUrl.substring(stringLength-10, stringLength);
						
System.out.println("ranCollectionUrl = "+ranCollectionUrl);
System.out.println("ranCollectionTitle = "+ranCollectionTitle);
						
						WebElement ranCollectionLink = driver.findElement(By.xpath("//a[contains(.,ranCollectionTitle)]"));
						((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", ranCollectionLink);

						actions.moveToElement(ranCollectionBox).build().perform();
						ranCollectionLink.click();
						
						driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
						driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


			String finishTest = "Ok";
			return finishTest ;
		
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
System.out.println("authLink = "+authLink);
			String authToken = GetAuthToken.AuthToken(authLink,"auth_token");
System.out.println("authToken = "+authToken);

			if(authToken.equals("null"))
			{
				System.out.println("authToken not exist in "+flag+"flag");
			}
			return authToken;
			
	}
			
		
		
		public static void switchFlag (String hostName, String token, String flag)  
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
			
			
			if (hostName.contains("stage"))
				{
				driver.get("http://dev:hys!dev@stage-us.haveyouseen.com/auth/login?auth_token="+token);
				}
				else {
					MoveAndClick.OneElement(flagLink);
					 }
			
		}	
			
		
//		public static String LoginCollectionFollow (String hostName)  
//		{
//			driver = new FirefoxDriver();
//			driver.manage().window().maximize();
//			driver.get(hostName);
//			
//			List<WebElement> CollectionBox = driver.findElements(By.xpath("//div[@class='product collections']"));
//			
//			int count = CollectionBox.size();
//			
//System.out.println("count = "+count);
//						int ran = (int)((Math.random()*count));
//System.out.println("ran = "+ran);
//
//						WebElement ranCollectionBox = CollectionBox.get(ran);
//						
//						String ranCollection = ranCollectionBox.getAttribute("data-collection-overlay");
//						
//System.out.println("ranProductUrl = "+ranProductUrl);
//System.out.println("ranProductTitle = "+ranProductTitle);
//			
//			
//						
//			String finishTest = "Ok";
//			return finishTest ;
//		
//		}

		
		
		
		
}
