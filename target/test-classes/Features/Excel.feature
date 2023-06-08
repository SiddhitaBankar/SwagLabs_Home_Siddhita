Feature: Login
 
  Scenario Outline: Verify PB login functionality with valid data
		Given Chrome is opened and SwagLabs app is opened    
		When user fills the data from given "<SheetName>" and rowsheet <RowNumber> in username and password field
    And User clicks on login button 
  	Then Relevant search result is displayed
 
    Examples: 
      | SheetName	 | RowNumber	|
      | Sheet1     |   0        |