package dataproviderq;

import org.testng.annotations.DataProvider;

public class DataProviders {
@DataProvider(name="InvlaidUserCredentials")
public Object[][] verify_usercredentials()
{
	
	Object[][] data =new Object[3][2];
	data[0][0]="afgej";
	data[0][1]=	"123456";
	
	
	data[1][0]="admin";
	data[1][1]="ammi";
	
	data[2][0]="afgej";
	data[2][1]="ammi";	
	
	
	return data;
	
}


}
