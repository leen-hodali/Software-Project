Feature: billing

Scenario: the patient choose one service
Given that the patient is loged in
When the patient "ali" book an appointment in "January" and "week2" and "saturday" and  choose the service
Then then the user should receive the "Root canal treatment" for the "200"

Scenario: the patient choose two service
Given that the patient is loged in
When the patient1 "ameer" book an appointment in "march" and "week1" and "tuesday" and  choose the service
Then then the user should receive the "Root canal treatment" for the first "200" and the "Braces" for the second "300"
