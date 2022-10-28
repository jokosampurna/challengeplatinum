@Logout @Smoke
Feature: Login
	As a User, I want to Logout in secondhand store website
		
	@Logout001
	Scenario: Logout001 - User want to logout
		Then click button masuk
		Then input email
		Then input password
		Then click masuk
		Then click button profile user
		Then click button logout