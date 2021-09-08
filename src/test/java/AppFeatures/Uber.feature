Feature: Uber Booking Feature

@Smoke
Scenario: Booking cab Toyota
Given User wants to select a car type "Toyota" from uber app
When user select car "Toyota" and pick up point "Cambridge" and drop location "London"
Then Driver starts the journey
And Driver finshes the journey
Then User pays 10 pounds

@Regression
Scenario: Booking cab Nissan
Given User wants to select a car type "Nissan" from uber app
When user select car "Nissan" and pick up point "Ely" and drop location "Chesterton"
Then Driver starts the journey
And Driver finshes the journey
Then User pays 10 pounds

@Production
Scenario: Booking cab MINI
Given User wants to select a car type "MINI" from uber app
When user select car "MINI" and pick up point "Luton" and drop location "Cranfield"
Then Driver starts the journey
And Driver finshes the journey
Then User pays 10 pounds
