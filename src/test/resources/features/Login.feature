Feature: verify Login functionality 
@Smoke
@Regression
Scenario Outline: verify login page
Given login page should be open in default browser
When click on username field and add valid user <username1> and <password1> <status>

Then login successfully and redirect to home page
Examples:
|username1|password1|status|
|username|password|success|
|jefggf988765|password|fail|
|username|bs75|Fail|
|bvfhjwge32|kj989674|Fail|
@Smoke
Scenario: reg

@Smoke
@Regression
Scenario: search
@smoke
@Regression
Scenario: product details
Given Regitration
Scenario:

Given login 
Scenario:

Given search
Scenario:

Given Add to cart




 