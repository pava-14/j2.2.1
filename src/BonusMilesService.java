public class BonusMilesService {
    public int calculate (int ticketPrice) {
        int milePrice = 20; //Стоимость мили в рублях
        int milesCount = ticketPrice / milePrice; // Количество миль
        return milesCount;
    }
}
