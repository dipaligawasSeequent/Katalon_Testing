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

'login as a general user'
WebUI.callTestCase(findTestCase('WIP/Sandbox/login into salesforce'), [:], FailureHandling.STOP_ON_FAILURE)

'Wait for Account tab '
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Login  Salesforce/Page_Home  Salesforce/span_Accounts'), 
    5)

'Select account tab '
WebUI.enhancedClick(findTestObject('Object Repository/Page_Login  Salesforce/Page_Home  Salesforce/span_Accounts'))

WebUI.maximizeWindow()

'Input keyword to search '
WebUI.setText(findTestObject('Object Repository/Page_Recently Viewed  Accounts  Salesforce/input_Search this list_Account-search-input'), 
    'er')

'Select existing account '
WebUI.click(findTestObject('Object Repository/Page_Recently Viewed  Accounts  Salesforce/a_er'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Account_123  Account  Salesforce/button_New Opportunity'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Page_er  Account  Salesforce/span_Dipali Gawas'), 'Dipali Gawas')

WebUI.takeScreenshot()

WebUI.getUrl()

