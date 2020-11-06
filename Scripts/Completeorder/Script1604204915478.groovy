import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.click(findTestObject('Object Repository/OrderPage_STORE/a_Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/OrderPage_STORE/h2_Products'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement ProductTable = driver.findElement(By.tagName('table'))

WebElement TotalPriceTable = driver.findElement(By.id("totalp"))

List<WebElement> rows_table = ProductTable.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

println(rows_count)

if(rows_count>1){
	
	List<WebElement> Columns_row = rows_table.get(1).findElements(By.tagName('td'))
	 
	int columns_count = Columns_row.size()
	 
	String productname = Columns_row.get(1).getText()
	
	String productprice = Columns_row.get(2).getText()
	 
	if (productname == 'Dell i7 8gb' && productprice == '700') {
		
		if(productprice == TotalPriceTable.getText()){
	
		WebUI.click(findTestObject('Object Repository/OrderPage_STORE/button_Place Order'))
		
		WebUI.verifyTextPresent("Place order",false)
		
		}
	 
	}
	
}else{

	WebUI.click(findTestObject('Object Repository/OrderPage_STORE/button_Place Order'))
	
	WebUI.verifyAlertPresent(20)
	
}


