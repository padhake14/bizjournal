package com.bizjournals.pages;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bizjournals.base.TestBase;
import com.bizjournals.testdata.TestUtil;

public class GetMapDetailsPage extends TestBase {

	@FindBy(xpath = "//div[@class=\"hero-bar__content\"]/a[1]")
	WebElement viewMapBtn;

	@FindBy(xpath = "//iframe[@class='cw-map']")
	WebElement frame;

	@FindBy(xpath = "//*[starts-with(@id,'map_layers')]/*[name()='svg']/*[name()='g']/*[101]")
	WebElement pinDetails;

	@FindBy(xpath = "//div[@class=\"titleButton arrow\"]")
	WebElement details;

	@FindBy(xpath = "(//div[@class=\"esriMobileInfoView esriMobilePopupInfoView\"])[1]")
	WebElement getProjectDetails;

	@FindBy(xpath = "(//div[@class=\"esriMobileNavigationItem left\"])[1]")
	WebElement closeBtn;

	public GetMapDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void getProjectDetails() throws InvalidFormatException, IOException, InterruptedException {
		viewMapBtn.click();
		driver.switchTo().frame(frame);
		Thread.sleep(10000);
		pinDetails.click();
		details.click();

		String projectDetails = getProjectDetails.getText();
		TestUtil.setDataInExcel(projectDetails);
		Thread.sleep(5000);
		closeBtn.click();

	}

}
