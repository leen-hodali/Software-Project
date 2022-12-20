Feature: add 
  
  Add users,service  and Only the 
    administrator can do this. Thus, the administrator has to be logged in. 

  Scenario: Add a user when the Admin is logged in 
    Given Admin loged in
    When Admin "aya" select to add user
    And Admin must enter the "obada","12344","0594678231","3"
    Then user was added to the record

  Scenario: Add a user when the Admin is logged in and enter an exist user
    Given Admin loged in
    When Admin "aya" select to add user1
     And Admin must enter the1 "ali","123451","0598672242","1"
    Then This user is already exist

  Scenario: Add a user when the Admin is not logged in 
    Given Admin not loged in
    When Admin with select to add user
    Then Admin could not add user
    
     Scenario: Add a service when the Admin is logged in 
    Given Admin loged in
    When Admin "suha" select to add service
    And Admin must enter the "teeth whitening","150"
    Then service was added to the record
    
   