package utilties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilityQ
{
	public static FileInputStream f;
    public static XSSFWorkbook w;
     public static XSSFSheet s;

public static String get_String_Data(int row, int column,String sheet) throws IOException

{
f= new FileInputStream("C:\\Users\\gladi\\eclipse-workspace\\QA_Legend\\src\\test\\resources\\Testdata.xlsx");
w=new XSSFWorkbook (f);
s=w.getSheet(sheet);
XSSFRow r=s.getRow(row);
XSSFCell c=r.getCell(column);
return c.getStringCellValue();
}

public static String get_Integer_Data(int row,int column,String sheet) throws IOException
{
	f=new FileInputStream("\"C:\\Users\\gladi\\eclipse-workspace\\QA_Legend\\src\\test\\resources\\Testdata.xlsx");
	w=new XSSFWorkbook(f);
	s=w.getSheet(sheet);
	XSSFRow r=s.getRow(row);
	XSSFCell c=r.getCell(column);
	int a=(int) c.getNumericCellValue();
	return String.valueOf(a);
}
}


