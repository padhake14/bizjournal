package com.bizjournals.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bizjournals.base.TestBase;
import com.bizjournals.pages.GetMapDetailsPage;

public class GetMapDetailsTest extends TestBase {

	GetMapDetailsPage getMapDetailsPage;

	public GetMapDetailsTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		getMapDetailsPage = new GetMapDetailsPage();

	}

	@Test
	public void getCraneWatchCityDetails() throws InterruptedException, InvalidFormatException, IOException {
		getMapDetailsPage.getProjectDetails();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
