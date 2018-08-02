package Practice.Alex;

import org.testng.annotations.Test;




import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;


public class Tab3ConnectionTest extends TestBase {
@Test
	public void tab3(){
	navigateTo("http://demoqa.com/");
	SpecializedFindElement gasireElement = new SpecializedFindElement();
    WebElement x=gasireElement.findObject(".//*[@id='menu-item-66']/a", "xpath", true);
	x.click();
	WebElement y=gasireElement.findObject(".//*[@id='menu-item-153']/a", "xpath", true);
	y.click();

	WebElement z=gasireElement.findObject(".//*[@id='ui-id-3']", "xpath", true);
	z.click();
	WebElement a=gasireElement.findObject(".//*[@id='tabs-3']/p[1]", "xpath", true);


	assertEquals(a.getText(), "Mauris eleifend est et turpis. Duis id erat. Suspendisse potenti. Aliquam vulputate, pede vel vehicula accumsan, mi neque rutrum erat, eu congue orci lorem eget lorem. Vestibulum non ante. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Fusce sodales. Quisque eu urna vel enim commodo pellentesque. Praesent eu risus hendrerit ligula tempus pretium. Curabitur lorem enim, pretium nec, feugiat nec, luctus a, lacus.");
}



}
