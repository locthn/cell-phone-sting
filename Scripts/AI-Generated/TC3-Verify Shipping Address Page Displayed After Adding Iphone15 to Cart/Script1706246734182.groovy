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

'Step 2: At Page home, click on hyperlink iphone 15 > navigate to Page product/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_iphone_15'))

'Step 3: At Page product/*, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_object'))

'Step 4: At Page product/*, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_object_1'))

'Step 5: At Page product/*, click on button buy'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

'Step 6: At Page product/*, click on hyperlink place an order > navigate to Page cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/hyperlink_place_an_order'))

'Step 7: At Page cart, click on button proceed to checkout > navigate to Page checkout/info'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed_to_checkout'))

'Step 8: At Page checkout/info, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

'Step 9: At Page checkout/info, click on input email'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

'Step 10: At Page checkout/info, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

'Step 11: At Page checkout/info, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/div_object_1'))

'Step 12: At Page checkout/info, click on button continue to shipping > navigate to Page checkout/shipping-address'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continue_to_shipping'))

'Step 13: Add visual checkpoint at Page_checkout/shipping-address'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Shipping Address Page Displayed After Adding Iphone15 to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
