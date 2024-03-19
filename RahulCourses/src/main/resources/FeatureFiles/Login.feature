Feature: Search Test for the functionality


  @SmokeTest
  Scenario Outline: To test the search
  
    Given User opens the homepage
    When User enters the <username> and <password> in the search area
    And User clicks on Login
    Then User should be redirected to the Google page
    
    Examples: 
   
   | username | password     |
    | Ujjwal   | Shrivastava |
   






