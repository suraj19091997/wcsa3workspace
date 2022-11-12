package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//generic reusable method
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//getting the specified file for read operation
		Workbook wb = WorkbookFactory.create(fis);//it makes the file ready for read operation
		Sheet sh = wb.getSheet(sheetName);//it specifies which sheet
		Row row = sh.getRow(rowCount);//specifies the row 
		Cell cell = row.getCell(cellCount);//specifies column
		String data = cell.getStringCellValue();//it read the data from cell
		return data;
		
	}

}
