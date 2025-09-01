package DDT;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.List;

public class WriteMultipledata {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Links");
		
		java.util.List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			XSSFRow row = sheet.createRow(i);
			XSSFCell cell = row.createCell(0);
		}
		FileOutputStream fos=new FileOutputStream("./Excel/Flicart.xlsx");
		book.write(fos);
		book.close();
		fos.close();
		System.out.println("data is created");
		
	}

}
