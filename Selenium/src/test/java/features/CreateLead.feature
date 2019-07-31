Feature: Login and Create Lead
Background:
Given Open the Browser
And Max the Browser
And Set the Timeout
And Navigate to URL
And Enter the UserName as Demosalesmanager
And Enter the pw as crmsfa
When Click on Login Button 
Then Verify Login is successful
And Click on crmsfa
And Click on Leads




Scenario: TC02 Edit Lead 

And Click on Find Leads
And Goto Email
And Enter email
And Click on FindLead
And Click on TopLead
And Click on Editbutton
And Clear companyName
And Enter companyName
And Click on Update
Then updated


