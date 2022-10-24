@Register @Smoke
Feature: Register
	As a User, I want to register in secondhand store website
	
#JokoSampurno.QA.Wave1.Binar
	
	@Reg001
	Scenario: Reg001 - User want to register using correct credential
		Then click button masuk
		Then click button daftar disini
		Then input nama1
		Then input email1
		Then input password1
		Then click daftar
		Then verify email

	@Reg002
	Scenario: Reg002 - User want to register using incorrect credential
		Then click button masuk
		Then click button daftar disini
		Then input nama2
		Then input incorrect email2
		Then input password2
		Then click daftar
		Then verify email
		
	@Reg003
	Scenario: Reg003 - User want to register using email already exists
		Then click button masuk
		Then click button daftar disini
		Then input nama3
		Then input email3
		Then input password3
		Then click daftar
		Then verify email already exists
		