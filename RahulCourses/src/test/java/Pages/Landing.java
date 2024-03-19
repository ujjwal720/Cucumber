package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing {

	WebDriver driver;

	public Landing(WebDriver driver) {

		this.driver = driver;

	}

	By search = By.xpath("//input[@class='search-keyword']");
	By prductname = By.xpath("//h4[@class='product-name']");
	By search1 = By.xpath("//button[@class='search-button']");
	By increment = By.xpath("//a[@class='increment']");
	By addtpcart = By.xpath("//div[@class='product-action']/button");
	By addtocart2 = By.xpath("//img[@alt='Cart']");
	By procedtocheckout=By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");

	public void search(String s) {

		driver.findElement(search).sendKeys(s);

	}

	public String gettext() {

		return driver.findElement(prductname).getText();

	}

	public void searchclick() {
		// TODO Auto-generated method stub
		driver.findElement(search1).click();
	}

	public void increment() {

		driver.findElement(increment).click();

	}

	public void addtocart() {

		driver.findElement(addtpcart).click();

	}

	public void addtocart1() {

		driver.findElement(addtocart2).click();

	}

	public void checkouts() {
		
		driver.findElement(procedtocheckout).click();

	}
	
	
	public String tittle() {
		
		
		return driver.getTitle();
	}

}
