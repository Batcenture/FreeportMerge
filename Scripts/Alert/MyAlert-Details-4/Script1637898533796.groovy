import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebDriver driver = DriverFactory.getWebDriver()

'Check Filter by Region Dropdown Filter'

'getting region option list based from regions table'
listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[4]/span'))

Set<String> setRegionList = new LinkedHashSet<String>()

//get the text into array
for (int i = 0; i < listRow.size(); i++) {
    nextRow = (i + 1)

    def findNextRow = driver.findElement(By.xpath(('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[' + 
            nextRow) + ']/div[4]/span'))

        ((driver) as JavascriptExecutor).executeScript('arguments[0].scrollIntoView(true);', findNextRow)

    setRegionList.add(listRow.get(i).getText())

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

        findNextRow = driver.findElement(By.xpath(('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[' + 
                nextRow) + ']/div[4]/span'))

            ((driver) as JavascriptExecutor).executeScript('arguments[0].scrollIntoView(true);', findNextRow)

        setRegionList.add(listRow.get(j).getText())

        setRegionList.removeAll(Arrays.asList('', null))

        if (nextRow == listRow.size()) {
            break
        }
    }
    
    hasNextPage = driver.findElement(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/ul/li[last()-1]')).getAttribute(
        'class')
}

//converting Set List into ArrayList for Sorting
List<WebElement> regionList = new ArrayList<String>()

for (int i = 0; i < setRegionList.size(); i++) {
    regionList.add(setRegionList[i])
}

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Sprint2/Alert-Choose-Action/Page_Freeport Dashboard/button_Clear All'))

'Putting Data from region table to dropdown data (VERIFY)'
if(WebUI.verifyElementVisible(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/li_All Regions'), FailureHandling.OPTIONAL)) {

WebUI.click(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/li_All Regions'))

listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[1]/div[3]/div/section[4]/div/ul/li'))

List<WebElement> regionOptions = new ArrayList<String>()

for (int i = 0; i < listRow.size(); i++) {
    regionOptions.add(listRow.get(i).getText())
}

//removing 'All Regions' option to equalize list from table
//regionOptions.remove(0)
Collections.sort(regionList)

Collections.sort(regionOptions)

//WebUI.verifyMatch(regionList.toString(), regionOptions.toString(), false)
if (regionOptions.size() == 1) {
    KeywordUtil.markPassed('No Present Region on the table' //WebUI.click(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/div_region_option'))
        )
} else {
    randomRegionValue = WebUI.getText(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/div_region_option'))

    WebUI.verifyElementAttributeValue(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/li_All Regions'), 'class', 
        'select-pit col-md-6', 0)

    listRow = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[4]/span'))

    for (int i = 0; i < listRow.size(); i++) {
        nextRow = (i + 1)

        findNextRow = driver.findElement(By.xpath(('//*[@id="root"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[' + 
                nextRow) + ']/div[4]/span'))

            ((driver) as JavascriptExecutor).executeScript('arguments[0].scrollIntoView(true);', findNextRow)

        checkElement = listRow.get(i).getText()

        println(checkElement)

        if (checkElement == randomRegionValue) {
            KeywordUtil.markPassed('Filter Verified')
        } else {
            println('No Item starts with filtered text or Filter Failed')
        }
        
        if (nextRow == listRow.size()) {
            break
        }
    }
	}
}
else {
	println("No button")
}

