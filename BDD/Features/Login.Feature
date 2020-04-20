Feature: Leaftaps Login Test

Background:
Given Open the Chrome Browser
And Maximise the Browser
And Set the timeouts
And Load the URL

@smoke
Scenario Outline: TC001 Positive Login Flow
And Enter the username as <username>
And Enter the Password as <password>
When Click on the Login
Then Verify Login Successful
Examples:
| username | password |
| Demosalesmanger | crmsfa |
| DemoCSR | crmsfa |

@sanity @regression
Scenario Outline: TC002 Negetive Login Flow
And Enter the username as <username>
And Enter the Password as <password>
When Click on the Login
But Verify Login failure
Examples:
|username|password|
|Demosalesmanger|c rmsfa|
|DemoCSR|c rmsfa|
