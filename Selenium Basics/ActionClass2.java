package AutomationTesting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		//sending the keys from keyboards
				//a.sendKeys(Keys.CONTROL+"t").perform();
				a.sendKeys(Keys.CONTROL+"t").perform();
			
				//driver.quit();

	}

}
