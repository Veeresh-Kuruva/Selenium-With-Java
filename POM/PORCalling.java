package POM;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import jxl.Sheet;
import jxl.Workbook;

public class PORCalling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FileInputStream f=new FileInputStream("C:\\Users\\HOME\\Documents\\Book2.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s= wb.getSheet("Sheet1");
		
		PORTeg p = PageFactory.initElements(driver,PORTeg.class );
		p.uid.sendKeys(s.getCell(1, 8).getContents());
		p.pass.sendKeys(s.getCell(1, 9).getContents());
	}

}
