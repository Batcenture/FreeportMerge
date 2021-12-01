import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.lowagie.text.List as List

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

WebUI.verifyElementAttributeValue(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/li_All Regions'), 'class', 
    'select-pit col-md-6', 0)

WebUI.click(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/li_All Regions'))

WebUI.click(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/li_region1'))

listRow3 = driver.findElements(By.xpath('//*[@id="root"]/div/div[3]/div/div/section/div/div[2]/div/div/div[2]/div/div/div[1]/div/span[1]'))

def List3 = WebUI.getText(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/div_firstList'))

println(List3)

arrayList3 = new ArrayList<String>()

for (int i = 0; i < listRow3.size(); i++) {
    nextRow3 = (i + 1)

    findNextRow = driver.findElement(By.xpath(('//*[@id="root"]/div/div[3]/div/div/section/div/div[2]/div/div/div[2]/div/div/div[' + 
            nextRow3) + ']/div/span[1]'))

    arrayList3.add(listRow3.get(i).getText())

    if (nextRow3 == listRow3.size()) {
        break
    }
}

WebUI.click(findTestObject('Sprint2/MyAlert/Page_Freeport Dashboard/li_All Regions'))

WebUI.click(findTestObject('Sprint3/Operator-ShovelTab/Page_Freeport Dashboard/li_region2'))

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

