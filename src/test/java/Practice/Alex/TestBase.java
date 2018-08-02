package Practice.Alex;




import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase extends BasePage{

	
	@BeforeClass
	public void initalizare() {
		initSetP();
	}
	
	@AfterClass
	public void inchidere() {
	tearDownP();
	}





}


