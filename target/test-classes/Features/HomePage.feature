Feature: HomePage
 

 Scenario: Validate user navigates on to HomePage
 			Given Chrome is opened and SwagLabs app is opened
			When User enters correct Username "standard_user" and Password "secret_sauce"
			And User clicks on login button 
    	Then User navigates onto HomePage

 Scenario: Validate HomePage UI
			Given Chrome is opened and SwagLabs app is opened
			When User enters correct Username "standard_user" and Password "secret_sauce"
			And User clicks on login button
	 		Then User navigates onto HomePage
  		Then HomePage title is visible to the user
 
  	Scenario: Validate Add to cart button is clickable
		Given Chrome is opened and SwagLabs app is opened
			When User enters correct Username "standard_user" and Password "secret_sauce"
		And User clicks on login button
   Then User navigates onto HomePage
    Then Add to cart button is visible to the user
    Then Menu icon is visible to the user
    When User clicks on Add to cart button
		Then Selected item is added to the cart

	Scenario: Validate the Cart icon
		Given Chrome is opened and SwagLabs app is opened
			When User enters correct Username "standard_user" and Password "secret_sauce"
		When User clicks on login button
    Then User navigates onto HomePage
    Then Cart icon is visible to the user
    When User clicks on Add to cart button
		Then Selected item is added to the cart
		Then User is able to see choosen item on the cart icon in the checkout page

	Scenario: Validate the filter icon of HomePage
		Given Chrome is opened and SwagLabs app is opened
			When User enters correct Username "standard_user" and Password "secret_sauce"
    When User clicks on login button
    Then User navigates onto HomePage
    Then Add to cart button is visible to the user
    When User clicks on Add to cart button
		Then User is able to see choosen item on the cart icon in the checkout page
		When User clicks on continue shopping it navigates back to HomePage
    And User clicks on the filter icon
    Then It shows the sorting dropdown