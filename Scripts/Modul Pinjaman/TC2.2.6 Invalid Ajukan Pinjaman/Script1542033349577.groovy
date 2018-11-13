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

WebUI.navigateToUrl('https://test.tunaiku.com/loan/application-form/data-diri')

WebUI.setText(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/textarea_Alamat KTP_domicileAd'), 
    'Jalan Selamat Sentosa')

WebUI.setText(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/input_Nomor Blok_domicileAddre'), 
    'MP')

WebUI.setText(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/input_Nomor Rumah_domicileAddr'), 
    '26')

WebUI.setText(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/input_RT_domicileAddress_rt'), 
    '0')

WebUI.setText(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/input_Nomor Blok_domicileAddre'), 
    '0')

WebUI.setText(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/input_RW_domicileAddress_rw'), 
    'MP')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/select_Pilih Salah Satu   ACEH'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/select_Pilih Salah Satu   KAB.'), 
    '69', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/select_Pilih Salah Satu   BUNG'), 
    '4465', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/select_Pilih Salah Satu   BELA'), 
    '54716', true)

WebUI.click(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC2.2.6/Page_Data Pribadi - Form Aplikasi P/button_Selanjutnya'))

