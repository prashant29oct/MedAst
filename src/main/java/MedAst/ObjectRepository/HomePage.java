package MedAst.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MedAst.GenericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility{

	@FindBy(linkText =  "Appointment") private WebElement AppointmentLink;
	@FindBy(linkText =  "Appointment List") private WebElement AppointmentListLink;
	@FindBy(linkText = "Requested Appointments") private WebElement RequestedAppointmentsLink;
	@FindBy(linkText = "Prescription") private WebElement PrescriptionLink;
	@FindBy(linkText = "Patient") private WebElement PatientLink;
	@FindBy(linkText = "Bed Allotment") private WebElement BedAllotmentLink;
	@FindBy(linkText =  "Blood Bank") private WebElement BloodBankLink;
	@FindBy(linkText = "Report") private WebElement ReportLink;
	@FindBy(linkText = "Message") private WebElement MessageLink;
	@FindBy(linkText = "Profile") private WebElement ProfileLink;
	@FindBy(partialLinkText = "Log Out") private WebElement LogOutLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAppointmentLink() {
		return AppointmentLink;
	}

	public WebElement getAppointmentListLink() {
		return AppointmentListLink;
	}

	public WebElement getRequestedAppointmentsLink() {
		return RequestedAppointmentsLink;
	}

	public WebElement getPrescriptionLink() {
		return PrescriptionLink;
	}

	public WebElement getPatientLink() {
		return PatientLink;
	}

	public WebElement getBedAllotmentLink() {
		return BedAllotmentLink;
	}

	public WebElement getBloodBankLink() {
		return BloodBankLink;
	}

	public WebElement getReportLink() {
		return ReportLink;
	}

	public WebElement getMessageLink() {
		return MessageLink;
	}

	public WebElement getProfileLink() {
		return ProfileLink;
	}

	public WebElement getLogOutLink() {
		return LogOutLink;
	}
	
	public void clickAppointmentListLink()
	{
		AppointmentLink.click();
		AppointmentListLink.click();
	}
	
	public void clickRequestAppointmentLink()
	{
		AppointmentLink.click();
		RequestedAppointmentsLink.click();
	}
	
	public void clickPrescriptionLink()
	{
		PrescriptionLink.click();
	}
	
	public void clickPatientLink()
	{
		PatientLink.click();
	}
	
	public void clickBedAllotmentLink()
	{
		BedAllotmentLink.click();
	}
	
	public void clickBloodBankLink()
	{
		BloodBankLink.click();
	}
	
	public void clickReportLink()
	{
		ReportLink.click();
	}
	
	public void clickMessageLink()
	{
		MessageLink.click();
	}
	
	public void clickProfileLink()
	{
		ProfileLink.click();
	}
	
	public void clickLogoutLink()
	{
		LogOutLink.click();
	}
	

}