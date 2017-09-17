Feature:  Advanced Cucumber test result reporting 

Background: 
	Given Web application is in running state 
	And Web browser is launched

@homePageTest	
Scenario: User login 
	Given Home page is launched
	When  Click on login
	Then Following fields should be shown username and password 
	When Valid user name and password is used 
	Then Login should be successful 
	But Register option should not be visible

@homePageTest	
Scenario: User change address
	Given User is already logged in
	When  When user edits address
	Then Editing address should be possible 
	 	
@homePageTest	
Scenario Outline: Home page loading on different browsers
	Given User launches following browser "<browser name>"
	When  User verifies home page title
	When Home page title validation should be successful
	 
	Examples:
	|browser name      |
	| chrome           |
	| mozilla          |
	| internet explorer|
	