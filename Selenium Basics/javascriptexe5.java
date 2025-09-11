package ClassTasks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexe5 {

	public static void main(String[] args) throws Exception {
		// zoom in and zoom out/increase the page and decrease the page
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='500%'");//increase the page
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='15%'");// decrease the page
		driver.quit();

	}

}
