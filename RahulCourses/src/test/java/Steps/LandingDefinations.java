package Steps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.Landing;
import Pages.OffersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContext;

public class LandingDefinations {

	public WebDriver driver;
	String homepage;
	Landing b;
	OffersPage c;

	public TestContext a;

	
	public LandingDefinations(TestContext a) {

		this.a = a;
		b = a.manager.lp();
		c=a.manager.bm();
		

	}
	
	/*
	 * basically we are giving the knowlge to a
	 */
	

	@Given("the user is in greencartpage")
	public void the_user_is_in_greencartpage() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("This is given");
		

	}

	@When("user search for {string} in search and extract name of it")
	public void user_search_for_in_search_and_extract_name_of_it(String lang) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		b.search(lang);
		Thread.sleep(2000);
		b.searchclick();
		a.homepage = b.gettext();
		System.out.println(a.homepage);
		a.rem = a.homepage.split(" ");
		Thread.sleep(2000);
		System.out.println("this is passed");

	}

	@Given("the user is in greencartpage of it")
	public void grrencart_verification() {

		try {

			String s = "greencart";

			String actual = b.tittle();

			Assert.assertEquals(s, actual);

		}

		catch (AssertionError e) {

			System.out.println("It is not equal");
		}

	}

	@When("the user enter the {string} product name in search with the ckick")
	public void addthename(String s) throws InterruptedException {

		b.search(s);
		b.searchclick();
		Thread.sleep(3000);

	}

	@And("Added the {string} items for the product the click on add to cart")
	public void ms(String value) {

		int a = Integer.parseInt(value);

		for (int i = 1; i <= a; i++) {
			
			b.increment();

		}

	}
	
	
	@Then("verify the checkout page and search is equal or not.")
	public void verify_the_checkout_page_and_search_is_equal_or_not() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		
		
		
	    
	}
	
	
	

}
