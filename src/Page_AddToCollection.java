
import org.openqa.selenium.By;


public class Page_AddToCollection {
	
	public static void setNameCollection(String NameCollection) 
	
	{
//	String name = StringReadWrite.readRandomString("Name.txt")+""+StringReadWrite.readRandomString("LastName.txt");
//	Setup.driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name); 
	}
	
	public static void setTagCollection(String TagCollection) 
		
		{
	//	String name = StringReadWrite.readRandomString("Name.txt")+""+StringReadWrite.readRandomString("LastName.txt");
	//	Setup.driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name); 
		}
	
	public static void selectExistCollection(String existCollection) //'Test collection'
	
	{
		Setup.driver.findElement(By.xpath("//span[contains(.,'"+existCollection+"')]")).click(); // Hard code
	}
	

	
	public static void selectVisibility(String existCollection) 
		
		{
	//	String name = StringReadWrite.readRandomString("Name.txt")+""+StringReadWrite.readRandomString("LastName.txt");
	//	Setup.driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name); 
		}
	
	public static void pushCreate(String existCollection) 
	
	{
		
	}
	
	
	public static void pushAdd() 
		
		{
			MoveAndClick.OneElement("//a[contains(.,'Add it')]");
		}
	

}
