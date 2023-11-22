package Playwright_series;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class Playwright_tracing {
   @Test
	public void tracing() {
		Playwright playwright=Playwright.create();
		Browser broswer=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext=broswer.newContext();
		brcontext.tracing().start(new Tracing.StartOptions()
				  .setScreenshots(true)
				  .setSnapshots(true)
				  .setSources(true));

		Page page=brcontext.newPage();
		page.navigate("https://www.facebook.com/");
		brcontext.tracing().stop(new Tracing.StopOptions()
				  .setPath(Paths.get("trace.zip")));
	}
}
