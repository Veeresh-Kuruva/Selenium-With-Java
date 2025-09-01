package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Readthedatausingjxl {

	public static void main(String[] args) throws BiffException, IOException {
		//importing identified workbook
		FileInputStream f=new FileInputStream("C:\\Users\\HOME\\Downloads\\Book1.xls");
		
		//opening the identified Excel
		Workbook wb=Workbook.getWorkbook(f);
		
		//opening the identified sheet in opended workbook (column,row)
		Sheet s=wb.getSheet("Sheet1");
		//print c,r values
		System.out.println(s.getCell(0, 0).getContents());
		System.out.println(s.getCell(1,0).getContents());
		System.out.println(s.getCell(2, 2).getContents());
       // print all the row values
		int rc = s.getRows();
		int cc = s.getColumns();
		
		for(int i=0;i<s.getRows()/*rc*/;i++)
		{
			System.out.println(s.getCell(0, i).getContents());
		}
		/*
		 for(int i=0;i<s.getColumns()/;i++)
		  {
			System.out.println(s.getCell(i, 0).getContents());
		}
		 
		*/
		
	}

}
