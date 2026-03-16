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



WebUI.scrollToElement(findTestObject('Page_Home Page - SIMON/a_Master Jabatan'), 5)
WebUI.click(findTestObject('Page_Home Page - SIMON/a_Master Jabatan'))

WebUI.scrollToElement(findTestObject('Page_Master Jabatan - SIMON/button_CreateBtn'), 5)
WebUI.click(findTestObject('Page_Master Jabatan - SIMON/button_CreateBtn'))

WebUI.setText(findTestObject('Page_Master Jabatan - SIMON/input_Kode'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Jabatan - SIMON/textarea_Nama'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Jabatan - SIMON/textarea_Keterangan'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Jabatan - SIMON/input_OrderBy'), '1')

WebUI.scrollToElement(findTestObject('Page_Master Jabatan - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Jabatan - SIMON/button_Submit'))

// SEARCH
WebUI.scrollToElement(findTestObject('Page_Master Jabatan - SIMON/a_Advance Search'), 5)
WebUI.click(findTestObject('Page_Master Jabatan - SIMON/a_Advance Search'))

WebUI.scrollToElement(findTestObject('Page_Master Jabatan - SIMON/input_txtNamaSearchParam'), 5)
WebUI.setText(findTestObject('Page_Master Jabatan - SIMON/input_txtNamaSearchParam'), 'DOTNET10')

WebUI.click(findTestObject('Page_Master Jabatan - SIMON/button_BtnSearch'))

WebUI.executeJavaScript('window.scrollTo(0,300)', null)
WebUI.delay(2)
WebUI.takeScreenshot()

// EDIT
WebUI.scrollToElement(findTestObject('Page_Master Jabatan - SIMON/button_button-edit'), 5)
WebUI.click(findTestObject('Page_Master Jabatan - SIMON/button_button-edit'))

WebUI.scrollToElement(findTestObject('Page_Master Jabatan - SIMON/input_IsActive'), 5)
WebUI.click(findTestObject('Page_Master Jabatan - SIMON/input_IsActive'))

WebUI.click(findTestObject('Page_Master Jabatan - SIMON/button_Submit'))

// DELETE
WebUI.scrollToElement(findTestObject('Page_Master Jabatan - SIMON/button_button-delete'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Jabatan - SIMON/button_button-delete'))

WebUI.scrollToElement(findTestObject('Page_Master Jabatan - SIMON/button_OK'), 5)
WebUI.click(findTestObject('Page_Master Jabatan - SIMON/button_OK'))
WebUI.takeScreenshot()