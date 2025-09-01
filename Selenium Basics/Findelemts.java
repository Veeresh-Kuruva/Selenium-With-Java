package AutomationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelemts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.fb.com");
	List<WebElement>lnk=driver.findElements(By.tagName("a"));
	System.out.println(lnk.size());
	for(int i=0;i<lnk.size();i++)
	{
		System.out.println(i+" "+ lnk.get(i).getAttribute("href"));
		//System.out.println(i+" "+link);
	}

	}

}
