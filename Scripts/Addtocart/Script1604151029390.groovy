import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/LandingPage_STORE/Categories_Laptops'))

WebUI.click(findTestObject('Object Repository/LandingPage_STORE/button_Next'))

WebUI.click(findTestObject('Object Repository/LandingPage_STORE/Product_Dell i7 8gb'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LandingPage_STORE/ProductDetails_Dell i7 8gb'))

WebUI.click(findTestObject('Object Repository/LandingPage_STORE/a_Add to cart'))

WebDriver driver = DriverFactory.getWebDriver()

WebDriverWait wait = new WebDriverWait(driver, 15);

wait.until(ExpectedConditions.alertIsPresent());

String alrt = driver.switchTo().alert().getText();

//System.out.print(alrt);

WebUI.verifyEqual(alrt, 'Product added')

driver.switchTo().alert().accept();
