import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Operator/Reusable'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/div_SHOVELS'))

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

if (WebUI.verifyElementAttributeValue(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/span_Hide inactive operators'), 
    'class', 'rt-switch-on', 0)) {
    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/section/div/div[2]/div/div/div[2]/div/div/div[1]/div/span[1]'))

    def List = WebUI.getText(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/div_firstList'))

    println(List)

    arrayList = new ArrayList<String>()

    for (int i = 0; i < listRow.size(); i++) {
        nextRow = (i + 1)

        findNextRow = driver.findElement(By.xpath(('//*[@id="root"]/div/div[3]/div/div/section/div/div[2]/div/div/div[2]/div/div/div[' + 
                nextRow) + ']/div/span[1]'))

        arrayList.add(listRow.get(i).getText())

        if (nextRow == listRow.size()) {
            break
        }
    }
} else if (WebUI.verifyElementAttributeValue(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/span_Hide inactive operators'), 
    'class', 'rt-switch-off', 0)) {
    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/section/div/div[2]/div/div/div[2]/div/div/div[1]/div/span[1]'))

    def List = WebUI.getText(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/div_firstList'))

    println(List)

    arrayList = new ArrayList<String>()

    for (int i = 0; i < listRow.size(); i++) {
        nextRow = (i + 1)

        findNextRow = driver.findElement(By.xpath(('//*[@id="root"]/div/div[3]/div/div/section/div/div[2]/div/div/div[2]/div/div/div[' + 
                nextRow) + ']/div/span[1]'))

        arrayList.add(listRow.get(i).getText())

        if (nextRow == listRow.size()) {
            break
        }
    }
}

WebUI.click(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/span_Hide inactive operators'))

if (WebUI.verifyElementAttributeValue(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/span_Hide inactive operators'), 
    'class', 'rt-switch-off', 0)) {
    listRow2 = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/section/div/div[2]/div/div/div[2]/div/div/div[1]/div/span[1]'))

    def List2 = WebUI.getText(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/div_firstList'))

    println(List2)

    arrayList2 = new ArrayList<String>()

    for (int i = 0; i < listRow2.size(); i++) {
        nextRow2 = (i + 1)

        findNextRow2 = driver.findElement(By.xpath(('//*[@id="root"]/div/div[3]/div/div/section/div/div[2]/div/div/div[2]/div/div/div[' + 
                nextRow2) + ']/div/span[1]'))

        arrayList2.add(listRow2.get(i).getText())

        if (nextRow2 == listRow2.size()) {
            break
        }
    }
} else if (WebUI.verifyElementAttributeValue(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/span_Hide inactive operators'), 
    'class', 'rt-switch-on', 0)) {
    listRow2 = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/section/div/div[2]/div/div/div[2]/div/div/div[1]/div/span[1]'))

    def List2 = WebUI.getText(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/div_firstList'))

    println(List2)

    arrayList2 = new ArrayList<String>()

    for (int i = 0; i < listRow2.size(); i++) {
        nextRow2 = (i + 1)

        findNextRow2 = driver.findElement(By.xpath(('//*[@id="root"]/div/div[3]/div/div/section/div/div[2]/div/div/div[2]/div/div/div[' + 
                nextRow2) + ']/div/span[1]'))

        arrayList2.add(listRow2.get(i).getText())

        if (nextRow2 == listRow2.size()) {
            break
        }
    }
}

WebUI.callTestCase(findTestCase('Operator/Operator-Shovel-Region'), [:], FailureHandling.CONTINUE_ON_FAILURE)

