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
//read operation
public class ReaddataFromExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");//getting the specified file for read operation
		Workbook wb = WorkbookFactory.create(fis);//it makes the file ready for read operation
		Sheet sh = wb.getSheet("validdata");//it specifies which sheet
		Row row = sh.getRow(1);//specifies the row 
		Cell cell = row.getCell(1);//specifies column
		String data = cell.getStringCellValue();//it read the data from cell
		System.out.println(data);//display data
	}

}
