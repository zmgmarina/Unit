### Проверка того, что функция addContact корректно добавляет новый контакт в список контактов.
  - если использовать заглушки, тогда можно предположить что это юнит-тест,  то есть проверка выполнения одного метода внутри класса
  - если подключить репозиторий, в этом случае создается зависимость, тгда  можно полагать что это интеграционный тест.

### Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов.
  -  поскольку задействован пользовательский интерфейс и отображение в нем же результата добавления контакта можно сказать что это сквозной тест

### Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление.
  -  здесь  взаимодействиее нескольких модулей, поэтому это интеграционный тест.