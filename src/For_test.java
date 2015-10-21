import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class For_test {
	public static int pages;

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		  String estimated = "?90.00";
//		  double ValueCash = Setup.getValueCashNumeric(estimated);
//		  double sum = ValueCash+15.5;
//
//		  
//		  System.out.println("estimated = "+estimated);
//		  System.out.println("ValueCash = "+ValueCash);
//		  System.out.println("sum = "+sum);
//
//	}
	
					public static void main(String[] args) {
						
					
					if (!Setup.driver.findElements(By.xpath("//ul[@class='pagination']")).isEmpty()) 
					  {
				List<WebElement> pagination = Setup.driver.findElements(By.xpath("//ul[@class='pagination']/li/a"));
				
				pages = pagination.size();				
					  }
				else {
				pages=1;
				}
				
				System.out.println("pages = "+pages);
				
				for (int i = 1; i <= 100; i++) {
				System.out.print(i + " ");
				}
				
				List<WebElement> statusBox = Setup.driver.findElements(By.xpath(statusPath));
				
				double cashSum = 0;
				
				for(WebElement value: statusBox){
				String text = value.getText();
				System.out.println("statusValue = "+"'"+text+"'");
				double cash = Setup.getValueCashNumeric(text);
				cashSum = cashSum + cash;
				
				}
					}
}
