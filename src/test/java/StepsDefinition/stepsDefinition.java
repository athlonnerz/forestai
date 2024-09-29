package StepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class stepsDefinition {

	static WebDriver driver;
	@Given("User is open forestai career page")
	public void user_is_open_forestai_career_page() {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://theforest.ai/careers");
	}

	@When("User search available Vacancies")
	public void user_search_available_vacancies() {
		WebElement vacanciesElement= driver.findElement(By.xpath("//span[contains(text(),'Vacancies')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(vacanciesElement).perform();
	}

	@Then("User select Senior software engineer")
	public void user_select_senior_software_engineer() {
		WebElement seniorseElement= driver.findElement(By.xpath("//div[contains(text(),'Senior Software Engineer')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(seniorseElement).perform();
		actions.click(seniorseElement).perform();
	}

	@Then("User click Apply Now")
	public void user_click_apply_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
