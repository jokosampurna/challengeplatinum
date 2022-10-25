@ViewAllProduct @Smoke
Feature: View All Product
	As a User, I want to view product for sale in Daftar Jual Saya menu Semua Produk
	
#JokoSampurno.QA.Wave1.Binar
	
	@PL001
	Scenario: PL001 - User want to view product for sale in Daftar Jual Saya menu Semua Produk
		Then call @Log001
		Then click product list
		Then click semua produk
		Then verify element visible