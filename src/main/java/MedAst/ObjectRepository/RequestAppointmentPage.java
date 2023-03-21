package MedAst.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MedAst.GenericUtilities.WebDriverUtility;

public class RequestAppointmentPage extends WebDriverUtility {

	@FindBy(partialLinkText = "Approve") private WebElement ApproveLink;
	@FindBy(name = "date_timestamp") private WebElement DateTextField;
	@FindBy(name = "time_timestamp") private WebElement TimeTextField;
	@FindBy(xpath = "//input[@type='submit']") private WebElement ApprovedBtn;
	@FindBy(xpath = "//label[text()='Patient']") private WebElement PatientName;
	
	
	public RequestAppointmentPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getApproveLink() {
		return ApproveLink;
	}

	public WebElement getDateTextField() {
		return DateTextField;
	}

	public WebElement getTimeTextField() {
		return TimeTextField;
	}

	public WebElement getApprovedBtn() {
		return ApprovedBtn;
	}

	public void approveAppointment(WebDriver driver, int Date, String time )
	{
		ApproveLink.click();
		waitForElementToBeVisible(driver, DateTextField);
		DateTextField.click();
		driver.findElement(By.xpath("//td[text()='"+Date+"']")).click();
		TimeTextField.clear();
		TimeTextField.sendKeys(time);
		PatientName.click();
		ApprovedBtn.click();
		
	}
	
	
}
