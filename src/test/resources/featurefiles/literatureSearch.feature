@Search-Software
Feature: Acceptance testing to validate britannica.com ranking position on Literature Google Search
 To Validate britannica.com is returned in the search result and display the position or index of the result

  @Search-Literature-Positive
  Scenario Outline: Validate Rank of britannica.com on Literature Search Results Page
    Given User navigate to "https://www.google.com" Google Home page 
    When Enter "Literature" as the search item
    Then Validate the position of "britannica.com"
    
Examples:
|keyword||SearchItem||RankingItem|
|Software||Literature||britannica.com|


