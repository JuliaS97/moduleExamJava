import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Credit score daxil edin: ");
        int creditScore = scanner.nextInt();

        if (creditScore < 300) {
            System.out.println("Status: Aşağı");
        } else if (creditScore <= 500) {
            System.out.println("Status: Orta");
        } else {
            System.out.println("Status: Yüksək");
        }
    }
}