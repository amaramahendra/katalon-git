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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vast-dawn-73245.herokuapp.com')

'First TestCase'
WebUI.setText(findTestObject('Page_Propine Addition Calculator/input_First Number_firstNumber'), '10')

WebUI.setText(findTestObject('Page_Propine Addition Calculator/input_Second Number_secondNumber'), '50')

WebUI.click(findTestObject('Page_Propine Addition Calculator/input_Second Number_btn btn-default'))

WebUI.verifyElementText(findTestObject('Page_Propine Addition Calculator/div_0'), '60')

'Second TestCase'
WebUI.setText(findTestObject('Page_Propine Addition Calculator/input_First Number_firstNumber'), '70')

WebUI.setText(findTestObject('Page_Propine Addition Calculator/input_Second Number_secondNumber'), '')

WebUI.click(findTestObject('Page_Propine Addition Calculator/input_Second Number_btn btn-default'))

WebUI.verifyElementText(findTestObject('Page_Propine Addition Calculator/div_0'), 'NaN')

'Third  Test Case'
WebUI.setText(findTestObject('Page_Propine Addition Calculator/input_First Number_firstNumber'), '-5')

WebUI.setText(findTestObject('Page_Propine Addition Calculator/input_Second Number_secondNumber'), '-40')

WebUI.click(findTestObject('Page_Propine Addition Calculator/input_Second Number_btn btn-default'))

WebUI.verifyElementText(findTestObject('Page_Propine Addition Calculator/div_0'), '-45')

'Fourth TestCase'
WebUI.setText(findTestObject('Page_Propine Addition Calculator/input_First Number_firstNumber'), '20.0000')

WebUI.setText(findTestObject('Page_Propine Addition Calculator/input_Second Number_secondNumber'), '07')

WebUI.click(findTestObject('Page_Propine Addition Calculator/input_Second Number_btn btn-default'))

WebUI.verifyElementText(findTestObject('Page_Propine Addition Calculator/div_0'), '27')

WebUI.closeBrowser()

