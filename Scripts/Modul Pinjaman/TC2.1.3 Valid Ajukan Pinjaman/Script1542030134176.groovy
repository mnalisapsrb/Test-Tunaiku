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

WebUI.navigateToUrl('https://test.tunaiku.com/loan/application-form/data-ktp')

WebUI.selectOptionByValue(findTestObject('TC2.1.3/Page_Identitas Sesuai KTP - Form Ap/select_Pilih Salah Satu   ACEH'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('TC2.1.3/Page_Identitas Sesuai KTP - Form Ap/select_Pilih Salah Satu   KAB.'), 
    '49', true)

WebUI.selectOptionByValue(findTestObject('TC2.1.3/Page_Identitas Sesuai KTP - Form Ap/select_12345678910111213141516'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('TC2.1.3/Page_Identitas Sesuai KTP - Form Ap/select_JanFebMarAprMayJunJulAu'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('TC2.1.3/Page_Identitas Sesuai KTP - Form Ap/select_20182017201620152014201'), 
    '1996', true)

WebUI.click(findTestObject('TC2.1.3/Page_Identitas Sesuai KTP - Form Ap/button_Perempuan'))

WebUI.click(findTestObject('TC2.1.3/Page_Identitas Sesuai KTP - Form Ap/button_Selanjutnya'))

