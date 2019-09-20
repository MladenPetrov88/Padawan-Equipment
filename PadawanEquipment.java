import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();
        int students = scanner.nextInt();
        double priceOfLightsabers = scanner.nextDouble();
        double priceOfRobes = scanner.nextDouble();
        double priceOfBelts = scanner.nextDouble();

        double totalPriceOfLighsabre = Math.ceil(students * 1.1) * priceOfLightsabers;
        double totalPriceOfRobes = priceOfRobes * students;
        double totalPriceOfBelts = priceOfBelts * (students - students/6);


        double totalPrice = totalPriceOfBelts + totalPriceOfLighsabre + totalPriceOfRobes;


        if (money >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv." , totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more." , totalPrice - money);
        }

    }
}
