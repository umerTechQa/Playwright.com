package Playwright_series;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Newtestcase {
    @Test
	public void new001() {
    	Playwright playwright=Playwright.create();
    	Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://www.ebay.com/");		
		System.out.println(" This is new test cases added !");
		
	}
}
