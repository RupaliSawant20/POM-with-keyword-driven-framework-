package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.cPage;
import Pages.javaPage;
import Utilities.XLUtils;

public class TestExcel {
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String uname, String pass, String select)
	{
			
			if(select.contentEquals("java")) {
				System.out.println("uname:" + uname);
				System.out.println("pass:" + pass);
				System.out.println("select:" + select);
				javaPage.callJava();
			}

		
	}

	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/TestData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
				
			}
				
		}
	
				
	return logindata;
	}
	
}
