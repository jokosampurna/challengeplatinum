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



class Login {
	@Then("input email")
	public void input_email() {
		WebUI.callTestCase(findTestCase('Page/Login/Input Email'), [('email') : 'binarqae1@gmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input password")
	public void input_password() {
		WebUI.callTestCase(findTestCase('Page/Login/Input Password'), [('password') : 'students1234'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("click masuk")
	public void click_masuk() {
		WebUI.callTestCase(findTestCase('Page/Login/Click Login'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
	}

	@Then("input incorrect email")
	public void input_incorrect_email() {
		WebUI.callTestCase(findTestCase('Page/Login/Input Email'), [('email') : 'makanmalam@gmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input incorrect password")
	public void input_incorrect_password() {
		WebUI.callTestCase(findTestCase('Page/Login/Input Password'), [('password') : '12345'], FailureHandling.STOP_ON_FAILURE)
	}
}
