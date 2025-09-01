package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		//importing the Actions class
		Actions a=new Actions(driver);
		WebElement dc = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		a.doubleClick(dc).perform();
		Thread.sleep(2000);
		WebElement rc = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		a.contextClick(rc).perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
