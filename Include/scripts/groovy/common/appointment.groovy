package common
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



class appointment {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("User open appointment page before login")
	def user_open_appointment_before_login_step() {
		WebUI.callTestCase(findTestCase("Test Cases/appointment/Create appointment before login"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can’t create appointment and User redirect to login page")
	def user_cant_create_appointment_redirect_to_login_page() {
		WebUI.callTestCase(findTestCase("Test Cases/login/Verify login page"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User create appointment with empty date")
	def user_create_appointment_with_empty_date() {
		WebUI.callTestCase(findTestCase("Test Cases/appointment/Create appointment with empty date"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can’t create appointment and Show message date is required")
	def user_cant_create_appointment_show_message_date_required() {
		WebUI.callTestCase(findTestCase("Test Cases/appointment/Required date"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User choose facility healthcare")
	def user_choose_faicility_healthcare() {
		WebUI.callTestCase(findTestCase("Test Cases/appointment/Choose healthcaren facility"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User choose healthy program")
	def user_choose_healty_program() {
		WebUI.callTestCase(findTestCase("Test Cases/appointment/Choose health program"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User choose date appointment")
	def user_choose_date_appointment() {
		WebUI.callTestCase(findTestCase("Test Cases/appointment/Input date appointment"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User fill the comment")
	def user_fill_the_comment() {
		WebUI.callTestCase(findTestCase("Test Cases/appointment/Input comment appointment"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User create the appointment")
	def user_create_the_appointment() {
		WebUI.callTestCase(findTestCase("Test Cases/appointment/Create valid appointment"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User success create appointment and User redirect to appointment confirmation page")
	def user_success_create_appointment_redirect_to_appointment_confirmatioln() {
		WebUI.callTestCase(findTestCase("Test Cases/appointment/Success create appointment"), [:], FailureHandling.STOP_ON_FAILURE)
	}
}