package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.ScreenHelper.makeScreenShot;
import static helpers.Waiters.waitUntilVisible;

/**
 * Класс в котором происходит взаимодействие с корзиной
 */

public class CartPage {

    /**
     * Экземпляр драйвера для управления браузером
     */
    private final WebDriver driver;

    /**
     * Конструктор создания AddPendingItemToOrderPage
     *
     * @param driver драйвер для управления браузером
     */
    public CartPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Элемент с полем переход в корзину
     */
    @FindBy(xpath = "//span[@class='js-basket-block']")
    private WebElement moveToCartWebElement;

    /**
     * Элемент с полем 'Очистить' корзину
     */
    @FindBy(xpath = "//span[@class='delete_all btn btn-default white white-bg grey remove_all_basket']")
    private WebElement emptyTheCartWebElement;

    /**
     * Метод выбора кнопки корзины в основном меню
     *
     * @return текущая страница
     */
    @Step("Выбора кнопки корзины в основном меню")
    public CartPage inputCart (){
        waitUntilVisible(driver, moveToCartWebElement);
        moveToCartWebElement.click();
        makeScreenShot(driver);
        return this;
    }

    /**
     * Метод выбора кнопки 'Очистить' корзину
     *
     * @return текущая страница
     */
    @Step("Выбор кнопки 'Очистить' корзину")
    public CartPage inputEmptyTheCart (){
        waitUntilVisible(driver, emptyTheCartWebElement);
        emptyTheCartWebElement.click();
        makeScreenShot(driver);
        return this;
    }
}
