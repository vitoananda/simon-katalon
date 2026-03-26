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

WebUI.setText(findTestObject('Page_Login - Project/input_Enter username'), '32323')

WebUI.click(findTestObject('Page_Login - Project/input_Enter password'))

WebUI.setEncryptedText(findTestObject('Page_Login - Project/input_Enter password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Login - Project/button_submit_login'))

WebUI.click(findTestObject('Page_Home Page - SIMON/p_Anda Memiliki 3 Debitur yang Perlu di Follow U'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Action'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/a_btn-formkualitatif'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container'))

WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_Review IRS 2.0 dalam 6 bulan terakhir'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Review IRS 2.0 dalam 6 bulan terakhir'))

WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 'DOTNET 10')

WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_file'), 'C:\\fakepath\\dummy.pdf')

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/div_SuksesData berhasil disimpan'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container'))

WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_Monitoring mutasi keuangan (FRP) 1 bulan tera'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Monitoring mutasi keuangan (FRP) 1 bulan tera'))

WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_file'), 'C:\\fakepath\\dummy.pdf')

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/div_SuksesData berhasil disimpan'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/span_span -Silahkan pilih'))

WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_Call (Debitur dan_atau pihak ketiga) pada Cal'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Call (Debitur dan_atau pihak ketiga) pada Cal'))

WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_file'), 'C:\\fakepath\\dummy.pdf')

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/div_SuksesData berhasil disimpan'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container'))

WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_Update FIA dalam 3 bulan terakhir'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Update FIA dalam 3 bulan terakhir'))

WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_file'), 'C:\\fakepath\\dummy.pdf')

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/div_SuksesData berhasil disimpan'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container'))

WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_Menyusun FKS dalam 3 bulan terakhir'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Menyusun FKS dalam 3 bulan terakhir'))

WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_file'), 'C:\\fakepath\\dummy.pdf')

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/div_SuksesData berhasil disimpan'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Next'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/div_SuksesData berhasil disimpan'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_1. Memiliki DSRA (rekening giro escrow) da'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_Tidak'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/a_TabInformasiDebitur'))

WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_BidangUsaha'), 'DOTNET10')

WebUI.click(findTestObject('Page_List Debitur - SIMON/b_presentation'))

WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_IDR'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Review IRS 2.0 dalam 6 bulan terakhir'))

WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_MaksimumKreditString'), '10.000.0000')

WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-IsGroup-container'))

WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_select2-IsGroup-result-imhe-2'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Monitoring mutasi keuangan (FRP) 1 bulan tera'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/span_span -Silahkan pilih_1'))

WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_select2-IsMps-result-384k-1'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Review IRS 2.0 dalam 6 bulan terakhir'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/span_span -Silahkan pilih_2'))

WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_select2-PemenuhanKewajiban-result-jam8-1'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Review IRS 2.0 dalam 6 bulan terakhir'))

WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_IndikasiMasalah'), 'DOTNET10')

WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_PemenuhanDsra'), 'DOTNET10')

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Next'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Meningkat lebih dari 25'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Pasar dalam posisi tumbuh dengan Daya s'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Growing stage'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Very Strong'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Pengalaman kerja manajemen senior dan a'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_0. Tidak memiliki group usaha'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_0. Sektor usaha debitur diperkirakan tidak'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/a_Pilar-11'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Debitur tidak pernah memiliki EBTIDA ne'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Debitur tidak pernah mengalami ekuitas'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Rasio DER dibawah dari ketentuan yang b'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Tidak pernah Pra NPL dalam satu tahun t'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Debitur memiliki risiko nilai tukar val'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/a_Pilar-12'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Memiliki DSRA dan DSPA masing-masing de'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Secara proaktif menyampaikan informasi'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Di atas 80_ s.d 100_ transaksi usaha di'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Laporan Keuangan 3 bulan terakhir terma'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Informasi mudah diperoleh dan staf Bank'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label__A. PK_P3K telah ditandatangani, Pengikata'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Lengkap'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Telah terpenuhi semuanya'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Masih berjalan dan penggunaan dana sesu'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Mayoritas BNI'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Pembayaran kewajiban debitur bersumber'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Next'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-Approver1-container'))

WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_searchbox'), 'NOPRIANDI')

WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_53895 - NOPRIANDI - STA BALIGE'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_53895 - NOPRIANDI - STA BALIGE'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-Approver2-container'))

WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_searchbox'), 'DANIEL ALOY')

WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_30092 - DANIEL ALOYSIUS SARAGI - STA BALIGE'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_53895 - NOPRIANDI - STA BALIGE'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Submit'))

WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Type your text here'), 'DOTNET10')

WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Submit_1'))

