package MedAst.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MedAst.GenericUtilities.WebDriverUtility;

public class AddPatientPage extends WebDriverUtility {

	@FindBy(xpath = "//button[contains(text(),'Add Patient')]") private WebElement AddPatientBtn;
	@FindBy(name = "name") private WebElement NameEdit;
	@FindBy(name = "email") private WebElement EmailEdit;
	@FindBy(name = "password") private WebElement PwdEdit;
	@FindBy(name = "address") private WebElement AddressEdit;
	@FindBy(name = "phone") private WebElement PhoneEdit;
	@FindBy(name = "sex") private WebElement SexDropDown;
	@FindBy(name = "birth_date") private WebElement DobEdit;
	@FindBy(name = "age") private WebElement AgeEdit;
	@FindBy(name = "blood_group") private WebElement BloodGpDropDown;
	@FindBy(xpath = "//input[@type='submit']") private WebElement SubmitBtn;
	
	
	public AddPatientPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getAddPatientBtn() {
		return AddPatientBtn;
	}


	public WebElement getNameEdit() {
		return NameEdit;
	}


	public WebElement getEmailEdit() {
		return EmailEdit;
	}


	public WebElement getPwdEdit() {
		return PwdEdit;
	}


	public WebElement getAddressEdit() {
		return AddressEdit;
	}


	public WebElement getPhoneEdit() {
		return PhoneEdit;
	}


	public WebElement getSexDropDown() {
		return SexDropDown;
	}


	public WebElement getDobEdit() {
		return DobEdit;
	}


	public WebElement getAgeEdit() {
		return AgeEdit;
	}


	public WebElement getBloodGpDropDown() {
		return BloodGpDropDown;
	}


	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	public void createNewPatient(WebDriver driver ,String patientName, String mailId, String pwd, String address, String phoneNum, String Sex, String Dob, String age, String BloodGp)
	{
		AddPatientBtn.click();
		waitForElementToBeVisible(driver, NameEdit);
		NameEdit.sendKeys(patientName);
		EmailEdit.sendKeys(mailId);
		PwdEdit.sendKeys(pwd);
		AddressEdit.sendKeys(address);
		PhoneEdit.sendKeys(phoneNum);
		handleDropdown(SexDropDown, Sex);
		DobEdit.sendKeys(Dob);
		AgeEdit.sendKeys(age);
		handleDropdown(BloodGpDropDown, BloodGp);
		SubmitBtn.click();
	}
	
}
