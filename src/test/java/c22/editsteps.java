package c22;

import static org.junit.Assert.assertTrue;

import c21.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editsteps {
	int index=-1;
	public static int search(String phone) 
	{
		for(int i=0;i<user.phone.size();i++)
		{
			if(phone.equals(user.phone.get(i)))
				return i;
		}
		return -1;	
	}
	

	@Given("admin want to change phone for {string} which is {string}")
	public void adminWantToChangePhoneForWhichIs(String string, String string2) {
		index=search(string2);
	}
	
	

	@When("admin change it to {string}")
	public void adminChangeItTo(String string) {
		
    	user.phone.set(index, string);
	}



	@Then("you will see phone changed in record")
	public void youWillSeePhoneChangedInRecord() {
		assertTrue(index!=-1);
	}

}
