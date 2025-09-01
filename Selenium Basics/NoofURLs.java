package AutomationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofURLs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.fb.com");
		driver.manage().window().maximize();
		List<WebElement> urls = driver.findElements(By.xpath("//a"));
		System.out.println(urls.size());
		for(int i=0;i<urls.size();i++)
		{
			System.out.println(i+" "+urls.get(i).getAttribute("href"));
		}
		
		driver.quit();
	}

}
