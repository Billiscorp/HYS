import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Bookmarks {
	
	
public static void AddItem (String local)
	{
	((JavascriptExecutor) Setup.driver).executeScript("if(top['bookmarklet-url@http://"+local+"']){top['bookmarklet-url@http://"+local+"'];}else{var e=document.createElement('script');e.setAttribute('type','text/javascript');e.setAttribute('charset','UTF-8');e.setAttribute('src','http://"+local+"/js/shareit-button.js?r='+Math.random()*99999999);document.body.appendChild(e);void(0);}");
	}

public static void pushLoginButton()
	{
	MoveAndClick.OneElement("//button[@type='submit']");
	}

public static void pushCorrect ()    
	{	
	Setup.driver.findElement(By.xpath("//input[@value='Yes']")).click();
	}



}
