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


WebUI.click(findTestObject('Page_Home Page - SIMON/a_Master Tema Reason Code'))

WebUI.scrollToElement(findTestObject('Page_Master Tema Reason Code - SIMON/button_CreateBtn'), 10)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/button_CreateBtn'))

WebUI.scrollToElement(findTestObject('Page_Master Tema Reason Code - SIMON/span_select2-SegmenId-container'), 10)
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/span_select2-SegmenId-container'))
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/li_select2-SegmenId-result-vtsa-3'))

WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/span_select2-Model-container'))
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/li_select2-Model-result-ol9q-1'))

WebUI.setText(findTestObject('Page_Master Tema Reason Code - SIMON/input_Nama'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Tema Reason Code - SIMON/textarea_Keterangan'), '1')

WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/button_Submit'))

WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/button_OK'))

// Create Jawaban
WebUI.scrollToElement(findTestObject('Page_Master Tema Reason Code - SIMON/a_CreateJawabanBtn'), 10)
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/a_CreateJawabanBtn'))

WebUI.setText(findTestObject('Page_Master Tema Reason Code - SIMON/input_Kode'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Tema Reason Code - SIMON/textarea_Name'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Tema Reason Code - SIMON/input_OrderBy'), '1')
WebUI.setText(findTestObject('Page_Master Tema Reason Code - SIMON/textarea_Keterangan_1'), 'DOTNET10')

WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/button_SubmitJawaban'))

WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/button_Submit'))

// Search
WebUI.scrollToElement(findTestObject('Page_Master Tema Reason Code - SIMON/a_Advance Search'), 10)
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/a_Advance Search'))

WebUI.setText(findTestObject('Page_Master Tema Reason Code - SIMON/input_txtNamaSearchParam'), 'DOTNET10')
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/button_BtnSearch'))

// Edit
WebUI.scrollToElement(findTestObject('Page_Master Tema Reason Code - SIMON/button_button-edit'), 10)
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/button_button-edit'))

WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/input_IsActive'))
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/button_Submit'))

// Delete
WebUI.scrollToElement(findTestObject('Page_Master Tema Reason Code - SIMON/button_button-delete'), 10)
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/button_button-delete'))

WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Tema Reason Code - SIMON/button_OK'))

