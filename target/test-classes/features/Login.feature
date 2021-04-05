Feature: Login in to application
Scenario Outline: Positive Testing Login
Given Initialize the browser with chrome 
And  Navigate to "http://www.qaclickacademy.com/" website
And click on login link to land in to signin page
When the user enters the "<username>" and "<password>" and logs in 
Then verify the user is sucessfully login

#parameterising the sceanarios that means reusing multiple data for the sametestcase

Examples:	 		
|username		|password	|
|"test99@gmail.com"	|	|"123456"	|
|"sainellore123@gmail.com"	|	|"45678	|	