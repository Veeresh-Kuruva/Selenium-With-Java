package AutomationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		//no.of links in a frame
		WebElement f1 = driver.findElement(By.xpath("//*[@name='packageListFrame']"));
		List<WebElement> link = driver.switchTo().frame(f1).findElements(By.xpath("//a"));
		System.out.println(link.size());
		// print to total links
		for(int i=0;i<link.size();i++)
		{
			System.out.println(link.get(i).getAttribute("href"));
		}
		//print no.of link texts
		for(WebElement text:link)
		{
			System.out.println(text.getText());
		}
		//print only .xml texts
		for(WebElement text:link)
		{
			String txt = text.getText();
			if(txt.contains(".xml")==true)//if(txt.contains(".xml"))
					{
				System.out.println(txt);
					}
		}
        driver.quit();
	}

}
