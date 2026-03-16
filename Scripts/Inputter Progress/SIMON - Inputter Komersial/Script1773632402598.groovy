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


WebUI.scrollToElement(findTestObject('Page_Home Page - SIMON/a_List Debitur'), 5)
WebUI.click(findTestObject('Page_Home Page - SIMON/a_List Debitur'))
WebUI.takeScreenshot()

// ── Advance Search & input CIF ───────────────────────────────────────────────
WebUI.waitForPageLoad(15)
WebUI.waitForElementVisible(findTestObject('Page_List Debitur - SIMON/a_Advance Search'), 15)
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/a_Advance Search'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/a_Advance Search'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/input_txtCifSearchParam1'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_txtCifSearchParam1'), cif)

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_BtnSearchV1'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_BtnSearchV1'))
WebUI.takeScreenshot()

// ── Open Form Kualitatif ─────────────────────────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_Action'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Action'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/a_btn-formkualitatif'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/a_btn-formkualitatif'))
WebUI.takeScreenshot()

// ── Upload Aktivitas 1: Review IRS 2.0 ──────────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/span_span -Silahkan pilih'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/span_span -Silahkan pilih'))
WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_Review IRS 2.0 dan dilampirkan melalui upload'))
WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Review IRS 2.0 dan dilampirkan melalui upload'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/input_file'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_file'), filePath)

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'))
WebUI.takeScreenshot()

// ── Upload Aktivitas 2: Monitoring penyaluran ────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container'))
WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_Monitoring penyaluran mutasi keuangan, efekti'))
WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Monitoring penyaluran mutasi keuangan, efekti'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/input_file'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_file'), filePath)

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'))
WebUI.takeScreenshot()

// ── Upload Aktivitas 3: Call (Kontak Debitur) ────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container_1'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container_1'))
WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_Call (Kontak Debitur) terkait monitor  verif'))
WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Call (Kontak Debitur) terkait monitor  verif'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/input_file'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_file'), filePath)

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'))
WebUI.takeScreenshot()

// ── Upload Aktivitas 4: Monitoring jaminan ───────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container_1'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container_1'))
WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_Monitoring jaminan bergerak dan tidak bergera'))
WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Monitoring jaminan bergerak dan tidak bergera'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/input_file'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_file'), filePath)

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'))
WebUI.takeScreenshot()

// ── Upload Aktivitas 5: Kunjungan setempat / site visit ──────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_CreateUploadBtn'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container_1'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-IdAktivitas-container_1'))
WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_Melakukan kunjungan setempat_site visit dan d'))
WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Melakukan kunjungan setempat_site visit dan d'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Keterangan'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/input_file'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_file'), filePath)

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_btnUploadAktivitas'))
WebUI.takeScreenshot()

// ── Next → Tab Checkboxes ────────────────────────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_Next'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Next'))
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_Tidak'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_Tidak'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_1. Memiliki DSRA (rekening giro escrow) da'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_1. Memiliki DSRA (rekening giro escrow) da'))

// ── Tab Informasi Debitur ────────────────────────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/a_TabInformasiDebitur'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/a_TabInformasiDebitur'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/textarea_BidangUsaha'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_BidangUsaha'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/span_presentation'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/span_presentation'))
WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_IDR'))

WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Review IRS 2.0 dan dilampirkan melalui upload'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/input_MaksimumKreditString'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_MaksimumKreditString'), '1.000.000.0000')

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/span_span -Silahkan pilih_1'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/span_span -Silahkan pilih_1'))
WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_select2-IsGroup-result-r2m4-2'))
WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Monitoring penyaluran mutasi keuangan, efekti'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/span_select2-IsMps-container'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-IsMps-container'))
WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_select2-IsMps-result-fd6r-0'))
WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Monitoring penyaluran mutasi keuangan, efekti'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/span_select2-PemenuhanKewajiban-container'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-PemenuhanKewajiban-container'))
WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_select2-PemenuhanKewajiban-result-588f-0'))
WebUI.click(findTestObject('Page_List Debitur - SIMON/li_Monitoring penyaluran mutasi keuangan, efekti'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/textarea_IndikasiMasalah'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_IndikasiMasalah'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/textarea_PemenuhanDsra'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_PemenuhanDsra'), 'DOTNET10')
WebUI.takeScreenshot()

