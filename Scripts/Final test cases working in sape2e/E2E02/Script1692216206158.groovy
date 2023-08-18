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

WebUI.callTestCase(findTestCase('WIP/Sape2e/Data_02_Select account url in sape2e'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Useful Modules_Identifiers/Create an account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://seequentglobal--sape2e.sandbox.lightning.force.com/lightning/r/Account/0017900000IgqwBAAR/view')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_JD 1794 China  Account  Salesforce/button_Submit For Approval'))

WebUI.click(findTestObject('Object Repository/Page_JD 1794 China  Account  Salesforce/button_Submit For Approval'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Submit For Approval  Salesforce/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Submit For Approval  Salesforce/button_Next'))

