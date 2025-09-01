package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByclassCalling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		POByclass ref=new POByclass();
		driver.findElement(ref.uid).sendKeys("veeresh@gmail.com");
		driver.findElement(ref.psd).sendKeys("Veeresh@12");
		driver.findElement(ref.login).click();
	}

}
