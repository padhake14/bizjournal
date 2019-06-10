package com.bizjournals.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.bizjournals.base.TestBase;

public class TestUtil extends TestBase {

	public static void setDataInExcel(String projectDetails) throws InvalidFormatException, IOException {
		final String FILE_NAME = ".\\src\\main\\java\\com\\bizjournals\\testdata\\testdata.xlsx";

		InputStream inp = new FileInputStream(FILE_NAME);
		Workbook wb = WorkbookFactory.create(inp);
		Sheet sheet = wb.getSheetAt(0);
		int num = sheet.getLastRowNum();
		Row row = sheet.createRow(++num);
		row.createCell(0).setCellValue(projectDetails);

		// Now this Write the output to a file
		FileOutputStream fileOut = new FileOutputStream(FILE_NAME);
		wb.write(fileOut);
		fileOut.close();
	}
}
