package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
	public static String getExcelData(String sheetName,int sheet, int cell) throws EncryptedDocumentException, IOException { 
	 FileInputStream file = new FileInputStream("C:\\\\Testdata\\\\Test.xlsx");
	 
	 String value =WorkbookFactory.create(file).getSheet(sheetName).getRow(sheet).getCell(cell).getStringCellValue();    

	 return value;
	 		
	 

}
}