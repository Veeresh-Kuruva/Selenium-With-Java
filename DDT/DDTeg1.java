package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class DDTeg1 {

	public static void main(String[] args) throws Exception {
		FileInputStream f=new FileInputStream("C:\\Users\\HOME\\Documents\\Book2.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s= wb.getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver",s.getCell(1, 12).getContents());
		WebDriver driver = new ChromeDriver();
		driver.get(s.getCell(1, 1).getContents());
		driver.manage().window().maximize();
		Thread.sleep(2000);
driver.findElement(By.id(s.getCell(1, 4).getContents())).sendKeys(s.getCell(1, 8).getContents());
Thread.sleep(2000);
driver.findElement(By.id(s.getCell(1, 5).getContents())).sendKeys(s.getCell(1, 9).getContents());
Thread.sleep(2000);
driver.quit();
	}

}
