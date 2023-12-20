import baseTest.BaseTest;
import config.AptekaTestsConfig;
import io.qameta.allure.*;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;
import pages.SearchProductPage;

/**
 * Класс с тестами поиска товара только по полному совпадению словосочетания
 */
@Epic("Apteka")
public class SearchProductTest extends BaseTest {

    /**
     * Экземпляр конфигурации с параметрами для Apteka тестов
     */
    private final AptekaTestsConfig config = ConfigFactory.create(AptekaTestsConfig.class, System.getenv());

    @Test(description = "Поиск товара только по полному совпадению словосочетания")
    @Feature("Вывод результатов поиска")
    @Owner("Помыткин Алексей Олегович")
    @Severity(value = SeverityLevel.MINOR)
    public void testSearchProductApteka()  {

        new SearchProductPage(driver)
                .inputStringInProductSearch(config.inputSearch());
    }
}
