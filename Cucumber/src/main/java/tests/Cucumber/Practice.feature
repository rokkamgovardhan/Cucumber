Feature: Drop Down Handling

	Background: Every test
		Given ope the browser
	
	@Second
	Scenario: Select multiple drop down values
		When navigated to brand site
		And find the element and select value
		Then deselect the values
		But display the values
		* quit the browser
		
	@First 
	Scenario: Select multiple drop down valueshdvdv hkdb
		When navigated to brand site
		But display the values
		* quit the browser
	
	