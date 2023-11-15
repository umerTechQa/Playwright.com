package Playwright_series;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class click_or_get_specific_tag_element {

	public void click_specific_tag_element() {
		 Playwright playwright = Playwright.create();
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	      BrowserContext context = browser.newContext();
	      Page page = context.newPage();
	      page.navigate("https://www.orangehrm.com/");
	     String header= page.locator("div.homepage-slider-content h1:has-text('Peace of mind is just a few clicks away!')").textContent();
	      System.out.println(header);
	      
	}


}
