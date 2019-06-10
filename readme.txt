# Page Object model Test automation framework using Selenium with Java, TestNG and Maven-
This is a sample project develop by using Page object model
TestNG is used as test framework.

Dependency
Java
Maven

###libraries used
Selenium
TestNG


###### Working
Open browser
open https://www.bizjournals.com/milwaukee/feature/crane-watch website
Extract milwaukee city crane watch news 

open  https://www.bizjournals.com/seattle/feature/crane-watch
Extract project details

##Projecct Structure
1.src/main/java:contains all main pakages and class
		com.bizjournals.base; this package contains jave class file for browser launch and properties file configuration 
		By default os select as windows if you are using mac please change in properties file os as "mac"
		
		com.bizjournals.config; this package contains properties file
		
	com.bizjournals.page contains all the pages
		CraneWatchPage.java Contains all element related to CraneWatchPage and Methods to perform action on CraneWatchPage.
		GetMapDetailsPage.java Contains all element related to GetMapDetailsPage and Methods to perform action on GetMapDetailsPage.
		

	com.bizjournals.testdata contains excel file and common util class

	

src/test/java contains all the testcases 
	com.bizjournals.testcases
		com.bizjournals.testcases it contains testcases
		CraneWatchTest.java print only latest news if any.
		all old new is stored in string array 
		ex. MAY 5, 2019, 8:00 AM CDT Construction underway on Huron Building, next major downtown Milwaukee office building: Slideshow ---considered as new recorded
		if we run the script now only ex. detail will print on the console or any other new record if available on page 
		the script will work with similar  crane watch cities
		
		GetMapDetailsTest.java before running this test case please change url in properties file 
		url = https://www.bizjournals.com/seattle/feature/crane-watch
		
		this will extract display information and save in excel file 
	

src/main/resources 
	testng.xml above both testcases are configured in this xml.
	

Non-coding exercise  answers are available in Answers.docx file