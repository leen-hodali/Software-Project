package clinicf;

import static org.junit.Assert.assertTrue;

import clinicl.Book;
import clinicl.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class billingsteps {
	
	Boolean t1,t;
	User a;
	Book b;
	public billingsteps()
	{
		a=new User();
		b=new Book();
	}

	@Given("that the patient is loged in")
	public void thatThePatientIsLogedIn() {
	 
	}
	
	
	

	@When("the patient {string} book an appointment in {string} and {string} and {string} and  choose the service")
	public void thePatientBookAnAppointmentInAndAndAndChooseTheService(String username, String month, String week, String day) {
		a.setUsername(username);
		b.setMonth(month);
		b.setWeek(week);
		b.setDay(day);
		t = b.checkapiontment(month,week,day);
	}


	@Then("then the user should receive the {string} for the {string}")
	public void thenTheUserShouldReceiveTheForThe(String service, String price) {
		assertTrue("failed",t);
		System.out.print("ali's billing:");
		 System.out.print("\n");
		 System.out.print("ali");
		 System.out.print("\n");
		System.out.print(service);
		System.out.print("\n");
	   System.out.print(price);
	   System.out.print("\n");
	   System.out.print("\n");
	}




	@When("the patient1 {string} book an appointment in {string} and {string} and {string} and  choose the service")
	public void thePatient1BookAnAppointmentInAndAndAndChooseTheService(String username, String month, String week, String day) {
		a.setUsername(username);
		b.setMonth(month);
		b.setWeek(week);
		b.setDay(day);
		t1 = b.checkapiontment1(month,week,day);
	}
	@Then("then the user should receive the {string} for the first {string} and the {string} for the second {string}")
	public void thenTheUserShouldReceiveTheForTheFirstAndTheForTheSecond(String service1, String price1, String service2, String price2) {
		assertTrue("failed",t1);
		 int number1 = Integer.parseInt(price1);
		 int number2 = Integer.parseInt(price2);
		 System.out.print("ameer's billing:");
		 System.out.print("\n");
		 System.out.print("ameer");
		 System.out.print("\n");
		System.out.print(service1);
		System.out.print("\n");
	   System.out.print(price1);
	   System.out.print("\n");
	   
	   System.out.print(service2);
		System.out.print("\n");
	   System.out.print(price2);
	   System.out.print("\n");
	   System.out.println("The total = " + Integer.sum(number1, number2));  
	   System.out.print("\n");
	   System.out.print("\n");

	   
	  

	}















}
