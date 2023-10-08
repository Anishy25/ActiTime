package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * This method is non static method used to read data from property file.
 * @author Anish
 *
 */
public class FileLibrary {
	/**
	 * This method is a non static method used to read data from Property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String readDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./Testdata/Common data.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	/**
	 * This method is a non static method used to read data from Excel.
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String readDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Testdata/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
