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

WebUI.scrollToElement(findTestObject('Page_Home Page - SIMON/a_Master Scoring'), 5)
WebUI.click(findTestObject('Page_Home Page - SIMON/a_Master Scoring'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/div_Tambah Data'), 5)
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/div_Tambah Data'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/button_CreateBtn'), 5)
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/button_CreateBtn'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/span_select2-SegmenId-container'), 5)
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/span_select2-SegmenId-container'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/li_select2-SegmenId-result-1m72-3'), 5)
WebUI.mouseOver(findTestObject('Page_Master Manage Scoring - SIMON/li_select2-SegmenId-result-1m72-3'))
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/li_select2-SegmenId-result-1m72-3'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/span_select2-Kolektability-container'), 5)
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/span_select2-Kolektability-container'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/li_select2-Kolektability-result-leq6-1'), 5)
WebUI.mouseOver(findTestObject('Page_Master Manage Scoring - SIMON/li_select2-Kolektability-result-leq6-1'))
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/li_select2-Kolektability-result-leq6-1'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/textarea_Name'), 5)
WebUI.setText(findTestObject('Page_Master Manage Scoring - SIMON/textarea_Name'), 'DOTNET10')

WebUI.setText(findTestObject('Page_Master Manage Scoring - SIMON/input_SkorMinimum'), '1')
WebUI.setText(findTestObject('Page_Master Manage Scoring - SIMON/input_SkorMaksimum'), '1')
WebUI.setText(findTestObject('Page_Master Manage Scoring - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/button_Submit'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/a_Advance Search'), 5)
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/a_Advance Search'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/input_txtNamaSearchParam'), 5)
WebUI.setText(findTestObject('Page_Master Manage Scoring - SIMON/input_txtNamaSearchParam'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/button_BtnSearch'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/button_BtnSearch'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/i_fa fa-edit btnEdit'), 5)
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/i_fa fa-edit btnEdit'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/input_IsActive'), 5)
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/input_IsActive'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/button_Submit'))

// DELETE
WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/button_button-delete'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/button_button-delete'))

WebUI.scrollToElement(findTestObject('Page_Master Manage Scoring - SIMON/button_OK'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Manage Scoring - SIMON/button_OK'))

WebUI.takeScreenshot()

