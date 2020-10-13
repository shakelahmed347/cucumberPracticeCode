
Feature: Home page  

@first
Scenario: Verifying Personal module
Given Open the chrome browser and go the url 
When I'm checking Personal feature spelling
Then I'm checking clickable personal feature
Then I find out loans and credit feature


@Second
Scenario: Verifying Small business module
When I'm checking Small business feature spelling 
Then I'm checking clickable small business feature
Then I find out merchant service

@Third
Scenario: Verifying Commercial module
When I'm checking Commercial feature spelling
Then I'm checking clickable commercial feature
Then I'm got insights


@Four
Scenario: Verifying Financial Education module
When I'm checking Financial education module spelling
Then I'm checking clickable financial education feature
Then I got investing


@Five
Scenario: Verifying About Wells Fargo module
When I'm checking about wells fargo feature spelling
Then I'm checking clickable about wells fargo feature 
Then I'm got about wells fargo text
