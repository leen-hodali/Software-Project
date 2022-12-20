package clinicf;

import clinicl.Admin;
import clinicl.user;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deletesteps {
	
	Boolean t1,t;
	user d;
	Admin de;
	public deletesteps()
	{
		d=new user();
		de=new Admin();
	}
	


	@Given("admin want to delete user")
	public void adminWantToDeleteUser() {
		
	}
	
	@When("admin click to delte {string}")
	public void adminClickToDelteIt(String name) {
		d.setUsername(name);
		t = d.delete(name);
	}
	

	@Then("you will see it deleted in record")
	public void youWillSeeItDeletedInRecord() {
		System.out.print("deleted user");  
		System.out.print("\n"); 
	  
	}
	


	@Given("admin want to delete service")
	public void adminWantToDeleteService() {
	    
	}
	
	@When("admin click to delete {string} and {string}")
	public void adminClickToDeleteAnd(String service, String price) {
		de.setService(service);
		de.setPrice(price);
		t = de.deletes(service,price);
	}
	@Then("you will see service deleted in record")
	public void youWillSeeServiceDeletedInRecord() {
		System.out.print("deleted service");  
		 System.out.print("\n");
		   System.out.print("\n");
		   System.out.print("\n");
	}







}
