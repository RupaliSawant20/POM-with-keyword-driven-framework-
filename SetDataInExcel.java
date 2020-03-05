package TestCases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.cPage;
import Pages.javaPage;
import Utilities.XLUtils;

public class SetDataInExcel {
	@Test()
	public void loginDDT() throws IOException
	{
	/*	String path=System.getProperty("user.dir")+"/src/TestData/LoginData1.xlsx";
		XLUtils.setCellData(path, "abc");*/
		File file=new File("D:/workspace/DataDriven/src/TestData/LoginData1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet();
		sh.createRow(0).createCell(0).setCellValue("abc");
		sh.getRow(0).createCell(1).setCellValue("xyz");
		sh.getRow(0).createCell(2).setCellValue("dhfwe");
		sh.createRow(1).createCell(0).setCellValue("xyz");
		sh.getRow(1).createCell(1).setCellValue("ihihi");
		try {
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	
}
