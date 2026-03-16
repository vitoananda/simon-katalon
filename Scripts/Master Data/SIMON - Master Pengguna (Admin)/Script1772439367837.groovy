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


WebUI.scrollToElement(findTestObject('Page_Home Page - SIMON/a_Master Pengguna'), 5)
WebUI.click(findTestObject('Page_Home Page - SIMON/a_Master Pengguna'))

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/button_BtnCreateUser'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/button_BtnCreateUser'))

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/input_Npp'), 5)
WebUI.setText(findTestObject('Page_Master Pengguna - SIMON/input_Npp'), '111')

// UNIT
WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/span_span -Silahkan pilih'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/span_span -Silahkan pilih'))

WebUI.setText(findTestObject('Page_Master Pengguna - SIMON/input_searchbox'), 'STA BENG')
WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/li_STA BENGKULU'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/li_STA BENGKULU'))

// ROLE
WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/span_select2-RoleId-container'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/span_select2-RoleId-container'))

WebUI.setText(findTestObject('Page_Master Pengguna - SIMON/input_searchbox'), 'INPUTT')
WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/li_select2-RoleId-result-6s40-4'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/li_select2-RoleId-result-6s40-4'))

// JABATAN
WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/span_select2-Jabatan_Id-container'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/span_select2-Jabatan_Id-container'))

WebUI.setText(findTestObject('Page_Master Pengguna - SIMON/input_searchbox'), 'RM')
WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/li_RM'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/li_RM'))

// SUBMIT CREATE
WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/button_Submit'))

// EDIT NPP
WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/input_Npp'), 5)
WebUI.setText(findTestObject('Page_Master Pengguna - SIMON/input_Npp'), '67254')

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/a_generate_npp'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/a_generate_npp'))

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/button_Submit'))

// SEARCH
WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/a_Advance Search'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/a_Advance Search'))

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/input_txtNppSearchParam'), 5)
WebUI.setText(findTestObject('Page_Master Pengguna - SIMON/input_txtNppSearchParam'), '67254')

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/button_BtnSearch'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/button_BtnSearch'))

WebUI.executeJavaScript('window.scrollTo(0,500)', null)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/button_BtnClearSearch'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/button_BtnClearSearch'))

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/input_txtNamaSearchParam'), 5)
WebUI.setText(findTestObject('Page_Master Pengguna - SIMON/input_txtNamaSearchParam'), 'MUHAMMAD IKO')

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/button_BtnSearch'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/button_BtnSearch'))

WebUI.executeJavaScript('window.scrollTo(0,500)', null)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/button_BtnClearSearch'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/button_BtnClearSearch'))

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/input_txtUnitSearchParam'), 5)
WebUI.setText(findTestObject('Page_Master Pengguna - SIMON/input_txtUnitSearchParam'), 'STA BENGKULU')

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/button_BtnSearch'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/button_BtnSearch'))

WebUI.executeJavaScript('window.scrollTo(0,500)', null)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/button_BtnClearSearch'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/button_BtnClearSearch'))

// EDIT
WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/i_fa fa-edit btnEdit'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/i_fa fa-edit btnEdit'))

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/input_IsActive'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/input_IsActive'))

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/button_Submit'))

// DELETE
WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/td_1'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/td_1'))

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/td_1_1'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/td_1_1'))

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/i_fa fa-trash btnDelete'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/i_fa fa-trash btnDelete'))

WebUI.scrollToElement(findTestObject('Page_Master Pengguna - SIMON/button_OK'), 5)
WebUI.click(findTestObject('Page_Master Pengguna - SIMON/button_OK'))
WebUI.takeScreenshot()

