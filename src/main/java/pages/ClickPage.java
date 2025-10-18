package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ClickPage extends BasePage {
    public ClickPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }
    @FindBy(id = "badButton")
    WebElement btnClickEvent;

    public void clickBtn(){
//        WebElement btn = driver.findElement(By.id("badButton"));
//        btn.click();

//        btnClickEvent.click();

        btnClickEvent.sendKeys(Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript()
    }
    }
