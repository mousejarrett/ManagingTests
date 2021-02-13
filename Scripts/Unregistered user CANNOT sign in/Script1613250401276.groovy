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

WebUI.navigateToUrl('https://managing-made-easier.web.app/')

WebUI.click(findTestObject('Object Repository/Page_Home/a_Sign-In'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-In/input__txtEmail'), 'test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-In/input__txtPassword'), 'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/Page_Sign-In/button_Sign-In'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sign-In/div_The email address is badly formatted'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-In/input__txtPassword'), 'YsxTccsmuDoDBwXzvpNmKQ==')

WebUI.click(findTestObject('Object Repository/Page_Sign-In/button_Sign-In'))

WebUI.setText(findTestObject('Object Repository/Page_Sign-In/input__txtEmail'), 'test@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Sign-In/button_Sign-In'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sign-In/div_There is no user record corresponding t_0b1d2f'), 
    0)

WebUI.closeBrowser()

