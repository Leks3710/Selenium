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
public class CategoryAndSubcategoryPage {

    /**
     * Экземпляр драйвера для управления браузером
     */
    private final WebDriver driver;

    /**
     * Конструктор создания CategoryAndSubcategoryPage
     *
     * @param driver драйвер для управления браузером
     */
    public CategoryAndSubcategoryPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Элемент с полем детское питание на главной странице
     */
    @FindBy(xpath = "//a[@href='/catalog/lechebnoe-i-dieticheskoe-pitanie/']/div")
    private WebElement productCatalogWebElement;

    /**
     * Элемент с полем леденцы и конфеты в подкатегории
     */
    @FindBy(xpath = "//a[text()='Леденцы, конфеты']")
    private WebElement productSubcategoryMenuWebElement;

    /**
     * Метод выбора категории из меню каталога на основной странице
     *
     * @return текущая страница
     */
    @Step("Выбор категории из меню каталога на основной странице")
    public CategoryAndSubcategoryPage inputInProductCatalogChoise (){
        waitUntilVisible(driver, productCatalogWebElement);
        productCatalogWebElement.click();
        makeScreenShot(driver);
        return this;
    }

    /**
     * Метод выбора товара из меню подкатегории из выбранного меню каталога
     *
     * @return текущая страница
     */
    @Step("Выбор товара из меню подкатегории из выбранного меню каталога")
    public CategoryAndSubcategoryPage inputInProductSubcategoryMenu (){
        waitUntilVisible(driver, productSubcategoryMenuWebElement);
        productSubcategoryMenuWebElement.click();
        makeScreenShot(driver);
        return this;
    }




}
