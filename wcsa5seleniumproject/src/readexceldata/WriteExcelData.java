package readexceldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//write the data in excel sheet

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		//to read data from excel we nned to use apache poi library 
		//and workbookfactory is interface of apache poi so we call it


		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		//Row row = sheet.getRow(1);
		Row row = sheet.createRow(11);
		//create cell by using row(0)
		Cell cell = row.createCell(0);//create new cell or column

		//it will add the value in new column or cell
		cell.setCellValue("pune");//we want to se
		//cell.setCellValue("dubai");

		//write the data we use fileoutputstream
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);






	}

}
