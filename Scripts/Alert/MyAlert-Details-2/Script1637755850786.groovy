import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
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


WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

//Check default list
'OWNER'
listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/span'))

'checking default orders of item'
arraySorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    arraySorted.add(listRow.get(i).getText())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/span'))

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        arraySorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//sorted by array
Collections.sort(arraySorted)

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check list after click ascending
'Clicked Ascending Button'
listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/span'))

WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/div_OWNER'))

buttonSorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    buttonSorted.add(listRow.get(i).getText())

    println(listRow.size())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/span'))

    println(listRow.size())

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        buttonSorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            println(listRow.size())

            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//WebUI.verifyMatch(arraySorted.toString(), buttonSorted.toString(), false)

//reverse sorting list
Collections.sort(arraySorted, Collections.reverseOrder())

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check list after click descending
'Clicked Descending Button'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/div_OWNER'))

listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/span'))

buttonSorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    buttonSorted.add(listRow.get(i).getText())

    println(listRow.size())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/span'))

    println(listRow.size())

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        buttonSorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            println(listRow.size())

            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//WebUI.verifyMatch(arraySorted.toString(), buttonSorted.toString(), false)

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check default list
'REGION'
listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[4]/span'))

'checking default orders of item'
arraySorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    arraySorted.add(listRow.get(i).getText())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[4]/span'))

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        arraySorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//sorted by array
Collections.sort(arraySorted)

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check list after click ascending
'Clicked Ascending Button'
listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[4]/span'))

WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/div_REGION'))

buttonSorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    buttonSorted.add(listRow.get(i).getText())

    println(listRow.size())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[4]/span'))

    println(listRow.size())

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        buttonSorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            println(listRow.size())

            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//WebUI.verifyMatch(arraySorted.toString(), buttonSorted.toString(), false)

//reverse sorting list
Collections.sort(arraySorted, Collections.reverseOrder())

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check list after click descending
'Clicked Descending Button'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/div_REGION'))

listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[4]/span'))

buttonSorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    buttonSorted.add(listRow.get(i).getText())

    println(listRow.size())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[4]/span'))

    println(listRow.size())

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        buttonSorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            println(listRow.size())

            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

WebUI.verifyMatch(arraySorted.toString(), buttonSorted.toString(), false)

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check default list
'OWNER'
listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/span'))

'checking default orders of item'
arraySorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    arraySorted.add(listRow.get(i).getText())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/span'))

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        arraySorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//sorted by array
Collections.sort(arraySorted)

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check list after click ascending
'Clicked Ascending Button'
listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/span'))

WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/div_UNIT'))

buttonSorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    buttonSorted.add(listRow.get(i).getText())

    println(listRow.size())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/span'))

    println(listRow.size())

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        buttonSorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            println(listRow.size())

            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//WebUI.verifyMatch(arraySorted.toString(), buttonSorted.toString(), false)

//reverse sorting list
Collections.sort(arraySorted, Collections.reverseOrder())

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

//Check list after click descending
'Clicked Descending Button'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/div_UNIT'))

listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/span'))

buttonSorted = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    buttonSorted.add(listRow.get(i).getText())

    println(listRow.size())

    if (nextRow == listRow.size()) {
        break
    }
}

hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
    'class')

while (hasNextPage.toString() != 'disabled') {
    WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/next_page'))

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/span'))

    println(listRow.size())

    for (int j = 0; j < listRow.size(); j++) {
        nextRow = (j + 1)

        buttonSorted.add(listRow.get(j).getText())

        if (nextRow == listRow.size()) {
            println(listRow.size())

            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//WebUI.verifyMatch(arraySorted.toString(), buttonSorted.toString(), false)

'back to first page'
WebUI.click(findTestObject('Object Repository/Sprint2/Alert-sortby_OR/Page_Freeport Dashboard/firstPage_button'))

WebUI.scrollToPosition(0, 0)

