
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Page_AddItem {
	
	public static void setProdictUrl (String item_url)  // Header ? Button?
	{
		Setup.driver.findElement(By.xpath("//input[@id='item-url']")).sendKeys(item_url);
		Setup.driver.findElement(By.xpath("//input[@value='Add']")).click();
		
		boolean for_while=true;
		  
  		while (for_while) 
  		{

  			if	(!Setup.driver.findElements(By.xpath("//div[@class='panel-collapse collapse in']")).isEmpty());
			{
				for_while=false;
			}
  		}
  		Setup.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	  		
//		add Verification
	
	
	public static String getProdictTitle ()  
	{
		String RanProductTitle = Setup.driver.findElement(By.xpath("//input[@id='title']")).getAttribute("value");
		
		return RanProductTitle ;
	}
		
	
	
	public static void setTags (String tags)  
	{
//		Setup.driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Test Item Tags");
		Setup.driver.findElement(By.xpath("//input[@id='tags']")).sendKeys(tags);
	}	
	 
	public static void setCategory ()  // Random category and subCategory, may be from file
	{
		new Select(Setup.driver.findElement(By.xpath("//select[@id='topcatid']"))).selectByVisibleText("Other");
		new Select(Setup.driver.findElement(By.xpath("//select[@id='category_id']"))).selectByVisibleText("Everything Else");
	}	
		
		
	public static void pushCorrect ()  // Random category and subCategory, may be from file  
	{	
		
		Setup.driver.findElement(By.xpath("//input[@value='Yes, all product details are correct']")).click();
		
//		if ((!driver.findElements(By.xpath("//input[@class='form-control error']")).isEmpty()) || (!driver.findElements(By.xpath("//select[@aria-describedby='topcatid-error']")).isEmpty()) || (!driver.findElements(By.xpath("//select[@aria-describedby='category_id-error']")).isEmpty()))
//		{
//			System.out.println("Product details are not correct!!! Test stop !!! ");
//			driver.quit();
//		}
		
		boolean for_while1=true;
		  
  		while (for_while1) 
  		{

  			if	(!Setup.driver.findElements(By.xpath("//div[@class='panel-collapse collapse in']")).isEmpty());
			{
				for_while1=false;
			}
  		}
  		Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
//		Add check ERROR !!!!
	
	public static void setReviewProduct (String review)  
	{
//		Setup.driver.findElement(By.xpath("//input[@id='review-title']")).sendKeys("Test Review this product");
		Setup.driver.findElement(By.xpath("//input[@id='review-title']")).sendKeys(review);
	}	
	
	
	public static void setRateProduct ()  // Random rate
	{
		Setup.driver.findElement(By.xpath("//span[@data-value='4']"));
	}	
	
	
	public static void pushAddtoReview ()  
	{
		Setup.driver.findElement(By.xpath("//input[@value='Add my review']")).click();
	}

	public static String getItemLink ()  //  !!!!!!!!!!!
	{
		String itemLink = Setup.driver.findElement(By.xpath("//div[@class='col-sm-10 bordered']/a")).getAttribute("href");
		
		return itemLink;
	}
	
	
	
	public static void toProductDetailsPage (String productTitle)  //  !!!!!!!!!!!
	{
		
	}
	
	public static String getCurrentPrice ()  
	{
		String CurrentPrice = Setup.driver.findElement(By.xpath("//input[@id='price']")).getAttribute("value");
		
		return CurrentPrice ;
	}



}
