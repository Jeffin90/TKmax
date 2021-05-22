import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.BrowserDriver;

public class Hook {
    BrowserDriver browserDriver = new BrowserDriver();

    @Before
    public void openDriver()
    {
      browserDriver.openBrowser();
    }

    @After
    public void closeDriver()
    {
        browserDriver.closeBrowser();
    }
}
