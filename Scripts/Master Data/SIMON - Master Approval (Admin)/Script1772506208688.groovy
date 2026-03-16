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


WebUI.scrollToElement(findTestObject('Page_Home Page - SIMON/a_Master Approval'), 5)
WebUI.click(findTestObject('Page_Home Page - SIMON/a_Master Approval'))

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/button_CreateBtn'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/button_CreateBtn'))

// JENIS
WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/span_select2-Jenis-container'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/span_select2-Jenis-container'))

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/li_select2-Jenis-result-vxro-1'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/li_select2-Jenis-result-vxro-1'))

// TRANSAKSI
WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/span_select2-TransaksiId-container'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/span_select2-TransaksiId-container'))

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/li_select2-TransaksiId-result-wkij-1'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/li_select2-TransaksiId-result-wkij-1'))

// SEGMEN
WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/span_select2-Segmen-container'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/span_select2-Segmen-container'))

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/li_select2-Segmen-result-21bt-3'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/li_select2-Segmen-result-21bt-3'))

// JABATAN
WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/span_select2-Jabatan-container'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/span_select2-Jabatan-container'))

WebUI.setText(findTestObject('Page_Master Approval - SIMON/input_searchbox'), 'RM')

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/li_RM'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/li_RM'))

// ROLE
WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/span_select2-Role-container'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/span_select2-Role-container'))

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/li_select2-Role-result-7b00-1'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/li_select2-Role-result-7b00-1'))

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/input_UrutanApprove'), 5)
WebUI.setText(findTestObject('Page_Master Approval - SIMON/input_UrutanApprove'), '1')

// SUBMIT CREATE
WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Approval - SIMON/button_Submit'))

// SEARCH
WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/a_Advance Search'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/a_Advance Search'))

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/input_txtKodeSearchParam'), 5)
WebUI.setText(findTestObject('Page_Master Approval - SIMON/input_txtKodeSearchParam'), 'Korporasi')

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/input_txtNamaSearchParam'), 5)
WebUI.setText(findTestObject('Page_Master Approval - SIMON/input_txtNamaSearchParam'), 'RM')

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/button_BtnSearch'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/button_BtnSearch'))

WebUI.executeJavaScript('window.scrollTo(0,300)', null)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/i_fa fa-edit btnEdit'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/i_fa fa-edit btnEdit'))

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/input_IsActive'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/input_IsActive'))

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Approval - SIMON/button_Submit'))

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/i_fa fa-trash btnDelete'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Approval - SIMON/i_fa fa-trash btnDelete'))

WebUI.scrollToElement(findTestObject('Page_Master Approval - SIMON/button_OK'), 5)
WebUI.click(findTestObject('Page_Master Approval - SIMON/button_OK'))
WebUI.takeScreenshot()

