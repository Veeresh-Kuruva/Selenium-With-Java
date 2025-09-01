package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select dp=new Select(day);
		Thread.sleep(2000);
		dp.selectByValue("9");
		WebElement mon = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dp2=new Select(mon);
		Thread.sleep(2000);
		dp2.selectByIndex(9);
		WebElement yr = driver.findElement(By.xpath("//select[@id='year']"));
		Select dp3=new Select(yr);
		Thread.sleep(2000);
		dp3.selectByVisibleText("2003");
		Thread.sleep(2000);
		driver.quit();
		
		
				
	}

}
