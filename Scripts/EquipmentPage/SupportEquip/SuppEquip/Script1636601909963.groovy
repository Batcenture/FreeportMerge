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

WebUI.click(findTestObject('EquipmentPage/Page_Freeport Dashboard/div_SUPPORT EQUIPMENT'))

WebUI.click(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/div_SE_DOWN1'))

WebUI.verifyElementClickable(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/a_EQUIPMENT'))

WebUI.verifyElementClickable(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/a_SUPPORT EQUIPMENT'))

WebUI.verifyElementText(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/span_DOWN'), 'DOWN')

def upNum = WebUI.getText(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/strong_WT022'))

def sideNum = WebUI.getText(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/aside_WT022'))

WebUI.verifyEqual(upNum, sideNum)

def upOperator = WebUI.getText(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/strong_None'))

def downOperator = WebUI.getText(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/p_NONE'))

if (downOperator.equals('None')) {
    println('Operator ' + downOperator)
} else {
    WebUI.click(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/p_NONE'))
}

WebUI.verifyElementPresent(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/p_REASON'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/p_OPERATOR'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/p_LOCATION'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/p_CREW'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/p_PROJECT'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/p_VELOCITY'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/p_EQUIPMENT TYPE'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/p_ACTIVITY'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/SupportEquip/Page_Freeport Dashboard/p_ENGINE HOURS'), 0)

