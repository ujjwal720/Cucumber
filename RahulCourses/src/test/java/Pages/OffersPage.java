package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	WebDriver driver;

	public OffersPage(WebDriver driver) {

		this.driver = driver;

	}

	By linkm = By.xpath("//div[@class='cart']/a[2]");
	By searchfield = By.xpath("//input[@id='search-field']");
	By grabtext = By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]");

	public void links() {

		driver.findElement(linkm).click();

	}

	public void searchs(String s) {

		driver.findElement(searchfield).sendKeys(s);

	}

	public String grabds() {

		return driver.findElement(grabtext).getText();
	}

}
