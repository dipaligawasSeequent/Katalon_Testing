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

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'Given user open the account creation form '
WebUI.click(findTestObject('Object Repository/Page_Recently Viewed  Accounts  Salesforce/div_New'))

WebUI.setText(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/input__Account name'), 'Account name _Automated_{{systemtime}}')

WebUI.setText(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/input_Legal Name_on account form'), 
    'Legal_name')

WebUI.scrollToElement(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/click on org type'), 0)

WebUI.click(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/click on org type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/a_Academic'))

WebUI.click(findTestObject('Object Repository/Account validations/Account validations/click on segment type'))

WebUI.click(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/segment value_Energy'))

WebUI.click(findTestObject('Object Repository/Account validations/click on subsegment on account form'))

WebUI.click(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/Select value from sub segment_Carbon Capture Storage'))

WebUI.scrollToElement(findTestObject('Object Repository/Account validations/Account validations/Search address'), 0)

WebUI.setText(findTestObject('Object Repository/Account validations/Account validations/Search address'), '20 moorehouse avenue christchurch')

WebUI.click(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/input_Bill To Address_combobox-input-679'))

WebUI.click(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/strong_Moorhouse Avenue'))

'Saves empty form '
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/span_Save'), 0)

'Saves empty form '
WebUI.doubleClick(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/span_Save'), FailureHandling.CONTINUE_ON_FAILURE)

'Saves empty form '
WebUI.doubleClick(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/span_Save'))

'Verify title message '
WebUI.verifyElementText(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/span_Review the errors on this page'), 
    'Review the errors on this page.')

WebUI.verifyElementText(findTestObject('Object Repository/Account validations/error messgae for phone missing'), 'These required fields must be completed: Phone')

WebUI.takeScreenshot()

WebUI.closeBrowser()

WebUI.setText(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/input_Bill To Country_country'), 
    '--None--')

WebUI.click(findTestObject('Object Repository/Page_New Account Organisation  Salesforce/input_Bill To Address_combobox-input-679_1'))

