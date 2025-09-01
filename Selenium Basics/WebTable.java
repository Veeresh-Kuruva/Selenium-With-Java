package AutomationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	   WebElement table = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
       
	   List<WebElement> th = driver.findElements(By.tagName("th"));
       
	   List<WebElement> tr = table.findElements(By.tagName("tr"));
       
	   List<WebElement> td = table.findElements(By.tagName("td"));
       
	   System.out.println("No.of columns :"+th.size());
       System.out.println("No.of rows :"+tr.size());
       System.out.println("No.of data present in table :"+td.size());
       Thread.sleep(2000);
       //read all the rows values from first column in table?
      List<WebElement> text = table.findElements(By.tagName("a"));
      for(int i=0;i<text.size();i++)
      {
    	  System.out.println(text.get(i).getText());
      }
       
       driver.quit();
	}

}
