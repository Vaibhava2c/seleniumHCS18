package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericcLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {

	//Declaration
	@FindBy(xpath="//div[@class='navbar-header']")
	private WebElement pageHeader;
	@FindBy(id="course")
	private WebElement courseTab;
	@FindBy(xpath="//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement catagoryDropdown;
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Utilization 
	public String getPageHeader(){
		return pageHeader.getText();
	}
	 public void mouseHoverToCourse(WebDriverUtility web) {
		 web.mouseHover(courseTab);
	 }
	 public void clickSeleniumTraining() {
		 seleniumTrainingLink.click();
	 }
	 public void selectCatagory(WebDriverUtility web, int index) {
		 web.dropdown(catagoryDropdown, index);
	 }
	 public void clickContactUs() {
		 contactUsLink.click();
	 }
}
