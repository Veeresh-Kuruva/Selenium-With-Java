package ClassTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickandOpenNewTaborWindow {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement elmt = driver.findElement(By.xpath("(//*[.='Cart'])[3]"));//*[@type="range"]
		a.contextClick(elmt).perform();
		//open link in new tab
		Robot r=new Robot();//perform the action on the browser
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}
