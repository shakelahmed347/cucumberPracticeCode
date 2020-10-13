package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TagHookStep {
	static WebDriver driver;

	// global hook 
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wellsfargo.com/");

	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.close();

		}

	}

	@Given("^Open the chrome browser and go the url$")
	public void open_the_chrome_browser_and_go_the_url() {
		System.out.println("Just checking the process");

	}

	@When("^I'm checking Personal feature spelling$")
	public void i_m_checking_Personal_feature_spelling() {
		String personalText = driver.findElement(By.xpath("//a[@id='tabNavPersonal']")).getText();
		String expect = "Personal";
		Assert.assertEquals(expect, personalText);

	}

	@Then("^I'm checking clickable personal feature$")
	public void i_m_checking_clickable_personal_feature() {
		WebElement personalClick = driver.findElement(By.xpath("//a[@id='tabNavPersonal']"));
		if (personalClick.isDisplayed() && personalClick.isEnabled()) {
			personalClick.click();
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case failed");
		}

	}

	@Then("^I find out loans and credit feature$")
	public void i_find_out_loans_and_credit_feature() {

	}

	@When("^I'm checking Small business feature spelling$")
	public void i_m_checking_Small_business_feature_spelling() {

	}

	@Then("^I'm checking clickable small business feature$")
	public void i_m_checking_clickable_small_business_feature() {
	}

	@Then("^I find out merchant service$")
	public void i_find_out_merchant_service() {

	}

	@When("^I'm checking Commercial feature spelling$")
	public void i_m_checking_Commercial_feature_spelling() {

	}

	@Then("^I'm checking clickable commercial feature$")
	public void i_m_checking_clickable_commercial_feature() {

	}

	@Then("^I'm got insights$")
	public void i_m_got_insights() {

	}

	@When("^I'm checking Financial education module spelling$")
	public void i_m_checking_Financial_education_module_spelling() {

	}

	@Then("^I'm checking clickable financial education feature$")
	public void i_m_checking_clickable_financial_education_feature() {

	}

	@Then("^I got investing$")
	public void i_got_investing() {

	}

	@When("^I'm checking about wells fargo feature spelling$")
	public void i_m_checking_about_wells_fargo_feature_spelling() {

	}

	@Then("^I'm checking clickable about wells fargo feature$")
	public void i_m_checking_clickable_about_wells_fargo_feature() {

	}

	@Then("^I'm got about wells fargo text$")
	public void i_m_got_about_wells_fargo_text() {
	}

}
