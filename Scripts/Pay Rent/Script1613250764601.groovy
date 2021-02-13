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

WebUI.setText(findTestObject('Object Repository/Page_Sign-In/input__txtEmail'), 'test321@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-In/input__txtPassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign-In/input__txtPassword'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Portal'))

WebUI.click(findTestObject('Object Repository/Page_Tenant Portal/path'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pay Rent/p_Rent 600.00'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pay Rent/p_Online Fees 17.70'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pay Rent/p_Total 617.70'), 0)

WebUI.switchToWindowTitle('Pay Rent')

WebUI.click(findTestObject('Object Repository/Page_Pay Rent/div_paypal-button-label-container'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in to your PayPal account/p__paypal-logo paypal-logo-long'), 
    0)

WebUI.closeBrowser()
