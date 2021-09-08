Feature: Home page
in order to check my order details
As a registered user
I want to specify the fatures of order details page

Background:
Given a registed user exists
Given user is on Amason login page
When user enters username
And user enters password
And user click on login button
Then user navigates to orger page

Scenario: Check previous Order Details
When user clicks on Order link
Then user checks the previous order details

Scenario: Check open Order Details
When user clicks on open Order link
Then user checks the open order details

Scenario: Check cancelled Order Details
When user clicks on cancelled Order link
Then user checks the cancelled order details	