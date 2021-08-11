package wrappers;

import core.BrowsersService;
import org.openqa.selenium.By;

public class Input {
    private final elements.UIElement uiElement;

    public Input(BrowsersService browsersService, By by) {
        this.uiElement = new elements.UIElement(browsersService, by);
    }

    public void sendKeys(){

    }

    public void sendKeys(String username) {
    }
}
