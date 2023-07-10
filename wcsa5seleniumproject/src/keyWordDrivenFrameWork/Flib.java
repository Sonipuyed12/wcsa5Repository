package keyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//read the data from excel sheet
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException

	{
		FileInputStream fis = new FileInputStream(excelPath);	

		Workbook wb = WorkbookFactory.create(fis);//ready to read

		Sheet sheet = wb.getSheet(sheetName);

		Row row = sheet.getRow(rowCount);

		Cell cell = row.getCell(cellCount);

		String data = cell.getStringCellValue();

		return data;



	}


	////it is use to get last count of row where we store the data
	public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;

	}
	////it is use to write the data into excel sheet

	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws IOException
	{

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);

         //add data 
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);


	}


	//it is use to read data from property file


	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);

		//creat obj of property
		Properties prop = new Properties();

		//make file ready to read
		prop.load(fis);

		//read the perticular key from file

		String data = prop.getProperty(key);
		return data;

	}

}
