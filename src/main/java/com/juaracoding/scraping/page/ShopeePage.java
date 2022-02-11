package com.juaracoding.scraping.page;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.scraping.driver.DriverSingleton;

public class ShopeePage {

	private WebDriver driver;
	
	public ShopeePage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='main']/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/form/input")
	private WebElement inputSearch;
	
	@FindBy(xpath = "//*[contains(@class,'shopee-search') and (@data-sqe)]")
	private List<WebElement> listSearchProduk;
	
	@FindBy(xpath = "//*[@id='main']/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div[3]/div/div[1]/span")
	private WebElement namaProduk;
	
	@FindBy(xpath = "//*[@id='main']/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div[3]/div/div[3]/div/div/div/div/div/div")
	private WebElement cekHarga;
	
	@FindBy(xpath = "//button[contains(text(),'beli sekarang')]")
	private WebElement btnBeliProduk;
	
	@FindBy(xpath = "//*[@id='main']/div/div[2]/div/div/form/div/div[2]/div[2]/div[1]/input")
	private WebElement userLogin;
	
	@FindBy(xpath = "//*[@id='main']/div/div[2]/div/div/form/div/div[2]/div[3]/div[1]/input")
	private WebElement passLogin;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement btnLogin;
	
	public void waiting() {
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void searchProduk() {
		waiting();
		Actions actions = new Actions(driver);
		actions.moveByOffset(5, 5).click().perform();
		waiting();
		inputSearch.sendKeys("iphone 11");
		inputSearch.sendKeys(Keys.ENTER);		
	}
	
	public void pilihProduk() {
		waiting();
		listSearchProduk.get(1).click();
		waiting();
		System.out.println(namaProduk.getText() + " : " + cekHarga.getText());
		waiting();
		btnBeliProduk.click();
	}
	
	public void checkoutProduk() {
		waiting();
		userLogin.sendKeys("test");
		passLogin.sendKeys("test");
		waiting();
		btnLogin.click();
		//verifikasi login
	}
}
