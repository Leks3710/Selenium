import baseTest.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.DelayButtonPage;
import pages.CategoryAndSubcategoryPage;

/**
 * Класс с тестами выбора кнопки 'Отложить' на продукте и в основном меню
 */
@Epic("Apteka")
public class DelayButtonTest extends BaseTest {

    @Test(description = "Тест кнопки 'Отложить' на продукте и в основном меню")
    @Feature("Добавление товара с помощью кнопки 'Отложить'")
    @Owner("Помыткин Алексей Олегович")
    @Severity(value = SeverityLevel.MINOR)
    public void testDelayButton() throws InterruptedException {

        /**
         * Поиск товара из категории и под категории из каталога
         */
        new CategoryAndSubcategoryPage(driver)
                .inputInProductCatalogChoise()
                .inputInProductSubcategoryMenu();

        Thread.sleep(3000);
        /**
         * Тест кнопки 'Отложить' на продукте и в основном меню
         */
        new DelayButtonPage(driver)
                .inputPushingThePostponeButtonOnAProduct()
                .inputSelectingTheDelayButtonInTheMainMenu();
    }
}
