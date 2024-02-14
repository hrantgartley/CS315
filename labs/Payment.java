import java.util.Scanner;

class payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = sc.nextLine();
        System.out.print("How many days of missed payments: ");
        int daysMissed = sc.nextInt();
        System.out.print("What is the daily rate: ");
        double rate = sc.nextDouble();
        sc.close();

        double total = rate * daysMissed;
        System.out.printf("Hello, %s, your fine is %.2f", name, total);

    }
}