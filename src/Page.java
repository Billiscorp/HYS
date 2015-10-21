
public class Page {
	
	public static void toLoginPage()
	
	{
		MoveAndClick.OneElement("//li[@class='link-nav']/a[@href='/auth/login']");
	}
	
		
	public static void toSignUpPage()
	
	{
		MoveAndClick.OneElement("//li[@class='link-nav']/a[@href='/auth/register']");
	}
	

}
