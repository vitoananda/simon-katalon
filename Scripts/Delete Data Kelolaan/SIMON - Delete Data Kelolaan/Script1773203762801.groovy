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

WebUI.scrollToElement(findTestObject('Page_Home Page - SIMON/a_Update Data Kelolaan'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Home Page - SIMON/a_Update Data Kelolaan'))

WebUI.scrollToElement(findTestObject('Page_Update Data Kelolaan - SIMON/a_Advance Search'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Update Data Kelolaan - SIMON/a_Advance Search'))

WebUI.scrollToElement(findTestObject('Page_Update Data Kelolaan - SIMON/input_txtCifSearchParam'), 10)

WebUI.setText(findTestObject('Page_Update Data Kelolaan - SIMON/input_txtCifSearchParam'), cif)

WebUI.scrollToElement(findTestObject('Page_Update Data Kelolaan - SIMON/button_BtnSearch2'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Update Data Kelolaan - SIMON/button_BtnSearch2'))

WebUI.scrollToElement(findTestObject('Page_Update Data Kelolaan - SIMON/button_Action'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Update Data Kelolaan - SIMON/button_Action'))

WebUI.scrollToElement(findTestObject('Page_Update Data Kelolaan - SIMON/a_button-delete'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Update Data Kelolaan - SIMON/a_button-delete'))

WebUI.scrollToElement(findTestObject('Page_Update Data Kelolaan - SIMON/button_Ya, Hapus'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Update Data Kelolaan - SIMON/button_Ya, Hapus'))

