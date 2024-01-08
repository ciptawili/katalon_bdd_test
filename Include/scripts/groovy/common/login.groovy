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


class login {
	
	@Given("Open the login menu")
	def open_login_menu_step() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Open login menu"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User login with valid username and password")
	def user_login_with_valid_data_step() {
		WebUI.callTestCase(findTestCase("Test Cases/login/Success - Valid login"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User success login and redirect to page appointment page")
	def user_success_login_step() {
		WebUI.callTestCase(findTestCase("Test Cases/login/Success login"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User login and success")
	def user_login_and_success_step() {
		open_login_menu_step()
		user_login_with_valid_data_step()
		user_success_login_step()
	}
	
	@When("User login with username (.*) and password (.*)")
	def user_login_with_username_and_password(String username, String password) {
		WebUI.callTestCase(findTestCase('Test Cases/login/Failed - Invalid Login'), [ ('username') : username, ('password'): password ], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("User failed login And Show message error")
	def user_failed_login_and_show_message_error() {
		WebUI.callTestCase(findTestCase('Test Cases/login/Failed login'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User logout from application")
	def user_logout_from_application_step() {
		WebUI.callTestCase(findTestCase('Test Cases/login/Success - valid logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("User success logout from the application and redirect to homepage application")
	def user_success_logout_from_application_step() {
		WebUI.callTestCase(findTestCase('Test Cases/login/Success logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}