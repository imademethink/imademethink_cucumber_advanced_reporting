Feature:  Advanced Cucumber test result reporting 

@homePageTestOther
Scenario: User log out
	Given User is already logged in
	When  User clicks on logout button
	Then User log out should be successful
	But Cookies should not be deleted

Scenario: User registration
	Given Fresh user opens home page 
	When  User clicks on register button
	Then User registration form should be opened
	 	
	 	