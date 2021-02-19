#Instructor MD Islam
#Date 02/09/2021
#Creator SR
@SmokeTest
Feature: Validate Techfios Login Functionality 

Background:
     Given User is on the Login page        
@Scenario1
Scenario Outline:User should be able to Login with valid credentials
	When User enters the "<username>" and "<password>"       
	When User clicks on Login button   
	Then User should be able to see the Dashboard       
	When User clicks on Bank and cash   
	When User clicks on New account  
	When User fill up the form Entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" and clicks on submit                  
	Then User should be able to see Validate             
	
	Examples:
	|username         |password|
	|demo@techfios.com|abc123|
	
   
   
