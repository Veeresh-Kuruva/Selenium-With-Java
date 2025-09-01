package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpatheg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='onlineId1']")).sendKeys("#######");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passcode1']")).sendKeys("@@@@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ id='signIn']")).click();
		Thread.sleep(8000);
		driver.quit();

	}

}
