package DoctorTest;

import org.testng.annotations.Test;

import MedAst.GenericUtilities.BaseClass;
import MedAst.ObjectRepository.HomePage;
import MedAst.ObjectRepository.RequestAppointmentPage;

public class RequestAppointmentTest extends BaseClass{

	@Test
	public void requestAppointmentTest() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.clickRequestAppointmentLink();
		
		RequestAppointmentPage rap = new RequestAppointmentPage(driver);
		rap.approveAppointment(driver, 4, "03:30");
		
	}
}
