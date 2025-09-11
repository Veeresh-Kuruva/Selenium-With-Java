package ClassTasks;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptexcector1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");//scroll vertically in down direction
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");//scroll vertically in up direction
		Thread.sleep(2000);
		
		
		
		driver.quit();
	

	}

}
