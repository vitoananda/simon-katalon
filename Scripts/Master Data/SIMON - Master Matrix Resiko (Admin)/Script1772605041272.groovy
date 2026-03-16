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



WebUI.click(findTestObject('Page_Home Page - SIMON/a_Master Matrix Resiko'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Resiko - SIMON/button_CreateBtn'), 10)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/button_CreateBtn'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Resiko - SIMON/span_select2-SegmenId-container'), 10)
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/span_select2-SegmenId-container'))
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/li_select2-SegmenId-result-1x0b-3'))

WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/span_select2-IdGroupResiko-container'))
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/li_select2-IdGroupResiko-result-pnfq-1'))

WebUI.setText(findTestObject('Page_Master Matrix Resiko - SIMON/textarea_ResikoName'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Matrix Resiko - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.takeScreenshot()

// Create Jawaban
WebUI.scrollToElement(findTestObject('Page_Master Matrix Resiko - SIMON/a_CreateJawabanBtn'), 10)
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/a_CreateJawabanBtn'))

WebUI.setText(findTestObject('Page_Master Matrix Resiko - SIMON/textarea_NamaPertanyaan'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Matrix Resiko - SIMON/textarea_Keterangan_1'), 'DOTNET10')

WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/button_SubmitJawaban'))

WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/button_Submit'))

// Search
WebUI.scrollToElement(findTestObject('Page_Master Matrix Resiko - SIMON/a_Advance Search'), 10)
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/a_Advance Search'))

WebUI.setText(findTestObject('Page_Master Matrix Resiko - SIMON/input_txtNamaSearchParam'), 'DOTNET10')
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/button_BtnSearch'))

// Edit
WebUI.scrollToElement(findTestObject('Page_Master Matrix Resiko - SIMON/button_button-edit'), 10)
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/button_button-edit'))

WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/input_Isactive'))
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/button_Submit'))

// Delete
WebUI.scrollToElement(findTestObject('Page_Master Matrix Resiko - SIMON/i_fa fa-trash btnDelete'), 10)
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/i_fa fa-trash btnDelete'))

WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Matrix Resiko - SIMON/button_OK'))

WebUI.takeScreenshot()

