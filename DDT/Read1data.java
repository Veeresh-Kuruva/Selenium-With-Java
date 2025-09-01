package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read1data {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./Excel/Testdata1.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell1 = row.getCell(0);
		XSSFCell cell2 = row.getCell(1);
		String usn = cell1.getStringCellValue();
		String pwd = cell2.getStringCellValue();
		System.out.println(usn+" "+pwd);
		book.close();
		fis.close();
	}

}
