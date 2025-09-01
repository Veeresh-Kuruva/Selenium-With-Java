package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public WebDriver driver;
//creating the lunch application
public void launchApp(String url)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Desktop\\Selenium Growming\\chromedriver-win64/chromedriver.exe");
    driver=new ChromeDriver();// launch the empty chrome browser
    driver.get(url);
    driver.manage().window().maximize();
	}
//creating the close the application
public void closeApp()
{
	driver.quit();
	}
//creating the method to verify wheather element is available or not
public void elementavailable(String Loc,boolean exp)
{
 boolean ele = driver.findElement(By.id(Loc)).isDisplayed();

if(ele==exp)
{
System.out.println("Pass");	
}
else
{
	System.out.println("Fail");
	}
//creating the method to verify wheather element is enabled or not
}
public void elementenabled(String loc,boolean exp)
{
	boolean elementEnabled = driver.findElement(By.id(loc)).isEnabled();
	if(elementEnabled==exp)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	}
public void urlcontains(String exp,boolean res)
{
String appUrl = driver.getCurrentUrl();	
if(appUrl.contains(exp)==res)
{
System.out.println("pass");
}
else
{
	System.out.println("Fail");
	}
System.out.println(appUrl);
}

}


