package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 *this class is a generic class which contains non static to read data from property and excel file
 * @author Omkar
 *
 */
public class FileLibrary {
	/**
	 * this method is  a non static method used to read data fromfile
	 * @param key
	 * @return
	 * @throws IOException 
	 */
	public String readDatafromPropertyFileString(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
	}
	/**
	 * this method is a non-static method used to data from excel sheet
	 * @param sheet
	 *@param row
	 *@param cell
	 *return
	 *throws EncryptedDocumentationException
	 *throws IOExceptin
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	
	
	public String readDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("Testdata/BANIKINGinfo 1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	
	


}
}