// ── Next → Pilar 1 ───────────────────────────────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_Next'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Next'))
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Meningkat lebih dari 25'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Meningkat lebih dari 25'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_0. Tidak memiliki group usaha'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_0. Tidak memiliki group usaha'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_0. Sektor usaha debitur diperkirakan tidak'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_0. Sektor usaha debitur diperkirakan tidak'))

// ── Pilar 2 ──────────────────────────────────────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/a_Pilar-17'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/a_Pilar-17'))
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Debitur tidak pernah memiliki EBTIDA ne'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Debitur tidak pernah memiliki EBTIDA ne'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Rasio DER dibawah dari ketentuan yang b'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Rasio DER dibawah dari ketentuan yang b'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Tidak pernah Pra NPL dalam satu tahun t'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Tidak pernah Pra NPL dalam satu tahun t'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Debitur memiliki risiko nilai tukar val'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Debitur memiliki risiko nilai tukar val'))

// ── Pilar 3 ──────────────────────────────────────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/a_Pilar-18'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/a_Pilar-18'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Memiliki DSRA dan DSPA masing-masing de'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Memiliki DSRA dan DSPA masing-masing de'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Secara proaktif menyampaikan informasi'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Secara proaktif menyampaikan informasi'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Di atas 80_ s.d 100_ transaksi usaha di'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Di atas 80_ s.d 100_ transaksi usaha di'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Laporan Keuangan 3 bulan terakhir terma'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Laporan Keuangan 3 bulan terakhir terma'))

WebUI.scrollToElememt(findTestObject('Page_List Debitur - SIMON/label__A. PK_P3K telah ditandatangani, Pengikata'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label__A. PK_P3K telah ditandatangani, Pengikata'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Lengkap'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Lengkap'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Telah terpenuhi semuanya'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Telah terpenuhi semuanya'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Masih berjalan dan penggunaan dana sesu'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Masih berjalan dan penggunaan dana sesu'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Mayoritas BNI'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Mayoritas BNI'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/label_A. Pembayaran kewajiban debitur bersumber'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/label_A. Pembayaran kewajiban debitur bersumber'))

// ── Next → Submit ─────────────────────────────────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_Next'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Next'))
WebUI.takeScreenshot()

if (hijau == true) {
	WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/span_select2-Approver1-container_1'), 5)
	WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-Approver1-container_1'))
	WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_searchbox'), 'eny')
	WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_30232 - ENY TANZIL - SBK MEDAN'))
	WebUI.click(findTestObject('Page_List Debitur - SIMON/li_30232 - ENY TANZIL - SBK MEDAN'))

	WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/span_select2-Approver2-container'), 5)
	WebUI.click(findTestObject('Page_List Debitur - SIMON/span_select2-Approver2-container'))
	WebUI.setText(findTestObject('Page_List Debitur - SIMON/input_searchbox'), 'dudi')
	WebUI.mouseOver(findTestObject('Page_List Debitur - SIMON/li_24899 - DUDI MURTIAWAN - SBK MEDAN'))
	WebUI.click(findTestObject('Page_List Debitur - SIMON/li_24899 - DUDI MURTIAWAN - SBK MEDAN'))
	WebUI.takeScreenshot()
}

// ── Final Submit ──────────────────────────────────────────────────────────────
WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_Submit'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Submit'))

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/textarea_Type your text here'), 5)
WebUI.setText(findTestObject('Page_List Debitur - SIMON/textarea_Type your text here'), 'DOTNET10')

WebUI.scrollToElement(findTestObject('Page_List Debitur - SIMON/button_Submit_1'), 5)
WebUI.click(findTestObject('Page_List Debitur - SIMON/button_Submit_1'))
WebUI.takeScreenshot()

