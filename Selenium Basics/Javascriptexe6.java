package ClassTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import grommingsession.Webelement;

public class Javascriptexe6 {

	public static void main(String[] args)throws Exception {
		// Hilight the element in the border
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		Webelement elt=(Webelement) driver.findElement(By.xpath("(//*[contains(text(),'Fresh')])[2]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid Yellow'",elt);
		Thread.sleep(2000);

	}

}
