package c22;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import c21.Admin;

public class logoutsteps {
	
	Admin bl;
	boolean t;

	public logoutsteps(Admin bl1) {
		super();
		bl = bl1;
	}

	@Given("Admin already log in")
	public void admin_already_log_in() {

	}

	@When("he {string} select to log out")
	public void he_select_to_log_out(String username) {
		t = bl.logout(username);
	}

	@Then("log out done")
	public void log_out_done() {
		assertTrue(t);
	}

}







