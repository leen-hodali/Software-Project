Feature: appointment is done

Scenario: the patient finished his/her appointment
Given that the patient "ali" is loged in
When the patient  went to the appointment "January" and "week2" and "saturday"
Then the appointment done 

Scenario: the patient finished his/her appointment1
Given that the patient "ameer" is loged in1
When the patient  went to the appointment1 "march" and "week1" and "tuesday"
Then the appointment done1 

