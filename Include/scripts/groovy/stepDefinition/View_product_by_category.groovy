package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

//JokoSampurno.QA.Wave1.Binar

class View_product_by_category {

	//PL001 - Semua Product
	@Then("call @Log001")
	public void call_Log001() {
		WebUI.callTestCase(findTestCase('Step Definition/Feature Login/Log005 - User want to login using correct credential'), [:],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("click product list")
	public void click_product_list() {
		WebUI.callTestCase(findTestCase('Page/Daftar Jual Saya/Click Daftar Jual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("click semua produk")
	public void click_semua_produk() {
		WebUI.callTestCase(findTestCase('Page/Daftar Jual Saya/Click Semua Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("verify element visible")
	public void verify_element_visible() {
		WebUI.callTestCase(findTestCase('Page/Daftar Jual Saya/Verify Content'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl('https://deployed-five.vercel.app/')
	}

	//PL002 - Diminati
	@Then("click diminati")
	public void click_diminati() {
		WebUI.callTestCase(findTestCase('Page/Daftar Jual Saya/Click Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("verify element not present")
	public void verify_element_not_present() {
		WebUI.verifyElementNotPresent(findTestObject('Page_Daftar Jual Saya_Semua Produk/button_TambahProduk'), 0)
		WebUI.delay(5)
		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl('https://deployed-five.vercel.app/')
	}

	//PL003 - Terjual
	@Then("click terjual")
	public void click_terjual() {
		WebUI.callTestCase(findTestCase('Page/Daftar Jual Saya/Click Terjual'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)

	}
}