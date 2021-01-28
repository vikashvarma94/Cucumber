Feature: GW Login

#Scenario: login
#
#Given  user is available in login page
#When title of login page is jenkins
#Then user enters "vikashvarma94" and "vikash@94"
#Then user clicks on login button
#Then user is on homepage
#Then close the browser

Scenario Outline: login

Given user is available in login page
When title of login page is jenkins
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on homepage
Then close the browser

Examples: 
		| username | password |
		| vikashvarma94 | vikash@94 |
		| Test | Test |