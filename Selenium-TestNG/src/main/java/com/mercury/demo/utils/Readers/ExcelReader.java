package com.mercury.demo.utils.Readers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public Object[][] andReturn2DObject(String FILENAME) throws IOException {
		String filePath = "/Users/ceroshjacob/git/SeleniumTestNG/Selenium-TestNG/browserDrivers/";
		String fullFilePath = filePath + FILENAME;
		File file = new File(fullFilePath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		wb.close();
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		Object[][] obj = new Object[rowCount][1];

		for (int i = 0; i < rowCount; i++) {
			Map<Object, Object> dataMap = new HashMap<Object, Object>();
			for (int j = 0; j < columnCount; j++) {
				dataMap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
			}
			obj[i][0] = dataMap;
		}
		return obj;

	}

}
