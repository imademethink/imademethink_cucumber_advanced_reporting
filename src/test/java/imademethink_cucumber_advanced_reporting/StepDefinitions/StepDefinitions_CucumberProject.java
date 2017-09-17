package imademethink_cucumber_advanced_reporting.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import imademethink_cucumber_advanced_reporting.StepImplimentations.StepImplementation_CucumberProject;

public class StepDefinitions_CucumberProject {

	StepImplementation_CucumberProject handle =  new StepImplementation_CucumberProject();

	@Given("^Web application is in running state$")
	public void web_application_is_in_running_state() {
		handle.web_application_is_in_running_state();
	}
	
	@Given("^Web browser is launched$")
	public void web_browser_is_launched() {
		handle.web_browser_is_launched();
	}
	
	@Given("^Home page is launched$")
	public void home_page_is_launched() {
		handle.home_page_is_launched();
	}
	
	@When("^Click on login$")
	public void click_on_login() {
		handle.click_on_login();
	}
	
	@Then("^Following fields should be shown username and password$")
	public void following_fields_should_be_shown_username_and_password() {
		handle.following_fields_should_be_shown_username_and_password();
	}
	
	@When("^Valid user name and password is used$")
	public void valid_user_name_and_password_is_used() {
		handle.valid_user_name_and_password_is_used();
	}
	
	@Then("^Login should be successful$")
	public void login_should_be_successful() {
		handle.login_should_be_successful();
	}
	
	@Then("^Register option should not be visible$")
	public void register_option_should_not_be_visible() {
		handle.register_option_should_not_be_visible();
	}
	
	@Given("^User is already logged in$")
	public void user_is_already_logged_in() {
		handle.user_is_already_logged_in();
	}
	
	@When("^When user edits address$")
	public void when_user_edits_address() {
		handle.when_user_edits_address();
	}
	
	@Then("^Editing address should be possible$")
	public void editing_address_should_be_possible() {
		handle.editing_address_should_be_possible();
	}
	
	@When("^User clicks on logout button$")
	public void user_clicks_on_logout_button() {
		handle.user_clicks_on_logout_button();
	}
	
	@Then("^User log out should be successful$")
	public void user_log_out_should_be_successful() {
		handle.user_log_out_should_be_successful();
	}
	
	@Then("^Cookies should not be deleted$")
	public void cookies_should_not_be_deleted() {
		handle.cookies_should_not_be_deleted();
	}
	
	@Given("^User launches following browser \"(.*?)\"$")
	public void user_launches_following_browser(String browserName) {
		handle.user_launches_following_browser(browserName);
	}
	
	@When("^User verifies home page title$")
	public void user_verifies_home_page_title() {
		handle.user_verifies_home_page_title();
	}
	
	@When("^Home page title validation should be successful$")
	public void home_page_title_validation_should_be_successful() {
		handle.home_page_title_validation_should_be_successful();
	}

	@Given("^Fresh user opens home page$")
	public void fresh_user_opens_home_page() {
		
	}
	
	@When("^User clicks on register button$")
	public void user_clicks_on_register_button() {
		
	}
	
	@Then("^User registration form should be opened$")
	public void user_registration_form_should_be_opened() {
		
	}
	
	
	
	
}
