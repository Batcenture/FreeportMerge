import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter
import com.kms.katalon.core.model.FailureHandling as FailureHandling
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

WebUI.callTestCase(findTestCase('EquipmentPage/Drilling/DrillingOne'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillThree/Page_Freeport Dashboard/text_Start'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillThree/Page_Freeport Dashboard/text_ft'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillThree/Page_Freeport Dashboard/tspan_Shift'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillThree/Page_Freeport Dashboard/text_End'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillThree/Page_Freeport Dashboard/span_Alert Summary'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillThree/Page_Freeport Dashboard/th_Reason'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillThree/Page_Freeport Dashboard/th_Time'), 0)

def css_holes = WebUI.getCSSValue(findTestObject('EquipmentPage/DrillThree/Page_Freeport Dashboard/p_1'), 'color')

WebUI.verifyEqual(css_holes, 'rgba(29, 186, 135, 1)')

def css_performance = WebUI.getCSSValue(findTestObject('EquipmentPage/DrillThree/Page_Freeport Dashboard/p_98'), 'color')

WebUI.verifyEqual(css_performance, 'rgba(255, 80, 88, 1)')

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/span_Feet Drilled vs Plan'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/span_Holes Drilled vs Plan'), 0)

def reason = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/div_Alert SummaryReasonTimeNo data to display'), 
    FailureHandling.CONTINUE_ON_FAILURE)

if (reason.contains('No data to display')) {
    println(reason)
}

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/span_Alert Summary'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/span_Holes Drilled'), 0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/span_Performance Matrix'), 0)

def actualOne = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_Actual'))

def targetTwo = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_Target'))

def st = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_Shift Target'))

def cons = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/div_Actual110Target520Shift Target1039'))

if ((cons.contains(actualOne) && cons.contains(targetTwo)) && cons.contains(st)) {
    println('ACTUAL,TARGET, AND SHIFT TARGER CONTAINS IN FEET DRILLED VS PLAN')
}

WebUI.click(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/span_Holes Drilled vs Plan'))

def actual2 = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_Actual'))

def target2 = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_Target'))

def st2 = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_Shift Target'))

def cons2 = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/div_Actual0Target33Shift Target50'))

if ((cons2.contains(actual2) && cons2.contains(target2)) && cons2.contains(st2)) {
    println('ACTUAL,TARGET, AND SHIFT TARGER CONTAINS IN FEET DRILLED VS PLAN')
} else {
    println('ACTUAL,TARGET, AND SHIFT TARGER IS NOT CONTAIN IN FEET DRILLED VS PLAN')
}

WebUI.click(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/span_Feet Drilled vs Plan'))

int actualNUm = Integer.parseInt(actual = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_906')))

println(actualNUm)

int targetNum = Integer.parseInt(target = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_55')))

println(targetNum)

def actualColor = WebUI.getCSSValue(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_906'), 'color')

if (actualNUm > targetNum) {
    WebUI.verifyEqual(actualColor, 'rgba(29, 186, 135, 1)')
} else if (actualNUm <= targetNum) {
    WebUI.verifyEqual(actualColor, 'rgba(255, 80, 88, 1)')
}

WebUI.click(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/div_HLight _HDP'))

int actualNUmHDP = Integer.parseInt(actual = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_0')))

println(actualNUmHDP)

int targetNumHDP = Integer.parseInt(target = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_8')))

println(targetNumHDP)

def actualColorHDP = WebUI.getCSSValue(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/p_0'), 'color')

if (actualNUmHDP > targetNumHDP) {
    WebUI.verifyEqual(actualColorHDP, 'rgba(29, 186, 135, 1)')
} else if ((actualNUmHDP < targetNumHDP) && (actualNUmHDP == targetNumHDP)) {
    WebUI.verifyEqual(actualColorHDP, 'rgba(255, 80, 88, 1)')
}

def formDate = WebUI.getText(findTestObject('EquipmentPage/DrillingTwo/Page_Freeport Dashboard/span_Thu November 11, 2021'))

println(formDate)

LocalDate localDate = LocalDate.now()

DateTimeFormatter formatters = DateTimeFormatter.ofPattern('EEE MMMM dd, yyyy')

String dateFormat = localDate.format(formatters)

println(dateFormat)

WebUI.verifyEqual(formDate, dateFormat, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/span_None_rt-switch-off'), 'class', 'rt-switch-off', 
    0)

WebUI.click(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/span_None_rt-switch-off'))

WebUI.verifyElementAttributeValue(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/span_None_rt-switch-on'), 'class', 'rt-switch-on', 
    0)

WebUI.verifyElementPresent(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/div_Map'), 0)

WebUI.click(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/span_None_rt-switch-off'))

