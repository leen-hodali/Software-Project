Feature: book apointment


  Background:
    Given a clinic with the following apointment:
    And the clinic works from saturday to thursday , from 8 AM to 8 PM
    
    |month|
    |"January"|
    |"February"| 
    |"March"| 
    |"April"| 
    |"May"| 
    |"June"| 
    |"July"| 
    |"August"| 
    |"September"| 
    |"October"| 
    |"November"| 
    |"December"|
    
    And the following weeks:
     | week  |
    |"week1"|
	|"week2" |
	|"week3"|
	|"week4" |
	
    And the following days:
    
    | day  |
    |"saturday"|
	|"sunday" |
	|"monday"|
	|"tuesday" |
	|"wednesday"|
	|"thursday" |
	|"friday"|
	
	
	And the following service
	
 |service|price|
 |"Root canal treatment"|"200"|
 |"Scale and polish"|"100"| 
 |"Braces"|"300"|
 |"Dental implants"|"200"|
 |"cleaning teath"|"50"|
      
	  Scenario Outline:the patiant book available apointment and service
	    Given the patiant booked an apointment and service
	    When the <ali> choose the available apointment <month> and <week> and <day>
	    And choose the service <service> and <price>
	    Then the book must be successful
		
		
	    Examples: 
	|month|week|day|service|price|
    |"January"|"week2"|"saturday"|"Root canal treatment"|"200"|
    |"January"|"week2"|"saturday"|"Braces"|"300"|
	
	      
	      
	       Scenario Outline:the patiant book unavailable apointment
	    Given the patiant booked an apointment
	    When the <ali> choose the unavailable apointment <month> and <week> and <day>
	    And choose1 the service <service> and <price>
	    Then the book must be failed
		
		
	    Examples: 
	    |month|week|day|service|price|
     	|"April"|"week4"|"friday" |"Braces"|"300"|
	   
	      
	     Scenario Outline:the patiant book available apointment
	    Given the patiant booked an apointment
	    When the <ameer> select the available apointment <month> and <week> and <day>
	     And choose2 the service <service> and <price>
	    Then the book must be successful1
		
		
	    Examples: 
	     |month|week|day|service|price|
         |"March"|"week1"|"tuesday"|"Root canal treatment"|"200"|
	     |"April"|"week4"|"sunday" |"Scale and polish"|"100"| 
	      
	 Scenario Outline:the patiant book unavailable apointment
	    Given the patiant booked an apointment
	    When the <ameer>  select the unavailable apointment <month> and <week> and <day>
	    And choose3 the service <service> and <price>
	    Then the book must be failed1
		
		
	    Examples: 
	     |month|week|day|service|price|
     	|"November"|"week1"|"friday" |"Root canal treatment"|"200"|
	     