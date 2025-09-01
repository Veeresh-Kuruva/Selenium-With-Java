package AutomationTesting;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenshotReuseMethod {
	public static WebDriver driver;
	
	public static void Screenshot() throws Exception
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\HOME\\Desktop\\Output\\Facebookimg.png"));
		
		
	}
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		//where we need to take screenshot in appli. store it in a file
		Screenshot();
		System.out.println("Screenshot is Taken");
		driver.close();
	}

}
