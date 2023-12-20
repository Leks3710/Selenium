import baseTest.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.AddToOrderPage;
import pages.CartPage;
import pages.CategoryAndSubcategoryPage;
import pages.DelayButtonPage;

/**
 * Класс с тестами взаимодействия с корзиной
 */
@Epic("Apteka")
public class CartTest extends BaseTest {

    @Test(description = "Тест перехода и очистки корзины")
    @Feature("Очистка товара из корзины")
    @Owner("Помыткин Алексей Олегович")
    @Severity(value = SeverityLevel.MINOR)
    public void testEmptyTheCart() throws InterruptedException {

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
         *  Добавление отложенного товара к заказу
         */
        new AddToOrderPage(driver)
                .inputAddPendingItemToOrder();

        Thread.sleep(3000);

        /**
         *  Тест перехода и очистки корзины
         */
        new CartPage(driver)
                .inputCart()
                .inputEmptyTheCart();
    }
}
