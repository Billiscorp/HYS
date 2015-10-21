import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


		public class Page_EditProduct {
			
			  
		public static void setFieldToFile(String fileName) throws FileNotFoundException, IOException  
					
					{
			  String newTitle = "Edit Item Title"; // change to random ???
			  String newDescription = "Edit Item Description"; // change to random ???
			  String newPrice = "100"; // change to random ???
			  String newCategory = "Books & Media"; // // may be random read from file ???
			  String newSubCategory = "Books"; // // may be random read from file ???
			  String newTags = "Edit Item Tags"; // change to random ???
			  
			  
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

					}
			
			
			
			
			
			public static void setNewTitle(String newTitle) 
			
			{
				Setup.driver.findElement(By.xpath("//input[@name='title_display']")).clear();
				Setup.driver.findElement(By.xpath("//input[@name='title_display']")).sendKeys(newTitle);
			}
			
		public static void setNewDescription(String newDescription)
		{
			Setup.driver.findElement(By.xpath("//textarea[@name='description']")).clear();
			Setup.driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(newDescription);
			
		}
		
		
		public static void setNewPrice(String newPrice)
		{
			Setup.driver.findElement(By.xpath("//input[@name='price_now_value']")).clear();
			Setup.driver.findElement(By.xpath("//input[@name='price_now_value']")).sendKeys(newPrice);
		}
		
		
		public static void setNewCategory(String newCategory, String newSubCategory)
		{
			new Select(Setup.driver.findElement(By.xpath("//select[@id='topcatid']"))).selectByVisibleText(newCategory);
			new Select(Setup.driver.findElement(By.xpath("//select[@id='category_id']"))).selectByVisibleText(newSubCategory);
		}
		
		//Is this on promotion?
		
		
		public static void setNewTags(String newTags)
		{
			 Setup.driver.findElement(By.xpath("//input[@name='tags']")).clear();
			Setup.driver.findElement(By.xpath("//input[@name='tags']")).sendKeys(newTags);
		}
		
		
		public static void pushApply()
		{
			MoveAndClick.OneElement("//input[@value='Apply']");
		}
		
		
		public static void checkEdit(String fileName) throws FileNotFoundException, IOException
		{
		Setup.driver.findElement(By.xpath("//ul[@class='breadcrumbs']/li[2]/a")).equals(StringReadWrite.getProp(fileName, "newCategory"));
		Setup.driver.findElement(By.xpath("//ul[@class='breadcrumbs']/li[2]/a")).equals(StringReadWrite.getProp(fileName, "newSubCategory"));
		Setup.driver.findElement(By.xpath("//h1[contains(.,'"+StringReadWrite.getProp(fileName, "newTitle")+"')]"));
		Setup.driver.findElement(By.xpath("//p[@id='product-descr']")).equals(StringReadWrite.getProp(fileName, "newDescription"));
		Setup.driver.findElement(By.xpath("//span[contains(.,'now: £"+StringReadWrite.getProp(fileName, "newPrice")+"')]"));
		}
	

}
