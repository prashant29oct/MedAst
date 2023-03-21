package DoctorTest;

import org.testng.annotations.Test;

import MedAst.GenericUtilities.BaseClass;
import MedAst.ObjectRepository.AppointmentListPage;
import MedAst.ObjectRepository.HomePage;

public class AddAppointmentTest extends BaseClass{

	@Test
	public void addAppointmentTest() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.clickAppointmentListLink();
		
		AppointmentListPage alp = new AppointmentListPage(driver);
		alp.AddAppointment(driver,10, "Prashant Sharma");

	}

}
