Feature: search service 


Scenario: search by a name 
	Given admin choose to search by name 
	When i entered a valid username "ali" 
	Then the user for this name will shown 
	
	
Scenario: search by  id 
	Given i choose to search by id 
	When i entered a valid id "2" 
	Then  the user for this id  will shown 
	
	
Scenario: search by a name when No user match the criteria 
	Given i choose to search by name 
	When i entered  invalid name "seema" 
	Then no information will apear 
	
	
Scenario: search by a id when No user match the criteria 
	Given i choose to search by id 
	When i entered  invalid id "6" 
	Then no information will apear1 
	
	
Scenario: search by a name when there is more than one with same name
	Given i choose to search by name 
	When i entered a valid name "ameer" 
	Then all users for this name will shown 
	

	