import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('EquipmentPage/Page_Freeport Dashboard/a_Equipment'))

WebUI.click(findTestObject('EquipmentPage/Page_Freeport Dashboard/div_SHOVELS'))

WebUI.click(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/div_L59'))

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/a_EQUIPMENT'), 'EQUIPMENT')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/a_SHOVELS'), 'SHOVELS')

WebUI.verifyElementPresent(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/span_DOWN'), 0)

def upTag = WebUI.getText(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/strong_D007'))

def upName = WebUI.getText(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/strong_None'))

def sideTag = WebUI.getText(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_D007'))

def sideName = WebUI.getText(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_None'))

WebUI.verifyEqual(upTag, sideTag)

WebUI.verifyEqual(upName, sideName)

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/p_REASON'), 'REASON')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/p_OPERATOR'), 'OPERATOR')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/p_TIME IN STATE'), 'TIME IN STATE')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/p_LOCATION'), 'LOCATION')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/p_SPOT TIME (mins)'), 'SPOT TIME (mins)')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/p_LOAD TIME (mins)'), 'LOAD TIME (mins)')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/p_IDLE TIME (mins)'), 'IDLE TIME (mins)')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/span_SHOVEL PAYLOAD'), 'SHOVEL PAYLOAD')

WebUI.verifyElementPresent(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/td_Crew None'), 0)

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/th_TPRH'), 'TPRH')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/th_TONS'), 'TONS')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/th_AVG PAY'), 'AVG PAY')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/th_LOADS'), '# LOADS')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/th_UNDER LOADED'), 'UNDER LOADED')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/th_BELOW TARGET'), 'BELOW TARGET')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/th_ON TARGET'), 'ON TARGET')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/th_ABOVE TARGET'), 'ABOVE TARGET')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/th_OVER LOADED'), 'OVER LOADED')

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/th_INVALID PAY'), 'INVALID PAY')

WebUI.verifyElementPresent(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/div_CARGO_whole'), 0)

WebUI.verifyElementText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/span_CARGO PAYLOAD HISTOGRAM'), 
    'CARGO PAYLOAD HISTOGRAM')

def nodata = WebUI.getText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/div_graph'))

if (nodata.contains('No data to display')) {
    println('No data to display')
} else {
    WebUI.verifyElementPresent(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/tspan_Percentage'), 0)

    WebUI.verifyElementPresent(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/tspan_Time'), 0)

    WebUI.mouseOver(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/circle_Percentage_recharts-dot'))

    def mouseOver = WebUI.getText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/circle_Percentage_recharts-dot'))

    println(mouseOver)

    def hoverText = WebUI.getText(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/svg_hover_text'))

    println(hoverText)

    Date date = Calendar.getInstance().getTime()

    DateFormat dateFormat = new SimpleDateFormat('MM/dd/YYYY HH:mm')

    String strDate = dateFormat.format(date)

    println(strDate)
}

if (sideName.equals('None')) {
    println('Operator None')
} else {
    WebUI.click(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_None'))

    WebUI.click(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/img'))
}

WebUI.verifyElementClickable(findTestObject('EquipmentPage/ShovelOne/Page_Freeport Dashboard/button_SHOVEL INSPECTION FORM'))

