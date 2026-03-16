import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Page_Home Page - SIMON/a_Menu'))

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/button_CreateBtn'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/button_CreateBtn'))

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/span_select2-TipeId-container'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/span_select2-TipeId-container'))
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/li_select2-TipeId-result-fx4h-1'))

WebUI.setText(findTestObject('Page_Pengaturan Menu - SIMON/input_Nama'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/span_select2-ParentId-container'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/span_select2-ParentId-container'))
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/li_select2-ParentId-result-4j9w-1'))

WebUI.setText(findTestObject('Page_Pengaturan Menu - SIMON/input_Route'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/input_search -Silahkan pilih'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/input_search -Silahkan pilih'))
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/li_select2-Role-result-kpaj-1_1'))

WebUI.setText(findTestObject('Page_Pengaturan Menu - SIMON/input_OrderBy'), '1')
WebUI.setText(findTestObject('Page_Pengaturan Menu - SIMON/input_Icon'), '1')

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/button_Submit'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/button_Submit'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/div_collapse-icon'), 5)
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/div_collapse-icon'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/div_collapse-icon'))

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/input_txtIndukSearchParam'), 5)
WebUI.setText(findTestObject('Page_Pengaturan Menu - SIMON/input_txtIndukSearchParam'), 'DOTNET10')

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/button_BtnSearch'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/button_BtnSearch'))

WebUI.executeJavaScript('window.scrollTo(0,300)', null)
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/button_button-edit'), 5)
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/button_BtnClearSearch'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/button_BtnClearSearch'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/button_button-edit'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/button_button-edit'))

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/input_Visible'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/input_Visible'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/button_Submit'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/button_Submit'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/i_fa fa-trash btnDelete'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/i_fa fa-trash btnDelete'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Pengaturan Menu - SIMON/button_OK'), 5)
WebUI.click(findTestObject('Page_Pengaturan Menu - SIMON/button_OK'))

WebUI.takeScreenshot()