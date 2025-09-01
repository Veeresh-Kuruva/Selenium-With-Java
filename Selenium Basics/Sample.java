package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Desktop\\Selenium Growming\\chromedriver-win64/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.close();
	}
	

}
