import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Page_AccountEarnings {
	
	public static String statusPath;
	public static int pages;
	public static double cashSum;
	
	
		public static String getSummaryEstimated () 
			
			{
			String estimated = Setup.driver.findElement(By.xpath("//div[@class='earnings']/div/div[contains(.,'estimated')]/span")).getText();
			return estimated;
			}
		
		
		
		public static String getSummaryConfirmed () 
		
		{
		String confirmed = Setup.driver.findElement(By.xpath("//div[@class='earnings']/div/div[contains(.,'confirmed')]/span")).getText();
		return confirmed;
		}
		
		
		public static String getSummaryPayable () 
				
				{
				String payable = Setup.driver.findElement(By.xpath("//div[@class='earnings']/div/div[contains(.,'my balance (payable)')]/span")).getText();
				return payable;
				}
		
		
		public static String getSummaryPaid () 
		
		{
		String paid = Setup.driver.findElement(By.xpath("//div[@class='earnings']/div/div[contains(.,'all time earnings (paid)')]/span")).getText();
		return paid;
		}
		
		
//		public static String getStatusConfirmedSum () 
//				
//				{
//				
//				return statusConfirmedSum;
//				}
		
		
//		public static double getStatusSum (String status) 
//		
//		{
//			if (status == "Available")
//			{
//			statusPath = "//td[contains(.,'Available')]/../td[5]";
//			System.out.println("status = "+"'"+status+"'");
//			}
//			if (status == "Rejected")
//			{
//			statusPath = "//td[contains(.,'Rejected')]/../td[5]";
//			System.out.println("status = "+"'"+status+"'");
//			}
//			if (status == "Confirmed")
//			{
//			statusPath = "//td[contains(.,'Confirmed')]/../td[5]";
//			System.out.println("status = "+"'"+status+"'");
//			System.out.println("");
//			}
//			
//			List<WebElement> statusBox = Setup.driver.findElements(By.xpath(statusPath));
//			
//			double cashSum = 0;
//			
//			for(WebElement value: statusBox){
//				String text = value.getText();
//	System.out.println("statusValue = "+"'"+text+"'");
//				double cash = Setup.getValueCashNumeric(text);
//				cashSum = cashSum + cash;
//				
//			}
//	
//		return cashSum;
//		}
		
		
		
		
		public static double getStatusSum (String status) 
		
		{
			if (status == "Available")
			{
			statusPath = "//td[contains(.,'Available')]/../td[5]";
			System.out.println("status = "+"'"+status+"'");
			}
			
			if (status == "Estimated")
			{
			statusPath = "//td[contains(.,'Estimated')]/../td[5]";
			System.out.println("status = "+"'"+status+"'");
			}
			
			if (status == "Rejected")
			{
			statusPath = "//td[contains(.,'Rejected')]/../td[5]";
			System.out.println("status = "+"'"+status+"'");
			}
			
			if (status == "Confirmed")
			{
			statusPath = "//td[contains(.,'Confirmed')]/../td[5]";
			System.out.println("status = "+"'"+status+"'");
			}
			
			if (!Setup.driver.findElements(By.xpath("//ul[@class='pagination']")).isEmpty()) 
					  {
				  List<WebElement> pagination = Setup.driver.findElements(By.xpath("//ul[@class='pagination']/li/a"));
				  
				  pages = pagination.size();				
				  	  }
			else {
				pages=1;
			}
			  
			  System.out.println("pages = "+pages);
			
			  
			  cashSum = 0;
			  for (int i = 1; i <= pages; i++) {
				  
				  MoveAndClick.OneElement("//ul[@class='pagination']/li/a[@href='/account/earnings/10/"+i+"']");
				  System.out.println("page = "+i);
				  
				  List<WebElement> statusBox = Setup.driver.findElements(By.xpath(statusPath));
					
					for(WebElement value: statusBox){
						String text = value.getText();
			System.out.println("statusValue = "+"'"+text+"'");
						double cash = Setup.getValueCashNumeric(text);
						cashSum = cashSum + cash;
						
					}
				}
			  return cashSum;
			
			
		}
		
		
		
		

		
		

}


