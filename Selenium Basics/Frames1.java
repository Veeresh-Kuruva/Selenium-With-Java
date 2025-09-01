package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		WebElement f1 = driver.findElement(By.xpath("//*[@name='packageListFrame']"));
       // WebElement f2 = driver.findElement(By.xpath("//*[@name='packageFrame']"));
        
        driver.switchTo().frame(f1).findElement(By.xpath("//*[@href='java/awt/package-frame.html']")).click();
        
        Thread.sleep(20000);
        driver.close();
		
		
		
	}

}
