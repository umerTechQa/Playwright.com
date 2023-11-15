package Playwright_series;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_automation {
	public void automation() {
  Playwright playwright=Playwright.create();
		
	    Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext=browser.newContext();
		Page page=brcontext.newPage();
		page.navigate("https://practice.automationtesting.in/my-account/");
		//page.pause();
		//PWDEBUG Added in the env need to remove in normal execution
		
		  page.locator("#username").fill("o.ejaz@plumlogix.com");
		  page.locator("#password").fill("Plumlogix@1234$$");
		  page.click("input[name='login']");

			System.out.println("Done");
	}


}
