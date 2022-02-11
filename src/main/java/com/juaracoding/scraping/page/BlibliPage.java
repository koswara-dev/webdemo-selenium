package com.juaracoding.scraping.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.scraping.driver.DriverSingleton;

public class BlibliPage {

	private WebDriver driver;
	
	public BlibliPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='blibliApp']/div/header/div[2]/div[2]/div/div[1]/input")
	private WebElement inputSearch;
	
	public void waiting() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void searchProduk() {
		waiting();
		inputSearch.sendKeys("iphone 11 pro");
		inputSearch.sendKeys(Keys.ENTER);
	}
}
