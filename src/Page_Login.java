import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Page_Login {
	
	
	public static void setUser(String userName)
	
	{
		Setup.driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName); 
		
	}
	
	
	public static void setPassword(String password)
		
		{
		Setup.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password); 
			
		}
	
	
	public static void pushLoginButton()
	
	{
		MoveAndClick.OneElement("//input[@value='Log in now']");
		
	}
	
	
	public static void VerLogin()
		
		{
		WebElement VerLogin = Setup.driver.findElement(By.xpath("//h1[contains(.,'Welcome to the haveyouseen community!')]"));
		((JavascriptExecutor) Setup.driver).executeScript("arguments[0].style.backgroundColor = 'red'", VerLogin);
		}
		
	

}
