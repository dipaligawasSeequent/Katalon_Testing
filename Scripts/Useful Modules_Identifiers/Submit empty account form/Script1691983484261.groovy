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

WebUI.navigateToUrl('https://seequentglobal--testdipali.sandbox.lightning.force.com/lightning/o/Account/list?filterName=Recent')

'Given user open the account creation form '
WebUI.click(findTestObject('Object Repository/Account validations/Page_Recently Viewed  Accounts  Salesforce/div_New'))

'Saves empty form '
WebUI.click(findTestObject('Object Repository/Account validations/Page_New Account Organisation  Salesforce/span_Save'))

WebUI.click(findTestObject('Object Repository/Account validations/Page_New Account Organisation  Salesforce/div_Review the errors on this page'))

'Verify title message '
WebUI.verifyElementText(findTestObject('Object Repository/Account validations/Page_New Account Organisation  Salesforce/span_Review the errors on this page'), 
    'Review the errors on this page.')

'Verify secory error message '
WebUI.verifyElementText(findTestObject('Object Repository/Account validations/Page_New Account Organisation  Salesforce/li_These required fields must be completed _314219'), 
    'These required fields must be completed: Account Name, Organization Type, Phone, Segment')

WebUI.click(findTestObject('Object Repository/Account validations/Page_New Account Organisation  Salesforce/span_Cancel'))

