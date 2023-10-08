package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
	
	public class ExtractDataFromExcel{
		public String readFromTestDataFile(String Sheet,int row,int cell) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream("./Testdata/Testdata.xlsx");
			Workbook WB = WorkbookFactory.create(fis);
			String value = WB.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
			return value;
		}
		

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ExtractDataFromExcel d = new ExtractDataFromExcel();
		String CN = d.readFromTestDataFile("CustomerDetails",1,1);
		String CD = d.readFromTestDataFile("CustomerDetails",1,2);
		System.out.println(CN);
		System.out.println(CD);
		

	}

}
