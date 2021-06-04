package decorators;
import java.util.List;

import org.openqa.selenium.By;

public interface Driver {

    public abstract void start(Browser browser);
    public abstract void quit();
    public abstract void goToUrl(String url);
    public abstract Element findElement(By locator);
    public abstract List<Element> findElements(By locator);
}
