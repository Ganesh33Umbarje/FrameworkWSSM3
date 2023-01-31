package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	/**
	 * This class contains reusable methods to perform operations on excel Files.
	 */
	private Workbook workbook;
	public void fetchdatafromexcel(String excelpath) {
		FileInputStream fis=null;
		try {
			fis = new FileInputStream (excelpath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			workbook=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This method is used to fetch single data from excel.
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public String fetchSingleDatafromExcel(String sheetName,int rowNum,int cellNum) {
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	/**
	 * This method is used to fetch multiple data from excel.
	 * @param sheetName
	 * @return
	 */
	public List<String> fetchDataFromExcel (String sheetName){
		List<String> list=new ArrayList<>();
		Sheet sheet=workbook.getSheet(sheetName);
		for(int i=0;i<4;i++) {
			String data=sheet.getRow(i).getCell(i).getStringCellValue();
			list.add(data);
		}
		return list;
	}
	/**
	 * This method is sused to close the workbook
	 */
	
	public void closeworkbook() {
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		

}
