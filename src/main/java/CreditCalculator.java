import java.util.Scanner;

public class CreditCalculator {
    private static final int monthYear = 12;
    private static final int percentYear = 10;
    private static int month;
    private static double sumCredit;
    private static double monthOverpayment;

    public static void main(String [] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите сумму кредита:");
            sumCredit = scanner.nextDouble();
            System.out.println("Введите срок в месяцах :");
            month = scanner.nextInt();
            System.out.println("Переплата составит:");
            System.out.println(overpayment(sumCredit,month));
            System.out.println("Ежемесячный платеж составит: :");
            System.out.println(monthlyPayment(sumCredit,month));
        }

    }
    public static double overpayment(double sumCredit, int month) {
        monthOverpayment = (sumCredit / 100 * percentYear / monthYear);
        return (monthOverpayment * month);
    }

    public static int monthlyPayment(double sumCredit, int month) {
        return (int)(overpayment(sumCredit,month) + sumCredit)/month;
    }
}
