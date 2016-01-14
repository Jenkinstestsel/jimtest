package PageObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_HomePage {
	WebDriver brows;
	@FindBy (id = "srchword" )
	WebElement Textbox_search;
	
	@FindBy (className ="newsrchbtn" )
	WebElement Button_search;
	
	@FindBy (id ="find" )
	WebElement text_validmsg;
	
	@FindBy(css = "p[class = 'sorrymsg']")
	WebElement text_invalidmsg;
	@FindBy(xpath = ".//div[@id='myDataDiv']/div/div[1]/div[1]/a/img")
	WebElement img_floodandfire;
	
	
	public POM_HomePage(WebDriver driver)
	{
		brows=driver;
		PageFactory.initElements(brows, this);
	}
	
	public void Enter_searchword(String Search_Item)
	{
		Textbox_search.sendKeys(Search_Item);
	}
	
	public void click_Searchbutton()
	{
		Button_search.click();
	}
	
	public String get_validmsg(){
		return text_validmsg.getText();
	}
	
	public String get_invalidmsg()
	{
		return text_invalidmsg.getText();
	}
	
	public void click_img()
	{
		img_floodandfire.click();
	}
	
	public void execute_comm_methods(String Search_Item)
	{
		Enter_searchword( Search_Item);
		click_Searchbutton();
	}
	
}
