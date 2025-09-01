package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Desktop\\Selenium Growming\\chromedriver-win64/chromedriver.exe");
        WebDriver driver=new ChromeDriver();// launch the empty chrome browser
        driver.get("https://fb.com");//launch the facebook browser window
        Thread.sleep(2000);
        
        WebElement element = driver.findElement(By.cssSelector("input[id='email']"));
        element.sendKeys("Admin");
        Thread.sleep(2000);
                
        element.clear();
        boolean displayed = element.isDisplayed();
        System.out.println(displayed);
        
        boolean enabled = element.isEnabled();
        System.out.println(enabled);
             
        WebElement pass = driver.findElement(By.cssSelector("input[id='pass']"));
        pass.sendKeys("Veeresh@12");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[name='login']")).click();
        Thread.sleep(2000);
        driver.quit();
        
        /*
         Whild/Special char's in css(^,$,*)
         ^ is used to check the element is ends-with particular char or not
         tagnamme[an^='av'] 
         
         $ is used to check the element is starts-with particular char or not
         tagnamme[an$='av'] 
         
         * is used to check the element is contains particular char or not
         tagnamme[an*='av'] 
                
         */
	}

}
