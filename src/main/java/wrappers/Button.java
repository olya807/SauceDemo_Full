package elements;

import core.BrowsersService;
import org.openqa.selenium.By;

public class Button {
    private final elements.UIElement uiElement;

    public Button(BrowsersService browsersService, By by) {
        this.uiElement = new elements.UIElement(browsersService, by);
    }

    public void click() {
        this.uiElement.click();
    }

    public void submit() {
        this.uiElement.submit();
    }

    public boolean isDisplayed() {
        return this.uiElement.isDisplayed();
    }
}