package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Internetspeed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://fast.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		String speed = driver.findElement(By.id("speed-value")).getText();
		String mbps = driver.findElement(By.id("speed-units")).getText();
		Thread.sleep(4000);
		System.out.println(speed+" "+mbps);
		driver.quit();
	}

}
