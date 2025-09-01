package AutomationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofTextfunction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.fb.com");
		driver.manage().window().maximize();
		List<WebElement> text = driver.findElements(By.xpath("//a"));//all the Links text
		List<WebElement> all = driver.findElements(By.xpath("//*"));//all the elements text
		List<WebElement> txtbox = driver.findElements(By.xpath("//input"));//textbox text
		System.out.println(text.size());
		System.out.println(all.size());
		System.out.println(txtbox.size());
		/*for(int i=0;i<urls.size();i++)
		{
			System.out.println(i+" "+text.get(i).getText());
		}
		*/
		for(WebElement txt:text)
		{
			System.out.println(txt.getText());
		}
		for(WebElement txt:all)
		{
			System.out.println(txt.getText());
		}
		for(WebElement txt:txtbox)
		{
			System.out.println(txt.getText());
		}
		driver.quit();
	}

}
