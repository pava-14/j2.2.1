# Задача № 1 "Мили"

## Краткое описание

1. Создан класс BonusMilesService. 

## Код

```java
public class BonusMilesService {
    public int calculate (int ticketPrice) {
        int milePrice = 20; //Стоимость мили
        int milesCount = ticketPrice / milePrice; // Количество миль
        return milesCount;
    }
}
```