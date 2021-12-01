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

WebUI.callTestCase(findTestCase('Alert/Reusable'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sprint2/ACTIVE-REUSABLE/Page_Freeport Dashboard/div_MY ALERTS'))

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_ACTION'), 0)

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_NAME'), 0)

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_STATUS'), 0)

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_PRIORITY'), 0)

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_OWNER'), 0)

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_REGION'), 0)

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_UNIT'), 0)

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_TIMESTAMP'), 0)

WebUI.verifyElementPresent(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/span_ELAPSED TIME'), 0)

WebUI.verifyElementText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/p_Keywords'), 'Keywords')

WebUI.setText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/input_keyword'), 'S')

WebUI.verifyElementAttributeValue(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/input_StatusDropDown'), 'class', 
    'rt-input-input rt-dropdown-value', 0)

WebUI.click(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/input_StatusDropDown'))

WebUI.verifyElementText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Open'), 'Open')

WebUI.verifyElementText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Closed'), 'Closed')

WebUI.verifyElementText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Assigned'), 'Assigned')

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Assigned'))

def statAssigned = WebUI.getText(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/span_Assigned'))

println(statAssigned)

WebUI.click(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/input_StatusDropDown'))

def dropAssigned = WebUI.getText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Assigned'))

WebUI.verifyMatch(statAssigned, dropAssigned, true)

WebUI.verifyElementAttributeValue(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/input_Priorities'), 'class', 'rt-input-input rt-dropdown-value', 
    0)

WebUI.click(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/input_Priorities'))

WebUI.verifyElementText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Critical'), 'Critical')

WebUI.verifyElementText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_High'), 'High')

WebUI.verifyElementText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Medium'), 'Medium')

WebUI.verifyElementText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Low'), 'Low')

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Medium'))

def prioStat = WebUI.getText(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/span_Medium'))

println(prioStat)

WebUI.click(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/input_Priorities'))

def dropPrio = WebUI.getText(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/li_Medium'))

WebUI.verifyMatch(prioStat, dropPrio, true)

