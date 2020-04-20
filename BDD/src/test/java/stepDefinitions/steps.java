package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {

		public ChromeDriver driver;
		@Given("Open the Chrome Browser")
		public void openBrowser() {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		@Given("Maximise the Browser")
		public void maxBrowser() {
			driver.manage().window().maximize();
		}
		@Given("Set the timeouts")
		public void setTheTimeouts() {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		@Given("Load the URL")
		public void loadURL() {
			driver.get("http://leaftaps.com/opentaps");
		}
		@Given("Enter the username as (.*)")
		public void enterUsername(String username) {
			driver.findElement(By.id("username"))
			.sendKeys(username);
			
		}
		@Given("Enter the Password as (.*)")
		public void enterPassword(String password) {
			driver.findElement(By.id("password"))
			.sendKeys(password);

		}
		@When("Click on the Login")
		public void clickLogin() {
			driver.findElement(By.className("decorativeSubmit")).click();

		}
		@Then("Verify Login Successful")
		public void verifyLogin() {
			System.out.println("Login Successful");
		}
		@But("Verify Login failure")
		public void loginfailure() {
			System.out.println("Login Failed");
		}




	}




