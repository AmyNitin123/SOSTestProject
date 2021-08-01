@Search-Software
Feature: Acceptance testing to validate Wikipedia is ranked top on Software Google Saerch

  @Search-Software
  Scenario Outline: Validate first Rank of Wikipedia link 
    Given User navigate to "https://www.google.com" Google Home page
    When Enter "<Searchterm>" as search term
    Then ensure "<RankItem>" is returned as the first rank
    
Examples:
|Searchterm||RankItem|
|Software||Wikipedia|


