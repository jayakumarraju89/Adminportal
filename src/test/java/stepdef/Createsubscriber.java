package stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.glass.events.KeyEvent;

import dataprovider.Createsub;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createsubscriber {
	
	public static WebDriver driver;
	
	
	
	// Createsub createsub = new Createsub(driver);
	
	
	
	
	public  Createsubscriber() {
		driver = Hooks.driver;
	}
	
	
	@Given("select subscriber and click on the create new subscriber")
	public void select_subscriber_and_click_on_the_create_new_subscriber() throws InterruptedException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		createsub.getSub_btn().click();
		createsub.getCreate_btn().click();
	}

	@When("Enter the subscriber details and click next")
	public void enter_the_subscriber_details_and_click_next() throws AWTException, InterruptedException {
		Createsub createsub = new Createsub(driver);		
		createsub.getFirst_name().sendKeys("kite");
		createsub.getLast_name().sendKeys("co");
		createsub.getCompany_name().sendKeys("kite and co");
		
		Robot r = new Robot();
		createsub.getCompany_address().sendKeys("357 green park avenue");
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);		
		r.keyRelease(KeyEvent.VK_TAB);
		
		createsub.getPhone_number().sendKeys("10045557878");
		createsub.getEmail().sendKeys("kite@gmail.com");
		createsub.getNxt_button1().click();
		
	}

	@When("select snaps industry, industry area")
	public void select_snaps_industry_industry_area() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Createsub createsub = new Createsub(driver);
		Thread.sleep(3000);

		createsub.getSnap_checkbox().click();
		WebElement ele = driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-primary'])[2]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		jse.executeScript("arguments[0].click()", ele);
			
	}

/*	@When("select snaps category, section and subsection")
	public void select_snaps_category_section_and_subsection() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("select taxomony and Labels")
	public void select_taxomony_and_Labels() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("click on the get packages button")
	public void click_on_the_get_packages_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}	*/

	@When("verify packages displayed")
	public void verify_packages_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("select packages")
	public void select_packages() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("click on the next button")
	public void click_on_the_next_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("verify subscription tab")
	public void verify_subscription_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("enter subscription details")
	public void enter_subscription_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("click next button")
	public void click_next_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("verify subscriber user screen launched")
	public void verify_subscriber_user_screen_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("click the add user button")
	public void click_the_add_user_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("enter subscriber details and click on save button")
	public void enter_subscriber_details_and_click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("browse file by clicking browse for file")
	public void browse_file_by_clicking_browse_for_file() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("select customer paid button")
	public void select_customer_paid_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("click the finalize button")
	public void click_the_finalize_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
