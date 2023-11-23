# Паттерны 

## Оглавление
1. [Структурные паттерны](#structPatterns)



## Структурные паттерны (Оглавление) <a name="structPatterns></a>
- [Декоратор (Decorator)] (#decorator)

### Описание паттернов
- Декоратор <a name="decorator></a>

  Паттерн проектирования декоратор позволяет нам динамически добавлять функциональность объекту без влияния на поведение объектов того же самого класса
+ Плюсы
  + Декоратор позволяет добавлять функциональность существующему объекту без изменения его структуру, то есть исходный класс не меняется
  + Декоратор полезен для возможности модифицировать поведение объекта во время рантайма. Такой код легко поддерживать и расширять.
- Минусы
  - Используется большое количество однотипных объектов-декораторов
