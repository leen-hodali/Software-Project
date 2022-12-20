package clinicf;

import static org.junit.Assert.assertTrue;

import clinicl.Admin;
import clinicl.book;
import clinicl.user;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class visitwedsteps {

	Boolean t1,t,v,s,v1;
	user u;
	Admin a;
	book b;
	
	public visitwedsteps()
	{
		u=new user();
		a=new Admin();
		b=new book();
	}

	@Given("that the patient {string} is loged in")
	public void thatThePatientIsLogedIn(String username) {
		u.setUsername(username);
		v1 = u.checkuser1(username);
	}
	@When("the patient  went to the appointment {string} and {string} and {string}")
	public void thePatientWentToTheAppointmentAndAnd(String month, String week, String day) {
		assertTrue(v1);
		b.setMonth(month);
		b.setWeek(week);
		b.setDay(day);
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
		u.setUsername(username);
		v = u.checkuser1(username);
	}
	@When("the patient  went to the appointment1 {string} and {string} and {string}")
	public void thePatientWentToTheAppointment1AndAnd(String month, String week, String day) {
		assertTrue(v);
		b.setMonth(month);
		b.setWeek(week);
		b.setDay(day);
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
