package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Read Data From Ipl Sheet?
		
		//implementation of read the data from excel
		
		//make object the fileinputstream
		//and pass the relative path a
		//store in one variable
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx" );//provide the path of file
		
		// workbookfactory is interface of apachi poi so we need to call it
		//then we call create method and pass the reference variable fis and store it in wb variable
		Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
		
		//workbook is an interface of an apache poi library
		
		Sheet sheet = wb.getSheet("IPL");//now we want sheet so we called getsheet method
		//returntype sheet interface
		Row row = sheet.getRow(3);//get into desire row
		
		Cell cell = row.getCell(1);//get into the desire the cell or column
		
		String data = cell.getStringCellValue();//read the data from cell
		
		//it is nonstatic method so we call it in print statement
		System.out.println(data);
		
		
		
		
		
		
	}

}
