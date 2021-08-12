package wrappers;

import core.BrowsersService;
import org.openqa.selenium.By;
import pages.UIElement;

public class Input {
    private final UIElement uiElement;

    public Input(BrowsersService browsersService, By by) {
        this.uiElement = new UIElement(browsersService, by);
    }

    public void sendKeys(){

    }

    public void sendKeys(String username) {
    }
}
