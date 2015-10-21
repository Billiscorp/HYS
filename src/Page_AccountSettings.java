import org.openqa.selenium.By;


public class Page_AccountSettings {
	
//	public static void SettingsPage()  
//	
//	{
//	MoveAndClick.TwoElement(HomePage.toSettings();,AccountMenu.Settings());
//	}
	
//	 move to Run.java 
	
	
	public static void setName() 
		
		{
		String name = StringReadWrite.readRandomString("Name.txt")+""+StringReadWrite.readRandomString("LastName.txt");
		Setup.driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name); 
		}
	
	
	public static String setDisplayName(String displayName) 
	
	{
		Setup.driver.findElement(By.xpath("//input[@name='display_name']")).sendKeys(displayName); 
		
		return displayName ;
	}
	
	
	public static String setEmail(String email) 
		
		{
		Setup.driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
			
		return email ;
		}
	
		
	public static String setLocationCity(String city) 
	
	{
		Setup.driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		
		return city ;
	}
	
	public static String setLocationCountry(String country) 
		
		{
		Setup.driver.findElement(By.xpath("//select[@name='country']")).sendKeys(country);
			
			return country ;
		}
		
	
	
	public static String setAge(String country) 
	
	{
	String age = "";
//		
//		 under 18	driver.findElement(By.xpath("//label[@for='age18']"));
//		 18-24		driver.findElement(By.xpath("//label[@for='age18_24']"));
//		 25-34		driver.findElement(By.xpath("//label[@for='age25_34']"));
//		 35-44		driver.findElement(By.xpath("//label[@for='age35_44']"));
//		 45-65		driver.findElement(By.xpath("//label[@for='age45_65']"));
//		 65+ 		driver.findElement(By.xpath("//label[@for='age65']"));
//		
//		
		return age ;
	}
	
	
//	public static String ProfilePicture() 
//		
//		{
//	//	String picture = "//ul[@class='dropdown-menu']/li/a[@href='/auth/logout']";
//			
//			return picture ;
//		}
	
//	public static String Password() 
//	
//	{
//	String password = "//ul[@class='dropdown-menu']/li/a[@href='/auth/logout']";
//		
//		return password ;
//	}
	
	
	
//	Tailor recommendations for
//
//	 A guy
//	A gal
//	Unspecified
	
	public static void pushApplyProfileSettingsButton()
		
		{
			MoveAndClick.OneElement("//a[@id='submit-profile-settings-link']");  
			
		}
	
	
//	Social network settings
//	Twitter
//	Facebook
//	Google
	
//	Site settings
//	Show popup tooltips
	
	
	public static void pushApplySiteSettingsButton()
	
	{
//		MoveAndClick.OneElement("//input[@value='Log in now']");
		
	}
	
//	Payments settings 
//	Paypal account

}
