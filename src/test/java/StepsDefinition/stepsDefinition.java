package StepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepsDefinition
{

static WebDriver driver;
	@Given("User is open OrangeHRM page")
	public void user_is_open_forestai_career_page() {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Get in Touch')]")));
	}

	@Then("User enter correct username")
	public void user_search_available_vacancies() {
		WebElement vacanciesElement= driver.findElement(By.xpath("//span[contains(text(),'Vacancies')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(vacanciesElement).perform();
	}

	@And("User enter correct password")
	public void user_click_apply_now() {
	    WebElement applyNow = driver.findElement(By.xpath("//button[contains(text(),'Apply Now')]"));
	    Actions actions = new Actions(driver);
		actions.click(applyNow).perform();
	}
	@Then("User click Login")
	public void user_click_next() {
	    WebElement applyNow = driver.findElement(By.xpath("//div[contains(text(),'Next')]\"))"));
	    Actions actions = new Actions(driver);
		actions.click(applyNow).perform();
	}
	}