Feature: ProductsPage
   
  Scenario: Validate the filter icon of Products page
		Given Chrome is opened and SwagLabs app is opened
		When User enters correct Username "standard_user" and Password "secret_sauce"
		And User clicks on login button 
    When User clicks on the filter icon
    Then It shows the sorting dropdown
    When User clicks on "Name(A-Z)" 
    Then Products get sorted in the ascending alphabetical manner