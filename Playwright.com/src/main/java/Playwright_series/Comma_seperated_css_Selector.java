package Playwright_series;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Comma_seperated_css_Selector {
	public void comma() {
		Playwright playwright= Playwright.create();
		Browser browser= playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page= browser.newPage();
		page.navigate("https://www.amazon.com/");
		page.locator("span:has-text('Sign in'), span:has-text('Log in')").first().click();
		System.out.println("Done");
		

	}

}
