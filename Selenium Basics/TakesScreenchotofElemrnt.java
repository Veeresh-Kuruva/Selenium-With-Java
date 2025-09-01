package AutomationTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenchotofElemrnt {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement logo = driver.findElement(By.cssSelector("*[alt='Facebook']"));
		File f=logo.getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\\\Users\\\\HOME\\\\Desktop\\\\Output\\\\Facebookelement.png"));
		driver.close();
		
		
		
		
	}

}
