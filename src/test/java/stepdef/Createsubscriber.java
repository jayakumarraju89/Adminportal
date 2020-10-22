package stepdef;

import org.openqa.selenium.WebDriver;

import dataprovider.Createsub;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createsubscriber {
	
	public static WebDriver driver;
	
	Createsub createsub = new Createsub(driver);
	
	
	@Given("select subscriber and click on the create new subscriber")
	public void select_subscriber_and_click_on_the_create_new_subscriber() throws InterruptedException {

		createsub.getSub_btn().click();
		createsub.getCreate_btn().click();
		Thread.sleep(10000);
		
	}

	@When("Enter the subscriber details and click next")
	public void enter_the_subscriber_details_and_click_next() {
		
		
	}

	@When("select snaps industry, industry area")
	public void select_snaps_industry_industry_area() {
		
		
	}

	@When("select snaps category, section and subsection")
	public void select_snaps_category_section_and_subsection() {
		
		
	}

	@When("select taxomony and Labels")
	public void select_taxomony_and_Labels() {
		
		
	}

	@Then("click on the get packages button")
	public void click_on_the_get_packages_button() {
		
		
	}

	@When("verify packages displayed")
	public void verify_packages_displayed() {
		
		
	}

	@When("select packages")
	public void select_packages() {
		
		
	}

	@When("click on the next button")
	public void click_on_the_next_button() {
		
		
	}

	@When("verify subscription tab")
	public void verify_subscription_tab() {
		
		
	}

	@When("enter subscription details")
	public void enter_subscription_details() {
		
		
	}

	@Then("click next button")
	public void click_next_button() {
		
		
	}

	@When("verify subscriber user screen launched")
	public void verify_subscriber_user_screen_launched() {
		
		
	}

	@When("click the add user button")
	public void click_the_add_user_button() {
		
		
	}

	@When("enter subscriber details and click on save button")
	public void enter_subscriber_details_and_click_on_save_button() {
		
		
	}

	@When("browse file by clicking browse for file")
	public void browse_file_by_clicking_browse_for_file() {
		
		
	}

	@When("select customer paid button")
	public void select_customer_paid_button() {
		
		
	}

	@Then("click the finalize button")
	public void click_the_finalize_button() {
		
		
	}

}
