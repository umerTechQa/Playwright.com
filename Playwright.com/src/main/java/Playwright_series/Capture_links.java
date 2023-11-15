package Playwright_series;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Capture_links {

	public void Capture_all_links() {
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://www.ebay.com/");
		List<String> LinkText=page.locator("a:visible").allInnerTexts();
		for(int i=0; i<=LinkText.size(); i++) {
			System.out.println(LinkText.get(i));
		}
				}

	


	}

