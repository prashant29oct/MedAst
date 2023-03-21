package DoctorTest;

import org.testng.annotations.Test;

import MedAst.GenericUtilities.BaseClass;
import MedAst.ObjectRepository.AddPrescriptionPage;
import MedAst.ObjectRepository.HomePage;

public class AddPrescriptionTest extends BaseClass {
	
	@Test
	public void addPrescriptionTest() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.clickPrescriptionLink();
		
		AddPrescriptionPage app = new AddPrescriptionPage(driver);
		app.addPrescription(driver, 4, "12:30", "Prashant Sharma");
	}

}
