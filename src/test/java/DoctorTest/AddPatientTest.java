package DoctorTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import MedAst.GenericUtilities.BaseClass;
import MedAst.ObjectRepository.AddPatientPage;
import MedAst.ObjectRepository.HomePage;

public class AddPatientTest extends BaseClass {
	
	@Test
	public void addPatientTest() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.clickPatientLink();
		
		AddPatientPage app = new AddPatientPage(driver);
		app.createNewPatient(driver ,"Prashant12", "prashant12@gmail.com", "123456", "43/323 Lucknow UP", "9999999912", "male", "02/12/1994", "28", "O+");
	}

}
