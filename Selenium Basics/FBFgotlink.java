package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBFgotlink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://fb.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		Thread.sleep(4000);
		driver.quit();
	}
	

}
