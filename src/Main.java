public class Main {
    public static void main (String[] args) {

        BonusMilesService bonusMilesService = new BonusMilesService();

        int price = 10_000;
        int miles = bonusMilesService.calculate(price);

        System.out.println("Количество бонусных миль: " + miles);
    }
}
