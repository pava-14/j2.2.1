public class BonusMilesService {
    public int calculate (int cost) {
        int milePrice = 20; //Стоимость мили в рублях
        int milesCount = cost / milePrice; // Количество миль
        return milesCount;
    }
}
