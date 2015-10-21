
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Page_AllProducts {
	
	public static WebElement SelectRanProductNotInCol_Wish (String attribute)  //  "+ Wishlist" "+ Collection"
	{
		List<WebElement> ProductBox = Setup.driver.findElements(By.xpath("//div[@class='product']/div[@class='text-box']/h5/a"));
		
		boolean for_while=true;
		  
  		while (for_while) 
  		{
					
		int count = ProductBox.size();
System.out.println("count = "+count);
		int ran = (int)((Math.random()*count));
System.out.println("ran = "+ran);

		


		WebElement ranProduct = ProductBox.get(ran);
		
		MoveAndClick.MouseOverWB(ranProduct);
		
		
		String ranProductUrl = ranProduct.getAttribute("href");
		
		if (attribute=="random")
		{
			return ranProduct;
		}
		 
		if (!Setup.driver.findElements(By.xpath("//a[contains(@href,'"+ranProductUrl+"')]/../div[@class='row bottom-links']/div/a[contains(.,'"+attribute+"')]")).isEmpty())
			
		{
			for_while=false;
			
			return ranProduct;

			}
		}
		return null;
		
		}
	
	
	
	
	
	
	
	public static String getURlRanProduct (WebElement ranProduct)  //  !!!!!!!!!!!
	{
		String ranProductUrl = ranProduct.getAttribute("href");
		
		return ranProductUrl;
	}
	
	
	public static String getTitleRanProduct (WebElement ranProduct)  
	{
		String ranProductTitle = ranProduct.getText();
		
		return ranProductTitle;
	}
	
	
	public static String getProductDealWishLIst (String ranProductUrl)  
	{
		String ranProductDealWishLIst = Setup.driver.findElement(By.xpath("//a[@href='"+ranProductUrl+"']/../div/div/div/div/a[contains(.,'Wishlist')]")).getAttribute("data-wishlist-deal");
		
		return ranProductDealWishLIst;
	}
	
	
	public static void AddToWishlist (String shortLink)  //  !!!!!!!!!!!
	{
		
		
		
	}
	
	public static void DelFromWishlist (String shortLink)  //  !!!!!!!!!!!
	{
		
	}
	
	public static void toAddToCollection (String ranProductUrl)  //  !!!!!!!!!!!
	{
		MoveAndClick.OneElement("//a[contains(@href,'"+ranProductUrl+"')]/../div[@class='row bottom-links']/div/a[contains(.,'+ Collection')]");
		
	}
	
	public static void DelFromCollection (String shortLink)  //  !!!!!!!!!!!
	{
		
	}
	
	public static void ShareAndEarn (String shortLink)  //  !!!!!!!!!!!
	{
		
	}
	
	public static boolean checkInCollection (String shortLink)  //  !!!!!!!!!!!
	{
		
		
		
		
		return false;
		
	}

}
