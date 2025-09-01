package DDT;

import java.io.FileInputStream;


import jxl.Sheet;
import jxl.Workbook;

public class Readthedatabothcr {

	public static void main(String[] args) throws Exception {
		FileInputStream f=new FileInputStream("C:\\Users\\HOME\\Downloads\\Book1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s= wb.getSheet("Sheet1");
		int rc = s.getRows();
		int cc = s.getColumns();
		
		for(int i=0;i<rc;i++)
		{
			for(int j=0;j<cc;j++)
			{
				System.out.print(s.getCell(j, i).getContents()+" ");
			}
			System.out.println();
		}
		
	}

}
