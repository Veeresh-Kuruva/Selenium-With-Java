package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://fb.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Veereshkuruva880@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Veeresh@12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
		//Thread.sleep(5000);
		driver.quit();
	}

}
