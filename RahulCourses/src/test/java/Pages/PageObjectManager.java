package Pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver drivers;

	public Landing a;
	public OffersPage b;
	public checkoutpage c;

	public PageObjectManager(WebDriver driver) {

		this.drivers = driver;

	}

	public Landing lp() {

		a = new Landing(drivers);

		return a;

	}

	public OffersPage bm() {

		b = new OffersPage(drivers);

		return b;

	}

	public Pages.checkoutpage checkoutpage() {
		
		c=new checkoutpage(drivers);
		
		return c;

	}

}
