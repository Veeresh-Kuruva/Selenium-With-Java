package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//importing the Actions class
		Actions a=new Actions(driver);
		
		WebElement job = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Thread.sleep(2000);
		a.moveToElement(job).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Fresher jobs']")).click();
		Thread.sleep(2000);
			
		//sending the keys from keyboards
		a.sendKeys(Keys.CONTROL+"t").perform();
		a.sendKeys(Keys.F5);
		Thread.sleep(8000);
		driver.quit();
	}

}
