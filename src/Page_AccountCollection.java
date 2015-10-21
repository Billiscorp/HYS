//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;


public class Page_AccountCollection {
	
	public static void selectCollection (String CollectionName)  
	{
		MoveAndClick.TwoElement("//h4[contains(.,'"+CollectionName+"')]/../../../..//div[@class='product collections']", "//span[@class='img-link']");
	
//	if (driver.findElements(By.xpath("//a[contains(.,'"+ranProductUrl+"')]")).isEmpty())
//	if (driver.findElements(By.xpath("//a[@href='"+ranProductUrl+"']/../../div[@class='product']")).isEmpty())
	}
	
	
	
	

}
