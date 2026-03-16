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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:44320/')

WebUI.setText(findTestObject('Page_Login - Project/input_Enter username'), '62808')

WebUI.click(findTestObject('Page_Login - Project/input_Enter password'))

WebUI.setEncryptedText(findTestObject('Page_Login - Project/input_Enter password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Login - Project/button_submit_login'))

WebUI.click(findTestObject('Page_Home Page - SIMON/a_List Debitur'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Action'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/a_btn-formkualitatif'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Next'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/div_SuksesData Aktivitas Pemantauan berhasil dis'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Next'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Pasar dalam posisi tumbuh dengan Daya s'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Debitur mendominasi pasar sebagai top 1'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Saluran distribusi sangat efisien yang'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. 100_ jajaran direksi dan satu level dir'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Level management tidak pernah berganti'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/a_Pilar-2'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Debitur tidak pernah mengalami ekuitas'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Persebaran baik_ Kualitas baik'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/a_Pilar-3'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Selalu terbuka  mau berkerja sama'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Jaminan sesuai atau lebih dari nilai kr'))

