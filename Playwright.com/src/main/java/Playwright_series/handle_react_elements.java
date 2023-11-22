package Playwright_series;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class handle_react_elements {

	@Test
	@Owner("Umer Ejaz")
	@Story("How to get react based locators")
	 @Description("This is for get react based locator.")
	 @Severity(SeverityLevel.CRITICAL)
	public void handle_react_locator() {
		
		Playwright playwright=Playwright.create();
	    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	    BrowserContext context=browser.newContext();
	    Page page =browser.newPage();
	   //launch the playwright inspector thru below command and then get the locator from any react application
	    //---* mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen https:google.com"----*
	    page.navigate("https://www.netflix.com/pk/");
	    page.locator("_react=input[name='email']").first().fill("XYZ@gmail.com");
	    System.out.println("Done with react based application locators.");
	    //allure result cmd commands below 
	    //allure serve allure-results
	
	}
}
