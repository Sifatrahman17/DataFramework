package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignIn;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement BankAndCashButton;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement NewAccountPage;
	
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement AccountTitleField;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement DescriptionField;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement InitialBalanceField ;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement AccountNumberField ;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement ContactPersonField ;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement PhoneNumberField ;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement InternetBankingUrlField ;
	@FindBy(how = How.XPATH, using = "//*[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SubmitButton;
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Manage Accounts')]")
	WebElement Manage_account;
	
	
	
	
	
	public void enterUserName(String userName) throws InterruptedException {
		UserName.sendKeys(userName);
		Thread.sleep(2000);

	}

	public void enterPassword(String passWord) {
		Password.sendKeys(passWord);
	}

	public void enterCredentials(String userName, String password) {
		UserName.sendKeys(userName);
		Password.sendKeys(password);
	}

	public void clickOnsignInButton() throws InterruptedException {
		Thread.sleep(1000);
		SignIn.click();
	}

	public void ClickOnBankandCash() throws InterruptedException {
		BankAndCashButton.click();
		Thread.sleep(2000);
		
	}
	public void ClickOnAddNewAccount() throws InterruptedException {
		NewAccountPage.click();
		Thread.sleep(2000);
	}

	public void fillInTheNewAccountForm(String accountTitle, String description, String initialBalance,
			String accountNumber, String contactPerson, String phone, String internetBankingUrl)
			throws InterruptedException {
		AccountTitleField.sendKeys(accountTitle);
		DescriptionField.sendKeys(description);
		InitialBalanceField.sendKeys(initialBalance);
		Thread.sleep(2000);
		AccountNumberField.sendKeys(accountNumber);
		ContactPersonField.sendKeys(contactPerson);
		PhoneNumberField.sendKeys(phone);
		InternetBankingUrlField.sendKeys(internetBankingUrl);
		Thread.sleep(2000);
		SubmitButton.click();

		Thread.sleep(5000);
	}

	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currrentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png"));
	}

}
