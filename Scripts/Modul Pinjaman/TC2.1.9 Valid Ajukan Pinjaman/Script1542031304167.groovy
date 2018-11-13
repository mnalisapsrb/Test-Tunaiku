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

WebUI.navigateToUrl('https://test.tunaiku.com/loan/application-form/data-kerabat')

WebUI.setText(findTestObject('Object Repository/TC2.1.9/Page_Data Kerabat - Form Aplikasi P/input_Nama Kerabat_personalRef'), 
    'Sintauli Manullang')

WebUI.setText(findTestObject('Object Repository/TC2.1.9/Page_Data Kerabat - Form Aplikasi P/input_Nomor Handphone Kerabat_'), 
    '85370784620')

WebUI.setText(findTestObject('Object Repository/TC2.1.9/Page_Data Kerabat - Form Aplikasi P/input_Alamat Lengkap Kerabat_p'), 
    'Jalan Bukit Umbul Timur')

WebUI.click(findTestObject('Object Repository/TC2.1.9/Page_Data Kerabat - Form Aplikasi P/button_Selanjutnya'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.tunaiku.com/loan/application-form/review-form')

WebUI.click(findTestObject('Object Repository/TC2.1.9/Page_Cek Ulang Data - Form Aplikasi/input_Pastikan nomor handphone'))

WebUI.click(findTestObject('Object Repository/TC2.1.9/Page_Cek Ulang Data - Form Aplikasi/button_Kirim Formulir'))

