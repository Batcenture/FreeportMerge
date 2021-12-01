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

WebUI.click(findTestObject('EquipmentPage/Page_Freeport Dashboard/a_Equipment'))

WebUI.verifyElementPresent(findTestObject('EquipmentPage/Page_Freeport Dashboard/div_TRUCKS'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/Page_Freeport Dashboard/div_SHOVELS'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/Page_Freeport Dashboard/div_DRILLS'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/Page_Freeport Dashboard/div_CAMERAS'), 0)

WebUI.verifyElementAttributeValue(findTestObject('EquipmentPage/Page_Freeport Dashboard/span_DOWN  (2)'), 'class', 'font-tiny equipment-counter status-down-en', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('EquipmentPage/Page_Freeport Dashboard/span_DELAY  (1)'), 'class', 'font-tiny equipment-counter', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('EquipmentPage/Page_Freeport Dashboard/span_SPARE  (1)'), 'class', 'font-tiny equipment-counter', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('EquipmentPage/Page_Freeport Dashboard/span_READY  (28)'), 'class', 'equipment-counter', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('EquipmentPage/Page_Freeport Dashboard/span_SUPPORT EQUIPMENT_rt-switch-off'), 
    'class', 'rt-switch-off', 0)

WebUI.verifyElementAttributeValue(findTestObject('EquipmentPage/Page_Freeport Dashboard/span_Show Heat Map'), 'class', 'rt-switch-text', 
    0)

