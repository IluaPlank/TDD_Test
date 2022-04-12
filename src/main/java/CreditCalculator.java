import java.util.Scanner;

public class CreditCalculator {
    private static final int monthYear = 12;
    private static final int percentYear = 10;
    private static int month;
    private static int sumCredit;
    private static long monthOverpayment;

    public static void main(String [] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите сумму кредита:");
            sumCredit = scanner.nextInt();
            System.out.println("Введите срок в месяцах :");
            month = scanner.nextInt();
            System.out.println("Переплата составит:");
            System.out.println(overpayment(sumCredit,month));
            System.out.println("Ежемесячный платеж составит: :");
            System.out.println(monthlyPayment(sumCredit,month));
        }

    }
    public static int overpayment(int sumCredit, int month) {
        monthOverpayment = (sumCredit / 100 * percentYear / monthYear);
        return (int)(monthOverpayment * month);
    }

    public static int monthlyPayment(int sumCredit, int month) {
        return (overpayment(sumCredit,month) + sumCredit)/month;
    }
}
