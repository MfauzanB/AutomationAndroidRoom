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

Mobile.startApplication('E:\\Kuliah\\SEMESTER 7\\Big Data\\Materi\\com.yoesuv.androidroom-v2(2.1.1)-release.apk', true)

Mobile.tapAndHold(findTestObject('Object Repository/android.widget.ImageButton (2)'), 0, 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Task Title (2)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Task Title (3)'), 'kue', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Task Content (3)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Task Content (4)'), 'malang', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SAVE (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - EDIT'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - malang'), 'Sleman', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - UPDATE'), 0)

Mobile.closeApplication()

