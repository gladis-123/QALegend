package utilties;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constants;

public class ExcelUtilityQ
{
	public static FileInputStream f;
    public static XSSFWorkbook w;
     public static XSSFSheet s;

public static String get_String_Data(int row, int column,String sheet)

{
	try
	{
		String path=Constants.HOMEDIRECTORY+Constants.TESTDATAEXELPATH;
f= new FileInputStream(path);
w=new XSSFWorkbook (f);
s=w.getSheet(sheet);
XSSFRow r=s.getRow(row);
XSSFCell c=r.getCell(column);
return c.getStringCellValue();
}
catch(Exception e)
	{
	throw new RuntimeException("Exelsheet not found");
	}
}
public static String get_Integer_Data(int row,int column,String sheet) throws IOException
{
	try
	{
		String path=Constants.HOMEDIRECTORY+Constants.TESTDATAEXELPATH;
	f=new FileInputStream(path);
	w=new XSSFWorkbook(f);
	s=w.getSheet(sheet);
	XSSFRow r=s.getRow(row);
	XSSFCell c=r.getCell(column);
	int a=(int) c.getNumericCellValue();
	return String.valueOf(a);
	}
	catch(Exception e)
	{
	throw new RuntimeException("Exelsheet not found");
	}
}

}

