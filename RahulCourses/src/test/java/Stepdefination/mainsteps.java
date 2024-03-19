package Stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class mainsteps {

	@Given("User opens the homepage")
	public void user_opens_the_website() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("This is an given");

	}

	@When("^User enters the (.*) and (.*) in the search area$")
	public void user_enters_the_ujjwal_in_the_search_area(String username, String password) {
		// Write code here that turns the phrase above into concrete actions

		System.out.println(username);
		System.out.println(password);

	}

	@And("User clicks on Login")
	public void user_clicks_on_login() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is an and");

	}

	@Then("User should be redirected to the Google page")
	public void user_should_be_redirected_to_the_google_page() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("This is an then");

	}

}
