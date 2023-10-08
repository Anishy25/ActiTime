package com.Actitime.GenericLibrary;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileLibrary f = new FileLibrary();
		String data = f.readDataFromExcel("CustomerDetails", 5, 1);
		System.out.println(data);
		String URL = f.readDataFromProperty("url");
		System.out.println(URL);
	}

}
