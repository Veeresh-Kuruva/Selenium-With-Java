package AutomationTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenshot1 {

	public static void main(String[] args)throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://fb.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//where we need to take screenshot in appli. store it in a file
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy the file to another new file
		//Files.copy(f, new File("C:\\Users\\HOME\\Desktop\\Output\\fb.png"));
		Files.copy(f, new File("C:\\Users\\HOME\\Desktop\\Output\\"+driver.getTitle()+".png"));
		Thread.sleep(2000);
		driver.close();

	}

}
