package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorID {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Desktop\\Selenium Growming\\chromedriver-win64/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();// launch the empty chrome browser
	        driver.get("https://fb.com");//launch the facebook browser window
	        Thread.sleep(2000);
	        driver.manage().window().maximize();//maximize the broser window
	        Thread.sleep(2000);
	        driver.findElement(By.id("email")).sendKeys("veeresh@gmail.com");
	        Thread.sleep(2000);
	        driver.findElement(By.id("pass")).sendKeys("Veeresh@123");
	        Thread.sleep(2000);
	        driver.findElement(By.id("email")).clear();
	        Thread.sleep(2000);
	        driver.close();
	}

}
