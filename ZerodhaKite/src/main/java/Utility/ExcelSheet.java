package Utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static String getData( int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream ("D:\\Automation\\ZerodhaKite\\src\\test\\resources\\Book3.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Rj").getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
		
		
	}
	
	
	
	
}
