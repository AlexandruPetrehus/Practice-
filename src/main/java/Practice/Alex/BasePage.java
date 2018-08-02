package Practice.Alex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public void navigateTo(String adresa) {
		driver.navigate().to(adresa);

	}
	
	public void clickOn(String element3) {
		WebElement elementA = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element3)));
		elementA.click();
	}

	public WebElement visible1 (WebElement type) {
		
				 WebElement element4 = wait.until(ExpectedConditions.visibilityOf(type));
			     return element4;
	}

	public WebElement visible(String a) {
		WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(a)));
		return element4;
	}

	public void initSetP() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\sources\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
	}

	public void tearDownP() {
		driver.close();
		if (!driver.equals(null))
			driver.quit();

	}

	

	public WebElement element1() {
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='center_column']/h1")));
	}

public void findAndClick(WebElement faclick) {
	 visible1 ((WebElement) faclick);
     faclick.click();
}
}