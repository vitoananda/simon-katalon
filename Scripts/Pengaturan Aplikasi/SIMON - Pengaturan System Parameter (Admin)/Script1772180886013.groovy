import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.click(findTestObject('Page_Home Page - SIMON/a_System Parameter'))

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/button_CreateBtn'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/button_CreateBtn'))

WebUI.setText(findTestObject('Page_System Parameter - SIMON/input_Key'), 'DOTNET10')
WebUI.setText(findTestObject('Page_System Parameter - SIMON/input_Value'), 'DOTNET10')
WebUI.setText(findTestObject('Page_System Parameter - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/input_IsActive'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/input_IsActive'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/button_Submit'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/button_Submit'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/a_Advance Search'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/a_Advance Search'))

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/input_txtKeySearchParam'), 5)
WebUI.setText(findTestObject('Page_System Parameter - SIMON/input_txtKeySearchParam'), 'DOTNET10')

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/button_BtnSearch'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/button_BtnSearch'))

WebUI.executeJavaScript('window.scrollTo(0,300)', null)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/button_BtnClearSearch'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/button_BtnClearSearch'))

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/input_txtValueSearchParam'), 5)
WebUI.setText(findTestObject('Page_System Parameter - SIMON/input_txtValueSearchParam'), 'DOTNET10')

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/button_BtnSearch'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/button_BtnSearch'))

WebUI.executeJavaScript('window.scrollTo(0,300)', null)
WebUI.delay(2)
WebUI.takeScreenshot()


WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/div_collapse-icon'), 5)

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/button_BtnClearSearch'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/button_BtnClearSearch'))

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/div_collapse-icon'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/div_collapse-icon'))

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/i_fa fa-edit btnEdit'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/i_fa fa-edit btnEdit'))

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/input_IsActive_1'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/input_IsActive_1'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/button_Submit'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/button_Submit'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/td_1'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/td_1'))

WebUI.click(findTestObject('Page_System Parameter - SIMON/td_1_1'))

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/i_fa fa-trash btnDelete'), 5)
WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_System Parameter - SIMON/i_fa fa-trash btnDelete'))

WebUI.scrollToElement(findTestObject('Page_System Parameter - SIMON/button_OK'), 5)
WebUI.click(findTestObject('Page_System Parameter - SIMON/button_OK'))

WebUI.takeScreenshot()
