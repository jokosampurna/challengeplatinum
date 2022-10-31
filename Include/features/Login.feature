@Login @Smoke
Feature: Login
	As a User, I want to login in secondhand store website
		
	@Log001
	Scenario: Log001 - User want to login incorrect credential
		Then click button masuk
		Then input incorrect email
		Then input incorrect password
		Then click masuk
		
		@Log002
	Scenario: Log002 - User want to login without input email
		Then click button masuk
		Then input password
		Then click masuk
		
		@Log003
	Scenario: Log003 - User want to login without input password
		Then click button masuk
		Then input email
		Then click masuk
		
		@Log004
	Scenario: Log004 - User want to login without input user name and password 
		Then click button masuk
		Then click masuk
		
	@Log005
	Scenario: Log005 - User want to login using correct credential
		Then click button masuk
		Then input semail
		Then input password
		Then click masuk