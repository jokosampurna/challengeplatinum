@ViewAllProduct @Smoke
Feature: View All Product
	As a User, I want to view product for sale in Daftar Jual Saya menu Semua Produk
	
#JokoSampurno.QA.Wave1.Binar
	
	@PL001
	Scenario: PL001 - User want to view product by kategori daftar jual menu semua produk
		Then call @Log001
		Then click product list
		Then click semua produk
		Then verify element visible
		
	@PL002
	Scenario: PL002 - User want to view product by kategori daftar jual menu diminati
		Then call @Log001
		Then click product list
		Then click diminati
		Then verify element not present
		
	@PL003
	Scenario: PL003 - User want to view product by kategori daftar jual menu terjual
		Then call @Log001
		Then click product list
		Then click terjual
		Then verify element not present
		