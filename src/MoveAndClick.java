import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MoveAndClick {
	
	public static void MouseOver (String element){
		
		
		WebElement target = Setup.driver.findElement(By.xpath(element));
		((JavascriptExecutor) Setup.driver).executeScript("arguments[0].style.backgroundColor = 'red'", element);
		
		Setup.actions.moveToElement(target).build().perform();
		
		Setup.driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		Setup.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		}
	
		public static void MouseOverWB (WebElement element){
				
				((JavascriptExecutor) Setup.driver).executeScript("arguments[0].style.backgroundColor = 'red'", element);
				
				Setup.actions.moveToElement(element).build().perform();
				
				Setup.driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
				Setup.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				}
	
	
	public static void OneElement (String element){
		
	WebElement target = Setup.driver.findElement(By.xpath(element));
	((JavascriptExecutor) Setup.driver).executeScript("arguments[0].style.backgroundColor = 'red'", target);
	
	Setup.actions.moveToElement(target).build().perform();
	
	Setup.driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	Setup.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	target.click();
	
	Setup.driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	Setup.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	public static void TwoElement (String element1, String element2){
		
		WebElement target1 = Setup.driver.findElement(By.xpath(element1));
		((JavascriptExecutor) Setup.driver).executeScript("arguments[0].style.backgroundColor = 'red'", target1);
		
		WebElement target2 = Setup.driver.findElement(By.xpath(element2));
		((JavascriptExecutor) Setup.driver).executeScript("arguments[0].style.backgroundColor = 'red'", target2);
		
		Setup.actions.moveToElement(target1).build().perform();
		
		Setup.driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		Setup.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		target2.click();
		
		Setup.driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		Setup.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		}

}
