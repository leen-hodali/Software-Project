Feature: user login
	
	  Scenario Outline: user log in with valid credentials 
	    Given user selected to log in
	    When user entered the valid <username> and the valid <password>
	    Then log in must be successful1
		
		
	    Examples: 
	      |username|password|phone#|id|
	      |"ali"|"123451"|"0598672242"|"1"|
	      |"ameer"|"949441"|"0598674522"|"2"|
	     
	     
	
	  Scenario Outline: user has the wrong password 
	    Given user selected to log in
	    When user entered the valid <username> and the unvalid <password>
	    Then log in must be field the password unvalid1
	
	    Examples: 
	      |username|password|phone#|id|
	      |"ali"|"222221"|"0598672242"|"1"|
	      |"ameer"|"72341"|"0598674522"|"2"|
	      
	     
	
	
	  Scenario Outline: user has the wrong username
	    Given user selected to log in
	    When user entered the unvalid <username> and the valid <password>
	    Then log in must be field the username unvalid1
	
	    Examples: 
	      |username|password|phone#|id|
	      |"ayat"|"123451"|"0598672242"|"1"|
	      |"suhal"|"949441"|"0598674522"|"2"|
	      
	     
	      
	       Scenario Outline: user has the wrong username and password
	    Given user selected to log in
	    When user entered the unvalid <username> and the unvalid <password>
	    Then log in must be field1
	
	    Examples: 
	      |username|password|phone#|id|
	      |"ayat"|"222221"|"0598672242"|"1"|
	      |"suhal"|"333331"|"0598674522"|"2"|
	      
	     
	      