package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
//it is use to read the data from excel sheet
	//using file class method readexcelData() no need to write the each and every componant reddata script
	//to store generic resuable method
	//all the method are non static

	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream	fis=new FileInputStream(excelPath);//provide the path of file

		Workbook wb=WorkbookFactory.create(fis);//make the file for ready to read
		Sheet	sheet=wb.getSheet(sheetName);//get into the sheet
		Row row=sheet.getRow(rowCount);//get into the desire row
		Cell cell=row.getCell(cellCount);//get into the desire cell
		String data=cell.getStringCellValue();//read the value from the cell
		return data;



	}
	
	//it is use to get last count of row where we store the data
	public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		 int rc = sheet.getLastRowNum(); //get lastrownum is no argument method
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
	
	
	FileOutputStream fos = new FileOutputStream(excelPath);
	wb.write(fos);
	
	
	}
	
	

}


