Feature: report

Scenario: admin can Generate a report 
Given the Admin "aya" is logged in
And   And the patient "ameer" book an appointment "march" and "week1" and "tuesday" 
When    the coditions true 
Then   report will be generated
  
  
Scenario: admin can not Generate a report 
Given the "suha" Admin is logged in1
And   And the patient "mira" not loged in
When   the coditions false
Then   report will not be generate