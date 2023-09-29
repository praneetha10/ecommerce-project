package Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class objectRepository {
	
	@FindBy(how=How.XPATH,using="//*[@id='content']/h2[1]")
	private static WebElement account;
	
	public void setvalue() {
		
	}
	

}
