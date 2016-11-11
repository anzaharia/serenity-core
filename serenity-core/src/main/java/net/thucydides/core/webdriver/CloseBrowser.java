package net.thucydides.core.webdriver;

import net.serenitybdd.core.webdriver.configuration.RestartBrowserForEach;
import org.openqa.selenium.WebDriver;

public interface CloseBrowser {
    void closeIfConfiguredForANew(RestartBrowserForEach event);

    void whenTheTestsAreFinished(WebDriver driver);
}
