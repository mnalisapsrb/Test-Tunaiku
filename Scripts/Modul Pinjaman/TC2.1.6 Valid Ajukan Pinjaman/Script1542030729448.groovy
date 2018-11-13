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

WebUI.navigateToUrl('https://test.tunaiku.com/loan/application-form/alamat-tinggal')

WebUI.click(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/button_Berbeda'))

WebUI.setText(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/input_Alamat Tempat Tinggal_co'), 
    'Jalan Kota Bambu Selatan II Nomor 47')

WebUI.setText(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/input_Nomor Blok_contactAddres'), 
    '0')

WebUI.setText(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/input_Alamat Tempat Tinggal_co'), 
    'Jalan Kota Bambu Selatan')

WebUI.setText(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/input_Nomor Rumah_contactAddre'), 
    '47')

WebUI.setText(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/input_RT_contactAddress_rt'), 
    '02')

WebUI.setText(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/input_RW_contactAddress_rw'), 
    '09')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/select_Pilih Salah Satu   ACEH'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/select_Pilih Salah Satu   KAB.'), 
    '155', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/select_Pilih Salah Satu   CENG'), 
    '2054', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/select_Pilih Salah Satu   JATI'), 
    '25565', true)

WebUI.click(findTestObject('Object Repository/TC2.1.6/Page_Domisli Tempat Tinggal - Form/button_Selanjutnya'))

