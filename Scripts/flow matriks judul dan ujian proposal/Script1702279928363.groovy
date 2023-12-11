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

WebUI.navigateToUrl('https://demo.siakad.link/')

WebUI.click(findTestObject('Object Repository/Page_SIAKAD LINK - Solusi Mutakhir Pengelol_60c0a5/a_SIAKADKlik icon berikut untuk administras_61fd7f'))

WebUI.switchToWindowTitle('Sistem Informasi Akademik Arkatama Multi Solusindo')

WebUI.setText(findTestObject('Object Repository/Page_Sistem Informasi Akademik Arkatama Mul_bb5093/input_Pengumuman Selengkapnya_username'), 
    '302190125')

WebUI.scrollToElement(findTestObject('Page_Sistem Informasi Akademik Arkatama Mul_bb5093/input_Pengumuman Selengkapnya_password'), 
    0)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sistem Informasi Akademik Arkatama Mul_bb5093/input_Pengumuman Selengkapnya_password'), 
    'iGDxf8hSRT4=')

WebUI.scrollToElement(findTestObject('Page_Sistem Informasi Akademik Arkatama Mul_bb5093/button_Login'), 0)

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik Arkatama Mul_bb5093/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_ecc366/a_Tugas Akhir'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_ecc366/span_Matriks Judul'))

WebUI.setText(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/input__judul_tugas_akhir'), 
    'Implementasi Grafana untuk Auto-Scaling pada NGINX Web-Server di Lingkungan Docker Container')

WebUI.setText(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/input__judul_bahasa_lain'), 
    'Grafana Implementation for Auto-Scaling on NGINX Web-Server in Docker Container Environment')

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/span_Pilih Metode Penelitian'))

WebUI.setText(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/input_concat(id(, , select2-id_metode_penel_77bde9'), 
    'kuanti')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/input_concat(id(, , select2-id_metode_penel_77bde9'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Latar Belakang'), 0)

WebUI.click(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Latar Belakang'))

WebUI.setText(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Latar Belakang'), 'Cloud Computing merupakan bidang teknologi yang menyediakan berbagai layanan melalui internet, berdasarkan teknologi virtualisasi seperti virtualisasi penyimpanan, jaringan, dan komputasi. Virtualisasi komputasi melibatkan penggunaan mesin virtual (VM) dan kontainer. VM memiliki overhead yang besar, sementara kontainer menawarkan performa lebih baik karena overhead yang lebih kecil')

WebUI.scrollToElement(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Rumusan masalah'), 0)

WebUI.click(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Rumusan masalah'))

WebUI.setText(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Rumusan masalah'), 'Teknologi kontainer memberikan banyak manfaat, termasuk lingkungan konsisten dan reproduksi sumber daya, serta kemudahan dalam deployment')

WebUI.scrollToElement(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Teori Relevan'), 0)

WebUI.click(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Teori Relevan'))

WebUI.setText(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Teori Relevan'), 'Auto-scaling membantu kontainer memungkinkan skala sumber daya beradaptasi dengan permintaan, memastikan layanan berjalan tanpa kegagalan fungsionalitas, dan mencegah pemborosan sumber daya saat permintaan rendah')

WebUI.scrollToElement(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Kajian Pustaka'), 0)

WebUI.click(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Kajian Pustaka'))

WebUI.setText(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/div_Kajian Pustaka'), 'Lorido-Botran, T., Miguel-Alonso, J., &amp; Lozano, J. A. (2014). A Review of Auto-scaling Techniques for Elastic Applications in Cloud Environments. Journal of Grid Computing, 12(4), 559–592.')

WebUI.scrollToElement(findTestObject('Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/button_Daftarkan Matriks Judul Sekarang'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/button_Daftarkan Matriks Judul Sekarang'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/button_Ya, Daftar Sekarang'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_9ce208/button_OK'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.siakad.link/')

WebUI.click(findTestObject('Object Repository/Page_SIAKAD LINK - Solusi Mutakhir Pengelol_60c0a5/a_BAAKlik icon berikut untuk petugas Admini_f99140'))

WebUI.switchToWindowTitle('Sistem Informasi Akademik — IAIN Ponorogo | index')

WebUI.setText(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_1c8aea/input_Silahkan login menggunakan akun Anda _d75272'),
	'70232')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_1c8aea/input_Silahkan login menggunakan akun Anda _7fe4b3'),
	'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_1c8aea/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_ecc366/a_Proposal'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_ecc366/span_Matriks Judul'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_76a6fc/a_Detail'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_176078/button_Tentukan Dosen Pembimbing'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_176078/input__status'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_176078/span__select2-id_dosen_pembimbing-container'))

WebUI.setText(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_176078/input_Simpan_select2-search__field'),
	'lia')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_176078/input_Simpan_select2-search__field'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_176078/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi Akademik  IAIN Ponoro_176078/button_OK'))

WebUI.closeBrowser()