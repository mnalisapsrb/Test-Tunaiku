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

WebUI.setText(findTestObject('Object Repository/TC2.2.2/Page_Data Pribadi - Form Aplikasi P/input_Nomor KTP (NIK)_pin'), 
    '1271075610960008')

WebUI.click(findTestObject('Object Repository/TC2.2.2/Page_Data Pribadi - Form Aplikasi P/div_Jumlah PinjamanRp 8.000.00'))

WebUI.setText(findTestObject('Object Repository/TC2.2.2/Page_Data Pribadi - Form Aplikasi P/input_Nomor KTP (NIK)_pin'), 
    '1271075610960009')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.2/Page_Data Pribadi - Form Aplikasi P/select_Pilih salah satu   AGRI'), 
    'BRI', true)

WebUI.setText(findTestObject('Object Repository/TC2.2.2/Page_Data Pribadi - Form Aplikasi P/input_Nomor Rekening_bankAccou'), 
    '530501014835516')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.2/Page_Data Pribadi - Form Aplikasi P/select_Pilih salah satu   SD'), 
    'BachelorDegree', true)

WebUI.setText(findTestObject('Object Repository/TC2.2.2/Page_Data Pribadi - Form Aplikasi P/input_Nomor KTP (NIK)_pin'), 
    '')

WebUI.click(findTestObject('Object Repository/TC2.2.2/Page_Data Pribadi - Form Aplikasi P/button_Ya'))

WebUI.click(findTestObject('Object Repository/TC2.2.2/Page_Data Pribadi - Form Aplikasi P/button_Selanjutnya'))

