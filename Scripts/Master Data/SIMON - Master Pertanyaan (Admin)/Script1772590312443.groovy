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

WebUI.scrollToElement(findTestObject('Page_Home Page - SIMON/a_Master Pertanyaan'), 5)
WebUI.click(findTestObject('Page_Home Page - SIMON/a_Master Pertanyaan'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/button_CreateBtn'), 5)
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/button_CreateBtn'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/span_select2-KategoriId-container'), 5)
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/span_select2-KategoriId-container'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/li_Ketersediaan dan keakuratan informasi keuanga'), 5)
WebUI.mouseOver(findTestObject('Page_Master Pertanyaan - SIMON/li_Ketersediaan dan keakuratan informasi keuanga'))
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/li_Ketersediaan dan keakuratan informasi keuanga'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/input_Kode'), 5)
WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/input_Kode'), 'DOTNET10')

WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/textarea_Pertanyaan'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/input_CutOfStabill'), '1')
WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/input_MaxParamScore'), '1')
WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/input_Bobot'), '1')
WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/input_JumlahPilihan'), '1')

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/textarea_Keterangan'), 5)
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/textarea_Keterangan'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/button_Submit'))

WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/button_Submit'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/button_OK'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/button_OK'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/a_CreateJawabanBtn'), 5)
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/a_CreateJawabanBtn'))

WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/input_Kode_1'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/input_Jawaban'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/input_Score'), '1')

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/input_Terbobot'), 5)
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/input_Terbobot'))

WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/textarea_Keterangan_1'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/input_OrderBy'), '1')

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/button_SubmitJawaban'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/button_SubmitJawaban'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/button_Submit'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/div_Advance Search'), 5)
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/div_Advance Search'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/input_txtKodeSearchParam'), 5)
WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/input_txtKodeSearchParam'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/button_BtnSearch'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/button_BtnSearch'))

WebUI.executeJavaScript('window.scrollTo(0,400)', null)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/td_1'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/button_BtnClearSearch'), 5)
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/button_BtnClearSearch'))

WebUI.setText(findTestObject('Page_Master Pertanyaan - SIMON/input_txtKodeSearchParam'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/button_BtnSearch'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/button_BtnSearch'))

WebUI.executeJavaScript('window.scrollTo(0,400)', null)
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/i_fa fa-edit btnEdit'), 5)
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/i_fa fa-edit btnEdit'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/input_IsActive'), 5)
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/input_IsActive'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/button_Submit'))

// ===== DELETE =====

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/i_fa fa-trash btnDelete'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/i_fa fa-trash btnDelete'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/button_OK'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Pertanyaan - SIMON/button_OK'))

WebUI.scrollToElement(findTestObject('Page_Master Pertanyaan - SIMON/div_SuksesData berhasil dihapus'), 5)
WebUI.takeScreenshot()

