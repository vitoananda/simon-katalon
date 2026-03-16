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

WebUI.scrollToElement(findTestObject('Page_Home Page - SIMON/a_Matrix Pemantauan'), 5)
WebUI.click(findTestObject('Page_Home Page - SIMON/a_Matrix Pemantauan'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_CreateBtn'), 5)
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_CreateBtn'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/span_select2-SegmenId-container'), 5)
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/span_select2-SegmenId-container'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-SegmenId-result-n9o3-3'), 5)
WebUI.mouseOver(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-SegmenId-result-n9o3-3'))
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-SegmenId-result-n9o3-3'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/span_select2-Kolektability-container'), 5)
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/span_select2-Kolektability-container'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-Kolektability-result-8kvw-1'), 5)
WebUI.mouseOver(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-Kolektability-result-8kvw-1'))
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-Kolektability-result-8kvw-1'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/textarea_Name'), 5)
WebUI.setText(findTestObject('Page_Master Matrix Pemantauan - SIMON/textarea_Name'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/span_select2-SkorKuantitatif-container'), 5)
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/span_select2-SkorKuantitatif-container'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-SkorKuantitatif-result-tijz-Merah'), 5)
WebUI.mouseOver(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-SkorKuantitatif-result-tijz-Merah'))
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-SkorKuantitatif-result-tijz-Merah'))

WebUI.setText(findTestObject('Page_Master Matrix Pemantauan - SIMON/input_MinimumScore'), '1')
WebUI.setText(findTestObject('Page_Master Matrix Pemantauan - SIMON/input_MaximumScore'), '1')

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/span_select2-RekomendasiAksi-container'), 5)
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/span_select2-RekomendasiAksi-container'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-RekomendasiAksi-result-qrp2-EXIT'), 5)
WebUI.mouseOver(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-RekomendasiAksi-result-qrp2-EXIT'))
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/li_select2-RekomendasiAksi-result-qrp2-EXIT'))

WebUI.setText(findTestObject('Page_Master Matrix Pemantauan - SIMON/textarea_Keterangan'), 'DOTNET10')
WebUI.setText(findTestObject('Page_Master Matrix Pemantauan - SIMON/input_Urutan'), '1')

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/input_PembuatanMts'), 5)
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/input_PembuatanMts'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_Submit'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/a_Advance Search'), 5)
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/a_Advance Search'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/input_txtNamaSearchParam'), 5)
WebUI.setText(findTestObject('Page_Master Matrix Pemantauan - SIMON/input_txtNamaSearchParam'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_BtnSearch'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_BtnSearch'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_button-edit'), 5)
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_button-edit'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/input_IsActive'), 5)
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/input_IsActive'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_Submit'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_Submit'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/td_1'), 5)
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/td_1'))

// DELETE
WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/i_fa fa-trash btnDelete'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/i_fa fa-trash btnDelete'))

WebUI.scrollToElement(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_OK'), 5)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Master Matrix Pemantauan - SIMON/button_OK'))

WebUI.takeScreenshot()

