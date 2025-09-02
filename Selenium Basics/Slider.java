package ClassTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/slider");
		driver.manage().window().maximize();
		WebElement elmt = driver.findElement(By.xpath("//*[@type=\"range\"]"));
		Actions a=new Actions(driver);
		a.clickAndHold(elmt).perform();
		a.moveByOffset(10, 0).perform();
		Thread.sleep(2000);
		a.release(elmt).perform();
	}

}
