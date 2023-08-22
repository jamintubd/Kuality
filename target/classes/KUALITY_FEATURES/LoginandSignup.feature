Feature: Login and Signup

Scenario: Verify user can signup
Given Open "<URL>"Applicaton URL
Then Mouseover Signin link
Then Click Create Account
Then Enter FirstName LastName
Then Enter Email address
Then Enter passwork
Then Click Creat Account
Then verity user can signup successfully 
