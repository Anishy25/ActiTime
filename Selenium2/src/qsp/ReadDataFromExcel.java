package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./Testdata/Testdata.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet("CustomerDetails").getRow(2).getCell(2).getStringCellValue();
		System.out.println(value);

	}

}
