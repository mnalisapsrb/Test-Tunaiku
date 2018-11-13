import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.tunaiku.com/')

WebUI.click(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/div_per bulan_mat-slider-thumb'))

WebUI.click(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/div_per bulan_mat-slider-thumb'))

WebUI.click(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/div_per bulan_mat-slider-thumb_1'))

WebUI.click(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/button_Ajukan Pinjaman'))

WebUI.click(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/button_BELUM PERNAH'))

WebUI.setText(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/input_Nama Lengkap_name'), 'Monalisa Pasaribu')

WebUI.setText(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/input_Nomor Handphone_mobilePh'), '82166023682')

WebUI.setText(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/input_Alamat Email_emailAddres'), 'monalisaapasaribu@gmail.com')

WebUI.selectOptionByValue(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/select_Pilih salah satu'), 'Personal', true)

WebUI.selectOptionByValue(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/select_Pilih salah satu       _1'), 'Investment', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/select_Pilih salah satu       _2'), 'Internet', 
    true)

WebUI.click(findTestObject('Page_Pinjaman Uang Online Tanpa Agu/button_Lanjut Isi Formulir Pen'))

