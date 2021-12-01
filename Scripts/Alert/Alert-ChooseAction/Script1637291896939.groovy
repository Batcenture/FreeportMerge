import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Alert/Reusable'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/input_Choose_Action'), 0)

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/input_Choose_Action'))

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Mark as Read'), 0)

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Accept'), 0)

WebUI.verifyElementAttributeValue(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/div_Accept_rt-checkbox-check'), 
    'class', 'rt-checkbox-check', 0)

WebUI.verifyElementAttributeValue(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_1stName'), 'class', 
    'font-value strong clickable', 0)

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/div_Accept_rt-checkbox-check'))

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/input_Choose_Action'))

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Mark as Read'))

WebUI.verifyElementAttributeValue(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_1stName'), 'class', 
    'font-value clickable', 0)

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/div_ACTION_rt-checkbox-check'))

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/input_Choose_Action'))

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Mark as Read'))

WebUI.verifyElementAttributeValue(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_1stName'), 'class', 
    'font-value clickable', 0)

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/button_Accept'))

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/div_ACTION_rt-checkbox-check'))

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/input_Choose_Action'))

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Mark as Read'))

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/div_ACTION_rt-checkbox-check'))

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/input_Choose_Action'))

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Accept'))

def table = WebUI.getText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/div_table'))

table.toString()

println(table)

WebUI.click(findTestObject('Sprint2/ACTIVE-REUSABLE/Page_Freeport Dashboard/div_MY ALERTS'))

def myAlertTable = WebUI.getText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/div_table'))

myAlertTable.toString()

println(myAlertTable)

WebUI.callTestCase(findTestCase('Alert/MyAlert'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Alert/MyAlert-Details-1'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Alert/MyAlert-Details-2'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Alert/MyAlert-Details-3'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Alert/MyAlert-Details-4'), [:], FailureHandling.CONTINUE_ON_FAILURE)

