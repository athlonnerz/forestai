package StepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;

public class POMstepsDefinition {

	static WebDriver driver;
	@Given("Admin is open OrangeHRM page")
	public void admin_is_open_OrangeHRM_page() {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Assert.assertTrue(driver.findElement(By.className(oxd-text oxd-text--h5 orangehrm-login-title")));
	}

	@Given("Admin enter correct username")
	public void admin_enter_correct_username() {
	 WebElement username = driver.findElement(By.name(username));
	    Actions actions = new Actions(driver);
		actions.click(username).perform();
	}

	
}
