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

WebUI.setText(findTestObject('Object Repository/Page_Sign-In/input__txtEmail'), 'owner@radford.edu')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign-In/input__txtPassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign-In/input__txtPassword'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Portal'))

WebUI.click(findTestObject('Object Repository/Page_Owner Portal/h4_Rent Log'))

WebUI.click(findTestObject('Object Repository/Page_Payment History/div_Payment History'))

WebUI.click(findTestObject('Object Repository/Page_Payment History/h2_nstoryradford.edu'))

WebUI.click(findTestObject('Object Repository/Page_Payment History/div_nstoryradford.eduThu Mar 18 2021Method _7d05a2'))

WebUI.click(findTestObject('Object Repository/Page_Payment History/button_Thu Mar 18 2021'))

WebUI.closeBrowser()

