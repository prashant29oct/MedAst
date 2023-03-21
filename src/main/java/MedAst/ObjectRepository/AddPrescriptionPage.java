package MedAst.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MedAst.GenericUtilities.WebDriverUtility;

public class AddPrescriptionPage extends WebDriverUtility{

	@FindBy(xpath = "//button[contains(text(),'Add Prescription')]") private WebElement AddPrescriptionBtn;
	@FindBy(name = "date_timestamp") private WebElement DateTextField;
	@FindBy(name = "time_timestamp") private WebElement TimeTextField;
	@FindBy(xpath = "//label[text()='Patient']") private WebElement PatientName;
	@FindBy(xpath = "//span[text()='Select Patient']") private WebElement SelectPatientDropDown;
	@FindBy(xpath = "input[contains(@class,'select2-input')]") private WebElement PatientNameedit;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/ul[1]/li[5]/div[1]/a[1]/i[1]") 
	private WebElement EditHtmlBtn1;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/ul[1]/li[5]/div[1]/a[1]/i[1]") 
	private WebElement EditHtmlBtn2;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/ul[1]/li[5]/div[1]/a[1]/i[1]") 
	private WebElement EditHtmlBtn3;
	
	@FindBy(name = "case_history") private WebElement CaseHistoryTxtField;
	@FindBy(name = "medication") private WebElement MedicationTxtField;
	@FindBy(name = "note") private WebElement NoteTxtField;
	@FindBy(xpath = "//input[@type='submit']") private WebElement SubmitBtn;
	
	public AddPrescriptionPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddPrescriptionBtn() {
		return AddPrescriptionBtn;
	}

	public WebElement getDateTextField() {
		return DateTextField;
	}

	public WebElement getTimeTextField() {
		return TimeTextField;
	}

	public WebElement getPatientName() {
		return PatientName;
	}

	public WebElement getSelectPatientDropDown() {
		return SelectPatientDropDown;
	}

	public WebElement getPatientNameedit() {
		return PatientNameedit;
	}

	public WebElement getEditHtmlBtn1() {
		return EditHtmlBtn1;
	}
	
	public WebElement getEditHtmlBtn2() {
		return EditHtmlBtn2;
	}
	
	public WebElement getEditHtmlBtn3() {
		return EditHtmlBtn3;
	}

	public WebElement getCaseHistoryTxtField() {
		return CaseHistoryTxtField;
	}

	public WebElement getMedicationTxtField() {
		return MedicationTxtField;
	}

	public WebElement getNoteTxtField() {
		return NoteTxtField;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	public void addPrescription(WebDriver driver, int Date, String time, String patientName)
	{
		AddPrescriptionBtn.click();
		waitForElementToBeVisible(driver, DateTextField);
		DateTextField.click();
		driver.findElement(By.xpath("//td[text()='"+Date+"']")).click();
		TimeTextField.clear();
		TimeTextField.sendKeys(time);
		PatientName.click();
		waitForElementToBeVisible(driver, SelectPatientDropDown);
		SelectPatientDropDown.click();
		driver.findElement(By.xpath("//input[contains(@class,'select2-focused')]")).sendKeys(patientName);
		driver.findElement(By.xpath("//span[@class='select2-match']")).click();
		
		EditHtmlBtn1.click();
		CaseHistoryTxtField.sendKeys("Sugar and High Blood Pressure");
		
		EditHtmlBtn2.click();
		MedicationTxtField.sendKeys("Paracetomol");
		
		EditHtmlBtn3.click();
		NoteTxtField.sendKeys("Take your self");
		
		SubmitBtn.click();  
		
	}
}
	

