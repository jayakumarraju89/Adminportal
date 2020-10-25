package stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
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
		Thread.sleep(2000);
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

	@When("select snaps and click on get packages button")
	public void select_snaps_and_click_on_get_Packages_button() throws InterruptedException {
		
		Createsub createsub = new Createsub(driver);
		Thread.sleep(3000);

		createsub.getSnap_checkbox().click();
		WebElement ele = driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-primary'])[2]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		jse.executeScript("arguments[0].click()", ele);
			
	}

	@When("select packages and click next")
	public void select_packages_and_click_next() {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		createsub.getPack_checkbox().click();
		WebElement ele = driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-primary'])[2]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		jse.executeScript("arguments[0].click()", ele);
	}

	@When("verify subscription tab and enter subscription details then click next button")
	public void verify_subscription_tab_and_enter_subscription_details_then_click_next_button() throws InterruptedException {
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement cal1 = driver.findElement(By.xpath("(//button[@aria-label='Open calendar'])[3]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", cal1);
		WebElement date1 = driver.findElement(By.xpath("//td[@aria-label='October 23, 2020']"));
		jse.executeScript("arguments[0].click()", date1);
		WebElement cal2 = driver.findElement(By.xpath("(//button[@aria-label='Open calendar'])[4]"));
		jse.executeScript("arguments[0].click()", cal2);
		WebElement date2 = driver.findElement(By.xpath("//td[@aria-label='October 31, 2020']"));
		jse.executeScript("arguments[0].click()", date2);
		Thread.sleep(2000);
		WebElement nxtbut = driver.findElement(By.xpath("(//div[@class='mat-button-focus-overlay'])[29]"));
		jse.executeScript("arguments[0].scrollIntoView(true);", nxtbut);
		jse.executeScript("arguments[0].click()", nxtbut);	
		Thread.sleep(2000);
	}

	@When("verify subscriber user screen launched and click the add user button")
	public void verify_subscriber_user_screen_launched_and_click_the_add_user_button() throws InterruptedException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement userbtn = driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-raised-button mat-fab mat-button-base mat-primary']"));
		jse.executeScript("arguments[0].click()", userbtn);

	//	WebElement useremail = driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c91-70']"));
	//	jse.executeScript("arguments[0].SetAttribute('value','kite@gmail.com')", useremail);
		
	/*	String pwind = driver.getWindowHandle();
		Set<String> allwind = driver.getWindowHandles();
		System.out.println(allwind);
		for (String x : allwind) {
			if (!(pwind.equals(x))) {
				driver.switchTo().window(x);
			}
		}	*/
		
		createsub.getUser_email().sendKeys("kite2@gmail.com");
		createsub.getUser_firstname().sendKeys("mar");
		createsub.getUser_lastname().sendKeys("orc");
		createsub.getUser_phone().sendKeys("10045558787");
		createsub.getUser_save().click();
		Thread.sleep(2000);
		createsub.getNxt_button4().click();
		
	}

	
	@When("enter subscriber details and click on save button then next")
	public void enter_subscriber_details_and_click_on_save_button_then_next() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("verify Finalize tab and browse file by clicking browse for file")
	public void verify_Finalize_tab_and_browse_file_by_clicking_browse_for_file() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("select customer paid button and click the finalize button")
	public void select_customer_paid_button_and_click_the_finalize_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	
}
