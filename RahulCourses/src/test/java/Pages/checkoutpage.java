package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutpage {

	WebDriver driver;

	public checkoutpage(WebDriver driver) {

		this.driver = driver;

	}

	By getproduct = By.xpath("//table[@class='cartTable']/tbody/tr/td[2]/p");

	public String getproductname() {
		
		
		String name=driver.findElement(getproduct).getText();
		
		return name;

	}

}
