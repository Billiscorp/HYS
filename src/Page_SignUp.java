import org.openqa.selenium.By;


public class Page_SignUp {
	
	
	public static void setUser(String user)
		
		{
			Setup.driver.findElement(By.xpath("//input[@id='name']")).sendKeys(user);
			
		}
	
	
	public static void setEmail(String email)
	
	{
		Setup.driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
	}
	
	
	public static void setPassword(String password)
		
		{
			Setup.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password); 
			
		}
	
	
	
	public static void pushSignUpButton()
		
		{
			MoveAndClick.OneElement("//input[@value='Sign up now']");
			
		}
	
	
}

