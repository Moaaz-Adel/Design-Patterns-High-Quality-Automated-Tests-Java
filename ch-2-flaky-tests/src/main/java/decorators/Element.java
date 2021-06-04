package decorators;

import org.openqa.selenium.By;

public interface Element {
    public abstract By getBy();
    public abstract String getText();
    public abstract Boolean isEnabled();
    public abstract Boolean isDisplayed();
    public abstract void typeText(String text) throws InterruptedException;
    public abstract void click();
    public abstract String getAttribute(String attributeName);
}
