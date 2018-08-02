package Practice.Alex;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTest {
	public class TestHomePage extends TestBase{
		@Test
		public void paginaPrincipala() {
		navigateTo("http://demoqa.com/");
		Assert.assertTrue(visible(".//*[@id='post-9']/header/h1").isDisplayed());
		}}

}
