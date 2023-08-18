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

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Pro-Ratey Tatey  - New opportunity cre_40fc54/button_New Quote'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Pro-Ratey Tatey  - New opportunity cre_40fc54/button_New Quote'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_New Quote  Salesforce/textarea_Quote Description_input-1014'), 'Katalon_Quote')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_New Quote  Salesforce/button_Next'), 0)

WebUI.click(findTestObject('Object Repository/Page_New Quote  Salesforce/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_New Quote  Salesforce/button_Next'), 0)

WebUI.click(findTestObject('Object Repository/Page_New Quote  Salesforce/button_Next'))

