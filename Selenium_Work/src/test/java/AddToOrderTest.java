import baseTest.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.AddToOrderPage;
import pages.CategoryAndSubcategoryPage;
import pages.DelayButtonPage;

/**
 * Класс с тестами взаимодействия с добавлением отложенного товара к заказу
 */
@Epic("Apteka")
public class AddToOrderTest extends BaseTest {

    @Test(description = "Тест взаимодействия добавлением отложенного товара к заказу")
    @Feature("Добавление товара к заказу с помощью 'Добавить к заказу'")
    @Owner("Помыткин Алексей Олегович")
    @Severity(value = SeverityLevel.MINOR)
    public void testAddPendingItemToOrder() throws InterruptedException {

        /**
         * Поиск товара из категории и под категории из каталога
         */
        new CategoryAndSubcategoryPage(driver)
                .inputInProductCatalogChoise()
                .inputInProductSubcategoryMenu();

        Thread.sleep(3000);

        /**
         * Добавление товара в 'Отложить'
         */
        new DelayButtonPage(driver)
                .inputPushingThePostponeButtonOnAProduct()
                .inputSelectingTheDelayButtonInTheMainMenu();

        Thread.sleep(3000);

        /**
         * Тест взаимодействия добавлением отложенного товара к заказу
         */
        new AddToOrderPage(driver)
                .inputAddPendingItemToOrder();

    }
}
