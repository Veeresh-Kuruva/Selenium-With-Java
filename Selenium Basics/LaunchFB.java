package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Desktop\\Selenium Growming\\chromedriver-win64/chromedriver.exe");
        WebDriver driver=new ChromeDriver();// launch the empty chrome browser
        driver.get("https://fb.com");//launch the facebook browser window
        driver.manage().window().maximize();//maximize the broser window
        driver.close();//close the broswer window
	}

}
