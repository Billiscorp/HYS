import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class RandomItem {
	
	public static WebDriver driver;
	
	public static String ParserAmazonUS ()
	{
	
		driver = new FirefoxDriver();
//		driver.get(hostName);
		driver.get("http://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Dstripbooks&field-keywords=");
				
//		List<WebElement> category = driver.findElements(By.xpath("//select[@class='searchSelect']/option"));
//		List<String> category_Title = new ArrayList<String>();
//		
//		for(WebElement title: category){
//			String text = title.getText();
//System.out.println("Category Title = "+"'"+text+"'");
//			category_Title.add(text);
//		}
//		
//		
//					int category_size = category.size();
//System.out.println("category size = "+category_size);	
//					int ran_cat = (int)((Math.random()*category_size));
//System.out.println("ran_cat = "+ran_cat);
//					String category_Select = category_Title.get(ran_cat);
//System.out.println("Random ran_cat urls = "+category_Select);
//					new Select(driver.findElement(By.xpath("//select[@class='searchSelect']"))).selectByVisibleText(category_Select);
		
		
//		new Select(driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']"))).selectByVisibleText("Books");	
//		driver.findElement(By.xpath("//input[@title='Go']"));
		
	List<WebElement> item_links = driver.findElements(By.xpath("//a[@class='title ntTitle noLinkDecoration']"));
	List<String> item_urls = new ArrayList<String>();
	
	for(WebElement url: item_links){
		String test = url.getAttribute("href");
//		String text = url.getText();
//System.out.println("Brand link "+"'"+text+"'"+" = "+test);
		item_urls.add(test);
	}
	
	int size = item_urls.size();
//	System.out.println("size = "+size);	
				int ran = (int)((Math.random()*size));
//	System.out.println("ran = "+ran);
									String u = item_urls.get(ran);
//	System.out.println("Random item urls = "+u);
									
	driver.quit();
	
	return u; // add text
	
	}
	
	
	
	public static String ParserAmazonUK ()
	{
	
		driver = new FirefoxDriver();
//		driver.get(hostName);
		driver.get("http://www.amazon.co.uk/s/ref=nb_sb_noss?url=search-alias%3Dstripbooks&field-keywords=");
				
//		List<WebElement> category = driver.findElements(By.xpath("//select[@class='searchSelect']/option"));
//		List<String> category_Title = new ArrayList<String>();
//		
//		for(WebElement title: category){
//			String text = title.getText();
//System.out.println("Category Title = "+"'"+text+"'");
//			category_Title.add(text);
//		}
//		
//		
//					int category_size = category.size();
//System.out.println("category size = "+category_size);	
//					int ran_cat = (int)((Math.random()*category_size));
//System.out.println("ran_cat = "+ran_cat);
//					String category_Select = category_Title.get(ran_cat);
//System.out.println("Random ran_cat urls = "+category_Select);
//					new Select(driver.findElement(By.xpath("//select[@class='searchSelect']"))).selectByVisibleText(category_Select);
		
		
//		new Select(driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']"))).selectByVisibleText("Books");	
//		driver.findElement(By.xpath("//input[@title='Go']"));
		
	List<WebElement> item_links = driver.findElements(By.xpath("//a[@class='title ntTitle noLinkDecoration']"));
	List<String> item_urls = new ArrayList<String>();
	
	for(WebElement url: item_links){
		String test = url.getAttribute("href");
//		String text = url.getText();
//System.out.println("Brand link "+"'"+text+"'"+" = "+test);
		item_urls.add(test);
	}
	
	int size = item_urls.size();
//	System.out.println("size = "+size);	
				int ran = (int)((Math.random()*size));
//	System.out.println("ran = "+ran);
									String u = item_urls.get(ran);
//	System.out.println("Random item urls = "+u);
									
	driver.quit();
	
	return u; // add text
	
	}
	
	
	public static String[] ParserHYS ()
	{
		
		String text = "";
		
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
									
	driver.quit();
	
	return new String[]{u,text};
//	return u; // add text
	
	
	}
	
//	public static String ParserKobobooks()
//	{
//	
//		driver = new FirefoxDriver();
//
//		driver.get("http://store.kobobooks.com/Collection/kobo-next-discover-a-new-series");
//
//		
//	List<WebElement> item_links = driver.findElements(By.xpath("//h3[@class='book-title']/a"));
//	List<String> item_urls = new ArrayList<String>();
//	
//	for(WebElement url: item_links){
//		String test = url.getAttribute("href");
////		String text = url.getText();
////System.out.println("Brand link "+"'"+text+"'"+" = "+test);
//		item_urls.add(test);
//	}
//	
//	int size = item_urls.size();
//	System.out.println("size = "+size);	
//				int ran = (int)((Math.random()*size));
//	System.out.println("ran = "+ran);
//									String u = item_urls.get(ran);
//	System.out.println("Random item urls = "+u);
//									
//	driver.quit();
//	
//	return u; // add text
//	
//	}
	
	
	public static String ParserKobobooks()
	{
	
		driver = new FirefoxDriver();

//		driver.get("http://www.kobobooks.com/browse.html");
		driver.get("http://www.kobobooks.com/browse/Mystery__Suspense/BQ0gbc10FU26-n_Jodt6yA-1.html");
		
		
		int pages = Integer.parseInt(driver.findElement(By.xpath("//li[@class='PageNumberItem']/span[@class='SCPagingNumTotalPages']")).getText());
		System.out.println("pages: "+pages);
		
		int ranPages = (int)((Math.random()*pages));
		System.out.println("Random page: "+ranPages);
		
		driver.get("http://www.kobobooks.com/browse/Mystery__Suspense/BQ0gbc10FU26-n_Jodt6yA-"+ranPages+".html");
		
		List<WebElement> books = driver.findElements(By.xpath("//div[@class='SCItemHeader']/h3/a"));
	
//		List<WebElement> category = Setup.driver.findElements(By.xpath("//h3[@class='book-title']/a"));
//		((JavascriptExecutor) Setup.driver).executeScript("arguments[0].style.backgroundColor = 'red'", category);
		
		for(WebElement book: books){
			String url = book.getAttribute("href");
			String titleBook = book.getText();
			System.out.println("Book title : "+titleBook);
			System.out.println("Book url : "+url);
			System.out.println("*******************************");
		
		}
		
		int size = books.size();
System.out.println("All count books on page = "+size);	
		int ranBook = (int)((Math.random()*size));
System.out.println("ranBook = "+ranBook);
		String ranTitle = books.get(ranBook).getText();
System.out.println("Random item title = "+ranTitle);
		String ranUrl = books.get(ranBook).getAttribute("href");
System.out.println("Random item urls = "+ranUrl);
										
		driver.quit();
		
		
	return ranUrl; // add text
	
	}
	
	
	public static String ParserEbooks()
	{
	
		driver = new FirefoxDriver();

//		driver.get("http://www.kobobooks.com/browse.html");
//		driver.get("http://www.ebooks.com/subjects/fantasy/"); // easy to make reading from the file categories
		
		int ranPages = (int)((Math.random()*10));
		System.out.println("Random page: "+ranPages);
		
		driver.get("http://www.ebooks.com/subjects/fantasy/?sortBy=&sortOrder=&RestrictBy=&countryCode=ua&page="+ranPages);
		
		List<WebElement> books = driver.findElements(By.xpath("//span[@class='book-title']/a"));
	
//		List<WebElement> category = Setup.driver.findElements(By.xpath("//h3[@class='book-title']/a"));
//		((JavascriptExecutor) Setup.driver).executeScript("arguments[0].style.backgroundColor = 'red'", category);
		
		for(WebElement book: books){
			String url = book.getAttribute("href");
			String titleBook = book.getText();
			System.out.println("Book title : "+titleBook);
			System.out.println("Book url : "+url);
			System.out.println("*******************************");
		
		}
		
		int size = books.size();
System.out.println("All count books on page = "+size);	
		int ranBook = (int)((Math.random()*size));
System.out.println("ranBook = "+ranBook);
		String ranTitle = books.get(ranBook).getText();
System.out.println("Random item title = "+ranTitle);
		String ranUrl = books.get(ranBook).getAttribute("href");
System.out.println("Random item urls = "+ranUrl);
										
		driver.quit();
		
		
	return ranUrl; // add text
	
	}
	
	
}