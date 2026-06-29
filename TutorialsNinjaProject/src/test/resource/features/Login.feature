Feature: User Login

Registered User should be able to login to access account details
@login @validcredentials @all @smoke @regression 
Scenario Outline:Login with valid credentials
Given User navigates to Login page
When User enters valid email address "akash@gmail.com"
And User enters valid password "12345"
And User clicks on Login button
Then User should login successfully

Examples:
|email              |password|
|akash@gmail.com    |12345   |
|wrong@gmail.com    |1234567 |

@login @invalidcredentials @all @smoke @regression 
Scenario: Login with invalid credentials
Given User navigates to Login page
When User enters invalid email address "wrong@gmail.com"
And User enters invalid password "1234567"
And User clicks on Login button
Then User login should get a proper warning message

@login @validemailandinvalidpassword @all @regression 
Scenario: Login with valid email address and invalid password
Given User navigates to Login page
When User enters valid email address "akash@gmail.com"
And User enters invalid password "1234567"
And User clicks on Login button
Then User should get a proper warning message

@login @invalidemailandvalidpassword @all @regression 
Scenario: Login with invalid email address and valid password
Given User navigates to Login page
When User enters invalid email address "wrong@gmail.com"
And User enters valid password "12345"
And User clicks on Login button
Then User should get a proper warning message

@login @nocredentials @all @regression 
Scenario: Login without providing any credentials
Given User navigates to Login page
When User does not enter any credentials
And User clicks on Login button
Then User should get a proper warning message