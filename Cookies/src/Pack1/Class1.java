package Pack1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","D:\\Desktop and Download Data\\Desktop\\Selenium\\Gecko Driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com");
	    Set<Cookie> cook =driver.manage().getCookies();
	    for(Cookie c:cook)
	    {
	    	System.out.println(c.getName()+" "+c.getValue());
	    }
		Cookie co=new Cookie("CustomCookie","#1W90A");
		driver.manage().addCookie(co);
		cook =driver.manage().getCookies();
		System.out.println("New Cookies are");
		for(Cookie c:cook)
	    {
	    	System.out.println(c.getName()+" "+c.getValue());
	    }
	    //driver.manage().deleteCookie(co);
		driver.manage().deleteCookieNamed("CustomCookie");
	    cook =driver.manage().getCookies();
		System.out.println("New Cookies are");
		for(Cookie c:cook)
	    {
	    	System.out.println(c.getName()+" "+c.getValue());
	    }
	    driver.manage().deleteAllCookies();
	    cook =driver.manage().getCookies();
		
	    System.out.println("New Cookies are");
	    
		for(Cookie c:cook)
	    {
	    	System.out.println(c.getName()+" "+c.getValue());
	    }
	}
}
