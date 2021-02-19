package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class StepDefinition {
	WebDriver driver;
	LoginPage loginPage;
	
	@Before
	public void beforetest() {
		driver = BrowserFactory.startBrowser();
		loginPage= PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the Login page$")
	public void User_is_on_the_LoginPage() {
		System.out.println("First step -User is on login page");
		driver.get("https://techfios.com/billing/?ng=login");
	}

	@When("^User Enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enters_the_and(String userName ,String passWord) throws Throwable {
		System.out.println("Second step User enters Username and password");
		loginPage.enterCredentials(userName, passWord);
		Thread.sleep(2000);

	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
	 loginPage.clickOnsignInButton();
		Thread.sleep(1000);
	}

	@Then("^User should be able to see the Dashboard$")
	public void user_should_be_able_to_see_the_Dashboard() throws Throwable {
		Assert.assertEquals("Dashboard- iBilling", driver.getTitle());
		loginPage.takeScreenshotAtEndOfTest(driver);
	}

	@When("^User clicks on Bank and cash$")
	public void user_clicks_on_Bank_and_cash() throws Throwable {
     Thread .sleep(2000);
     loginPage.ClickOnBankandCash();
	}

	@When("^User clicks on New account$")
	public void user_clicks_on_New_account() throws Throwable {
		loginPage.ClickOnAddNewAccount();
	}

	@When("^User fill up the form Entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\" and clicks on submit$")
	public void user_fill_up_the_form_Entering_and_and_and_and_and_and_and_clicks_on_submit(String AccountTitle,String description, String initialBalance, String accountNumber, String contactPerson, String phone,
	String internetBankingUrl) throws InterruptedException  {
		loginPage.fillInTheNewAccountForm(AccountTitle, description, initialBalance, accountNumber, contactPerson, phone, internetBankingUrl);
		
	}

	@Then("^User should be able to see Validate$")
	public void user_should_be_able_to_see_Validate() throws Throwable {
		Assert.assertEquals("Accounts- iBilling", driver.getTitle());
	}
	@Given("^User is on the Techfios LoginPage$")
	public void user_is_on_the_Techfios_LoginPage() throws Throwable {
	    
	}

	@Then("^User should be able to see the dashboard$")
	public void user_should_be_able_to_see_the_dashboard() throws Throwable {
	    
	}


	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

	
}
