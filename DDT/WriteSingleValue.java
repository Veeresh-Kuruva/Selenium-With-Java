package DDT;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSingleValue {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("TestData2.xlsx");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Admin123");
		FileOutputStream fos=new FileOutputStream("./Excel/Testdata2.xlsx");
		book.write(fos);
		book.close();
		fos.close();
		System.out.println("Data is created");
		

	}

}
