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

WebUI.navigateToUrl('https://test.tunaiku.com/loan/application-form/data-ktp-2')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   Ruma'), 
    'Rumah', true)

WebUI.setText(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/input_Nomor Blok_domicileAddre'), 
    '0')

WebUI.setText(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/input_Nomor Rumah_domicileAddr'), 
    '26')

WebUI.setText(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/input_RT_domicileAddress_rt'), 
    '0')

WebUI.setText(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/input_RW_domicileAddress_rw'), 
    '0')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   ACEH'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   KAB.'), 
    '49', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   MEDA'), 
    '3870', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   KEME'), 
    '47073', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   Isla'), 
    'Christian', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   WNI'), 
    'Indonesian', true)

WebUI.click(findTestObject('Object Repository/TC2.2.5/Page_Alamat Sesuai KTP - Form Aplik/button_Selanjutnya'))

