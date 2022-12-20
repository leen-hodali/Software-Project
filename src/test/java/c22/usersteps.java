package c22;

import static org.junit.Assert.assertTrue;
import c21.user;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class usersteps {
	Boolean t1,t;
	user u;
	
	public usersteps()
	{
		u=new user();
	}

	@Given("user selected to log in")
	public void userSelectedToLogIn() {
	    
	}
	@When("user entered the valid {string} and the valid {string}")
	public void userEnteredTheValidAndTheValid(String username, String password) {
		u.setUsername(username);
		u.setPasword(password);
		t = u.login(username,password);
	}
	@Then("log in must be successful1")
	public void logInMustBeSuccessful() {
		assertTrue("It's not successful",t);
	}


	@When("user entered the valid {string} and the unvalid {string}")
	public void userEnteredTheValidAndTheUnvalid(String username, String password) {
		u.setUsername(username);
		u.setPasword(password);
		t = u.login(username,password);
	}
	@Then("log in must be field the password unvalid1")
	public void logInMustBeFieldThePasswordUnvalid() {
		assertTrue("login successful",!t);
	    
	}
	

	@When("user entered the unvalid {string} and the valid {string}")
	public void userEnteredTheUnvalidAndTheValid(String username, String password) {
		u.setUsername(username);
		u.setPasword(password);
		t = u.login(username,password);
	}
	@Then("log in must be field the username unvalid1")
	public void logInMustBeFieldTheUsernameUnvalid() {
		assertTrue(!t);
	}
	


	
	@When("user entered the unvalid {string} and the unvalid {string}")
	public void userEnteredTheUnvalidAndTheUnvalid(String username, String password) {
		u.setUsername(username);
		u.setPasword(password);
		t = u.login(username,password);
	}
	@Then("log in must be field1")
	public void logInMustBeField() {
		assertTrue(!t);
	
	}


}
