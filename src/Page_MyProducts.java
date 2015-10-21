import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class Page_MyProducts {
	
	
	public static void CheckAddItem (String productTitle)  //  !!!!!!!!!!!
	{
		Page_Home.toMyProductsPage();
		
		WebElement element = Setup.driver.findElement(By.xpath("//a[contains(.,'"+productTitle+"')]"));
		((JavascriptExecutor) Setup.driver).executeScript("arguments[0].style.backgroundColor = 'red'", element);
				
				if (Setup.driver.findElements(By.xpath("//a[contains(.,'"+productTitle+"')]")).isEmpty())
				{
					System.out.println("Item was not added !!!!");
					
					Setup.driver.quit();
				
		  		}
	}
//		String add_item_link = Setup.driver.findElement(By.xpath("//a[contains(.,'"+productTitle+"')]")).getAttribute("href");	
//		
//		if (add_item_link != getItemLink())
//		{
//			System.out.println("Item was not added !!!!");
//			
//			Setup.driver.quit();
//		}
		
				public static String getShortLink (String add_item_link)  //  !!!!!!!!!!! -4 must be 4xgj NOT /4xgj
				{
					int stringLength = add_item_link.length();
					String shortLink = add_item_link.substring(stringLength-5, stringLength);
					
					return shortLink;
				}
		
				
				public static void selectItem (String shortLink)  //  !!!!!!!!!!!
				{
					String element = "//table[@class='table hidden-xs hidden-sm']//a[@class='icon icon-view'][contains(@href,'"+shortLink+"')]";
					MoveAndClick.OneElement(element);
				}
				
				
	}


