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

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/burger'))

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/a_Settings'))

WebUI.verifyElementText(findTestObject('GenralFeatures/Page_Freeport Dashboard/div_ALERTS'), 'ALERTS')

WebUI.verifyElementPresent(findTestObject('GenralFeatures/Page_Freeport Dashboard/div_Language'), 0)

WebUI.verifyElementPresent(findTestObject('GenralFeatures/Page_Freeport Dashboard/div_Release Notes'), 0)

WebUI.verifyElementAttributeValue(findTestObject('GenralFeatures/Page_Freeport Dashboard/div_ALERTS'), 'class', 'rt-tabs-label rt-tabs-active rt-tabs-withText undefined', 
    0)

WebUI.verifyTextPresent('Alert if: Any of these Operator Fatigue alerts are triggered', true)

WebUI.verifyTextPresent('Alert if: Any of these Outrageous Idle alerts are triggered', true)

def css_colorEmail = WebUI.getCSSValue(findTestObject('GenralFeatures/Page_Freeport Dashboard/button_EMAIL'), 'background-color')

WebUI.verifyEqual(css_colorEmail, 'rgba(153, 153, 153, 1)')

def css_colorSMS = WebUI.getCSSValue(findTestObject('GenralFeatures/Page_Freeport Dashboard/button_SMS'), 'background-color')

WebUI.verifyEqual(css_colorSMS, 'rgba(153, 153, 153, 1)')

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/button_EMAIL'))

WebUI.verifyElementAttributeValue(findTestObject('GenralFeatures/Page_Freeport Dashboard/button_EMAIL'), 'class', 'rt-button-button rt-button-flat rt-button-button rt-button-squared rt-button-neutral activeAlertButton', 
    0)

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/button_EMAIL'))

WebUI.verifyElementAttributeValue(findTestObject('GenralFeatures/Page_Freeport Dashboard/button_EMAIL'), 'class', 'rt-button-button rt-button-flat rt-button-button rt-button-squared rt-button-neutral', 
    0)

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/div_Language'))

WebUI.verifyElementAttributeValue(findTestObject('GenralFeatures/Page_Freeport Dashboard/input_Release Notes_rt-input-inputElement rt-input-filled'), 
    'class', 'rt-input-inputElement rt-input-filled', 0)

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/input_Release Notes_rt-input-inputElement rt-input-filled'))

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/li_Spanish'))

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/button_Cerrar'))

WebUI.verifyElementText(findTestObject('GenralFeatures/Page_Freeport Dashboard/span_Operadores'), 'Operadores')

WebUI.verifyElementText(findTestObject('GenralFeatures/Page_Freeport Dashboard/span_Resumen'), 'Resumen')

WebUI.verifyElementPresent(findTestObject('GenralFeatures/Page_Freeport Dashboard/span_ltima actualizacin'), 0)

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/div_Idioma'))

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/input_Release Notes_rt-input-inputElement rt-input-filled'))

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/li_English'))

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/button_Close'))

WebUI.click(findTestObject('GenralFeatures/Page_Freeport Dashboard/div_Release Notes'))

def uno = WebUI.getText(findTestObject('GenralFeatures/Page_Freeport Dashboard/a_21.7.1'))

def dos = WebUI.getText(findTestObject('GenralFeatures/Page_Freeport Dashboard/strong_21.7.1'))

def tres = WebUI.getText(findTestObject('GenralFeatures/Page_Freeport Dashboard/p_2021.07.02'))

def kwatro = WebUI.getText(findTestObject('GenralFeatures/Page_Freeport Dashboard/span_2021.07.02'))

WebUI.verifyEqual(uno, dos)

WebUI.verifyEqual(tres, kwatro)

