@Login @Smoke
Feature: Login
	As a User, I want to login in secondhand store website
		
	@Log001
	Scenario: Log001 - User want to login using correct credential
		Then click button masuk
		Then input email
		Then input password
		Then click masuk
		
		
