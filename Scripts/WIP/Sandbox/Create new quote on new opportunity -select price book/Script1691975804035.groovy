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

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Useful Modules_Identifiers/Creeate an opportunity from account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Useful Modules_Identifiers/Create new quote and click on next'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Q-79019  Quote  Salesforce/button_Add Products'))

WebUI.enableSmartWait()

WebUI.waitForPageLoad(0)

WebUI.switchToFrame(findTestObject('iframe_2'), 10)

WebUI.enhancedClick(findTestObject('Numbers/child'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Numbers/child'), '01s4S000000JxbqQAC', false)

WebUI.click(findTestObject('Numbers/Save button on pricebook'))

WebUI.click(findTestObject('Numbers/Add products_SeequentGlobal'))

WebUI.getUrl()

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Pricebook entries GS/iframe price'), 25)

WebUI.click(findTestObject('Pricebook entries GS/child geosoft'))

WebUI.click(findTestObject('Pricebook values/Child_checkbox'))

WebUI.click(findTestObject('Select pricebook product/Select button on pricebook poroduct list page'))

WebUI.click(findTestObject('Select product from produc line choice page/First checkbox selection'))

