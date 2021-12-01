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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('EquipmentPage/Page_Freeport Dashboard/a_Equipment'))

WebUI.click(findTestObject('EquipmentPage/Page_Freeport Dashboard/div_DRILLS'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/div_D014'))

WebUI.verifyElementClickable(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/a_EQUIPMENT'))

WebUI.verifyElementClickable(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/a_DRILLS'))

WebUI.getText(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/span_DOWN'), FailureHandling.CONTINUE_ON_FAILURE)

def upTag = WebUI.getText(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/strong_D007'))

def upName = WebUI.getText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/p_None'))

def sideTag = WebUI.getText(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_D007'))

def sideName = WebUI.getText(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/strong_None'))

WebUI.verifyEqual(upTag, sideTag)

WebUI.verifyEqual(upName, sideName)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_REASON'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_OPERATOR'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_NUMBER OF HOLES'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_TIME IN STATE'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_MODEL'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_AVAILABILITY'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_PENETRATION RATE'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/span_TOTAL DRILL DEPTH'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_GPS QUALITY'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/span_Hide Drill Holes'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_UTILIZATION'), 0)

WebUI.verifyElementClickable(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/button_DRILL INSPECTION FORM'))

if (sideName.equals('None')) {
    println('Operator None')
} else {
    WebUI.click(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_None'))

    WebUI.click(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/Back'))
}

