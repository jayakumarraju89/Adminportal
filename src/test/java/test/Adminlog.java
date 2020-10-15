package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adminlog {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayakumar\\eclipse-workspace\\ettma\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-adminportal.ettma.com/#/dashboard");
		Thread.sleep(10000);
		
		WebElement user = driver.findElement(By.xpath("//input[@class='form-control ltr_override input ext-input text-box ext-text-box']"));
		user.sendKeys("jayakumarraju@ettma.com");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		WebElement pass = driver.findElement(By.id("i0118"));
		pass.sendKeys("Kumar@1989");
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
	}

}
