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

WebUI.enableSmartWait()

WebUI.getText(findTestObject('Object Repository/Page_Q-78992  Quote  Salesforce/Get_Quote_ID'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1208/Page_Q-79004  Quote  Salesforce/button_Contract Information'), 0)

WebUI.click(findTestObject('Object Repository/Page_Q-78992  Quote  Salesforce/button_Edit Multi-Year Master Services Agmt (MSA)'))

WebUI.click(findTestObject('Object Repository/Page_Q-78992  Quote  Salesforce/button_--None--'))

WebUI.click(findTestObject('Object Repository/Page_Q-78992  Quote  Salesforce/span_Not an MSA'))

WebUI.click(findTestObject('Object Repository/Page_Q-78994  Quote  Salesforce/Non-Standard Contract Documentation_select dropdown'))

WebUI.click(findTestObject('Object Repository/Page_Q-78994  Quote  Salesforce/Non-Standard Contract Documentation_select first value'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Q-78994  Quote  Salesforce/span_Reasons for Non-Standard Deal Terms'), 
    0)

WebUI.scrollToPosition(0, 60)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Q-78994  Quote  Salesforce/Edit Rationale For Non Standard Deal Terms'), 
    0)

WebUI.setText(findTestObject('Page_Q-79011  Quote  Salesforce/enter 2 words in rational field'), '1 2 ')

WebUI.click(findTestObject('Page_Q-79015  Quote  Salesforce/button_Save_quoteEdit_MSA'))

