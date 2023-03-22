package MedAst.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MedAst.GenericUtilities.WebDriverUtility;

public class AddBedAllocationPage extends WebDriverUtility{

	@FindBy(xpath = "//button[contains(text(),'Add Bed Allotment')]") private WebElement AddBedAllotBtn;
	@FindBy(name = "bed_id") private WebElement BedNumDropDown;
	@FindBy(name = "patient_id") private WebElement PatientDropDown;
	@FindBy(name = "allotment_timestamp") private WebElement AllotedTime;
	@FindBy(name = "discharge_timestamp") private WebElement DischargeTime;
	@FindBy(xpath = "//input[@type='submit']") private WebElement SubmitBtn;
	@FindBy(xpath = "//h3[text()='Add Bed Allotment']") private WebElement HeaderTxt;
	
	public AddBedAllocationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddBedAllotBtn() {
		return AddBedAllotBtn;
	}

	public WebElement getBedNumDropDown() {
		return BedNumDropDown;
	}

	public WebElement getPatientDropDown() {
		return PatientDropDown;
	}

	public WebElement getAllotedTime() {
		return AllotedTime;
	}

	public WebElement getDischargeTime() {
		return DischargeTime;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	
	public void createBedAllot(WebDriver driver, String BedNum, String PatientName, int Date1, int Date2)
	{
		AddBedAllotBtn.click();
		handleDropdown(BedNum, BedNumDropDown);
		handleDropdown(PatientName, PatientDropDown);
		AllotedTime.click();
		driver.findElement(By.xpath("//td[text()='"+Date1+"']")).click();
		HeaderTxt.click();
		DischargeTime.click();
		driver.findElement(By.xpath("//td[text()='"+Date2+"']")).click();
		HeaderTxt.click();
		SubmitBtn.click();
	}
	
}
