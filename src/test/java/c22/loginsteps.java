package c22;

import static org.junit.Assert.assertTrue;

import c21.Admin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginsteps {

	Boolean t1,t;
	Admin a;
	public loginsteps()
	{
		a=new Admin();
	}
	
@Given("System selected to log in")
public void system_selected_to_log_in() {
   
}

@When("System entered the valid {string} and the valid {string}")
public void system_entered_the_valid_and_the_valid(String username, String password) {
	a.setUsername(username);
	a.setPasword(password);
	t = a.login(username,password);
}

@Then("log in must be successful")
public void log_in_must_be_successful() {
	assertTrue("It's not successful",t);
}



@When("System entered the valid {string} and the unvalid {string}")
public void system_entered_the_valid_and_the_unvalid(String username, String password) {
	a.setUsername(username);
	a.setPasword(password);
	t = a.login(username,password);
}

@Then("log in must be field the password unvalid")
public void log_in_must_be_field_the_password_unvalid() {
	assertTrue("login successful",!t);
	
}

@When("System entered the unvalid {string} and the valid {string}")
public void system_entered_the_unvalid_and_the_valid(String username, String password) {
	a.setUsername(username);
	a.setPasword(password);
	t = a.login(username,password);
}

@Then("log in must be field the username unvalid")
public void log_in_must_be_field_the_username_unvalid() {
	assertTrue(!t);
}

@When("System entered the unvalid {string} and the unvalid {string}")
public void system_entered_the_unvalid_and_the_unvalid(String username, String password) {
	a.setUsername(username);
	a.setPasword(password);
	t = a.login(username,password);
}

@Then("log in must be field")
public void log_in_must_be_field() {
	assertTrue(!t);
}



}
