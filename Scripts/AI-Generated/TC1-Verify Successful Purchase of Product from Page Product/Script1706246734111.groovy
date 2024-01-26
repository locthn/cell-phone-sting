import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'Step 2: At Page home, click on hyperlink new > navigate to Page product/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_new'))

'Step 3: At Page product/*, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_object'))

'Step 4: At Page product/*, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_object_1'))

'Step 5: At Page product/*, click on button buy'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

'Step 6: Add visual checkpoint at Page_product/*'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Purchase of Product from Page Product_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
