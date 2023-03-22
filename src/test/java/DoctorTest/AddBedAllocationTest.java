package DoctorTest;

import org.testng.annotations.Test;

import MedAst.GenericUtilities.BaseClass;
import MedAst.ObjectRepository.AddBedAllocationPage;
import MedAst.ObjectRepository.HomePage;

public class AddBedAllocationTest extends BaseClass {

	@Test
	public void addBedAllocationTest()
	{
		HomePage hp = new HomePage(driver);
		hp.clickBedAllotmentLink();
		
		AddBedAllocationPage abap = new AddBedAllocationPage(driver);
		abap.createBedAllot(driver, "4 - ward", "Prashant Sharma", 12, 20);
	}
}
