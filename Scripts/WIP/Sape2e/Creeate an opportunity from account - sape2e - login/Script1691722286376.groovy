import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('WIP/Sape2e/login into salesforce with general testing user 2- sape2e'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('WIP/Sape2e/Data_01_Select proraty account- sape2e'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Pro-Ratey Tatey   Account  Salesforce/button_New Opportunity'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_New Opportunity  Salesforce/button_Next'), 0)

WebUI.click(findTestObject('Object Repository/Page_New Opportunity  Salesforce/input__input_Short_Description'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_New Opportunity  Salesforce/input__input_Short_Description'), 'New opportunity created by Katalon_Proration testing')

WebUI.click(findTestObject('Object Repository/Page_New Opportunity  Salesforce/button_Next'))

WebUI.waitForElementVisible(findTestObject('Page_New Opportunity  Salesforce/button_Next'), 0)

WebUI.click(findTestObject('Object Repository/Page_New Opportunity  Salesforce/button_Next'))

