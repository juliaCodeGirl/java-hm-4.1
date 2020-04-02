public class BonusMilesService {
    public int calculate(int price) {
        int amountAccrual = 20;
        int bonusMiles = 1;

        int miles = price / amountAccrual * bonusMiles;

        return (miles);
    }
}
