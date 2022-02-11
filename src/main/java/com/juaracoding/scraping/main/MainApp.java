package com.juaracoding.scraping.main;

import org.openqa.selenium.WebDriver;

import com.juaracoding.scraping.driver.DriverSingleton;
import com.juaracoding.scraping.page.BlibliPage;
import com.juaracoding.scraping.page.ShopeePage;

public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("https://shopee.co.id/");
		
		ShopeePage shopeePage = new ShopeePage();
		shopeePage.searchProduk();
		shopeePage.pilihProduk();
		shopeePage.checkoutProduk();
		
//		BlibliPage blibliPage = new BlibliPage();
//		blibliPage.searchProduk();
		
	}
}
