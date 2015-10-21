import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Setup {
	
	public static WebDriver driver;
	public static Actions actions;
	public static String hostName;
	public static String currency;
	
	
public static void selectHost (String flag,String server) 
	
	{
	
//	Dev server
	if ((flag == "US") && (server == "dev"))
	{
		
	}
	
	if ((flag == "UK") && (server == "dev"))
	{
	hostName = "http://dev:hys!dev@dev.haveyouseen.co.uk";
	}
	
	
	
	
//	Stage
	if ((flag == "US") && (server == "stage"))
		{
		hostName = "http://dev:hys!dev@stage-us.haveyouseen.com";
		}
	
	if ((flag == "UK") && (server == "stage"))
	{
	hostName = "http://dev:hys!dev@stage.haveyouseen.com/";
	}
	
	if ((flag == "") && (server == "stage"))
	{
	hostName = "http://dev:hys!dev@stage.haveyouseen.com";
	}
	
	
//	Pre-Live
	if ((flag == "US") && (server == "pre-live"))
	{
	hostName = "http://usa:exclusive@www.us.haveyouseen.com";
	}
		
	if ((flag == "UK") && (server == "pre-live"))
	{
	hostName = "http://dev:hys!dev@prelive-uk.haveyouseen.com";
	}
	
//	if ((flag == "") && (server == "live"))
//	{
//	hostName = "http://haveyouseen.com";
//	}
	
	
	
	
	
	
	
//	Live
	if ((flag == "US") && (server == "live"))
	{
	hostName = "http://www.haveyouseen.com";
	}
		
	if ((flag == "UK") && (server == "live"))
	{
	hostName = "http://www.haveyouseen.co.uk";
	}
	
//	if ((flag == "") && (server == "live"))
//	{
//	hostName = "http://haveyouseen.com";
//	}
	
	
	
	
	
	
		
			Setup.driver.get(hostName);
			
		
		
	}
	
		public static void init () 
		
		{
			driver = new FirefoxDriver();
			actions = new Actions(driver);
			driver.manage().window().maximize();
		
			
		}
		
		
		public static void close () 
		
		{
			driver.quit();
		}
		

		public static void Activate (String hostName)  // Header ? Button?
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.google.com/");
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("tpcdealer@gmail.com");
			driver.findElement(By.xpath("//input[@id='next']")).click();
			driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("welovetpc123");
			driver.findElement(By.xpath("//input[@id='signIn']")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//span[@id]//b[contains(text(),'Please confirm your haveyouseen account')]")).click();

			String VerUrl = "";

			if (hostName.contains("stage"))
				{
				VerUrl = (driver.findElement(By.xpath("//a[contains(.,'Verify my account')]")).getAttribute("href")).replace("http://", "http://dev:hys!dev@");
				}
			if (hostName.contains("dev"))
			{
			VerUrl = (driver.findElement(By.xpath("//a[contains(.,'Verify my account')]")).getAttribute("href")).replace("http://", "http://dev:hys!dev@");
			}
				else {
					VerUrl = (driver.findElement(By.xpath("//a[contains(.,'Verify my account')]")).getAttribute("href")); // for Live
					 }

			driver.get(VerUrl);
						
			driver.findElement(By.xpath("//p[contains(.,'Thank you for confirming your email address. You will now be able to withdraw any earnings from the site.')]"));
			 			
						
		}
		
		
		public static String getAuthToken (String url_token, String param) {
			
			String result = "";
			
System.out.println("url_token = "+url_token);
System.out.println("param = "+param);
		
			param = param + "=";
			int stringLength = url_token.length();
			int startPar = url_token.indexOf(param);
			String newString = url_token.substring(startPar, stringLength);
//			int newStringLenght = newString.length();
//			int nextPar = newString.indexOf("&");
			
			result = newString.substring(newString.indexOf("=") + 1);

	return result;
	
	
}
		
		public static double getValueCashNumeric (String cash) {
					
			int stringCash = cash.length();
			
			double ValueCash = Double.parseDouble(cash.substring(1, stringCash));
			
			return ValueCash;
			
			
		}
		
		
		public static void checkCurrency (String flag, String currencyValue)
		{
		if (flag == "UK")
			{
			currency = "£";
			}
		
		
		if (flag == "US")
			{
			currency = "$";
			}
		
		System.out.println("location = "+flag);
		System.out.println("currency = "+currency);
		System.out.println("Value = "+currencyValue);
		
		if (!currencyValue.contains(currency))
		{
			System.out.println("Failed! Value of currency:"+currency+" does not match the location !!!");
		}
		
		System.out.println("Ok. Value currency:"+currency+" corresponds to the location !!!");
		
		}

		
		

}
