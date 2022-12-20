package clinicf;

import static org.junit.Assert.assertTrue;

import clinicl.Book;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bookAp {
	
	Boolean t1,t;
	Book b;
	public bookAp()
	{
		b=new Book();
	}
	
	
	@Given("a clinic with the following apointment:")
	public void aClinicWithTheFollowingApointment() {
	  
	}
	@Given("the clinic works from saturday to thursday , from {int} AM to {int} PM")
	public void theClinicWorksFromSaturdayToThursdayFromAMToPM(Integer int1, Integer int2, io.cucumber.datatable.DataTable dataTable) {
	   
	}
	@Given("the following weeks:")
	public void theFollowingWeeks(io.cucumber.datatable.DataTable dataTable) {
	   
	}
	@Given("the following days:")
	public void theFollowingDays(io.cucumber.datatable.DataTable dataTable) {
	    
	}
	@Given("the following service")
	public void theFollowingService(io.cucumber.datatable.DataTable dataTable) {
	   
	}
	@Given("the patiant booked an apointment and service")
	public void thePatiantBookedAnApointmentAndService() {
	    
	}
	
	@Given("the patiant booked an apointment")
	public void thePatiantBookedAnApointment() {
	    
	}
	
	
	@When("the <ali> choose the available apointment {string} and {string} and {string}")
	public void theAliChooseTheAvailableApointmentAndAnd(String month, String week, String day) {
		b.setMonth(month);
		b.setWeek(week);
		b.setDay(day);
		t = b.thebook(month,week,day);
	}
	
	@When("choose the service {string} and {string}")
	public void chooseTheServiceAnd(String service, String price) {
		b.setService(service);
		b.setPrice(price);
		
	}
	@Then("the book must be successful")
	public void theBookMustBeSuccessful() {
		assertTrue("It's not successful",t);
	}
	
	

	
	@When("the <ali> choose the unavailable apointment {string} and {string} and {string}")
	public void theAliChooseTheUnavailableApointmentAndAnd(String month, String week, String day) {
		b.setMonth(month);
		b.setWeek(week);
		b.setDay(day);
		t = b.thebook(month,week,day);  
	}
	@When("choose1 the service {string} and {string}")
	public void choose1TheServiceAnd(String service, String price) {
		b.setService(service);
		b.setPrice(price);
		
	}
	@Then("the book must be failed")
	public void theBookMustBeFailed() {
		assertTrue("login successful",!t);
	}


	

	@When("the <ameer> select the available apointment {string} and {string} and {string}")
	public void theAmeerSelectTheAvailableApointmentAndAnd(String month, String week, String day) {
		b.setMonth(month);
		b.setWeek(week);
		b.setDay(day);
		t = b.thebook(month,week,day);
	}
	@When("choose2 the service {string} and {string}")
	public void choose2TheServiceAnd(String service, String price) {
		b.setService(service);
		b.setPrice(price);
		
	}
	@Then("the book must be successful1")
	public void theBookMustBeSuccessful1() {
		assertTrue(t);
	}


	
	@When("the <ameer>  select the unavailable apointment {string} and {string} and {string}")
	public void theAmeerSelectTheUnavailableApointmentAndAnd(String month, String week, String day) {
		b.setMonth(month);
		b.setWeek(week);
		b.setDay(day);
		t = b.thebook(month,week,day);
	}
	@When("choose3 the service {string} and {string}")
	public void choose3TheServiceAnd(String service, String price) {
		b.setService(service);
		b.setPrice(price);
	
	}
	@Then("the book must be failed1")
	public void theBookMustBeFailed1() {
		assertTrue(!t);
	}









}
