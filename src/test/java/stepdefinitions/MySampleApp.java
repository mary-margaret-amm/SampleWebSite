package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MySampleApp extends BaseClass {

@Given("user launch sample app page")
public void user_launch_sample_app_page() {
driver.get("https://dhilip19031991.github.io/NewHtmlSite/");
}

@Then("enter first name {string} and last name {string}")
public void enter_first_name_and_last_name(String firstname, String lastname) {
driver.findElement(By.id("firstName")).sendKeys(firstname);
driver.findElement(By.id("lastName")).sendKeys(lastname);
}

@Then("enter date of birth {string}")
public void enter_date_of_birth(String DOB) {
driver.findElement(By.id("dob")).sendKeys(DOB);
}

@Then("click education level and select {string}")
public void click_education_level_and_select(String option) {
WebElement educationdropdown=driver.findElement(By.id("education"));
Select select=new Select(educationdropdown);
select.selectByVisibleText(option);
}

@Then("click submit")
public void click_submit() {
driver.findElement(By.xpath("//button[text()='Submit']")).click();
}
}
