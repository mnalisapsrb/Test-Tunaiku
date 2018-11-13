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

WebUI.navigateToUrl('https://test.tunaiku.com/loan/application-form/status-tinggal')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.7/Page_Status Tempat Tinggal - Form A/select_Pilih Salah Satu   Apar'), 
    'House', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.7/Page_Status Tempat Tinggal - Form A/select_Pilih Salah Satu   Kelu'), 
    'BoardingHouse', true)

WebUI.click(findTestObject('Object Repository/TC2.2.7/Page_Status Tempat Tinggal - Form A/p_isi dengan angka ribuan cont'))

WebUI.setText(findTestObject('Object Repository/TC2.2.7/Page_Status Tempat Tinggal - Form A/input_Rp_housing_monthlyCost'), 
    '1100000')

WebUI.setText(findTestObject('Object Repository/TC2.2.7/Page_Status Tempat Tinggal - Form A/input_Rp_housing_expenseCost'), 
    '100000')

WebUI.setText(findTestObject('Object Repository/TC2.2.7/Page_Status Tempat Tinggal - Form A/input_Jumlah Tinggal Serumah_h'), 
    '2')

WebUI.setText(findTestObject('Object Repository/TC2.2.7/Page_Status Tempat Tinggal - Form A/input_Jumlah Tanggungan_depend'), 
    '1')

WebUI.click(findTestObject('Object Repository/TC2.2.7/Page_Status Tempat Tinggal - Form A/button_Selanjutnya'))

