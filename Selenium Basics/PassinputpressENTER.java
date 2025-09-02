package ClassTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PassinputpressENTER {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://https://www.google.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement elmt = driver.findElement(By.xpath("//*[@name=\"q\"]"));
		a.sendKeys(elmt, "iphone").perform();
		elmt.sendKeys(Keys.ENTER);
		//a.sendKeys(elmt, "iphone"+keys.ENTER).perform();
		//tab sequence(Alt)
		a.sendKeys(elmt, "iphone"+Keys.TAB+Keys.TAB+Keys.ENTER).perform();
		
	}

}
