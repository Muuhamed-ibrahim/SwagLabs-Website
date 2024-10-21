package actions;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;

import java.util.List;

public class CustomDecorator implements WebElement {
    private WebDriver driver;
    private By element;
    private int waitTime;

    public CustomDecorator(WebDriver driver, By element, int waitTime){
        this.driver = driver;
        this.element = element;
        this.waitTime = waitTime;
    }
    private void setWait(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void click() {
        System.out.println("Clicking on element: "+ element.toString());
        setWait();
        driver.findElement(element).click();

    }

    @Override
    public void submit() {

    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        System.out.println("Typing: "+ keysToSend + "on element: " + element.toString());
        setWait();
        driver.findElement(element).sendKeys(keysToSend);

    }

    @Override
    public void clear() {

    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public @Nullable String getDomProperty(String name) {
        return WebElement.super.getDomProperty(name);
    }

    @Override
    public @Nullable String getDomAttribute(String name) {
        return WebElement.super.getDomAttribute(name);
    }

    @Override
    public @Nullable String getAttribute(String name) {
        return null;
    }

    @Override
    public @Nullable String getAriaRole() {
        return WebElement.super.getAriaRole();
    }

    @Override
    public @Nullable String getAccessibleName() {
        return WebElement.super.getAccessibleName();
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public SearchContext getShadowRoot() {
        return WebElement.super.getShadowRoot();
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public Point getLocation() {
        return null;
    }

    @Override
    public Dimension getSize() {
        return null;
    }

    @Override
    public Rectangle getRect() {
        return null;
    }

    @Override
    public String getCssValue(String propertyName) {
        return null;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return null;
    }
}
