package Practice.Alex;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;



public class SpecializedFindElement extends BasePage
{	
	public WebElement findObject(String elementName, String elementFindBy, boolean elementMandatory) {
	// method is not void, will return a WebElement
	// Initialize a WebElement type object
	WebElement elementFindObject = null;
	//
	try {
		// in if-else if we choose all the selectors
		if (elementFindBy == "css")
			elementFindObject = driver.findElement(By.cssSelector(elementName));
		else if (elementFindBy == "xpath")
			elementFindObject = driver.findElement(By.xpath(elementName));
		else if (elementFindBy == "id")
			elementFindObject = driver.findElement(By.id(elementName));
		else if (elementFindBy == "className")
			elementFindObject = driver.findElement(By.className(elementName));

	} catch (NoSuchElementException ex) {
		System.out.println("Element " + elementName + "was not found on page");
	}
	// if an element is found then return that element
	if (elementFindObject == null && elementMandatory == true) {
		System.out.println("The mandatory element " + elementName + "was not found on the page");
	}
	// if the element is not mandatory
	//elementFindObject.click();
	return elementFindObject;
}
	

	
	}
