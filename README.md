# Паттерны

## Оглавление
1. [Структурные паттерны](#structPatterns)
2. [Поведенческие (behavioral patterns)](#behavioral)


## Структурные паттерны (Оглавление) <a name="structPatterns"></a>
- [Декоратор (Decorator)](#decorator)

## Поведенческие паттерные (Оглавление) <a name="behavioral"></a>
- [Комманда (Command)](#command)
### Описание паттернов
#### Декоратор <a name="decorator"></a>

  Паттерн проектирования декоратор позволяет нам динамически добавлять функциональность объекту без влияния на поведение объектов того же самого класса
+ Плюсы
  + Декоратор позволяет добавлять функциональность существующему объекту без изменения его структуру, то есть исходный класс не меняется
  + Декоратор полезен для возможности модифицировать поведение объекта во время рантайма. Такой код легко поддерживать и расширять.
- Минусы
  - Используется большое количество однотипных объектов-декораторов

#### Command <a name="command"></a>

Паттерн команда — это поведенческий паттерн проектирования, который позволяет инкапсулировать выполнение операций в виде объектов. Он позволяет создавать отделные команды, которые могут быть переданы в качестве параметра и вызваны в других объектах без знания о том, какая именно команда будет выполнена.

+ Команда (Command): абстрактный класс или интерфейс, определяющий метод execute, который будет вызываться для выполнения запроса.
+ Конкретная команда (Concrete Command): класс, реализующий интерфейс команды и определяющий конкретную операцию, которую необходимо выполнить.
+ Инициатор (Invoker): класс, который использует команду для выполнения запроса.
+ Получатель (Receiver): класс, который содержит логику выполнения команды.
+ Клиент (Client): класс, который инициализирует команду, устанавливает получателя и передает команду инициатору для выполнения.

##### Плюсы паттерна 
+ Инкапсуляция: Паттерн Command помогает инкапсулировать запросы как объекты, что позволяет параметризовать клиентов с различными запросами, хранить историю запросов и поддерживать отмену операций.

+ Отделение отправителя от получателя: Команды изолируют отправителя от получателя. Отправитель не знает, как именно выполняется команда, а получатель не знает, кто отправил команду.

+ Расширяемость: Позволяет легко добавлять новые команды без изменения существующего кода.

+ Отложенное выполнение операций: Можно откладывать выполнение команд, сохраняя их в истории и выполняя их по необходимости.

+ Отмена операций: Паттерн Command облегчает реализацию отмены операций, так как каждая команда может иметь метод отмены (undo).