Feature: Validate Techfios Login Functionality 

Background: 
	Given User is on the Login page   
	
@NewAccount
Scenario Outline: 
	When  User Enters the "<username>" and "<password>"    
	When  User clicks on Login button 
	Then User should be able to see the Dashboard 
	When User clicks on Bank and cash    
	When User clicks on New account
	When User fill up the form Entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" and clicks on submit             
	Then User should be able to see Validate     
	Examples: 
	
|username          |password    |accountTitle|description|initialBalance|accountNumber|contactPerson|phone |internetBankingUrl|
|demo@techfios.com |abc123		|SRahman    |Saving          |3000          |123658       |JR           |123456|SR@gmail.com|