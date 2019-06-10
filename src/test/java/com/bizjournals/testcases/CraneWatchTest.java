package com.bizjournals.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bizjournals.base.TestBase;
import com.bizjournals.pages.CraneWatchPage;

public class CraneWatchTest extends TestBase {
	CraneWatchPage craneWatchPage;

	public CraneWatchTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		craneWatchPage = new CraneWatchPage();

	}

	@Test
	public void getCraneWatchCityDetails() throws InterruptedException {
		craneWatchPage.verifyNews();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
