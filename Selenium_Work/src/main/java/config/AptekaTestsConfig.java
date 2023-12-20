package config;

import org.aeonbits.owner.Config;

/**
 * Интерфейс с конфигурацией проекта для тестов aptekaeconom страницы
 */
@Config.Sources({"classpath:aptekaeconom_tests_config.properties"})
public interface AptekaTestsConfig extends Config {

    /**
     * Метод возвращает параметр seleniumInput из aptekaeconom_tests_config.properties
     *
     * @return параметр строки поиска
     */
    String inputSearch();
}
