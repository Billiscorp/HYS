import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;


public class Page_Collection {
	
	public static void checkAddItemToCollection (String ranProductDealWishLIst)  
	{
		MoveAndClick.MouseOver("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']");
		
		if (Setup.driver.findElements(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']")).isEmpty())
			
		{
			System.out.println("Product not add to Collection and found in Collection !!!!");
			Setup.driver.quit();
		}
		
		
	}
	
	
	
	public static void delItemFromCollection (String ranProductDealWishLIst)  
	{
		MoveAndClick.MouseOver("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']");
		
		MoveAndClick.OneElement("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../div[@class='col-xs-6']/a[contains(.,'- Collection')]");
		
		Setup.driver.navigate().refresh();
		
		if (!Setup.driver.findElements(By.xpath("//a[@data-wishlist-deal='"+ranProductDealWishLIst+"']/../../../../div[@class='product']")).isEmpty())
		{
			System.out.println("Product was not removed from Collection !!!!");
			
			Setup.driver.quit();
		}
	}

}
