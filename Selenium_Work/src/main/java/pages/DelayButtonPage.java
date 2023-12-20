package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.ScreenHelper.makeScreenShot;
import static helpers.Waiters.waitUntilVisible;

/**
 * Класс в котором происходит взаимодействие с кнопкой "Отложить"
 */
public class DelayButtonPage {

    /**
     * Экземпляр драйвера для управления браузером
     */
    private final WebDriver driver;

    /**
     * Конструктор создания DelayButtonPage
     *
     * @param driver драйвер для управления браузером
     */
    public DelayButtonPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Элемент с полем кнопки 'Отложить' на продукте
     */
    @FindBy(xpath = "//div[@id='bx_3966226736_134602']/div/div/div/div")
    private WebElement pushingThePostponeButtonOnAProduct;

    /**
     * Элемент с полем кнопки отложить в основном меню
     */
    @FindBy(xpath = "//div[@class='wrap_icon inner-table-block baskets big-padding']/a")
    private WebElement SelectingTheDelayButtonInTheMainMenu;

    /**
     * Метод нажатия кнопки 'Отложить' на продукте
     *
     * @return текущая страница
     */
    @Step("Клик кнопки 'Отложить' на продукте")
    public DelayButtonPage inputPushingThePostponeButtonOnAProduct(){
        waitUntilVisible(driver, pushingThePostponeButtonOnAProduct);
        pushingThePostponeButtonOnAProduct.click();
        makeScreenShot(driver);
        return this;
    }

    /**
     * Метод выбора кнопки отложить в основном меню
     *
     * @return текущая страница
     */
    @Step("Клик кнопки отложить в основном меню")
    public DelayButtonPage inputSelectingTheDelayButtonInTheMainMenu(){
        waitUntilVisible(driver, SelectingTheDelayButtonInTheMainMenu);
        SelectingTheDelayButtonInTheMainMenu.click();
        makeScreenShot(driver);
        return this;
    }


}
