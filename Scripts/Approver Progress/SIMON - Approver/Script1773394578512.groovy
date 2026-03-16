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

// Open Inbox
WebUI.scrollToElement(findTestObject('Page_Home Page - SIMON/a_Inbox2'), 10)

WebUI.waitForElementVisible(findTestObject('Page_Home Page - SIMON/a_Inbox2'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Home Page - SIMON/a_Inbox2'))

// Advance Search
WebUI.scrollToElement(findTestObject('Page_Inbox - SIMON/a_Advance Search'), 10)

WebUI.waitForElementVisible(findTestObject('Page_Inbox - SIMON/a_Advance Search'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Inbox - SIMON/a_Advance Search'))

// Input CIF
WebUI.waitForElementVisible(findTestObject('Page_Inbox - SIMON/input_txtCifSearchParam'), 10)

WebUI.scrollToElement(findTestObject('Page_Inbox - SIMON/input_txtCifSearchParam'), 10)

WebUI.setText(findTestObject('Page_Inbox - SIMON/input_txtCifSearchParam'), cif)

WebUI.takeScreenshot()

// Search
WebUI.scrollToElement(findTestObject('Page_Inbox - SIMON/button_BtnSearch2'), 10)

WebUI.click(findTestObject('Page_Inbox - SIMON/button_BtnSearch2'))

// Action
WebUI.waitForElementVisible(findTestObject('Page_Inbox - SIMON/button_Action'), 10)

WebUI.scrollToElement(findTestObject('Page_Inbox - SIMON/button_Action'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Inbox - SIMON/button_Action'))

// Open Form
WebUI.scrollToElement(findTestObject('Page_Inbox - SIMON/a_btn-formkualitatif'), 10)

WebUI.click(findTestObject('Page_Inbox - SIMON/a_btn-formkualitatif'))

WebUI.takeScreenshot()

// Next
WebUI.waitForElementVisible(findTestObject('Page_Inbox - SIMON/button_Next'), 10)
WebUI.scrollToElement(findTestObject('Page_Inbox - SIMON/button_Next'), 10)

WebUI.click(findTestObject('Page_Inbox - SIMON/button_Next'))

WebUI.takeScreenshot()

// Next
WebUI.waitForElementVisible(findTestObject('Page_Inbox - SIMON/button_Next'), 10)
WebUI.scrollToElement(findTestObject('Page_Inbox - SIMON/button_Next'), 10)

WebUI.click(findTestObject('Page_Inbox - SIMON/button_Next'))

WebUI.takeScreenshot()


// Next
WebUI.waitForElementVisible(findTestObject('Page_Inbox - SIMON/button_Next'), 10)
WebUI.scrollToElement(findTestObject('Page_Inbox - SIMON/button_Next'), 10)

WebUI.click(findTestObject('Page_Inbox - SIMON/button_Next'))

WebUI.takeScreenshot()


// Approve
WebUI.waitForElementVisible(findTestObject('Page_Inbox - SIMON/button_Approve'), 10)

WebUI.scrollToElement(findTestObject('Page_Inbox - SIMON/button_Approve'), 10)

WebUI.click(findTestObject('Page_Inbox - SIMON/button_Approve'))

// Comment
WebUI.waitForElementVisible(findTestObject('Page_Inbox - SIMON/textarea_Type your text here'), 10)

WebUI.scrollToElement(findTestObject('Page_Inbox - SIMON/textarea_Type your text here'), 10)

WebUI.setText(findTestObject('Page_Inbox - SIMON/textarea_Type your text here'), 'DOTNET10')

WebUI.takeScreenshot()

// Submit
WebUI.scrollToElement(findTestObject('Page_Inbox - SIMON/button_Submit'), 10)

WebUI.click(findTestObject('Page_Inbox - SIMON/button_Submit'))

WebUI.takeScreenshot()

