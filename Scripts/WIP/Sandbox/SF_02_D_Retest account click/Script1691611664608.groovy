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

WebUI.callTestCase(findTestCase('Final Test Cases _Working in local/SF_01_D_Open existing account and take a screenshot'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_er  Account  Salesforce/button_New Opportunity'), 0)

WebUI.click(findTestObject('Object Repository/Page_er  Account  Salesforce/button_New Opportunity'))

WebUI.setText(findTestObject('Object Repository/Page_New Opportunity  Salesforce/input__input_Short_Description'), '12365478_DNM')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_New Opportunity  Salesforce/button_Next'), 0)

WebUI.click(findTestObject('Object Repository/Page_New Opportunity  Salesforce/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_New Opportunity  Salesforce/button_Next'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_er - Do Not Modify_00009  Opportunity _e614e1/lightning-formatted-text_er - Do Not Modify_00009'), 
    'er - 12365478_DNM')

