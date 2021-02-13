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

WebUI.setText(findTestObject('Object Repository/Page_Sign-In/input__txtEmail'), 'test123@radford.edu')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-In/input__txtPassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Sign-In/button_Sign-In'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sign-In/div_Sign-in Successful You will be redirect_b31683'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Home/a_Listings'))

WebUI.click(findTestObject('Object Repository/Page_Search/div_Search_portfolio-hover'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_View Listing/h1_House'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_View Listing/p_A lovely apartment'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_View Listing/h1_7486 Lee Hwy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_View Listing/a_'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_View Listing/a_'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_View Listing/a_'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_View Listing/a_'), 0)

WebUI.click(findTestObject('Object Repository/Page_View Listing/div'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_View Listing/svg_No pets allowed in property._heart'), 
    0)

WebUI.closeBrowser()

