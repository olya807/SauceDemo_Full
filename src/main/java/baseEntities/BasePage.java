package baseEntities;

import core.BrowsersService;

public abstract class BasePage {
    protected static final int WAIT_FOR_PAGE_LOAD_IN_SECONDS = 5;
    protected final BrowsersService browsersService;

    /**
     * In subclasses  should be used for page opening
     */
    protected abstract void openPage();

    /**
     * checks is page opened
     *
     * @return true if opened
     */
    public abstract boolean isPageOpened();

    public BasePage(BrowsersService browsersService, boolean openPageByUrl) {
        this.browsersService = browsersService;

        if (openPageByUrl) {
            openPage();
        }

        waitForOpen();
    }

    /**
     * Waiting for page opening
     */
    protected void waitForOpen() {
        int secondsCount = 0;
        boolean isPageOpenedIndicator = isPageOpened();
        while (!isPageOpenedIndicator && secondsCount < WAIT_FOR_PAGE_LOAD_IN_SECONDS) {
            browsersService.sleep(1000);
            secondsCount++;
            isPageOpenedIndicator = isPageOpened();
        }

        if (!isPageOpenedIndicator) {
            throw new AssertionError("Page was not opened");
        }
    }
}
