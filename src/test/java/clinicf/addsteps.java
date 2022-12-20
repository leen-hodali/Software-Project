package clinicf;

import static org.junit.Assert.assertTrue;

import clinicl.Admin;
import clinicl.user;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addsteps {
	
	boolean l, v, t,t1;
	user ss;
	Admin as;
	Admin a = new Admin();
	public addsteps()
	{
		ss=new user();
		as=new Admin();
	}
	

	@Given("Admin loged in")
	public void adminLogedIn() {
	   
	}
	@When("Admin {string} select to add user")
	public void adminSelectToAddUser(String username) {
		l = as.checkLogin(username);
	}
	@When("Admin must enter the {string},{string},{string},{string}")
	public void adminMustEnterThe(String username, String password, String phone, String id) {
		ss.setUsername(username);
		ss.setPasword(password);
		ss.setPhone(phone);
		ss.setId(id);
		t = ss.adduser(username,password,phone,id);
		
	}
	@Then("user was added to the record")
	public void userWasAddedToTheRecord() {
		assertTrue("failed",t);
	}




	@When("Admin {string} select to add user1")
	public void adminSelectToAddUser1(String username) {
		l = as.checkLogin(username);
	}
	



	@When("Admin must enter the1 {string},{string},{string},{string}")
	public void adminMustEnterThe1(String username, String password, String phone, String id) {
		
		ss.setUsername(username);
		ss.setPasword(password);
		ss.setPhone(phone);
		ss.setId(id);
		v = ss.checkuser(username,id);
		
		
	}
	
	@Then("This user is already exist")
	public void thisUserIsAlreadyExist() {
		assertTrue("done",!v);
	}
	


	@Given("Admin not loged in")
	public void adminNotLogedIn() {
	  
	}
	@When("Admin with select to add user")
	public void adminWithSelectToAddUser() {
		l = as.checkLogin("tamer");
	}
	@Then("Admin could not add user")
	public void adminCouldNotAddUser() {
		assertTrue(!l);
	}
	


	@When("Admin {string} select to add service")
	public void adminSelectToAddService(String username) {
		l = as.checkLogin(username);
	}
	@When("Admin must enter the {string},{string}")
	public void adminMustEnterThe(String service, String price) {
		as.setService(service);
		as.setPrice(price);
		t1 = as.addservice(service,price);
	}
	@Then("service was added to the record")
	public void serviceWasAddedToTheRecord() {
		assertTrue("failed",t1);
	}



}
