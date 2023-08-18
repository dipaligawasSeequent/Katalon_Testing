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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://seequentglobal--sape2e.sandbox.lightning.force.com/lightning/o/Task/home')

WebUI.click(findTestObject('Object Repository/Task page/Page_Web EnquiryContact Us (Training)  Salesforce/div_Tasks List'))

WebUI.enhancedClick(findTestObject('Object Repository/Task page/Page_Web EnquiryContact Us (Training)  Salesforce/span_New Task_1'))

WebUI.click(findTestObject('Object Repository/Task page/Page_New Task  Salesforce/span_Next'))

WebUI.click(findTestObject('Object Repository/Task page/Page_New Task General Task  Salesforce/input__combobox-input-185'))

WebUI.setText(findTestObject('Task page/Page_New Task General Task  Salesforce/input__combobox-input-185'), 'Web Enquiry | Contact Us (Training)')

WebUI.click(findTestObject('Object Repository/Task page/Page_New Task General Task  Salesforce/span_Save'))

WebUI.click(findTestObject('Object Repository/Task page/Page_Web Enquiry  Contact Us(Training)  Salesforce/button_Select a List View Tasks'))

WebUI.setText(findTestObject('Task page/Page_Web Enquiry  Contact Us(Training)  Salesforce/Enter search query'), 'open training')

WebUI.enhancedClick(findTestObject('Object Repository/Task page/Page_Web Enquiry  Contact Us(Training)  Salesforce/span_Open Training'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://seequentglobal--sape2e.sandbox.lightning.force.com/lightning/o/Task/list?filterName=00B790000019WFnEAM')

WebUI.verifyElementText(findTestObject('Object Repository/Task page/Page_Web Enquiry  Contact Us (Training)  Sa_212f2f/span_Open Training'), 
    'Open Training')

WebUI.takeScreenshot()

WebUI.closeBrowser()

