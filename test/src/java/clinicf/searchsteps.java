package clinicf;


import static org.junit.Assert.assertTrue;

import clinicl.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchsteps {
	

	Boolean t1,t;
	User s;
	public searchsteps()
	{
		s=new User();
	}
	

	@Given("admin choose to search by name")
	public void adminChooseToSearchByName() {
	
	}
	
	@When("i entered a valid username {string}")
	public void iEnteredAValidUsername(String name) {
		
	    t = s.search(name);
	   
	}
	@Then("the user for this name will shown")
	public void theUserForThisNameWillShown() {
		assertTrue("It's not found",t);
	  
	}

	
	@Given("i choose to search by id")
	public void iChooseToSearchById() {
	 
	}
	@When("i entered a valid id {string}")
	public void iEnteredAValidId(String id) {

	    t = s.search1(id);
	}
	@Then("the user for this id  will shown")
	public void theUserForThisIdWillShown() {
		assertTrue("not found",t);
	}
	
	

	@Given("i choose to search by name")
	public void iChooseToSearchByName() {
	  
	}


	@When("i entered  invalid name {string}")
	public void iEnteredInvalidName(String name) {
		
	    t = s.search(name);
	   
	}
	@Then("no information will apear")
	public void noInformationWillApear() {
		assertTrue("successful",!t);
	}
	
	

	@When("i entered  invalid id {string}")
	public void iEnteredInvalidId(String id) {
		
	    t = s.search1(id);
	}
	
	@Then("no information will apear1")
	public void noInformationWillApear1() {
		assertTrue("successful!",!t);
	}
	
	

	@When("i entered a valid name {string}")
	public void iEnteredAValidName(String name) {
		
	    t = s.search(name); 
	}
	@Then("all users for this name will shown")
	public void allUsersForThisNameWillShown() {
		assertTrue(t);
	}















}
