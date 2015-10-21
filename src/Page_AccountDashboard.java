import org.openqa.selenium.By;


public class Page_AccountDashboard {
	
	public static void checkCurrencyEarnings (String local)
	{
		String currencyEarnings = Setup.driver.findElement(By.xpath("//div[@data-tip='Total of estimated and confirmed earnings']/span")).getText();
		Setup.checkCurrency(local, currencyEarnings);
	}
	
	public static void checkCurrencyMybalance (String local)
	{
		String currencyMybalance = Setup.driver.findElement(By.xpath("//div[@data-tip='When your balance has reached the minimum of £20, you will be able to withdraw your money']/span")).getText();
		Setup.checkCurrency(local, currencyMybalance);
	}
	
	
		
			

}
