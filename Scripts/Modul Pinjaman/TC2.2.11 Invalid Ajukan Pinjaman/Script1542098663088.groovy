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

WebUI.navigateToUrl('https://test.tunaiku.com/loan/application-form/pekerjaan')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.11/Page_Pekerjaan - Form Aplikasi Pinj/select_Pilih Salah Satu   PNS'), 
    'PublicServant', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.11/Page_Pekerjaan - Form Aplikasi Pinj/select_Pilih Salah Satu   Perm'), 
    'Permanent', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC2.2.11/Page_Pekerjaan - Form Aplikasi Pinj/select_Pilih Salah Satu   Kont'), 
    'Staff', true)

WebUI.setText(findTestObject('Object Repository/TC2.2.11/Page_Pekerjaan - Form Aplikasi Pinj/input_Rp_income_monthlyIncome'), 
    '6000000')

WebUI.setText(findTestObject('Object Repository/TC2.2.11/Page_Pekerjaan - Form Aplikasi Pinj/input_Rp_income_previousIncome'), 
    '5000000')

WebUI.click(findTestObject('Object Repository/TC2.2.11/Page_Pekerjaan - Form Aplikasi Pinj/button_Selanjutnya'))

