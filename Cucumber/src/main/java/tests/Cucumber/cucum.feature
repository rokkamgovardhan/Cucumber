Feature: Open web site 

@govardhan1
Scenario Outline: OPen website and search something
Given open the site
And Enter the <input> value

Examples:
| input |
| Govardhan |
| Reddy |

Examples:
| input |
| Ram |
| Raj |

@Reddy
Scenario: OPen the website
Given open the site
And enter the value
| input |values|
| Govardhan | a|
| Reddy |b|

@Ramireddy
Scenario: Login to the Application
	Given login with Ram and Passw0rd
	Then login with Raj and passw0rd
	And user click on button
	But user tap on button
