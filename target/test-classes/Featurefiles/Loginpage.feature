
  Feature: To verify New user register funtionality
  
  
  Scenario Outline: To verify new user register with new credential  
    
    Given User launch adactin signup page
    When User needs to enter "<username>"
	  And User enter "<password>" and "<confirm password>"
	  And User enters "<full name>" and "<email address>"
	  And check terms and condition
	  And click register button
	  Then User created account
	  
	  Examples:
	     |username|password|confirm password|full name|email address|
	     |Priya161|priya123|priya123|priya|mshanmugapriya@gmail.com|
	     
	     
	     
	 Scenario Outline: To verify login functionality
	 Given User launch adactin login page
	 When User needs to enter "<username>" and "<password>"
	 And click login button
	 Then User should be in adactin login page
	 
	 Examples:
	 |username|password|
	 |priyavimal16|priya789|
	 
	 
	 Scenario Outline: To verify search page functionality
	 
	 Given User should be in search page
	 When select city for location
	 And select hotel and Roomtype
	 And Select no of rooms
	 And User enters "<checkin>" and "<checkout>" dates
	 And User select Adults per room
	 And Select children per room
	 And click search button
	 Then User enters to available hotel page
	 
	 Examples:	 
	 |checkin|checkout|
	 |01/06/2020|02/06/20|
	 
	 
	 Scenario: Select hotel	
	 When Select the hotel
	 And click continue button
	 
	 Scenario: Booking hotel page	 
	 When User needs to enter Firstname and lastname and address and creditcard	 
	 |Firstname		|lastname		|address		|creditcard		|
	 |priya				|vimal			|123,abc		|1234567887456321 |
	 And user needs to select creditcard type and expiry date
	 And user needs to enter cvvnumber
	 |cvvnumber|951|
	 And click the booknow button
	
	 Scenario: To validate booking confirmation page	  
	 When get the order no
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 