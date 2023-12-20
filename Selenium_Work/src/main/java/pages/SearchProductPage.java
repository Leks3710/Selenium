package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.ScreenHelper.makeScreenShot;
import static helpers.Waiters.waitUntilVisible;

/**
 * Класс в котором происходит взаимодействие со страницей Apteka
 */
public class SearchProductPage {

    /**
     * Экземпляр драйвера для управления браузером
     */
    private final WebDriver driver;

    /**
     * Конструктор создания ProductSearchPage
     *
     * @param driver драйвер для управления браузером
     */
    public SearchProductPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Элемент с полем поиска на главной странице
     */
    @FindBy(xpath = "//input[@id='title-search-input_fixed']")
    private WebElement productSearchWebElement;

    /**
     * Метод ввода текста в поле поиска
     *
     * @param product текст ввода
     * @return текущая страница
     */
    @Step("Поиск товара только по полному совпадению словосочетания")
    public SearchProductPage inputStringInProductSearch(String product) {
        waitUntilVisible(driver, productSearchWebElement);
        productSearchWebElement.sendKeys(product);
        makeScreenShot(driver);
        return this;
    }
}
