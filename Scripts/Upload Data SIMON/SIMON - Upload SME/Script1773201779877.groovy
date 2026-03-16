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

// Navigate to Upload
WebUI.scrollToElement(findTestObject('Page_Home Page - SIMON/a_Upload Data Simon'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Home Page - SIMON/a_Upload Data Simon'))

// Select Segmen
WebUI.scrollToElement(findTestObject('Page_Upload Data SIMON - SIMON/span_select2-Segmen-container'), 10)

WebUI.click(findTestObject('Page_Upload Data SIMON - SIMON/span_select2-Segmen-container'))

WebUI.scrollToElement(findTestObject('Page_Upload Data SIMON - SIMON/li_select2-Segmen-result-d4el-5'), 10)

WebUI.mouseOver(findTestObject('Page_Upload Data SIMON - SIMON/li_select2-Segmen-result-d4el-5'))

WebUI.click(findTestObject('Page_Upload Data SIMON - SIMON/li_select2-Segmen-result-d4el-5'))


// Set Periode
WebUI.scrollToElement(findTestObject('Page_Upload Data SIMON - SIMON/input_Periode'), 10)

WebUI.click(findTestObject('Page_Upload Data SIMON - SIMON/input_Periode'))

// Upload file
WebUI.scrollToElement(findTestObject('Page_Upload Data SIMON - SIMON/input_file'), 10)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_Upload Data SIMON - SIMON/input_file'), filePath)

// Upload button
WebUI.scrollToElement(findTestObject('Page_Upload Data SIMON - SIMON/button_BtnUpload'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Upload Data SIMON - SIMON/button_BtnUpload'))

WebUI.scrollToElement(findTestObject('Page_Upload Data SIMON - SIMON/button_SubmitSimon'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Upload Data SIMON - SIMON/button_SubmitSimon'))

