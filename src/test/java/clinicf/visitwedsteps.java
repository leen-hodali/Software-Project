package clinicf;

import static org.junit.Assert.assertTrue;

import clinicl.Admin;
import clinicl.Book;
import clinicl.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class visitwedsteps {

	Boolean t1,t,v,s,v1;
	User u;
	Admin a;
	Book b;
	
	public visitwedsteps()
	{
		u=new User();
		a=new Admin();
		b=new Book();
	}

	@Given("that the patient {string} is loged in")
	public void thatThePatientIsLogedIn(String username) {
		
		v1 = u.checkuser1(username);
	}
	@When("the patient  went to the appointment {string} and {string} and {string}")
	public void thePatientWentToTheAppointmentAndAnd(String month, String week, String day) {
		assertTrue(v1);
	
		t1 = b.checkapiontment(month,week,day);
	}
	
	@Then("the appointment done")
	public void theAppointmentDone() {
		assertTrue(t1);
		  System.out.print("Ali's appointment done");
		   System.out.print("\n");
		   System.out.print("\n");
		   System.out.print("\n");
	}



	@Given("that the patient {string} is loged in1")
	public void thatThePatientIsLogedIn1(String username) {
		
		v = u.checkuser1(username);
	}
	@When("the patient  went to the appointment1 {string} and {string} and {string}")
	public void thePatientWentToTheAppointment1AndAnd(String month, String week, String day) {
		assertTrue(v);
	
		s= b.checkapiontment1(month,week,day);
	}
	@Then("the appointment done1")
	public void theAppointmentDone1() {
		assertTrue(s);
		  System.out.print("Ameer's appointment done");
		   System.out.print("\n");
		   System.out.print("\n");
		   System.out.print("\n");
		   
		   
	}






}
