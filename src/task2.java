import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Məbləği daxil edin: ");
        double mebleg = scanner.nextDouble();
        int tamEded = (int) mebleg;
        System.out.println("Tam ədəd olaraq: " + tamEded);
    }
}