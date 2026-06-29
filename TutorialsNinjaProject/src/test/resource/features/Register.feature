@all 
Feature: User Registration

Background:
Given User navigates to Register Account page 

@regiaster @mandatoryfields @smoke @regression 
Scenario: Register with mandatory fields
Given User navigates to Login page
When User enters firstname "Akash" into the First Name field
And User enters lastname "Sabar" into the Last Name field
And User enters email address "akashsabar@gmail.com" into the Email field
And User enters phone number "9999333300" into the Phone field
And User enters password "12345" into the Password field
And User enters password "12345" into the Password Confirm field
And User selects Privacy Policy field
And User clicks on Continue button
Then Account should get successfully created

@regiaster @allfields @smoke @regression 
Scenario: Register with mandatory fields and newsletter
Given User navigates to Login page
When User enters firstname "Akash" into the First Name field
And User enters lastname "Sabar" into the Last Name field
And User enters email address "akashsabar@gmail.com" into the Email field
And User enters phone number "9999333300" into the Phone field
And User enters password "12345" into the Password field
And User enters password "12345" into the Password Confirm field
And User selects Yes for Newsletter
And User selects Privacy Policy field
And User clicks on Continue button
Then Account should get successfully created

@register @nodetails @regression 
Scenario: Register without providing any fields
Given User navigates to Register Account page
When User does not enter details into any fields
And User clicks on Continue button
Then Warning messages should be displayed for the mandatory fields

@register @allfields @smoke @regression 
Scenario: Register with duplicate email address
Given User navigates to Register Account page
When User enters firstname "Akash" into the First Name field
And User enters lastname "Sabar" into the Last Name field
And User enters email address "akashsabar9@gmail.com" into the Email field
And User enters phone number "9999333300" into the Phone field
And User enters password "12345" into the Password field
And User enters password "12345" into the Password Confirm field
And User selects Yes for Newsletter
And User selects Privacy Policy field
And User clicks on Continue button
Then Warning message informing the User about duplicate email should be displayed