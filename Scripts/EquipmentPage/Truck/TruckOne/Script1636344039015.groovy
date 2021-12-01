import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('EquipmentPage/Page_Freeport Dashboard/a_Equipment'))

WebUI.click(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/div_HT053'))

WebUI.verifyElementClickable(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/a_EQUIPMENT'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/a_TRUCKS'))

WebUI.verifyElementPresent(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/span_DOWN'), 0)

def aupside = WebUI.getText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/strong_T204'))

def nameUp = WebUI.getText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/strong_None'))

def aside = WebUI.getText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/aside_T204'))

def name = WebUI.getText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/p_None'))

WebUI.verifyMatch(aupside, aside, true)

WebUI.verifyMatch(nameUp, name, true)

def noData = WebUI.getText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/div_No data found'))

println(noData)

WebUI.verifyElementText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/tspan_Delta C'), 'Delta C')

WebUI.verifyElementText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/text_Minutes'), 'Minutes')

WebUI.verifyElementText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/tspan_Idle'), 'Idle')

WebUI.verifyElementText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/tspan_Spotting'), 'Spotting')

WebUI.verifyElementText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/tspan_Loading'), 'Loading')

WebUI.verifyElementText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/tspan_Loaded'), 'Loaded')

WebUI.verifyElementText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/tspan_Dumping'), 'Dumping')

WebUI.verifyElementText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/tspan_Crusher'), 'Crusher')

WebUI.verifyElementText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/tspan_Empty'), 'Empty')

WebUI.click(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/span_S12'))

WebUI.click(findTestObject('Login/Page_Freeport Dashboard/img'))

if (name.equals('None')) {
    println('Operator None')
} else {
    WebUI.click(findTestObject('EquipmentPage/DrillOne/Page_Freeport Dashboard/p_None'))

    WebUI.click(findTestObject('Login/Page_Freeport Dashboard/img'))
}

if (noData.equals('No data found')) {
    println('No data found')
} else {
    int numC = Integer.parseInt(crusherNum = WebUI.getText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/p_6_bg')))

    println(numC)

    int numS = Integer.parseInt(stockpileNum = WebUI.getText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/p_6_b')))

    println(numS)

    def totalValue = WebUI.getText(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/span_TOTAL 12'))

    int total = numC + numS

    String totals = String.valueOf(total)

    if (totalValue.contains(totals)) {
        println(totals)

        println(totalValue)

        def bgreen = WebUI.getCSSValue(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/div_bg'), 'background-color')

        def bgreenEqual = WebUI.verifyEqual(bgreen, 'rgba(38, 215, 235, 1)')

        def bgreenside = WebUI.getCSSValue(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/path_bluegreen'), 
            'background-color')

        def bgreensideequal = WebUI.verifyEqual(bgreenside, 'rgba(38, 215, 235, 1)')

        WebUI.verifyEqual(bgreensideequal, bgreenEqual)

        def blue = WebUI.getCSSValue(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/div_b'), 'background-color')

        def blueequal = WebUI.verifyEqual(blue, 'rgba(33, 168, 253, 1)')

        def blueside = WebUI.getCSSValue(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/path_blue'), 'background-color')

        def bluesideequal = WebUI.verifyEqual(blueside, 'rgba(33, 168, 253, 1)')

        WebUI.verifyEqual(blueequal, bluesideequal)
    }
}

WebUI.click(findTestObject('EquipmentPage/TruckOne/Page_Freeport Dashboard/img'))

