# Задача № 1 "Мили"

## Краткое описание

1. Создан класс BonusMilesService. 

## Код

```java
public class BonusMilesService {
    public int calculate (int cost) {
        int milePrice = 20; //Стоимость мили в рублях
        int milesCount = cost / milePrice; // Количество миль
        return milesCount;
    }
}
```