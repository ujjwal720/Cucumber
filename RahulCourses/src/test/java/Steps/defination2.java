package Steps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import Pages.OffersPage;
import io.cucumber.java.en.Then;
import utils.TestContext;

public class defination2 {

	public TestContext a;
	String Topdealspage;
	String[] rem;

	public defination2(TestContext a) {
		
		this.a=a;

	}

	@Then("user search in Offers page and search for the {string} and extract actual name")
	public void user_search_in_ofeers_page_and_search_for_the_and_extract_actual_name(String searchString) {
		
		OffersPage n=a.manager.bm();

		n.links();
		
	    a.iop.getwindowshandels();
		n.searchs(searchString);
		a.Topdealspage = n.grabds();
	   Assert.assertEquals(a.rem[0], a.Topdealspage);

	}

}
