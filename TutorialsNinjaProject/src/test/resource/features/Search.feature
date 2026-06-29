@all
Feature:Search functionality 

Background:
Given User opens the Application 

@search @validproduct @smoke @regression
Scenario: Search for a valid product
Given User opens the Application 
When User enters valid product into Search field 
And User clicks on Search button 
Then Valid Product should get displayed in search results 

@search @nonexistingproduct @regression 
Scenario: Search for a non-existing product 
Given USer open the Application 
When User enter non-existing product into Search field 
And User click on Search button 
Then Proper text informing the User about no product matching should be displayed 

@search @noproduct @regression 
Scenario: Search without providing product 
Given USer open the Application 
When User dont enter any product into Search field 
And User click on Search button 
Then Proper text informing the User about no product matching should be displayed 