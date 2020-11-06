import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

//WebUI.openBrowser(GlobalVariable.URL)
//
//WebUI.verifyMatch(WebUI.getWindowTitle(), 'STORE', false)
//
//WebUI.click(findTestObject('Object Repository/OrderPage_STORE/a_Cart'))
//
//WebUI.click(findTestObject('Object Repository/OrderPage_STORE/button_Place Order'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Payment_Page_STORE/h5_Place order'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Payment_Page_STORE/div_Name'))

WebUI.sendKeys(findTestObject('Object Repository/Payment_Page_STORE/input_Name_name'), 'a')

WebUI.verifyElementVisible(findTestObject('Object Repository/Payment_Page_STORE/div_Country'))

WebUI.sendKeys(findTestObject('Object Repository/Payment_Page_STORE/input_Country_country'), 'a')

WebUI.verifyElementVisible(findTestObject('Object Repository/Payment_Page_STORE/div_City'))

WebUI.sendKeys(findTestObject('Object Repository/Payment_Page_STORE/input_City_city'), 'a')

WebUI.verifyElementVisible(findTestObject('Object Repository/Payment_Page_STORE/div_Credit card'))

WebUI.sendKeys(findTestObject('Object Repository/Payment_Page_STORE/input_Credit card_card'), 'a')

WebUI.verifyElementVisible(findTestObject('Object Repository/Payment_Page_STORE/div_Month'))

WebUI.sendKeys(findTestObject('Object Repository/Payment_Page_STORE/input_Month_month'), 'a')

WebUI.verifyElementVisible(findTestObject('Object Repository/Payment_Page_STORE/div_Year'))

WebUI.sendKeys(findTestObject('Object Repository/Payment_Page_STORE/input_Year_year'), 'a')

WebUI.click(findTestObject('Object Repository/Payment_Page_STORE/button_Purchase'))

WebUI.verifyElementVisible(findTestObject('Object Repository/verifyPage_STORE/success_img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/verifyPage_STORE/success_message'))

WebUI.verifyElementVisible(findTestObject('Object Repository/verifyPage_STORE/Page_STORE/pdetails'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/verifyPage_STORE/Page_STORE/pdetails'),30)

String date = element.text

println(date)

WebUI.click(findTestObject('Object Repository/verifyPage_STORE/button_OK'))


//WebDriver driver = DriverFactory.getWebDriver()
//
//String AlertText = driver.switchTo().alert().getText()
//
//WebUI.verifyEqual(AlertText, 'Please fill out Name and Creditcard.')
//
//driver.switchTo().alert().accept();

