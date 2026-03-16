import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.scrollToElement(findTestObject('Page_Home Page - SIMON/a_Master Kategori'), 5)
WebUI.click(findTestObject('Page_Home Page - SIMON/a_Master Kategori'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/button_CreateBtn'), 5)
WebUI.click(findTestObject('Page_Master Kategori - SIMON/button_CreateBtn'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/span_select2-PilarId-container'), 5)
WebUI.click(findTestObject('Page_Master Kategori - SIMON/span_select2-PilarId-container'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/li_Pilar-1'), 5)
WebUI.click(findTestObject('Page_Master Kategori - SIMON/li_Pilar-1'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/input_Kode'), 5)
WebUI.setText(findTestObject('Page_Master Kategori - SIMON/input_Kode'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/textarea_Name'), 5)
WebUI.setText(findTestObject('Page_Master Kategori - SIMON/textarea_Name'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/input_Bobot'), 5)
WebUI.setText(findTestObject('Page_Master Kategori - SIMON/input_Bobot'), '1')

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/textarea_Keterangan'), 5)
WebUI.setText(findTestObject('Page_Master Kategori - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Kategori - SIMON/button_Submit'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/input_OrderBy'), 5)
WebUI.setText(findTestObject('Page_Master Kategori - SIMON/input_OrderBy'), '1')

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Kategori - SIMON/button_Submit'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/a_Advance Search'), 5)
WebUI.click(findTestObject('Page_Master Kategori - SIMON/a_Advance Search'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/input_txtKodeSearchParam'), 5)
WebUI.setText(findTestObject('Page_Master Kategori - SIMON/input_txtKodeSearchParam'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/button_BtnSearch'), 5)
WebUI.click(findTestObject('Page_Master Kategori - SIMON/button_BtnSearch'))

WebUI.executeJavaScript('window.scrollTo(0,500)', null)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/button_BtnClearSearch'), 5)
WebUI.click(findTestObject('Page_Master Kategori - SIMON/button_BtnClearSearch'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/input_txtNamaSearchParam'), 5)
WebUI.setText(findTestObject('Page_Master Kategori - SIMON/input_txtNamaSearchParam'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/i_fa fa-md fa-search'), 5)
WebUI.click(findTestObject('Page_Master Kategori - SIMON/i_fa fa-md fa-search'))

WebUI.executeJavaScript('window.scrollTo(0,500)', null)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/i_fa fa-edit btnEdit'), 5)
WebUI.click(findTestObject('Page_Master Kategori - SIMON/i_fa fa-edit btnEdit'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/input_IsActive'), 5)
WebUI.click(findTestObject('Page_Master Kategori - SIMON/input_IsActive'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Kategori - SIMON/button_Submit'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/button_button-delete'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Kategori - SIMON/button_button-delete'))

WebUI.scrollToElement(findTestObject('Page_Master Kategori - SIMON/button_OK'), 5)
WebUI.click(findTestObject('Page_Master Kategori - SIMON/button_OK'))
WebUI.takeScreenshot()

