package MedAst.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MedAst.GenericUtilities.WebDriverUtility;

public class AppointmentListPage extends WebDriverUtility{

	@FindBy(xpath = "//h3[normalize-space()='Appointment']") private WebElement HeaderText;
	@FindBy(partialLinkText = "Delete") private WebElement DeletedLink;
	@FindBy(xpath = "//button[contains(text(),'Add Appointment')]") private WebElement AddApointmentLink;
	@FindBy(name = "date_timestamp") private WebElement DateTextField;
	@FindBy(xpath = "//label[text()='Patient']") private WebElement PatientName;
	@FindBy(xpath = "//span[text()='Select Patient']") private WebElement SelectPatientDropDown;
	@FindBy(xpath = "//input[@type='submit']") private WebElement SubmitBtn;
	
	public AppointmentListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getHeaderText() {
		return HeaderText;
	}

	public WebElement getDeletedLink() {
		return DeletedLink;
	}

	public WebElement getAddApointmentLink() {
		return AddApointmentLink;
	}

	public WebElement getDateTextField() {
		return DateTextField;
	}

	public WebElement getSelectPatientDropDown() {
		return SelectPatientDropDown;
	}
	
	
	
	public WebElement getPatientName() {
		return PatientName;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	public void AddAppointment(WebDriver driver, int Date, String patientName) {
		
		AddApointmentLink.click();
		waitForElementToBeVisible(driver, DateTextField);
		DateTextField.click();
		driver.findElement(By.xpath("//td[text()='"+Date+"']")).click();
		PatientName.click();
		waitForElementToBeVisible(driver, SelectPatientDropDown);
		SelectPatientDropDown.click();
		driver.findElement(By.xpath("//input[contains(@class,'select2-input')]")).sendKeys(patientName);
		driver.findElement(By.xpath("//span[@class='select2-match']")).click();
		SubmitBtn.click(); 
	}
}
