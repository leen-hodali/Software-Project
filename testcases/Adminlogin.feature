Feature: Admin login
	
	  Scenario Outline: System log in with valid credentials 
	    Given System selected to log in
	    When System entered the valid <username> and the valid <password>
	    Then log in must be successful
		
		
	    Examples: 
	      |username|password|
	      |"aya"|"12345"|
	      |"suha"|"94944"|
	     
	
	  Scenario Outline: System has the wrong password 
	    Given System selected to log in
	    When System entered the valid <username> and the unvalid <password>
	    Then log in must be field the password unvalid
	
	    Examples: 
	      |username|password|
	      |"aya"|"22222"|
	      |"suha"|"7234"|
	     
	
	
	  Scenario Outline: System has the wrong username
	    Given System selected to log in
	    When System entered the unvalid <username> and the valid <password>
	    Then log in must be field the username unvalid
	
	    Examples: 
	      |username|password|
	      |"ayat"|"12345"|
	      |"suhal"|"94944"|
	     
	      
	       Scenario Outline: System has the wrong username and password
	    Given System selected to log in
	    When System entered the unvalid <username> and the unvalid <password>
	    Then log in must be field
	
	    Examples: 
	      |username|password|
	      |"ayat"|"22222"|
	      |"suhal"|"33333"|
	     
	      