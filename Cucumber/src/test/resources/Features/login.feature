@FunctionalTest
Feature: GW Login

#@SmokeTest
#Scenario: login
#
#Given  user is available in login page
#When title of login page is jenkins
#Then user enters "vikashvarma94" and "vikash@94"
#Then user clicks on login button
#Then user is on homepage
#Then close the browser

@RegressionTest
Scenario Outline: login

Given user is available in login page
When title of login page is jenkins
Then user enters "<username>" and "<password>" and login
Then user is on homepage


Examples: 
		| username | password |
		| vikashvarma94 | vikash@94 |
		| Test | Test |