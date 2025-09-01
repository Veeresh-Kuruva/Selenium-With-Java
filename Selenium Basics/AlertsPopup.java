package AutomationTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopup {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='proceed']")).click();
		Thread.sleep(2000);
        
		//importing alert
		Alert a=driver.switchTo().alert();
		Thread.sleep(1000);
		
		//print message/text in alert popup
		System.out.println(a.getText());
		
		//close the alert
		a.dismiss();
		
		driver.close();
		
		
		

	}

}
