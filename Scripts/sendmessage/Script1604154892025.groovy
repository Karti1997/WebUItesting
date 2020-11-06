import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Object Repository/ContactPage_STORE/a_Contact'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ContactPage_STORE/dialogtitle_New message'))

WebUI.sendKeys(findTestObject('Object Repository/ContactPage_STORE/email_TextField'), 'ramu@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/ContactPage_STORE/name_TextField'), 'kalai')

WebUI.sendKeys(findTestObject('Object Repository/ContactPage_STORE/Message_TextArea'), 'hai iam fine')

WebUI.click(findTestObject('Object Repository/ContactPage_STORE/button_Send message'))

WebDriver driver = DriverFactory.getWebDriver()

String AlertText = driver.switchTo().alert().getText()

WebUI.verifyEqual(AlertText, 'Thanks for the message!!')

driver.switchTo().alert().accept();