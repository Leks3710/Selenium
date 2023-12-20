import baseTest.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.CategoryAndSubcategoryPage;

/**
 * Класс с тестами выбора категории и подкатегории из основного меню
 */
@Epic("Apteka")
public class CategoryAndSubcategoryTest extends BaseTest {

    @Test(description = "Выбор категории и подкатегории из основного меню")
    @Feature("Вывод товаров из категории и подкатегории")
    @Owner("Помыткин Алексей Олегович")
    @Severity(value = SeverityLevel.MINOR)
    public void testCatalogAndSubcategory() {

        /**
         * Тест выбора категории и под категории из каталога
         */
        new CategoryAndSubcategoryPage(driver)
                .inputInProductCatalogChoise()
                .inputInProductSubcategoryMenu();
    }
}
