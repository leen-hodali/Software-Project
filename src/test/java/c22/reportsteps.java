package c22;

import c21.user;

import static org.junit.Assert.assertTrue;

import c21.Admin;
import c21.book;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class reportsteps {
	Boolean t1,t,v;
	user u;
	Admin a;
	book b;
	
	public reportsteps()
	{
		u=new user();
		a=new Admin();
		b=new book();
	}
	

	@Given("the Admin {string} is logged in")
	public void theAdminIsLoggedIn(String username) {
		a.setUsername(username);
		t = a.checkLogin(username);
	}




	@Given("And the patient {string} book an appointment {string} and {string} and {string}")
	public void andThePatientBookAnAppointmentAndAnd(String username, String month, String week, String day) {
		u.setUsername(username);
		b.setMonth(month);
		b.setWeek(week);
		b.setDay(day);
		t1 = b.checkapiontment1(month,week,day);
	}


	
	@When("the coditions true")
	public void theCoditionsTrue() {
		assertTrue(t1);
	}
	
	@Then("report will be generated")
	public void reportWillBeGenerated() {
		System.out.print("Report");
		 System.out.print("\n");
		 System.out.print("paitiant:ameer");
		 System.out.print("\n");
		System.out.print("phone:0598674522");
		System.out.print("\n");
	   System.out.print("id:2");
	   System.out.print("\n");
	   System.out.print("The first appointment:2/3/2023");
		System.out.print("\n");
	   System.out.print("The fisrt service:Root canal treatment");
		System.out.print("\n");
	   System.out.print("price:200");
	   System.out.print("\n");
	   System.out.print("The second appointment:24/4/2023");
		System.out.print("\n");
	   System.out.print("The second service:Scale and polish");
		System.out.print("\n");
	   System.out.print("price:100");
	   System.out.print("\n");
	   System.out.print("\n");
	   System.out.print("\n");
	}

	

	@Given("the {string} Admin is logged in1")
	public void theAdminIsLoggedIn1(String username) {
		a.setUsername(username);
		t = a.checkLogin(username);
	}
	@Given("And the patient {string} not loged in")
	public void andThePatientNotLogedIn(String username) {
		
		u.setUsername(username);
		v = u.checkuser1(username);
	}
	@When("the coditions false")
	public void theCoditionsFalse() {
		assertTrue(!v);
	}
	@Then("report will not be generate")
	public void reportWillNotBeGenerate() {
		 System.out.print("sorry we can not generate this report because this user is not loged in");
		   System.out.print("\n");
		   System.out.print("\n");
		   System.out.print("\n");
	}









}
