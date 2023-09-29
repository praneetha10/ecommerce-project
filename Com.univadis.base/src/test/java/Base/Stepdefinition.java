package Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefinition {
	
	@Given("User has launched url")
	public void launchurl() {
		
	}
	@Given("User has logged in with following crediantials")
	public void enterCredentials(DataTable credentials) {
	    
	}

	@Given("user has clicked on login button")
	public void user_has_clicked_on_login_button() {
		
	  
	}
	

	@Then("user should land on Dashboard")
	public void user_should_land_on_dashboard() {
	    
	}
    
	@Then("user should verify {string} on dashboard")
	public void user_should_verify_on_dashboard(String element) {
	   
	}




}
