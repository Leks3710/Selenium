package pages;


import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.ScreenHelper.makeScreenShot;
import static helpers.Waiters.waitUntilVisible;

/**
 * Класс в котором происходит взаимодействие с добавлением отложенного товара к заказу
 */
public class AddToOrderPage {

    /**
     * Экземпляр драйвера для управления браузером
     */
    private final WebDriver driver;

    /**
     * Конструктор создания AddPendingItemToOrderPage
     *
     * @param driver драйвер для управления браузером
     */
    public AddToOrderPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Элемент с полем Добавить к заказу
     */
    @FindBy(xpath = "//a[@data-entity='basket-item-remove-delayed']")
    private WebElement AddPendingItemToOrderWebElement;

    /**
     * Метод выбора кнопки 'Добавить к заказу'
     *
     * @return текущая страница
     */
    @Step("Выбор кнопки 'Добавить к заказу'")
    public AddToOrderPage inputAddPendingItemToOrder (){
        waitUntilVisible(driver, AddPendingItemToOrderWebElement);
        AddPendingItemToOrderWebElement.click();
        makeScreenShot(driver);
        return this;
    }
}
